//Calculator program by Dany
import java.io.*;
import java.util.*;

class Calculator{
  public static void main(String[] args) {
    System.out.println("Welcome to the simple Arithmetic Calculator");

    Scanner s = new Scanner(System.in);
    int choice2,choice3;

    do{
    System.out.println("Enter number 1");
    int num1 = s.nextInt();
    System.out.println("Enter number 2");
    int num2 = s.nextInt();

  do{
    System.out.println("Enter what you want to do with these numbers");
    String choice1 = s.next();
    switch (choice1) {
      case "addition" :System.out.println("Doing Addition");
                  System.out.println("The Sum of " + num1 + " and " + num2 + " is:" + (num1 + num2));
                  break;
  case "subtraction" :System.out.println("Doing Subtraction");
                  System.out.println("The Difference of " + num1 + " and " + num2 + " is:" + (num1 - num2));
                  break;
case "multiplication" :System.out.println("Doing Multiplication");
                  System.out.println("The Product of " + num1 + " and " + num2 + " is:" + (num1 * num2));
                  break;
  case "division" :System.out.println("Doing Division");
                  System.out.println("The Quotient of " + num1 + " and " + num2 + " is:" + (num1 / num2));
                  break;
    case "modulo" :System.out.println("Doing Modulo");
                  System.out.println("The Remainder of " + num1 + " and " + num2 + " is:" + (num1 % num2));
                  break;
      default:
              System.out.println("PLS check whether the right choice was selected");
    }
    System.out.println("Do you want to try another Operation (1/2)");
    choice2 = s.nextInt();
  }while( choice2 == 1);
  System.out.println("Do you want to Change the NUmber set (1/2)");
  choice3 = s.nextInt();
}while(choice3 == 1);
    System.out.println("Thanks for using");
    }

}
