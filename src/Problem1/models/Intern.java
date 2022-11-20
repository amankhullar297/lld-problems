package Problem1.models;

import Problem1.enums.EmployeeType;

public class Intern extends Employee{
    private String collegeName;
    private Integer internshipDuration;

    public Intern(){
        super(EmployeeType.INTERN);
    }
}
