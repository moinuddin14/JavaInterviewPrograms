package com.java.programs;

public class PrimeOrNot {
    public static void main(String[] args) {
        isPrime(70);
    }

    public static void isPrime(int num) {
        int count = 0;
        for(int i = 2;i < num/2; i++) {
            if(num%i == 0){
                count++;
                break;
            }
        }
        if(count>0) {
            System.out.println("Number "+num+" is not prime");
        } else {
            System.out.println("Number "+num+" is prime");
        }
    }
}