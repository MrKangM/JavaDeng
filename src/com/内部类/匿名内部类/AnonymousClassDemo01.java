package com.内部类.匿名内部类;
/*
*   匿名内部类：
*       可以把匿名内部类看成一个没有名字的局部内部类
*       定义在方法当众
*       必须在定义匿名内部类的时候创建他的对象
*
* 格式：
*       new 类/接口{};
*       如果是创建了继承这个类的子类对象，我们可以重写父类的方法
*       如果是创建实现这个接口的子类对象，我们必须实现接口中的所有方法
*
* 原理：
*       创建了这个类的子类对象对象或者是实现了这个接口的所有方法
* */
public class AnonymousClassDemo01 {
    public static void main(String[] args) {
        student s = new student();
        s.method();
    }
}

//创建接口
interface people{
    public void eat();
}

class student{
    public void method(){
//        创建匿名内部类
        new people(){
//            重写方法
            @Override
            public void eat() {
                System.out.println("eat()");
            }
        }.eat();
    }
}