package atm;

import java.util.Scanner;

public class Console {

  Scanner sc;

  public void display(String text){
    System.out.println(text);
  }

  public int getPIN(){
    sc = new Scanner(System.in);
    String stringPin = sc.nextLine();
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