package com.java.programs;

public class PrintNumbersStarsReverseTriangle {

	public static void main(String[] args) {
		printTriangle(6);
	}

	public static void printTriangle(int rows) {
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j<=rows-i; j++) {
				System.out.print(j);
			}
			for(int k = rows; k >= rows-i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}