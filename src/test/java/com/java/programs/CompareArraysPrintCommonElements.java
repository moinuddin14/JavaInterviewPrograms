package com.java.programs;

public class CompareArraysPrintCommonElements {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 45, 8, 9, 5};
        int[] a2 = {3, 5, 7, 9, 18, 21};
        // Output => {3, 5, 9}
        commonElements(a1, a2);
    }

    public static void commonElements(int[] b1, int[] b2) {
        for(int i = 0; i < b1.length; i++) {
            for(int j = 0; j < b2.length; j++) {
                if(b1[i] == b2[j]) {
                    System.out.print(b2[j]+ " ");
                }
            }
        }
    }
}
