package atm;

public class Account{

  private int balance;

  public Account(int startingBalance){

    this.balance = startingBalance;
  }

  public int getBalance(){
    return this.balance;
  }

  public void deduct(int amount){
    this.balance -= amount;
  }

}