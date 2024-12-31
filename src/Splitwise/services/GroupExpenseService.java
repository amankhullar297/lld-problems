package Splitwise.services;

import Splitwise.models.Expense;
import Splitwise.requests.ExpenseRequest;

public interface GroupExpenseService {
    public Expense add(String groupId, ExpenseRequest expenseRequest);
    public Expense update(String groupId, String expenseId, ExpenseRequest expenseRequest);
    public Expense remove(String groupId, String expenseId, ExpenseRequest expenseRequest);
}
