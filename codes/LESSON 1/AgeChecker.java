import java.util.Scanner;
public class AgeChecker {
    public static void main(String args[]){
        Scanner inputter = new Scanner(System.in);
        int Age;
        char Holdinglicense ;
        System.out.print("Please enter your age: ");
        Age= inputter.nextInt();
        System.out.print("Do you hold a current driving licence? ");
        Holdinglicense = inputter.next().charAt(0);
        
        if( (Age>20  && Holdinglicense == 'y')){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
        inputter.close();



    }
}
