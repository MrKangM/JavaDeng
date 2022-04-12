package com.day5;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        System.out.println("get:"+arr.get(0));
        System.out.println("size:"+arr.size());
        System.out.println("remove:"+arr.remove(2));
        System.out.println("booleanRemove:"+arr.remove(1));
        System.out.println("set:"+arr.set(0,"asd"));
        System.out.println(arr);
    }
}
