package Splitwise.services.implementations;

import Splitwise.exceptions.ExpenseNotFoundException;
import Splitwise.exceptions.SplitwiseBaseException;
import Splitwise.models.Expense;
import Splitwise.repositories.ExpenseRepository;
import Splitwise.requests.ExpenseRequest;
import Splitwise.services.ExpenseService;
import Splitwise.services.ExpenseSplitService;

import java.util.UUID;

public class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final ExpenseSplitService expenseSplitService;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository, ExpenseSplitService expenseSplitService) {
        this.expenseRepository = expenseRepository;
        this.expenseSplitService = expenseSplitService;
    }

    @Override
    public Expense add(ExpenseRequest expenseRequest) {
        Expense expense = new Expense();
        expense.setAmount(expenseRequest.getAmount());
        expense.setDescription(expenseRequest.getDescription());
        expense.setId(UUID.randomUUID().toString());
        expense.setType(expenseRequest.getType());

        expenseSplitService.addUserExpenseSplits(expenseRequest);
        return expenseRepository.add(expense);
    }

    @Override
    public Expense update(String expenseId, ExpenseRequest expenseRequest) throws SplitwiseBaseException {
        Expense expense = expenseRepository.get(expenseId);
        if(expense == null)
            throw new ExpenseNotFoundException(String.format("No expense exists with given expense id %s", expenseId));

        expense.setAmount(expenseRequest.getAmount());
        expense.setDescription(expenseRequest.getDescription());
        expense.setId(UUID.randomUUID().toString());
        expense.setType(expenseRequest.getType());

        expenseSplitService.updateUserExpenseSplits(expenseId, expenseRequest);
        return expenseRepository.update(expenseId, expense);
    }

    @Override
    public boolean remove(String expenseId) throws SplitwiseBaseException {
        Expense expense = expenseRepository.get(expenseId);
        if(expense == null)
            throw new ExpenseNotFoundException(String.format("No expense exists with given expense id %s", expenseId));

        expenseSplitService.removeUserExpenseSplits(expenseId);
        return expenseRepository.remove(expenseId);
    }
}
