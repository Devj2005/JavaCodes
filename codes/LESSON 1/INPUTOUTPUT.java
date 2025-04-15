import java.util.Scanner;
public class INPUTOUTPUT{
 public static void main(String args[]) {
    Scanner userInput = new Scanner (System.in);
    System.out.println("Enter your age");
   int age=userInput.nextInt();
if (age>18)
{
    System.out.println("You are GenZ");
}
else
{
    System.out.println("You are not GenZ");
}
userInput.close();

 }

}