package Problem1.models;

import Problem1.enums.EmployeeType;

public class PartTimeEmployee  extends Employee {

    public PartTimeEmployee(){
        super(EmployeeType.PART_TIME);
    }
}