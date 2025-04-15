package codesalone;
import java.util.*;
public class TriangleTest {
    public static void main(String args[]){
        Scanner inputter = new Scanner(System.in);
        Triangle T1= new Triangle(); //NO args

        System.out.println("Base: "+  T1.getBase());
        System.out.println("Height: "+T1.getHeight());
        System.out.println("Area: "+T1.fArea());

        System.out.println(); 

        Triangle T2 = new Triangle(2, 4); //Args
        System.out.println("Base: "+  T2.getBase());
        System.out.println("Height: "+T2.getHeight());
        System.out.println("Area: "+T2.fArea());
        System.out.println();

        Triangle T3 = new Triangle();
        T3.setBase(3);
        T3.setHeight(4);
        System.out.println("Area: "+T3.fArea());

        Triangle T4 = new Triangle();

        System.out.println("Enter the base: ");
        double base = inputter.nextDouble();
        T4.setBase(base);

        System.out.println("Enter the height: ");
        double height = inputter.nextDouble();
        T4.setHeight(height);

        System.out.println("AREA IS: "+ T4.fArea() );



        
        
    }
    
}
