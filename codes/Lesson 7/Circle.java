public class Circle {
    //attribute
    private double radius;
    private final double pi=3.14;

    //constuctor
    //used to initialise
    public Circle(){
        radius=0.0;
        
    }
    public double findArea(){

        return pi*radius*radius;

    }
    public double findCircumference(){
        return 2*pi*radius;
    }
}
