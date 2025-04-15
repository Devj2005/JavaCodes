package codesalone;
//Lab 2 Program 2: 

   //File: Lab2Program2.java 


import javax.swing.*;
//import java.awt.*;

public class Lab2Program2X {

    public static void main (String [] args) {
          
	String firstName;
	String lastName;
	String fullName;

	firstName = JOptionPane.showInputDialog(null, "What is your first name?");
	lastName = JOptionPane.showInputDialog(null, "What is your last name?");
    fullName = firstName + " " + lastName;

   String[] nameParts=fullName.split(" ");
 //  String extractedFirstname=nameParts[0];
   //String extractedLastname=nameParts[1];

 JOptionPane.showMessageDialog(null, "Your full name  is " +fullName);
 JOptionPane.showMessageDialog(null, "Your first name  is " +nameParts[0]); 
 JOptionPane.showMessageDialog(null, "Your last  name  is " +  nameParts[1]); 
 		
 
   JOptionPane.showMessageDialog(null, "Your initials are " +    firstName.charAt(0) + "." +   lastName.charAt(0));
}
}