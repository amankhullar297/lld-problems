package Splitwise.services.implementations;

import Splitwise.models.ExpenseSplit;
import Splitwise.repositories.GroupExpenseSplitRepository;
import Splitwise.requests.ExpenseRequest;
import Splitwise.services.GroupExpenseSplitService;
import Splitwise.util.ExpenseSplitUtil;

import java.util.List;

public class GroupExpenseSplitServiceImpl implements GroupExpenseSplitService {
    private final GroupExpenseSplitRepository groupExpenseSplitRepository;

    public GroupExpenseSplitServiceImpl(GroupExpenseSplitRepository groupExpenseSplitRepository) {
        this.groupExpenseSplitRepository = groupExpenseSplitRepository;
    }

    @Override
    public boolean addUserGroupExpenseSplits(String groupId, ExpenseRequest expenseRequest) {
        return groupExpenseSplitRepository.add(groupId, ExpenseSplitUtil.getExpenseSplits(expenseRequest));
    }

    @Override
    public boolean updateUserGroupExpenseSplits(String groupId, String expenseId, ExpenseRequest expenseRequest) {
        List<ExpenseSplit> updatedExpenseSplits = ExpenseSplitUtil.getExpenseSplits(expenseRequest);
        return groupExpenseSplitRepository.update(groupId, expenseId, updatedExpenseSplits);
    }

    @Override
    public boolean removeUserGroupExpenseSplits(String groupId, String expenseId) {
        List<ExpenseSplit> expenseSplits = groupExpenseSplitRepository.get(groupId, expenseId);
        return groupExpenseSplitRepository.remove(groupId, expenseId);
    }
}
