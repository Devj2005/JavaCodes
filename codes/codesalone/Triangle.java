package codesalone;

public class Triangle {
    private double base;
    private double height;

    //Constructor must have same name as class whether it is Args or no args!!!! Public so it can be accessed by another class
    public Triangle(){
        base=1;
        height=1;
    }
//CONSTRUCTOR WITH ARGS

  /*   public Triangle(double base, double height){
        this.base = base; //Assign the attribute base with the value[base]
        this.height = height; }
        */
    public Triangle(double b , double h){
        base = b;
        height = h;
    }

    //Setter are void and have no return type inputting something into the brackets
    public void setBase(double b){
        base= b;

    }
    public void setHeight(double h){
        height = h;
    }

    //Getter have a return type and are non-void brakcets r empty
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double fArea(){
        return 0.5*(base*height);
    }
    
    //sqroot and square
    //findout


    

    
}
