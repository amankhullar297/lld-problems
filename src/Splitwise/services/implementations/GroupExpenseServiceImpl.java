package Splitwise.services.implementations;

import Splitwise.models.Expense;
import Splitwise.repositories.GroupExpenseRepository;
import Splitwise.requests.ExpenseRequest;
import Splitwise.services.GroupExpenseService;

public class GroupExpenseServiceImpl implements GroupExpenseService {
    private final GroupExpenseRepository groupExpenseRepository;

    public GroupExpenseServiceImpl(GroupExpenseRepository groupExpenseRepository) {
        this.groupExpenseRepository = groupExpenseRepository;
    }

    @Override
    public Expense add(String groupId, ExpenseRequest expenseRequest) {
        return null;
    }

    @Override
    public Expense update(String groupId, String expenseId, ExpenseRequest expenseRequest) {
        return null;
    }

    @Override
    public Expense remove(String groupId, String expenseId, ExpenseRequest expenseRequest) {
        return null;
    }
}
