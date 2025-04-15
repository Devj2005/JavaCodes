public class Rectangle {
    //2 main methods
    private double Len;
    private double Width;

    public Rectangle(double l, double w){
        Len=l;
        Width=w;
    }
    public void setLen(double l){

        Len=1; //Used to enter the length
    }
    public void setWidth(double w,double l){
            Width=w;
            
   } 
   
   public double getLength(){
    return Len;
   }
   public double getWidth(){
    return Width;
    }
    //Computer area
    public double fArea(){
        
        return Len*Width;}

    
    //Compute perimeter
    public double fPeri(){
        return 2*(Len+Width);
    }
}

