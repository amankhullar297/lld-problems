package Splitwise.services.implementations;

import Splitwise.exceptions.ExpenseNotFoundException;
import Splitwise.exceptions.SplitwiseBaseException;
import Splitwise.models.Expense;
import Splitwise.repositories.GroupExpenseRepository;
import Splitwise.requests.ExpenseRequest;
import Splitwise.services.GroupExpenseService;
import Splitwise.services.GroupExpenseSplitService;

import java.util.UUID;

public class GroupExpenseServiceImpl implements GroupExpenseService {
    private final GroupExpenseRepository groupExpenseRepository;
    private final GroupExpenseSplitService groupExpenseSplitService;

    public GroupExpenseServiceImpl(GroupExpenseRepository groupExpenseRepository, GroupExpenseSplitService groupExpenseSplitService) {
        this.groupExpenseRepository = groupExpenseRepository;
        this.groupExpenseSplitService = groupExpenseSplitService;
    }

    @Override
    public Expense add(String groupId, ExpenseRequest expenseRequest) {
        Expense expense = new Expense();
        expense.setAmount(expenseRequest.getAmount());
        expense.setDescription(expenseRequest.getDescription());
        expense.setId(UUID.randomUUID().toString());
        expense.setType(expenseRequest.getType());

        groupExpenseSplitService.addUserGroupExpenseSplits(groupId, expenseRequest);
        return groupExpenseRepository.add(groupId, expense);
    }

    @Override
    public Expense update(String groupId, String expenseId, ExpenseRequest expenseRequest) throws SplitwiseBaseException {
        Expense expense = groupExpenseRepository.get(groupId, expenseId);
        if(expense == null)
            throw new ExpenseNotFoundException(String.format("No expense exists with given expense id %s", expenseId));

        expense.setAmount(expenseRequest.getAmount());
        expense.setDescription(expenseRequest.getDescription());
        expense.setId(UUID.randomUUID().toString());
        expense.setType(expenseRequest.getType());

        groupExpenseSplitService.updateUserGroupExpenseSplits(groupId, expenseId, expenseRequest);
        return groupExpenseRepository.update(groupId, expenseId, expense);
    }

    @Override
    public boolean remove(String groupId, String expenseId) throws SplitwiseBaseException {
        Expense expense = groupExpenseRepository.get(groupId, expenseId);
        if(expense == null)
            throw new ExpenseNotFoundException(String.format("No expense exists with given expense id %s", expenseId));

        groupExpenseSplitService.removeUserGroupExpenseSplits(groupId, expenseId);
        return groupExpenseRepository.remove(groupId, expenseId);
    }
}
