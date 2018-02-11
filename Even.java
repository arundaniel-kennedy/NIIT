//To Display the first n Even numbers
import java.io.*;
import java.util.*;

class Even{
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number of Even numbers you want to display");
    int n = s.nextInt();

    System.out.println("The Even Numbers");

    for (int i=2 ; i<=n ; i+=2 ) {
        System.out.println(i);
      }

    }
}
