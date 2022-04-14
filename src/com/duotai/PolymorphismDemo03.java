package com.duotai;
/*
* 多态转型
*   向上转型
*   向下转型
* */
public class PolymorphismDemo03 {
    public static void main(String[] args) {
//        向上转型
        A a = new B();
        a.eat();
//        a.drink();
//        向下转型 父类可以调用到子类方法
        B c = (B)a;
        c.drink();
        c.eat();
    }
}

class A {
    public void eat(){
        System.out.println("吃");
    }
}

class B extends A{
    public void eat(){
        System.out.println("重写eat");
    }
    public void drink(){
        System.out.println("喝");
    }
}
