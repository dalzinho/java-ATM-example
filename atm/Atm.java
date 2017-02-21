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

public int requestPin(Console console){
  console.display("Please enter your PIN:");
  return console.getPIN();
}

public boolean checkPin(Customer customer, int enteredPin){
  return customer.getPin() == enteredPin;
}

public int requestCash(Console console){
  console.display("How much would you like to withdraw?");
  return console.cashRequest();
}

public void newSession(Customer customer, Console console){
  boolean pinCorrect = false;

  while(pinCorrect == false){
    int enteredPin = requestPin(console);
    if(checkPin(customer, enteredPin)){
      pinCorrect = true;
      console.display("Correct Pin!");
    }
  }

 int requestedAmount = requestCash(console);
 customer.withdrawCash(requestedAmount, this);

}

}


