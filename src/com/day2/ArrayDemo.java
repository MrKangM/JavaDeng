package com.day2;

public class ArrayDemo {
    public static void main(String[] args) {
//        静态初始化完全版
        int [] arr1 = new int[]{1,2,3};
//        静态初始化简写版
        int [] arr2 = {4,5,6};
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("=====================");
        for (int a = 0; a < arr2.length ; a++) {
            System.out.println(arr2[a]);
        }
    }
}
