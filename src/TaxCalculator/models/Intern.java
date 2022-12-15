package TaxCalculator.models;

import TaxCalculator.enums.EmployeeType;

public class Intern extends Employee{
    private String collegeName;
    private Integer internshipDuration;

    public Intern(){
        super(EmployeeType.INTERN);
    }
}
