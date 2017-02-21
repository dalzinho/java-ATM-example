package atm;

public class Customer{

  private int wallet;
  private String name;
  private Account account;
  private int pin;

  public Customer(String name, Account account){
    this.wallet = 0;
    this.name = name;
    this.account = account;
    this.pin = 1234;
  }

  public int getCashInWallet(){
    return this.wallet;
  }

  public boolean withdrawCash(int amount, Atm atm){
    boolean operationComplete;
    if(getAccount().hasFunds(amount)){
      wallet += atm.giveCash(amount);
      this.account.deduct(amount);
      operationComplete = true;
    }
    else{
      operationComplete = false;
    }
    return operationComplete;
    //else add console message 
  }

  public Account getAccount(){
    return this.account;
  }

  public int getPin(){
    return this.pin;
  }


}