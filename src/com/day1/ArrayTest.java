package com.day1;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i;
        }
        System.out.println("==================");
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("==================");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
