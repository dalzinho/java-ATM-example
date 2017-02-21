package atm;

public class Atm{

  private int cashReserve;
  private String location;
  private int maxIssue;

  public Atm(String location){
    this.cashReserve = 1000;
    this.location = location;
    this.maxIssue = 250;
  }

  public int getcashReserve(){
    return this.cashReserve;
  }

  public boolean isWithinMaxIssue(int amount){
    return amount <= this.maxIssue;
  }


  public boolean isATMFundsAvailable(int amount){
    return amount <= cashReserve;
  }
  

  public int giveCash(int amount){

    int result;

    if (isWithinMaxIssue(amount) && isATMFundsAvailable(amount)){
     this.cashReserve -= amount;
     result = amount;
   }
   else {
    result = 0;
    // return something to console from here?
  }
  return result;
}

public void fillUp(){
  this.cashReserve = 1000;
}

public boolean checkPin(Customer customer, int pin){
  return customer.getPin() == pin;
}

public void newSession(Customer customer, Console console){
  console.display("Please enter your PIN:");    
  if (console.getPIN() == customer.getPin()){
    console.display("PIN Correct!");
  }

}


}