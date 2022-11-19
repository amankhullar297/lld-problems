package Problem1.models;

import Problem1.interfaces.TaxCalculator;
import Problem1.interfaces.TaxComputingStrategy;

public class Intern extends Employee implements TaxCalculator {
    private String collegeName;
    private Integer internshipDuration;
    private TaxComputingStrategy taxComputingStrategy;

    public Intern(TaxComputingStrategy taxComputingStrategy){
        this.taxComputingStrategy = taxComputingStrategy;
    }

    @Override
    public Double getTax() {
        return this.taxComputingStrategy.computeTax(this.getSalary());
    }
}
