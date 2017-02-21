package atm;

public class Customer{

  private int wallet;
  private String name;
  private Account account;
  private String pin;

  public Customer(String name, Account account){
    this.wallet = 0;
    this.name = name;
    this.account = account;
    this.pin = "2/9TQaytXipY2079XnLi2aCoQ6KOArEYPGgWLQo6PeY=";
  }

  public int getCashInWallet(){
    return this.wallet;
  }

  public String withdrawCash(int amount, Atm atm){
    
    String operationOutcome;

    if(getAccount().hasFunds(amount)){

      int returnedCash = atm.giveCash(amount);

      if(returnedCash > 0){
        wallet += atm.giveCash(amount);
        this.account.deduct(amount);
        operationOutcome = "Please wait while your money is being counted.";
      }
      else {
        operationOutcome = "Unable to complete this transaction";
      }
    
   
    //else add console message 
}  
else{
  operationOutcome = "Insufficient funds for this transaction.";
}
  return operationOutcome;
}


  public Account getAccount(){
    return this.account;
  }

  public String getPin(){
    return this.pin;
  }


}
