//Code To do Bubble Sort by Arun Daniel
import java.util.*;
import java.io.*;

class Bubble{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int ch=0;

    do{
      int n;
      System.out.println("Enter the number of elements");
      n = s.nextInt();

      int a[];
      a = new int[n];
      int i=0,j=0;

      System.out.println("Enter the array to be sorted");
      for(i=0;i<n;i++){
        a[i] = s.nextInt();
      }

      //Sorting Begins

      for ( i=0 ; i<n ; i++ ) {
        for ( j=i ; j<n-1 ; j++ ) {
          if(a[j]>a[j+1]){
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
          }
        }
      }

      System.out.println("\nThe Sorted Array is::");
      for(i=0;i<n;i++){
        System.out.println(a[i]);
      }

      System.out.println("Do you want to repeat");
      ch = s.nextInt();

    }while(ch==1);
  }
}
