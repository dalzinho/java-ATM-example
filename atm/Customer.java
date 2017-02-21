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

}