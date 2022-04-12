package com.方法和switch;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        hello(a);
    }
//    定义一个hello方法
    public static void hello(int num){
        for (int i = 0; i <num ; i++) {
            int a = i + 1;
            System.out.println("第"+a+"次"+"HelloWorld!");
        }
    }
}
