package com.方法和switch;

public class MethodTest06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("第一次遍历结果："+arr[i]);
        }
        change(arr);
        for (int j = 0; j < arr.length ; j++) {
            System.out.println("change方法后遍历结果："+arr[j]);
        }
    }
    public static void change(int[] a){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2==0){
                a[i] += 1;
            }
            System.out.println("change方法遍历结果："+a[i]);
        }
    }
}
