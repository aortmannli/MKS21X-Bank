public class Driver{
  public static void main(String[] args){
    BankAccount boi = new BankAccount(300.00, 3684, "mypassword");
    System.out.println(boi);
    System.out.println(boi.getBalance());
    System.out.println(boi.getID());
    boi.setPass("hello!");

    if (boi.withdraw(50)){
      System.out.println("Withdrawal success! :^) \nYou new balance is: "+ boi.getBalance());
    }else{
      System.out.println("Withdrawal failure1 :'^( Please withdraw an amount fewer than: "+boi.getBalance());
    }

    if (boi.withdraw(500)){
      System.out.println("Withdrawal success! :^) \nYou new balance is: "+ boi.getBalance());
    }else{
      System.out.println("Withdrawal failure! :'^( \nPlease withdraw an amount fewer than: "+boi.getBalance());
    }

    if (boi.deposit(1000)){
      System.out.println("Deposit success! :^) \nYou new balance is: "+ boi.getBalance());
    }else{
      System.out.println("Deposit failure! :'^( \nPlease enter a positive ammount.");
    }

    if (boi.deposit(-10)){
      System.out.println("Deposit success! :^) \nYou new balance is: "+ boi.getBalance());
    }else{
      System.out.println("Deposit failure! :'^( \nPlease enter a positive ammount.");
    }
  }
}
