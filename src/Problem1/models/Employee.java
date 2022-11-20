package Problem1.models;

import Problem1.enums.EmployeeType;

public abstract class Employee {
    private String id;
    private String name;
    private String email;

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    private String contact;
    private String address;
    private Double salary;
    private EmployeeType employeeType;

    public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
