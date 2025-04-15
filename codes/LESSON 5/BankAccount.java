public class BankAccount {
    //attributes/datamembers
    String accountName;
    double accountBalance;

    //method/behavior
    //Constructor is a method does not have a return type "BankAccount"

    BankAccount(){
        accountName="Unknown"; //ATTRIBUTES
        accountBalance = 5000.00;
    }
    //SETTER METHODS/MUTATOR METHODS
    //void return type for setter method
    //attribute then argument accountName=name;
     void setterAccountName(String name){
        accountName=name;


    }
     void setterAccountBalance(double bal){

        accountBalance=bal;

     }
     //GETTER/ACCESOR METHODS
     //Read 
     String getterAccountName(){
        
        
        return accountName; 
        // unreachable code after the return statement System.out.println("hehe");
     }
     double getterAccountBalance(){
        
        
        return accountBalance;
     }

     //Functional methods
    void withdraw(double amount){
        if(amount<accountBalance){
        accountBalance=accountBalance-amount;
        }
    }
    void deposit(double amount){
        accountBalance=accountBalance+amount;
    }
    double checkBalance(){
        
        return accountBalance;
    }
}
