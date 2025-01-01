package Splitwise.services;

import Splitwise.exceptions.SplitwiseBaseException;
import Splitwise.models.Expense;
import Splitwise.requests.ExpenseRequest;

public interface GroupExpenseService {
    public Expense add(String groupId, ExpenseRequest expenseRequest);
    public Expense update(String groupId, String expenseId, ExpenseRequest expenseRequest) throws SplitwiseBaseException;
    public boolean remove(String groupId, String expenseId) throws SplitwiseBaseException;
}
