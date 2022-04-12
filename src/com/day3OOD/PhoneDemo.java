package com.day3OOD;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.borad = "华为";
        p.price = 9999;
        p.color = "red";
        p.call("张三");
        p.send("李四","水果",6999,"骚粉");
    }
}
