import static org.junit.Assert.assertEquals;
import org.junit.*;
import atm.*;

public class AccountTest{

  Atm atm;
  Customer customer;
  Account account;


 @Before
  public void before(){
    atm = new Atm("Sauchiehall St.");
    account = new Account(1000);
    customer = new Customer ("Slartibartfast", account);
  }

  @Test
  public void canGetBalance(){
    assertEquals(1000, account.getBalance());
  }

  @Test
  public void canDeductFromBalance(){
    account.deduct(100);
    assertEquals(900, account.getBalance());
  }

  @Test
  public void customerHasFunds(){
    assertEquals(true, account.hasFunds(1000));
    assertEquals(false, account.hasFunds(1010));
  }
}
