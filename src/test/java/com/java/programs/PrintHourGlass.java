package com.java.programs;

public class PrintHourGlass {

    public static void main(String[] args) {
        printDiamond(6);
    }

    public static void printDiamond(int num) {
        for(int i = num;i >=1; i--) {
            for(int j = num; j>= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k<= i;k++) {
                System.out.print("$");
            }
            for(int k = 1; k<= i;k++) {
                System.out.print("$");
            }
            System.out.println("");
        }

        for(int i = 2;i <=num; i++) {
            for(int j = num; j>= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k<= i;k++) {
                System.out.print("$");
            }
            for(int k = 1; k<= i;k++) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}
