//Student details program
import java.io.*;
import java.util.*;

class Student{
  public static void main(String[] args) {

      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Your name");
      String name = s.next();
      System.out.println("Enter your age");
      int age = s.nextInt();
      System.out.println("Enter your Address");
      String address = s.next();
      System.out.println("Enter your height");
      float height = s.nextFloat();
      System.out.println("Enter your weight");
      float weight = s.nextFloat();
      System.out.println("Enter your hobby");
      String hobby = s.next();

      System.out.println("The entered Name is:" + name);
      System.out.println("The entered Age is:" + age);
      System.out.println("The entered Address is:" + address);
      System.out.println("The entered height is:" + height);
      System.out.println("The entered weight is:" + weight);
      System.out.println("The entered hobby is:" + hobby);
  }
}
