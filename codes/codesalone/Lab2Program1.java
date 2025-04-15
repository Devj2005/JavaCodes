package codesalone;
import javax.swing.*;
import java.awt.*;
public class Lab2Program1 {

    public static void main (String [] args) {
          
	JFrame window = new JFrame();

        window = new javax.swing.JFrame ();

        window.setSize(360,670);
        window.setTitle("My First Java Program in Lab");
    Point position = new Point();

	position = new java.awt.Point(300,750);

        window.setLocationRelativeTo(null); // sets it to the middle of the screen
	    window.setVisible(true); //if false it wont show
    //window.setVisible(false);
    }
}
