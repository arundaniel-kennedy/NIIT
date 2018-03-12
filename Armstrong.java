//To find the Armstrong of an number
import java.io.*;
import java.util.*;

class Armstrong{
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int ch=0;

    do{
    int num=0,sum=0;

    System.out.println("Enter the Number");
    num = s.nextInt();

    int temp = num;

     while(num != 0){
       int digit = num % 10;
       digit = digit * digit * digit;
//	System.out.println("dig " + digit);
       sum += digit;
//	System.out.println("sum " + sum);
       num = num / 10;
//	System.out.println("num " + num);
     }

     if(temp == sum)
      System.out.println("It's a Armstrong");
     else
      System.out.println("It's not a Armstrong");

      System.out.println("Do you want to continue");
      ch = s.nextInt();
  }while(ch==1);
}
}
