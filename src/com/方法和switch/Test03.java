package com.方法和switch;

public class Test03 {
    public static void main(String[] args) {
        int[] a ={1,2,3,6,9};
        int[] b = new int[5];
        int temp;
        for(int i = 0;i<b.length;i++){
            for (int j = a.length-1; j >= 0; j--) {
                b[i] = a[j];
                temp = b[i];
                a[j] = temp;
                System.out.println(b[i]);
            }
        }
    }
}
