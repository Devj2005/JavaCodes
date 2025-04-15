public class Account2 {
  public static void main (String args[]){
    //myAccount is a reference
    //4 objects cretaed using the constructor "new BankAccount"
    //you have called the BankACCOUNT

    BankAccount myAccount = new BankAccount();
    BankAccount yourAccount = new BankAccount();
    BankAccount hisAccount = new BankAccount();
    BankAccount herAccount = new BankAccount();

   /*  System.out.println(myAccount.accountName);
    System.out.println(hisAccount.accountName);
    System.out.println(yourAccount.accountName);
    System.out.println(herAccount.accountName); */

   myAccount.setterAccountName("N.Achieng");
   yourAccount.setterAccountName("Devyan");
   hisAccount.setterAccountName("Azhar");
   herAccount.setterAccountName("Love");

   myAccount.setterAccountBalance(5000.0);
  hisAccount.setterAccountBalance(3000.0);
  System.out.println("Her account name is: "+herAccount.getterAccountName());
  //string x - "Her account name is: "+ herAccount.getterAccountName();
  //sout(x);
  myAccount.deposit(13000);
  myAccount.withdraw(3000);

  double balance =  hisAccount.checkBalance();
  System.out.println(balance);




  


}
}
