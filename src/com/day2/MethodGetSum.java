package com.day2;

import java.util.Scanner;

public class MethodGetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = getSum(a,b);
        System.out.println(sum);
        System.out.println(getSum(a,b));
    }
    public static int getSum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
}
