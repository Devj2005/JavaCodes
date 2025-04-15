import java.util.*;
public class RectangleTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
       double l=input.nextDouble();
       System.out.println("Enter the width: ");
       double w = input.nextDouble();
       if (w>l){
        System.out.println("ERROR LENGTH SHOULD BE GREATER THAN WIDTH");
        System.exit(0);
        
    } 
        //Create instance
        Rectangle r1= new Rectangle(l,w); //  Arguments
        //Rectangle r2= new Rectangle(50,30);

        System.out.println("Area is: "+ r1.fArea());
        System.out.println("Perimeter is: "+ r1.fPeri());


        

    
    }


}