//To print # in the form of Staircases
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase{

    static void staircase(int n) {
        int temp = n,j=0;
        while(j<=temp){
        for(int i=n-1;i!=0;i--){
            System.out.println(" ");
        }
        for(int i=0;i<=j;i++){
            System.out.println("#");
        }
            n -= 1;
            j++;
             System.out.println("\n");
        }
}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
