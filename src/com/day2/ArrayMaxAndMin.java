package com.day2;

public class ArrayMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {6,8,1,5,10};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max = arr[i];

            }
        }
        System.out.println("最大值是："+max);
        System.out.println("=================0");
        for (int a = 0; a <arr.length ; a++) {
            if(min>arr[a]){
                min = arr[a];
            }
        }
        System.out.println("最小值是："+min);
    }
}
