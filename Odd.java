//To Display the first n Odd numbers
import java.io.*;
import java.util.*;

class Odd{
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number of Odd numbers you want to display");
    int n = s.nextInt();

    System.out.println("The odd Numbers");

    for (int i=1 ; i<=n ; i++ ) {
      if (i % 2 != 0) {
        System.out.println(i);
      }

    }
  }
}
