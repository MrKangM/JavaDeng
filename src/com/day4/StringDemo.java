package com.day4;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        String s4 = "Hello";
        System.out.println(s1==s2);
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
