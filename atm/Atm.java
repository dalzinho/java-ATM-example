package atm;

public class Atm{

  private int cashReserve;
  private String location;
  private int maxWithdrawal;

  public Atm(String location){
    this.cashReserve = 1000;
    this.location = location;
    this.maxWithdrawal = 250;
  }

  public int getcashReserve(){
    return this.cashReserve;
  }

  public int giveCash(int amount){
    this.cashReserve -= amount;
    return amount;
  }

  public void fillUp(){
    this.cashReserve = 1000;
  }


}