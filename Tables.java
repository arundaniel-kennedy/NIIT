//This program is to display the tables in tables
import java.io.*;
import java.util.*;

class Tables{
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int ch = 0;

    do{
    System.out.println("Enter the Multiplicand");
    int num = s.nextInt();

    for ( int i=1 ; i<=10 ; i++ ) {
      System.out.println(num + " * " + i + " = " + (num*i));
    }
    System.out.println("Do you want to try again (1/2)");
    ch = s.nextInt();

  }while(ch == 1);
}
}
