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

  public String withdrawCash(int amount, Atm atm){
    
    String operationState;

    if(getAccount().hasFunds(amount)){

      int returnedCash = atm.giveCash(amount);

      if(returnedCash > 0){
        wallet += atm.giveCash(amount);
        this.account.deduct(amount);
        operationComplete = true;
      }
      else {
        operationComplete = false;
      }
    
    else{
      operationComplete = false;
    }
   
    //else add console message 
}  
  return operationComplete;
}


  public Account getAccount(){
    return this.account;
  }

  public int getPin(){
    return this.pin;
  }


}
