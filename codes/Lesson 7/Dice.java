public class Dice {
    private static final int max_number = 6;
    private static final int min_number = 1;
    private static final int no_number = 0;

    private int number;

    public Dice(){
        number = no_number;

    }
    public void roll(){
        number = ((int)(Math.floor(Math.random()*6)+1)); //because min number is 1 so u have to add 1 then floor it if the number is 0
        //int casting to force the answer to form an integer/.
    }
    public int get_number(){
        return number;
    }
    public static void main(String[] args) {
        Dice d1 = new Dice();
        d1.roll(); 
        System.out.println("Rolled number: " + d1.get_number());
        


    }
}

