package Problem1;
import Problem1.factories.TaxCalculatorFactory;
import Problem1.models.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee();
        employee1.setSalary(1000000.00);

        Employee employee2 = new PartTimeEmployee();
        employee2.setSalary(500000.00);

        Employee employee3 = new Intern();
        employee3.setSalary(2000000.00);

        System.out.println(TaxCalculatorFactory.getTaxCalculator(employee1).calculateTax(employee1));
        System.out.println(TaxCalculatorFactory.getTaxCalculator(employee2).calculateTax(employee2));
        System.out.println(TaxCalculatorFactory.getTaxCalculator(employee3).calculateTax(employee3));

    }
}