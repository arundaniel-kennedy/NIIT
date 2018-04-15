import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Timeconversion {

    static void timeConversion(String s) {
        String a[] = s.split("");
        int i=0;
        int n = s.length();

        /*for (String temp: a){
          System.out.println(temp);
       }*/

       // System.out.println(n);

        int am = 0, pm = 0;

            if(a[n-2].equals("A"))am++;
            else if(a[n-2].equals("P")) pm++;
            else System.out.println("Invalid");

        //System.out.println(a[n-2]);

         if(am!=0){
            if(a[0].equals("1") && a[1].equals("2")){
                a[0] = "0";
                a[1] = "0";
                System.out.println("00:" + a[3]+a[4]+ ":" +a[6]+a[7] );
            }
            else {
                System.out.println(a[0]+a[1]+ ":" + a[3]+a[4]+ ":" +a[6]+a[7]);
            }
         }

              if(pm!=0){
            if(a[0].equals("1") && a[1].equals("2")){
                System.out.println("12:" + a[3]+a[4]+ ":" +a[6]+a[7] );
            }
            else {
                int d = Integer.parseInt(a[0]+a[1]);
                d+=12;

                String t = String.valueOf(d);
                //System.out.println("::::"+t);
                String e[] = t.split("");
                a[0] = e[0];
                a[1] = e[1];
                System.out.println(a[0]+a[1]+ ":" + a[3]+a[4]+ ":" +a[6]+a[7]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion(s);
        //System.out.println(result);
    }
}
