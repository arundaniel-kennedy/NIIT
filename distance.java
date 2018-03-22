//The score taken by two boys at throwing
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class distance {


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
       int count1=0,count2=0;
        for(int i=0;i<apples.length;i++){
            if(apples[i]+a>=s&&apples[i]+a<=t)count1++;
        }
        for(int i=0;i<oranges.length;i++){
            if(oranges[i]+b>=s&&oranges[i]+b<=t)count2++;
        }
        System.out.println(count1+"\n"+count2);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scan.nextLine().split(" ");

        int s = Integer.parseInt(st[0].trim());

        int t = Integer.parseInt(st[1].trim());

        String[] ab = scan.nextLine().split(" ");

        int a = Integer.parseInt(ab[0].trim());

        int b = Integer.parseInt(ab[1].trim());

        String[] mn = scan.nextLine().split(" ");

        int m = Integer.parseInt(mn[0].trim());

        int n = Integer.parseInt(mn[1].trim());

        int[] apple = new int[m];

        String[] appleItems = scan.nextLine().split(" ");

        for (int appleItr = 0; appleItr < m; appleItr++) {
            int appleItem = Integer.parseInt(appleItems[appleItr].trim());
            apple[appleItr] = appleItem;
        }

        int[] orange = new int[n];

        String[] orangeItems = scan.nextLine().split(" ");

        for (int orangeItr = 0; orangeItr < n; orangeItr++) {
            int orangeItem = Integer.parseInt(orangeItems[orangeItr].trim());
            orange[orangeItr] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apple, orange);
    }
}
