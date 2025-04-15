package Lesson8Inheritance;

public class Director extends Manager {
   
    private Double budget;
    public Director(int empID, String name, String ssn, double salary, String dn, Double budget) {  
        super(empID, name, ssn, salary,dn);
        this.budget = budget ;
        

    
    }
    
           //Specialized method to manager only to get deptname
           public Double getBudget(){
            return budget;
    
           }
    
    }
    

