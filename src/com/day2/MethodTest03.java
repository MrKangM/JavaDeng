package com.day2;

import java.util.Scanner;

public class MethodTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        getNum(a);
    }
    public static int num(int num){
        int b = 1;
        while(true){
            System.out.println(b);
            b++;
            if(b==num){
                break;
            }
        }
        return b;
    }

    public static void getNum(int num){
        for (int i = 1; i <= num ; i++) {
            System.out.println(i);
        }
    }
}
