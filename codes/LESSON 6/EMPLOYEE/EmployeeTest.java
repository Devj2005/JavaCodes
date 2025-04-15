import java.util.* ;
public class EmployeeTest{
    

    
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("|||||----------WELCOME TO THE EMPLOYEE MANAGEMENT SOFTWARE----------|||||");
        System.out.println("Menu(Select from this options)");
        System.out.println("1. Increment Salary");
        System.out.println("2. Decrement Salary");

        System.out.println("Choose option");
      int choice = input.nextInt();

      if(choice==1){
        RaiseSalary();
      }
      if(choice==2){
        
      }


       

    

        //Create an object/Instance from the employee class A1 Is the first employee Constructor with no arguments
        Employee A1= new Employee(); //invoking the constructor
       

        //Print out on the console employee A1s name ID and salary


        //Access using setters if a modifier is present
        /* 
        System.out.println("EMP_ID: "+A1.getEmpId());
        System.out.println("EMP_NAME: "+A1.getEmpName());
        System.out.println("EMP_SALARY: "+A1.getEmpSalary());

        Employee A2= new Employee("Nelson",10,300.00); // 2nd employee using the constructor with arguments in the ()==OVERLOADING
        System.out.println("EMP_ID"+A2.getEmpId());
        System.out.println("EMP_NAME"+A2.getEmpName());
        System.out.println("EMP_SALARY"+A2.getEmpSalary());


        Employee A3= new Employee();
        A3.setEmpId(2);
        A3.setEmpName("Devyan");
        A3.setEmpSalary(30000.0);

        System.out.println("EMP_ID: "+A3.getEmpId());
        System.out.println();
        System.out.println("EMP_NAME: "+A3.getEmpName());
        System.out.println("EMP_SALARY: "+A3.getEmpSalary());

        Employee A4= new Employee();
        A4.setEmpId(3);
        A4.setEmpName("Griffin");
        A4.setEmpSalary(30000.33);
        A4.RaiseSalary(2000);
        System.out.println(A4.getEmpSalary());*/

        Employee A5 = new Employee();
        System.out.println("Enter Employee ID: ");
        int empId = input.nextInt(); 
        //to not bring input problem for name as the enter clicked after inputting the ID the complier thinks the enter button is the input hence skips the name thingy
        input.nextLine();
        A5.setEmpId(empId);
        
         
        System.out.println("Enter Employee Name: ");
        String empName = input.nextLine();
        A5.setEmpName(empName);
       

        System.out.println("Enter Employee Salary");
        double empSalary = input.nextDouble();
        A5.setEmpSalary(empSalary);





        
      

    }
}