package com.java.programs;

import java.util.Scanner;

public class PrintSquareBs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Rows");
		int i = scanner.nextInt();
		System.out.println("Enter Cols");
		int j = scanner.nextInt();
		printSquare(i, j);
	}

	public static void printSquare(int height, int width) {
		if((height == 0 ) || (width == 0)) {			
			System.out.println("Height & Width cannot be zero");
		}else {
			for(int i = 1; i <= height; i++) {
				for(int j = 1; j <= width; j++) {
					System.out.print("B ");
				}
				System.out.println();
			}
		}
	}
}
