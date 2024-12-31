package Splitwise.models;

public class ExpenseSplit {
    private String userId;
    private float amount;

    public ExpenseSplit(String userId, float amount) {
        this.userId = userId;
        this.amount = amount;
    }
}
