public class Stringz {
    public static void main(String[] args) {
        String message = "Hello World" + "!!"; // string concatenation 
        System.out.println(message);
        message.length();
        message.endsWith("!!");
        System.out.println("Message Length is: "+ message.length());
        System.out.println(message.endsWith("!!"));
        message.replace("!", "$$");
        System.out.println(message.replace("!", "$")); //target and replacemennt are parameters while ! and $ are arguments(actual values)
        System.out.println(message);

        System.out.println("c\\windows\\onedrive"); // shows \ by using \\ to avoid errors like in hello world java

    }
}
 