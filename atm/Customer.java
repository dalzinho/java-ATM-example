package atm;

public class Customer{

  private int wallet;
  private String name;
  private Account account;

  public Customer(String name, Account account){
    this.wallet = 0;
    this.name = name;
    this.account = account;
  }

  public int getCashInWallet(){
    return this.wallet;
  }

  public void withdrawCash(int amount, Atm atm){
    wallet += atm.giveCash(amount);
    // balance -= amount;
  }

}