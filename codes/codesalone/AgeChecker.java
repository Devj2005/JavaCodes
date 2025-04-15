package codesalone;
import java.util.*;
public class AgeChecker{
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    AgeCheckerTest A1= new AgeCheckerTest();

    System.out.println("Enter the age of the person: ");
    int Age = input.nextInt();
    A1.setAge(Age);

if(Age>20){
    System.out.println("Enter the character if you are a licence holder: [Y/N]");
    char LicenceHolder = input.next().charAt(0);
    A1.setLicenceHolder(LicenceHolder);
     if(LicenceHolder=='Y'||LicenceHolder=='y'){
        System.out.println("You are not eligible for a drivers licence as you have one already");
        System.out.println("Your Age is: " + A1.getAge());
        System.out.println("You are a Licence Holder: "+ A1.getLicenceHolder());
    }
    else if(LicenceHolder=='N'||LicenceHolder=='n'){
        System.out.println("*|||______YOUR FINAL DETAILS ARE______|||*");
        System.out.println("You are eligible for drivers licence");
 
        System.out.println("Your Age is: " + A1.getAge());
        System.out.println("You are a Licence Holder: "+ A1.getLicenceHolder());
        
    }
    else{
        System.out.println("Choose an option from above either (Y/y) or (N/n)");
        System.exit(0);
    }
}
else if(Age<20){
    System.out.println("You are not eligible for a drivers licence. ");
        System.exit(0);
}




   /*  System.out.println("*|||______YOUR FINAL DETAILS ARE______|||*");
    System.out.println("Your Age is: " + A1.getAge());
    System.out.println("You are a Licence Holder: "+ A1.getLicenceHolder()); */
    

   /*  if(Age>20){
        System.out.println("You are an adult. ");
    }else if(Age<20){
        System.out.println("You are not an adult. ");
    }

    if(LicenceHolder=='Y'||LicenceHolder=='y'){
        System.out.println("You are eligible for a drivers licence");
    }
    else if(LicenceHolder=='N'||LicenceHolder=='n'){
        System.out.println("You are not eligible for ");
        
    }
    else{
        System.out.println("Choose an option from above either (Y/y) or (N/n)");
        System.exit(0);
    }*/





}
    

    
}
