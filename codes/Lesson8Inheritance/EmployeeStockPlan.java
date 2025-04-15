package Lesson8Inheritance;

public class EmployeeStockPlan {

    public int grantStock(Employee e){
        if (e instanceof Manager){

            return 100;
        } else if (e instanceof Director) {
            return 1000;
        }else{
            return 10;
        }
    }


    
}
