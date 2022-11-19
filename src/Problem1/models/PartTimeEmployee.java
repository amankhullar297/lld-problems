package Problem1.models;

import Problem1.interfaces.TaxCalculator;
import Problem1.interfaces.TaxComputingStrategy;

public class PartTimeEmployee  extends Employee implements TaxCalculator {
    private TaxComputingStrategy taxComputingStrategy;

    public PartTimeEmployee(TaxComputingStrategy taxComputingStrategy){
        this.taxComputingStrategy = taxComputingStrategy;
    }

    @Override
    public Double getTax() {
        return this.taxComputingStrategy.computeTax(this.getSalary());
    }
}