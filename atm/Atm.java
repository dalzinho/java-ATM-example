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
  }
  return result;
}

public void fillUp(){
  this.cashReserve = 1000;
}


}