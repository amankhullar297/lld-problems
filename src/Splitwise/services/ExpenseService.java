package Splitwise.services;

import Splitwise.models.Expense;
import Splitwise.requests.ExpenseRequest;

public interface ExpenseService {
    public Expense add(ExpenseRequest expenseRequest);
    public Expense update(String expenseId, ExpenseRequest expenseRequest);
    public Expense remove(String expenseId);
}
