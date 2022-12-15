package TaxCalculator.factories;

import TaxCalculator.interfaces.TaxCalculator;
import TaxCalculator.interfaces.implementations.FullTimeEmployeeTaxCalculator;
import TaxCalculator.interfaces.implementations.InternTaxCalculator;
import TaxCalculator.interfaces.implementations.PartTimeEmployeeTaxCalculator;
import TaxCalculator.models.Employee;

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
