package com.day3OOD;

public class Phone {
    String borad;
    int price;
    String color;
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void send(String name,String borad,int price,String color){
        System.out.println("用价值"+price+"的"+color+"色"+borad+"手机给"+name+"发短信");
    }
}
