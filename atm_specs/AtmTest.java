import static org.junit.Assert.assertEquals;
import org.junit.*;
import atm.*;

public class AtmTest{

  Atm atm;

 @Before
  public void before(){
    atm = new Atm("Sauchiehall St.");
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
    atm.giveCash(500);
    assertEquals(500, atm.getcashReserve());
    atm.fillUp();
    assertEquals(1000, atm.getcashReserve());
  }
}