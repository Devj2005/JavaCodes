import java.util.Scanner;
public class ValueChecker {
    public static void main(String args[]) 
    {   Scanner inputter = new Scanner(System.in);
        int Val;
        System.out.println("Enter an integer value");
        Val = inputter.nextInt();
        if (Val == 7){
            System.out.println("You are lucky");
            
        }
        if(Val ==13){
            System.out.println("That number is neither lucky not unlucky");
        }
        else{
            System.out.println("Thats not Lucky or Unlucky");
        }


    }
}
