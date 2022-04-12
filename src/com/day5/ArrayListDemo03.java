package com.day5;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        for (int i = 0; i <arr.size() ; i++) {
//            System.out.println(i+arr.get(i));
//            标准写法
            String s = arr.get(i);
            System.out.println(s);
        }
    }
}
