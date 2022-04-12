package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo04 {
    public static void main(String[] args) {
//        自定义添加元素
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        while(true){
            String a = sc.next();
            if(a.equals("end")){
                break;
            }
            arr.add(a);
        }
        for (int i = 0; i <arr.size() ; i++) {
            String s = arr.get(i);
            System.out.println(s);
        }
    }
}
