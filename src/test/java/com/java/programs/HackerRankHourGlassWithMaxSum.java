import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static int ROW = 5;
    public static int COL = 5;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxSum = findMaxSum(arr);

        if(maxSum == -1) {
            System.out.println("Not possible");
        } else {
            System.out.println(maxSum);
        }

        scanner.close();
    }

    public static int findMaxSum(int[][] arr) {
        if(ROW < 3 || COL < 3) {
            return -1;
        }
        int maxTotal = -1000;
        for(int i = 0; i <= ROW-2; i++) {
            for(int j = 0; j <= COL-2; j++) {

                int tempTotal = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) + 
                            (arr[i+1][j+1]) + 
                            (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                maxTotal = (maxTotal > tempTotal)? maxTotal: tempTotal;
                }
            }
            return maxTotal;
    }
}
