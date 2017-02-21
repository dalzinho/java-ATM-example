package atm;

public class Runner{

  static Console console = new Console();
 static Account account = new Account(1000);
  static Customer customer = new Customer("Slartibartfast", account);
  static Atm atm = new Atm("Trongate");
 

  public static void main(String[] args) {
    // atm.newSession(customer);
  }
}