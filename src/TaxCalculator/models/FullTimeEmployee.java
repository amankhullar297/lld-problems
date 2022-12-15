package TaxCalculator.models;

import TaxCalculator.enums.EmployeeType;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(){
        super(EmployeeType.FULL_TIME);
    }
}
