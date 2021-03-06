import static org.junit.Assert.assertEquals;
import org.junit.*;
import atm.*;

public class CustomerTest{

  Atm atm;
  Account account;
  Customer customer;


 @Before
  public void before(){
    atm = new Atm("Sauchiehall St.");
    account = new Account(1000);
    customer = new Customer ("Slartibartfast", account);
  }



  @Test
  public void canGetWalletCash(){
    assertEquals(0, customer.getCashInWallet());
  }

  @Test
  public void canGetAccount(){
    assertEquals(1000, customer.getAccount().getBalance());
  }

  @Test
  public void withdrawCashAdjustsBalance(){
    customer.withdrawCash(100, atm);
    assertEquals(900, customer.getAccount().getBalance());
    assertEquals(900, atm.getcashReserve()); 
    assertEquals(100, customer.getCashInWallet());
  }

  @Test
  public void customerCannotExceedAccountBalance(){
    customer.withdrawCash(250, atm);
    customer.withdrawCash(250, atm);
    customer.withdrawCash(250, atm);
    customer.withdrawCash(200, atm);
    //withdrawals total 950
    customer.withdrawCash(100, atm);
    //withdrawal would exceed balance (i.e. 1000)
    assertEquals(50, customer.getAccount().getBalance());
  }

  @Test
  public void canRetrieveCorrectPin(){
    assertEquals("2/9TQaytXipY2079XnLi2aCoQ6KOArEYPGgWLQo6PeY=", customer.getPin());
  }
}