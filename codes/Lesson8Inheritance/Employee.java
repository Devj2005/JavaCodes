package Lesson8Inheritance;

import java.text.NumberFormat;

public class Employee extends Object{ //object is a class which is always above a class which has no parents
    //attributes
    protected int empID;
    protected String name;
    protected String ssn;
    protected double salary;
    public int countOfEmployees = 0;
    public static int cemps = 0; //static keyword use.
    //constructor for employee
   public Employee(int empID, String name,String ssn, double salary){
        this.empID = empID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary; 
        this.countOfEmployees = countOfEmployees++;
        this.cemps++;
   }
        /*public Employee(int ID, String Name, String sn, double Salary )
        ID=empID;
        Name = name;
        sn = ssn
        Salary = salary;
        
    } */
    void SetName(String n){
        //name = this.name;
     name = n;

    
    }
    public String getname(){
        return name;
    }
    //method
    public void RaiseSalary(double increase){
        salary+=increase;
    }
    void SetEmpId(int e){
        empID = e;
    }
    void SetSSN(String s){
        ssn = s;
    }
    void SetSalary(double sal){
        salary = sal;

    } 
    public Double getSalary(){
        return salary;
    }
    //overridding

    public String toString(){
       //you want it behave as you want it

        return ("The String representaiton of that object is "+"Name is: " + this.name +"\n"+ "SSN is:" + this.ssn+"\n"+"EmployeeID:"+this.empID+"\n"+"Salary is: "+this.salary + NumberFormat.getCurrencyInstance().format(getSalary()));


    
}
}