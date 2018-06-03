package com.java.programs;

public class PrintDiamondBorder {
    public static void main(String[] args) {
        printDiamondBorder(7);
    }

    public static void printDiamondBorder(int evenNumber) {
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

        for(int i = 0; i <=evenNumber; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k= i;k >= i;k--) {
                System.out.print("*");
            }
            for(int l = evenNumber-1;l >= i;l--) {
                System.out.print(" ");
            }
            for(int l = evenNumber;l >= i;l--) {
                System.out.print(" ");
            }
            for(int k= i;k >= i;k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        printSpaces(evenNumber+1);
        System.out.println("*");
    }

    public static void printSpaces(int num) {
        for(int i = 0;i<=num; i++) {
            System.out.print(" ");
        }
    }
}
