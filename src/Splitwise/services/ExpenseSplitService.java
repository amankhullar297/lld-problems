package Splitwise.services;

import Splitwise.requests.ExpenseRequest;

public interface ExpenseSplitService {
    public boolean addUserExpenseSplits(ExpenseRequest expenseRequest);
    public boolean updateUserExpenseSplits(String expenseId, ExpenseRequest expenseRequest);
    public boolean updateUserExpenseSplits(String expenseId);
}
