package com.java.programs;

public class PrintNumbersTopDownBottomUp {

	public static void main(String[] args) {
		printNumbers();
	}
	
	public static void printNumbers() {
		for(int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30; a <= 10; a++, b--, c++, d--, e++, f--) {
			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		}
	}
}