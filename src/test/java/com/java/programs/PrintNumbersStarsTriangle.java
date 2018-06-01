package com.java.programs;

public class PrintNumbersStarsTriangle {

	public static void main(String[] args) {
		
		printTriangle(6);

	}

	public static void printTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = rows; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}