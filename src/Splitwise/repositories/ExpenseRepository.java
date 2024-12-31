package Splitwise.repositories;

import Splitwise.models.Expense;

public interface ExpenseRepository {
    public Expense add(Expense expense);
    public Expense get(String expenseId);
    public Expense update(String expenseId, Expense expense);
    public Expense remove(String expenseId);
}
