package Splitwise.services;

import Splitwise.requests.ExpenseRequest;

public interface GroupExpenseSplitService {
    public boolean addUserGroupExpenseSplits(String groupId, ExpenseRequest expenseRequest);
    public boolean updateUserGroupExpenseSplits(String groupId, String expenseId, ExpenseRequest expenseRequest);
    public boolean removeUserGroupExpenseSplits(String groupId, String expenseId);
}
