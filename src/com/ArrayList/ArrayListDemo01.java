package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
//        创建ArrayList
        ArrayList<String> arr = new ArrayList<String>();
//        添加元素
        arr.add("hello");
        arr.add("java");
        arr.add(0,"world");
        System.out.println(arr);
    }
}
