//This is to Find Prime Number
import java.io.*;
import java.util.*;
import java.math.*;

class Prime{
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int flag = 0;
    int ch = 0;

do{
    System.out.println("Enter the number you want to check as Prime number");
    int n = s.nextInt();

    flag = 0;

    for (int i=2 ; i<=n/2 ; i++ ) {

      if( n%i == 0 ){
        flag++;
        break;
      }
      }
      if (flag !=0) {
        System.out.println("Not prime");
        }
      else {
        System.out.println("Prime");
      }
      System.out.println("Do you want to repeat (1/2)");
      ch = s.nextInt();
  }while(ch == 1);
}
}
