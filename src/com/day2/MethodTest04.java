package com.day2;

public class MethodTest04 {
    public static void main(String[] args) {
        getParameter("a","asd","zxc");
        getParameter(1,2,3);
    }
    public static void getParameter(String... a){
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void getParameter(int...a){
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
