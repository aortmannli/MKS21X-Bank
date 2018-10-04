public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (double balance, int accountID, String password){
    this.balance = balance;
    this.accountID = accountID;
    this.password = password;
  }

  public double getBalance(){
    return balance;
  }

  public int getID(){
    return accountID;
  }

  public void setPass(String pass){
    password = pass;
  }
  public String toString(){
    return "Account ID: " + accountID + "\n" + "Balance: " + balance;
  }

  public boolean deposit(double ammount){
    if (ammount>0){
      balance += ammount;
      return true;
    }else{
      return false;
    }
  }

  public boolean withdraw(double ammount){
    if (balance>ammount){
      balance -= ammount;
      return true;
    }else{
      return false;
    }
  }
}

