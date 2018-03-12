//To find the Difference in Diagonals of a Matrix
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference{

    static int diagonalDifference(int[][] a,int n) {
        int sum1=0,sum2=0,dif=0;

        for(int i=0;i<n;i++){
            sum1 += a[i][i];
        }

        for(int i=0;i<n;i++){
            sum2 += a[n-1-i][i];
        }

        dif = (sum1 - sum2);
        if(dif<0)dif = -dif;

        return dif;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
