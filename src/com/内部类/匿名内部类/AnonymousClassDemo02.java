package com.内部类.匿名内部类;

public class AnonymousClassDemo02 {
    public static void main(String[] args) {
        cat c = new cat();
        c.method();
    }
}

interface animal{
    public void shout();
}

class cat{
    public void method(){
//        第二种匿名内部类的使用方法
        animal a = new animal() {
            @Override
            public void shout() {
                System.out.println("猫在叫");
            }
        };
//        调用父类方法
        a.shout();
    }
}