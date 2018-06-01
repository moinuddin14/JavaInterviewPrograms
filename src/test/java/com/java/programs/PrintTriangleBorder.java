package com.java.programs;

public class PrintTriangleBorder {

	public static void main(String[] args) {
		printTriangleBorderImpl(9);
	}
	
	public static void printTriangleBorderImpl(int rows) {
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j<= i; j++) {
				if(i == 1)
					System.out.print("@ ");
				else if(i == rows) {
					if(rows % 2== 0) {
						for(int k = 1 ; k < (rows/2 + 2); k++){
							System.out.print("@ ");
						}	
					}else {
						for(int k = 1 ; k < (rows/2 + 3); k++){
							System.out.print("@ ");
						}	
					}
					break;
				}
				else if((j == 1) || (j == i))
					System.out.print("@ ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}