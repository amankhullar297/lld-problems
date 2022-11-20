package Problem1.factories;

import Problem1.interfaces.TaxCalculator;
import Problem1.interfaces.implementations.FullTimeEmployeeTaxCalculator;
import Problem1.interfaces.implementations.InternTaxCalculator;
import Problem1.interfaces.implementations.PartTimeEmployeeTaxCalculator;
import Problem1.models.Employee;

public class TaxCalculatorFactory {
    public static TaxCalculator getTaxCalculator(Employee employee){
        switch (employee.getEmployeeType()){
            case FULL_TIME:
                return FullTimeEmployeeTaxCalculator.INSTANCE;

            case PART_TIME:
                return PartTimeEmployeeTaxCalculator.INSTANCE;

            case INTERN:
                return InternTaxCalculator.INSTANCE;
        }

        return null;
    }
}
