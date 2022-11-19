package Problem1.models;

import Problem1.interfaces.TaxCalculator;
import Problem1.interfaces.TaxComputingStrategy;

public class FullTimeEmployee  extends Employee implements TaxCalculator {
    private TaxComputingStrategy taxComputingStrategy;

    public FullTimeEmployee(TaxComputingStrategy taxComputingStrategy){
        this.taxComputingStrategy = taxComputingStrategy;
    }

    @Override
    public Double getTax() {
        return this.taxComputingStrategy.computeTax(this.getSalary());
    }
}
