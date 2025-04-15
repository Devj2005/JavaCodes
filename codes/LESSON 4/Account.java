public class Account{ //parent of this is the object
    private String accountNumber;
    private String accountName;
    private String accountType;
    private double balance;

//NO MAIN METHOD
    //methods/behaviours

public void withdraw(double amount){
    
    balance=balance-amount;
}

public void deposit(double amount){
   
    balance= balance +amount; 
}

   
   public double checkBalance(){


    return balance;
   } 

    
}