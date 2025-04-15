import javax.swing.JOptionPane;
public class Welcome {

public static void main(String args[]) { //main method
    JOptionPane.showMessageDialog(null,"I Love Java and God"); // write null in exam 
    System .out.println("Good Morning");
    
String name = JOptionPane.showInputDialog(null ,  "What is your name?" );


int age;    
String userinput= JOptionPane.showInputDialog(null ,  "What is your age?" );
age = Integer.parseInt(userinput);

    System.out.print(name); 
   

    if (age < 18) {
        JOptionPane.showMessageDialog(null, "You are A Minor");
    }
    else
    {
        JOptionPane.showMessageDialog(null, "You are not A minor");
    }

}
    
}
