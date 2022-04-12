package com.方法和switch;

public class MethodTest05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 11.2;
        double d = 11.2;
        equls(a,b);
        equls(c,d);
    }
    public static void equls(int a,int b){
        if(a==b){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
    public static void equls(double a,double b){
        if(a==b){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
}
