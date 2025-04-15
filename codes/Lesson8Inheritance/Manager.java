package Lesson8Inheritance;

import java.text.NumberFormat;

public class Manager extends Employee {
    // Private variable for department name
    private String DeptName;
    
    // Constructor
    public Manager(int empID, String name, String ssn, double salary, String dn) {  
        super(empID, name, ssn, salary);
        this.DeptName = dn;
    }

    // Specialized method to get department name
    public String getDeptName() {
        return DeptName;
    }                       

    // Corrected toString() method to include DeptName
    //Overriding
    @Override
    public String toString() {
        return "The String representation of that object is:\n" +
               "Name: " + this.name + "\n" +
               "SSN: " + this.ssn + "\n" +
               "Employee ID: " + this.empID + "\n" +
               "Salary: " + this.salary + "\n" +
               "Department Name: " + DeptName+ this.salary +   NumberFormat.getCurrencyInstance().format(getSalary());
    }
}


