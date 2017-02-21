package atm;

public class Customer{

  private int wallet;
  private String name;
  private int balance;

  public Customer(String name, int balance){
    this.wallet = 0;
    this.name = name;
    this.balance = balance;
  }

  public int getBalance(){
    return this.balance;
  }

  public int getCashInWallet(){
    return this.wallet;
  }

  public void withdrawCash(int amount, Atm atm){
    wallet += atm.giveCash(amount);
    balance -= amount;
  }

}