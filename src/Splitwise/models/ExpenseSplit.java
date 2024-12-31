package Splitwise.models;

public class ExpenseSplit {
    private String from;
    private String to;
    private float amount;

    public ExpenseSplit(String from, String to, float amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}
