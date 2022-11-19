package Problem1.models;

import Problem1.interfaces.TaxComputingStrategy;

public class PartTimeEmployeeTaxStrategy implements TaxComputingStrategy {
    @Override
    public Double computeTax(Double salary) {
        return salary * 0.27;
    }
}
