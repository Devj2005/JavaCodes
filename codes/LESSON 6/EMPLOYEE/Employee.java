import java.util.Scanner;

public class Employee {

    //Attributes 
    private String empName;
    private int empId;
    private double empSalary;
    



    //No-args Constructor is default settings-esque
    //Setter is to modify the value from unknown to devyan
   public Employee() {
        empName="Unknown";
        empId= 0;
        empSalary=0.00;

    }
   
        //methods for raising and decreasing salary
        //used for data validation too!
        public double RaiseSalary(double increment){
            
            if (increment>0){
                System.out.println("Enter the increment value");
            empSalary=empSalary+increment;}
            else{
                System.out.println("Enter a value greater than 0 to increment");
               
            }
            return empSalary;
        }
    
   
    public double ReduceSalary(double decrement)
    {   if  (decrement<0){
        System.out.println("Enter the decrement value");
             empSalary=empSalary-decrement;}
        else{
             System.out.println("Enter a value greater than 0 to decrement");
        }

        return  empSalary;
    }

    //Define a constructor with arguments you have already set so u need only getters
    public Employee(String name, int id, double salary){
        empName=name;
        empId=id;
        empSalary=salary;
        //using this. method
        /*  empName=empName;
            empId=empId;
            empSalary=empSalary; */
    }
    // Write code for getter methods/accessor for each of the attributes
    public String getEmpName(){

        return empName;
    }
    public int getEmpId(){

        return empId;
    }
    public double getEmpSalary(){

        return empSalary;
    }

    //Using setter method'- USE VOID AND NO RETURN VALUE a
    public void setEmpName(String name){
        empName= name;
    }
    public void setEmpSalary(double salary){
        empSalary=salary;
    }
    public void setEmpId(int id){
        empId= id;
    }
}
