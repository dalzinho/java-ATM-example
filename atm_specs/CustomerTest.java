import static org.junit.Assert.assertEquals;
import org.junit.*;
import atm.*;

public class CustomerTest{

  Atm atm;
  Customer customer;


 @Before
  public void before(){
    atm = new Atm("Sauchiehall St.");
    customer = new Customer ("Slartibartfast", 300);
  }

  @Test
  public void canGetBalance(){
    assertEquals(300, customer.getBalance());
  }

  @Test
  public void canGetWalletCash(){
    assertEquals(0, customer.getCashInWallet());
  }

  @Test
  public void withdrawCashAdjustsBalance(){
    customer.withdrawCash(100, atm);
    assertEquals(200, customer.getBalance());  
    assertEquals(900, atm.getcashReserve()); 
    assertEquals(100, customer.getCashInWallet());
  }
}