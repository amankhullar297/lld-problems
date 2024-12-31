package Splitwise.util;

import Splitwise.models.ExpenseSplit;
import Splitwise.models.User;
import Splitwise.requests.ExpenseRequest;

import java.util.*;

public class ExpenseSplitUtil {
    private static List<ExpenseSplit> distributeExpenses(Map<String, Float> balances) {
        List<ExpenseSplit> expenseSplits = new ArrayList<>();

        Queue<Map.Entry<String, Float>> owedByQueue = new LinkedList<>();
        Queue<Map.Entry<String, Float>> owedToQueue = new LinkedList<>();

        for (Map.Entry<String, Float> entry : balances.entrySet()) {
            if (entry.getValue() < 0) {
                owedByQueue.offer(new AbstractMap.SimpleEntry<>(entry.getKey(), -entry.getValue())); // Convert to positive
            } else if (entry.getValue() > 0) {
                owedToQueue.offer(entry);
            }
        }

        while (!owedByQueue.isEmpty() && !owedToQueue.isEmpty()) {
            Map.Entry<String, Float> owedBy = owedByQueue.poll();
            Map.Entry<String, Float> owedTo = owedToQueue.poll();

            float payment = Math.min(owedBy.getValue(), owedTo.getValue());
            expenseSplits.add(new ExpenseSplit(owedBy.getKey(), owedTo.getKey(), payment));

            if (owedBy.getValue() > payment) {
                owedByQueue.offer(new AbstractMap.SimpleEntry<>(owedBy.getKey(), owedBy.getValue() - payment));
            }
            if (owedTo.getValue() > payment) {
                owedToQueue.offer(new AbstractMap.SimpleEntry<>(owedTo.getKey(), owedTo.getValue() - payment));
            }
        }

        return expenseSplits;
    }

    public static List<ExpenseSplit> getExpenseSplits(ExpenseRequest expenseRequest){
        List<ExpenseSplit> expenseSplits = new ArrayList<>();
        int totalMembers = expenseRequest.getOwedBy().size() + expenseRequest.getOwedTo().size();
        Map<String, Float> balances = new HashMap<>();
        for(Map.Entry<User, Float> entry: expenseRequest.getOwedBy().entrySet())
            balances.put(entry.getKey().getId(), entry.getValue());

        switch (expenseRequest.getType()){
            case EQUALLY -> {
                for(User user: expenseRequest.getOwedTo())
                    balances.put(user.getId(), -1 * expenseRequest.getAmount()/totalMembers);
            }
            case PERCENTAGE -> {
                for(Map.Entry<User, Float> entry: expenseRequest.getPercentage().entrySet())
                    balances.put(entry.getKey().getId(), -1 * expenseRequest.getAmount()/100 * entry.getValue());
            }

            case INDIVIDUAL -> {
                for(Map.Entry<User, Float> entry: expenseRequest.getSplit().entrySet())
                    balances.put(entry.getKey().getId(), -1 * entry.getValue());
            }
        }

        return distributeExpenses(balances);
    }
}
