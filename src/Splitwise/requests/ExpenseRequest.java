package Splitwise.requests;

import Splitwise.models.ExpenseType;
import Splitwise.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseRequest {
    private ExpenseType type;
    private float amount;
    private String description;
    private Map<User, Float> owedBy = new HashMap<>();
    private List<User> owedTo = new ArrayList<>();
    private Map<User, Float> percentage = new HashMap<>();
    private Map<User, Float> split = new HashMap<>();

    public void setType(ExpenseType type) {
        this.type = type;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwedTo(List<User> owedTo) {
        this.owedTo = owedTo;
    }

    public Map<User, Float> getPercentage() {
        return percentage;
    }

    public ExpenseType getType() {
        return type;
    }

    public float getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public List<User> getOwedTo() {
        return owedTo;
    }

    public Map<User, Float> getOwedBy() {
        return owedBy;
    }

    public void setOwedBy(Map<User, Float> owedBy) {
        this.owedBy = owedBy;
    }

    public void setPercentage(Map<User, Float> percentage) {
        this.percentage = percentage;
    }

    public Map<User, Float> getSplit() {
        return split;
    }

    public void setSplit(Map<User, Float> split) {
        this.split = split;
    }
}
