package com.StringBulider类;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        String s4 = "Hello";
        System.out.println(s1==s2);//判断地址是否相等
        System.out.println(s2.equals(s3));//判断值是否相等
        System.out.println(s2.equalsIgnoreCase(s4));//不考虑大小写比较值是否相等
    }
}
