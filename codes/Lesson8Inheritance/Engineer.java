package Lesson8Inheritance;

public class Engineer extends Employee {

    private String DeptName;
    public String dn; 
    
public Engineer(int empID, String name, String ssn, double salary, String dn) {  
    super(empID, name, ssn, salary);
    DeptName = dn;

}

       //Specialized method to manager only to get deptname
       public String getDeptName(){
        return dn ;

       }

}

    

