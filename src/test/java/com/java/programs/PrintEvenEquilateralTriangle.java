package com.java.programs;

public class PrintEvenEquilateralTriangle {

    public static void main(String[] args) {
        PrintEvenEquiTriangle(6);
    }

    public static void PrintEvenEquiTriangle(int evenNumber) {
        for(int i = evenNumber; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = evenNumber; k >= i; k--) {
                System.out.print("*");
            }
            for(int k = evenNumber; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}