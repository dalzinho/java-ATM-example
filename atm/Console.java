package atm;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Console {

  Scanner sc;
  String hash;

  public void display(String text){
    System.out.println(text);
  }

  public String getPIN(){
    sc = new Scanner(System.in);
    String stringPin = sc.nextLine();

    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(stringPin.getBytes());
    //thanks to http://www.java2s.com/Code/Java/Security/EncryptpasswordbyusingSHA256algorithmencryptedPasswordlengthis32bits.htm
    //for the bit below!
      hash = new sun.misc.BASE64Encoder().encode(md.digest());

    }
    catch(NoSuchAlgorithmException ex){
      System.out.println("HVISHJSHFJKHFJK");
    }
    //these lines might need to be commented out while attempting to create hash from the input
    // int intPin = Integer.parseInt(stringPin);
    // return intPin;
    
 // this bit was so i could see the hash to store it
      System.out.println(hash);
    return hash;
  }

  public int cashRequest(){
    sc = new Scanner(System.in);
    String stringCashRequest = sc.nextLine();
    

    int intCashRequest = Integer.parseInt(stringCashRequest);
    return intCashRequest;
  }

}