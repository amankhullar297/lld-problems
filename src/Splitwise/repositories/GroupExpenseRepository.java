package Splitwise.repositories;

import Splitwise.models.Expense;

public interface GroupExpenseRepository {
    public Expense add(String groupId, Expense expense);
    public Expense update(String groupId, String expenseId, Expense expense);
    public Expense remove(String groupId, String expenseId, Expense expense);
}
