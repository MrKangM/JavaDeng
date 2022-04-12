package com.day5;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("java");
        arr.add(0,"world");
        System.out.println(arr);
    }
}
