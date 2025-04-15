import java.util.*;
import java.text.SimpleDateFormat;
public class DatesTester {
    public static void main(String[] args) {
      Date t = new Date();
       
      
      SimpleDateFormat sdf;
      sdf = new SimpleDateFormat("MMMM/d/yyyy");
      System.out.println(sdf.format(t)); 
    }
    

}
