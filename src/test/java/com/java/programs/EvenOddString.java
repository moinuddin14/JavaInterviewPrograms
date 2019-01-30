import java.io.*;
import java.util.*;

// Input example as below. 
/* 
2
Hacker
Rank 
*/
// Output as below. 
/*
Hce akr
Rn ak
*/


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        if(i >= 1 && i <= 10){
            while(sc.hasNextLine()){
                 String S = sc.nextLine();
                 char[] ch = S.toCharArray();
                 if(ch.length >= 2 && ch.length <= 10000)
                    System.out.println(get(S));
            }
        }
    }

    public static String get(String S) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        char[] ch = S.toCharArray();
        for(int j = 0; j < ch.length; j++) {
            if(j == 0) 
                a.append(ch[j]);
            else if(j%2 == 0)
                a.append(ch[j]);
            else
                b.append(ch[j]);
        }
        return a+" "+b;
    }
}
