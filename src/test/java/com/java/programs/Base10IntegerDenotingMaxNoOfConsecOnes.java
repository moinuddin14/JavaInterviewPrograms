import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        getSumOfMaxOnesDigits(getBinaryOf(n));
        scanner.close();
    }

    private static String getBinaryOf(int number) {
        int binary;
        String finalBinaryNumber = "";
        while(number > 0) {
            binary = number % 2;
            finalBinaryNumber = finalBinaryNumber+""+binary;
            number = number/2;
        }
        return finalBinaryNumber;
    }

    private static void getSumOfMaxOnesDigits(String binaryNumber) {
        int globalMaxCountOfOnes = 0;
        int currentMaxCountOfOnes = 0;
        // int currentIndex= 0;
        String s = binaryNumber;
        for(int i = 0; i<binaryNumber.length();i++) {
            if(s.charAt(i) == '1'){
                currentMaxCountOfOnes += 1;
                // currentIndex = i;
                globalMaxCountOfOnes = (globalMaxCountOfOnes < currentMaxCountOfOnes) ? currentMaxCountOfOnes: globalMaxCountOfOnes;
            } else{
                currentMaxCountOfOnes = 0;
            }
        }

        System.out.println(globalMaxCountOfOnes);
    }
}
