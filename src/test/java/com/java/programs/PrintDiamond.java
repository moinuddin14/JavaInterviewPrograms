package com.java.programs;

public class PrintDiamond {
    public static void main(String[] args) {
        printDiamond(5);
    }
    public static void printDiamond(int num) {
        for(int i = num; i >=0; i--) {
            for(int j = 0;j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = num; k >= i;k--) {
                System.out.print("*");
            }
            for(int k = num-1; k >= i;k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = 1; i <=num; i++) {
            for(int j = 0;j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = num; k >= i;k--) {
                System.out.print("*");
            }
            for(int k = num-1; k >= i;k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
