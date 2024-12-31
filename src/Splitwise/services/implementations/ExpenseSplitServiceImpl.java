package Splitwise.services.implementations;

import Splitwise.models.ExpenseSplit;
import Splitwise.repositories.ExpenseSplitRepository;
import Splitwise.requests.ExpenseRequest;
import Splitwise.services.ExpenseSplitService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpenseSplitServiceImpl implements ExpenseSplitService {
    private final ExpenseSplitRepository expenseSplitRepository;

    public ExpenseSplitServiceImpl(ExpenseSplitRepository expenseSplitRepository) {
        this.expenseSplitRepository = expenseSplitRepository;
    }

    @Override
    public boolean addUserExpenseSplits(ExpenseRequest expenseRequest) {
        List<ExpenseSplit> expenseSplits = new ArrayList<>();
        // todo: logic to split expenses.

        return expenseSplitRepository.add(expenseSplits);
    }

    @Override
    public boolean updateUserExpenseSplits(String expenseId, ExpenseRequest expenseRequest) {
        List<ExpenseSplit> expenseSplits = expenseSplitRepository.get(expenseId);
        // todo: logic to split expenses.

        return expenseSplitRepository.update(expenseId, expenseSplits);
    }

    @Override
    public boolean updateUserExpenseSplits(String expenseId) {
        List<ExpenseSplit> expenseSplits = expenseSplitRepository.get(expenseId);
        // todo: check if expenseSplits actually present else throw exception.

        return expenseSplitRepository.remove(expenseId);
    }
}
