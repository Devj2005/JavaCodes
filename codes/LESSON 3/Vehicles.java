public class Vehicles {
    private String regNumber;
    private String make;
    private String model;
    private String color;
    private int mileage;
    private int numberOfSeats; 
    //shared attributes

    int speed;

    public void accelerate(int s){
        speed=speed+s;

    }
    public void brake(int b){
        speed=speed-b;

    } // IS-A AND AS-A USES A BOAT IS A VEHICLE.

 class Bicycle extends Vehicles{
    private int numberOfWheels;
 }
 class Boat extends Vehicles{
    private int hasOar;
 }
 class Car extends Vehicles{
    private int numberOfWheels;
 }
 
}