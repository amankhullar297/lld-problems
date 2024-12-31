package Splitwise.repositories;

import Splitwise.models.ExpenseSplit;
import java.util.List;

public interface ExpenseSplitRepository {
    public boolean add(List<ExpenseSplit> expenseSplits);
    public List<ExpenseSplit> get(String expenseId);
    public boolean update(String expenseId, List<ExpenseSplit> expenseSplits);
    public boolean remove(String expenseId);
}
