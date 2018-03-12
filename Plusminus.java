//To find the number of plus and minus in an array
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plusminus{

    static void plusMinus(int[] arr,int n) {
        float count1=0,count2=0,count3=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){ count1++;}
            else if(arr[i]<0){count2++;}
            else if(arr[i]==0){count3++;}
        }

        System.out.println(count1/n);
        System.out.println(count2/n);
        System.out.println(count3/n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr,n);
        in.close();
    }
}
