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

  
}