package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        System.out.println("get:"+arr.get(0));//获取第一个元素
        System.out.println("size:"+arr.size());//获取数组长度
        System.out.println("remove:"+arr.remove(2));//删除第三个元素
        System.out.println("booleanRemove:"+arr.remove(1));//删除第二个元素
        System.out.println("set:"+arr.set(0,"asd"));//设置第一个元素值
        System.out.println(arr);
    }
}
