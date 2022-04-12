package com.day1;

public class ArrayTest {
    public static void main(String[] args) {
//        定义数组长度
        int[] arr = new int[2];
//        输出数组在内存中的地址
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
//        遍历数组并将第i个元素的值赋值给下标为i
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i;
        }
        System.out.println("==================");
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("==================");
//        遍历数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
