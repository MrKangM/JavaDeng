package com.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo05 {
    public static void main(String[] args) {
//        查询元素
        String[] arr = {"张三","李四","张五","王二"};
        ArrayList<String> arr1 = new ArrayList<String>();
        for (int i = 0; i <arr.length ; i++) {
            arr1.add(arr[i]);
        }
        for (int j = 0; j <arr1.size() ; j++) {
            String s = arr1.get(j);
            if(s.startsWith("张")){
                System.out.println("第"+(j+1)+":"+arr1.get(j));
            }
        }
    }
}
