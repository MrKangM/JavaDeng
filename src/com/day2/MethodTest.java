package com.day2;

import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int point = maxormin(a,b);
        System.out.println("main"+point);
    }
    public static int maxormin(int a,int b){
        if(a>b){
            System.out.println("最大的是:"+a);
            return a;
        }else if(a<b){
            System.out.println("最大的是："+b);
            return b;
        }else{
            System.out.println("两个数相等");
            return a|b;
        }
    }
}

