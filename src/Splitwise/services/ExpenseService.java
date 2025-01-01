package Splitwise.services;

import Splitwise.exceptions.SplitwiseBaseException;
import Splitwise.models.Expense;
import Splitwise.requests.ExpenseRequest;

public interface ExpenseService {
    public Expense add(ExpenseRequest expenseRequest);
    public Expense update(String expenseId, ExpenseRequest expenseRequest) throws SplitwiseBaseException;
    public boolean remove(String expenseId) throws SplitwiseBaseException;
}
