import java.util.Scanner;
public class InputVariables {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in); //input acts as a variable 
    boolean boolVal;
    byte byteVal;
    char charVal;
    short shortVal;
    int intVal;
    long longVal;
    float floatVal;
    double doubleVal;

    System.out.print("Please enter a booleanvalue: ");
    boolVal = input.nextBoolean();
    System.out.print("Please enter a byte value: ");
    byteVal = input.nextByte();
    System.out.print("Please enter a char value: ");
    charVal = input.next().charAt(0);
    System.out.println("Please enter a short value: ");
    shortVal = input.nextShort();
    System.out.println("Please enter an integer value: ");
    intVal = input.nextInt();
    System.out.println("Please enter a long value: ");
    longVal = input.nextLong();
    System.out.println("Please enter a float value: ");
    floatVal = input.nextFloat();
    System.out.println("Please enter a double  value: " );
    doubleVal = input.nextDouble();
    input.close();

System.out.println("booleanvalue: "+ boolVal);
System.out.println("byte value : "+ byteVal);
System.out.println("char value : "+ charVal);
System.out.println("short value : "+ shortVal);
System.out.println("int value : "+ intVal);
System.out.println("long value : "+ longVal);
System.out.println("double value : "+ floatVal);
System.out.println("double value : "+ doubleVal);

    }
}
