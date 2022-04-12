package com.day9;

public class extendsDemo03 {
    public static void main(String[] args) {
            B b = new B();
            b.show();
    }
}

class A {
    String name = "A";
}

class B extends A{
    String name = "B";
    public void show(){
        String name = "C";
        System.out.println("super.name:" + super.name);
        System.out.println("this.name:" + this.name);
        System.out.println("funtion.name:" + name);
        System.out.println("就近原则：" + name);
    }
}
