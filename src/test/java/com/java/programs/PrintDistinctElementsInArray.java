package com.java.programs;

public class PrintDistinctElementsInArray {

    // [1, 2, 3, 4, 5, 1, 23, 12, 8, 4, ]
    // [2, 3, 5, 23, 12, 8, 4]

    public static int[] arr = {1, 2, 3, 4, 5, 1, 23, 12, 8, 4, 1};

    public static void main(String[] args) {
        printDistElems(arr) ;
    }

    public static void printDistElems(int[] elems) {
//        Integer[] distArray = null;
        for(int i = 0; i < elems.length; i++) {
            boolean flag = false;
            int k = 0;
            for(int j = 0; j < elems.length; j++) {
                if(elems[j] == elems[i]) {
                    k++;
                }

                if(k > 1) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.print(elems[i]+ " ");
            }
        }
    }
}
