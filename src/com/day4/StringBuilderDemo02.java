package com.day4;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
//        StringBuilder转换String类型
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append("world");
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
//        String转换StringBuilder
        String ss = "hello";
        StringBuilder sa = new StringBuilder(ss);
        System.out.println(sa);
    }
}
