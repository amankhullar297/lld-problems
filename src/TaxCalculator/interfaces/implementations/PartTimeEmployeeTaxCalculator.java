package TaxCalculator.interfaces.implementations;

import TaxCalculator.interfaces.TaxCalculator;
import TaxCalculator.models.Employee;

public enum PartTimeEmployeeTaxCalculator implements TaxCalculator {
    INSTANCE;

    @Override
    public Double calculateTax(Employee employee) {
        return employee.getSalary() * 0.27;
    }
}
