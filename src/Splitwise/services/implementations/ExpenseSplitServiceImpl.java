package Splitwise.services.implementations;

import Splitwise.models.ExpenseSplit;
import Splitwise.models.User;
import Splitwise.repositories.ExpenseSplitRepository;
import Splitwise.requests.ExpenseRequest;
import Splitwise.services.ExpenseSplitService;
import Splitwise.util.ExpenseSplitUtil;

import java.util.*;

public class ExpenseSplitServiceImpl implements ExpenseSplitService {
    private final ExpenseSplitRepository expenseSplitRepository;

    public ExpenseSplitServiceImpl(ExpenseSplitRepository expenseSplitRepository) {
        this.expenseSplitRepository = expenseSplitRepository;
    }

    @Override
    public boolean addUserExpenseSplits(ExpenseRequest expenseRequest) {
        return expenseSplitRepository.add(ExpenseSplitUtil.getExpenseSplits(expenseRequest));
    }

    @Override
    public boolean updateUserExpenseSplits(String expenseId, ExpenseRequest expenseRequest) {
        List<ExpenseSplit> updatedExpenseSplits = ExpenseSplitUtil.getExpenseSplits(expenseRequest);
        return expenseSplitRepository.update(expenseId, updatedExpenseSplits);
    }

    @Override
    public boolean removeUserExpenseSplits(String expenseId) {
        List<ExpenseSplit> expenseSplits = expenseSplitRepository.get(expenseId);
        // todo: check if expenseSplits actually present else throw exception.

        return expenseSplitRepository.remove(expenseId);
    }
}
