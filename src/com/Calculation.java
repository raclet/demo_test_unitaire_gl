package com;

public class Calculation {

    public static int findMax(int arr[]) {
        int max = 0; // BUG HERE!!!
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    // You shouldn't test your method with in a main...
//    public static void main(String[] args) {
//        System.out.println("test 1 : " + findMax(new int[]{1, 2, 3}));
//        System.out.println("test 2 : " + findMax(new int[]{5, 2, 3}));
//
//    }

}
