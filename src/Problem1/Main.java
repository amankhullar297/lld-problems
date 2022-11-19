package Problem1;

import Problem1.interfaces.TaxCalculator;
import Problem1.interfaces.TaxComputingStrategy;
import Problem1.models.*;

public class Main {
    public static void main(String[] args) {
        TaxComputingStrategy fullTimeEmployeeTaxComputingStrategy = new FullTimeEmployeeTaxStrategy();
        TaxComputingStrategy partTimeEmployeeTaxComputingStrategy = new PartTimeEmployeeTaxStrategy();
        TaxComputingStrategy internTaxComputingStrategy = new InternTaxStrategy();

        Employee employee1 = new FullTimeEmployee(fullTimeEmployeeTaxComputingStrategy);
        employee1.setSalary(1000000.00);

        Employee employee2 = new PartTimeEmployee(partTimeEmployeeTaxComputingStrategy);
        employee2.setSalary(500000.00);

        Employee employee3 = new Intern(internTaxComputingStrategy);
        employee3.setSalary(2000000.00);

        System.out.println(((TaxCalculator)employee1).getTax());
        System.out.println(((TaxCalculator)employee2).getTax());
        System.out.println(((TaxCalculator)employee3).getTax());
    }
}