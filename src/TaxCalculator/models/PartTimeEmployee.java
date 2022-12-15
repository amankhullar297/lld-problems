package TaxCalculator.models;

import TaxCalculator.enums.EmployeeType;

public class PartTimeEmployee  extends Employee {

    public PartTimeEmployee(){
        super(EmployeeType.PART_TIME);
    }
}