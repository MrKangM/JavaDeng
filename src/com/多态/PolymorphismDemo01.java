package com.多态;
/*
* 多态的实现：
*   字父类继承关系
*   方法重写
*   父类引用指向子类子类对象
* */
public class PolymorphismDemo01 {
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
//      父类引用指向子类对象
//      父类：Animal类
//      子类：cat类
        Animal a = new cat();
        a.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}

//字父类继承
class cat extends Animal{
//    方法重写
    public void eat(){
        System.out.println("猫吃鱼");
    }
}