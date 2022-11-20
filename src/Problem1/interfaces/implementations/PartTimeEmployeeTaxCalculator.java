package Problem1.interfaces.implementations;

import Problem1.interfaces.TaxCalculator;
import Problem1.models.Employee;

public enum PartTimeEmployeeTaxCalculator implements TaxCalculator {
    INSTANCE;

    @Override
    public Double calculateTax(Employee employee) {
        return employee.getSalary() * 0.27;
    }
}
