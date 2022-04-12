package com.StringBulider类;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.length());//获取长度
        System.out.println(s1.charAt(2));//获取第二个下标的值
        System.out.println(s1.indexOf('o'));//获取出现第一个字符的下标位置
        System.out.println(s1.substring(3));//获取下标3后的值，包括3
        System.out.println(s1.substring(0,2));//获取0~1的值
    }
}
