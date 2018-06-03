package com.java.programs;

public class PrintPyramid {
    public static void main(String[] args) {
        printPyramid(6);
    }

    public static void printPyramid(int evenNumber) {
        System.out.println("#");
        for(int i = evenNumber; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for(int k = evenNumber; k >= i; k--) {
                System.out.print(" ");
            }
            for(int k = evenNumber; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println("");
        }

        for(int i = evenNumber+1; i >= 0; i--) {
            System.out.print("# ");
        }
    }
}
