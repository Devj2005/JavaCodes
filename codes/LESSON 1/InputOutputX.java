import java.util.Scanner; // Import the Scanner class for input

public class InputOutputX{
    public static void main(String[] args) { // Add parameter to main method
        Scanner scanner = new Scanner(System.in); // Correct capitalization of 'Scanner'

        System.out.print("Enter an integer: "); // Prompt the user for input
        int userInput = scanner.nextInt(); // Read the integer
        System.out.println("You entered: " + userInput); // Print the input

        scanner.close(); // Close the Scanner
    }
}
