//To Display ten or n Natural numbers
import java.io.*;
import java.util.*;

class Natural{
  public static void main(String[] args) {
    int choice;
    Scanner s = new Scanner(System.in);
do{
    System.out.println("Enter the Number of Natural Numbers you want to display");
    int n = s.nextInt();

    for (int i=1 ;i<=n ;i++ ) {
        System.out.println(i);
    }
  System.out.println("Do you want to reapeat it again (1/2) ");
  choice = s.nextInt();
}while(choice == 1);
  }

}
