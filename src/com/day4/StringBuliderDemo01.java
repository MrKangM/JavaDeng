package com.day4;

public class StringBuliderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(123);
        sb.append('c');
        sb.append(1.23);
        sb.append(false);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
