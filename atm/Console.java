package atm;

import java.util.Scanner;
import java.security.MessageDigest;


public class Console {

  Scanner sc;
  MessageDigest md;

  public void display(String text){
    System.out.println(text);
  }

  public int getPIN(){
    sc = new Scanner(System.in);
    String stringPin = sc.nextLine();

    try {
    md = MessageDigest.getInstance("SHA-256");
      }
      catch(NoSuchAlgorithmException ex){
        System.out.println("HVISHJSHFJKHFJK");
      }
    //these lines might need to be commented out while attempting to create hash from the input
    int intPin = Integer.parseInt(stringPin);
    return intPin;
  }

  public int cashRequest(){
    sc = new Scanner(System.in);
    String stringCashRequest = sc.nextLine();
    

    int intCashRequest = Integer.parseInt(stringCashRequest);
    return intCashRequest;
  }

}