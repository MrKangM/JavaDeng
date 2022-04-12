package com.方法和switch;

import java.util.Scanner;

public class MethodTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = getMax(a,b,c);
        System.out.println(d);
    }
    public static int getMax(int a,int b,int c){
        int temp = a>b?a:b;
        int max = temp > c ? temp : c;
        return max;
    }
}
