package atm;

public class Account{

  private Customer owner;
  private int balance;

  public Account(Customer owner, int balance){
    this.owner = owner;
    this.balance = balance;
  }
  
}