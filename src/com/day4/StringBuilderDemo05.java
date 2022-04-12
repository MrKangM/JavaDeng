package com.day4;

import java.util.Scanner;

public class StringBuilderDemo05 {
    public static void main(String[] args) {
//        字符串对称
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String a = sc.next();
        String get = reserve(a);
        if(a.equals(get)){
            System.out.println("是对称的");
        }else{
            System.out.println("不是对称的");
        }
    }
    public static String reserve(String a){
        StringBuilder sb = new StringBuilder();
        String result = sb.append(a).reverse().toString();
        return result;
    }
}
