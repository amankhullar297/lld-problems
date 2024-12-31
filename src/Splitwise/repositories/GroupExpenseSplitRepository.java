package Splitwise.repositories;

import Splitwise.models.ExpenseSplit;

import java.util.List;

public interface GroupExpenseSplitRepository {
    public boolean add(String groupId, List<ExpenseSplit> expenseSplits);
    public List<ExpenseSplit> get(String groupId, String expenseId);
    public boolean update(String groupId, String expenseId, List<ExpenseSplit> expenseSplits);
    public boolean remove(String groupId, String expenseId);
}
