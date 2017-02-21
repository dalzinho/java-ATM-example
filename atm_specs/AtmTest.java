import static org.junit.Assert.assertEquals;
import org.junit.*;
import atm.*;

public class AtmTest{

  Atm atm;
  Account account;
  Customer customer;

 @Before
  public void before(){
    atm = new Atm("Sauchiehall St.");
    account = new Account(1000);
    customer = new Customer("Slartibartfast", account);

  }

  @Test
  public void canGetCashReserve(){
    assertEquals(1000, atm.getcashReserve());
  }

  @Test
  public void canGiveCash(){
    assertEquals(100, atm.giveCash(100));
    assertEquals(900, atm.getcashReserve());

  }

  @Test
  public void canFillUpATM(){
    atm.giveCash(250);
    assertEquals(750, atm.getcashReserve());
    atm.fillUp();
    assertEquals(1000, atm.getcashReserve());
  }

  @Test 
  public void testIsWithinMaxIssue(){
    assertEquals(true, atm.isWithinMaxIssue(250));
    assertEquals(false, atm.isWithinMaxIssue(260));
  }

  @Test
  public void testATMFundsAvailable(){
    atm.giveCash(250);
    atm.giveCash(250);
    atm.giveCash(250);
    atm.giveCash(200);
    assertEquals(true, atm.isATMFundsAvailable(50));
    assertEquals(false, atm.isATMFundsAvailable(60));
  }

  @Test
  public void wontGiveMoreThanMaxWithdrawal(){

    assertEquals(250, atm.giveCash(250));
    assertEquals(0, atm.giveCash(260));
  }

  @Test
  public void checkPinReturnsValidResponse(){
    assertEquals(true, atm.checkPin(customer, 1234));
  }
}