package Lesson8Inheritance;
import java.util.*; 

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an instance from the Manager class
        Manager m2Manager = new Manager(2, "Nelson", "183428", 22000, "Manager");

        // FIX: Add () to call the method
        System.out.println(m2Manager.getDeptName());

        m2Manager.RaiseSalary(25000);
        System.out.println(m2Manager.toString());

        // Close Scanner to prevent resource leak
        input.close();

        Employee e1 = new Employee(0, "dj", "", 10000);
        Employee e2 = new Employee(1, "vj", "", 10000);

        System.out.println("NUMBER: "+Employee.cemps); // total number of employees



    }
    public static void printEmployee(Employee e){
        System.out.println();
        System.out.println("Employee name:"+e.getname());

    }
    
}


