package com.java.programs;

public class PrintPyramid {
    public static void main(String[] args) {
        printPyramid(7);
    }

    public static void printPyramid(int evenNumber) {
        printSpaces(evenNumber+1);
        System.out.println("*");

        for(int i = evenNumber; i >=1; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k= i;k >= i;k--) {
                System.out.print("*");
            }
            for(int l = evenNumber;l >= i;l--) {
                System.out.print(" ");
            }
            for(int l = evenNumber-1;l >= i;l--) {
                System.out.print(" ");
            }
            for(int k= i;k >= i;k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0;i <= (evenNumber+1); i++) {
            System.out.print(" *");
        }
    }

    public static void printSpaces(int num) {
        for(int i = 0;i<=num; i++) {
            System.out.print(" ");
        }
    }
}
