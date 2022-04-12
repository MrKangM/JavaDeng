package com.接口和案例;
/*
* 接口成员特点：
		只能有抽象方法
		只能有常量
		抽象方法只能使用public和abstract关键字修饰
		常量默认使用public&static&final关键字修饰
*  注意：
		接口不能创建对象(不能实例化)
		类与接口是实现关系，一个类实现一个接口就必须实现他所有的抽象方法
 */
public class interfaceDemo02 {
    public static void main(String[] args) {
        C c = new C();
        c.eat();
        c.drink();
    }
}
// 建议：
//	定义接口类建议手动填上public abstract修饰方法
interface A {
    int NUM = 10;
    public abstract void eat();
    public abstract void sleep();
}

class B{
    public void drink(){
        System.out.println("喝");
    }
}

class C extends B implements A {
    @Override
    public void eat(){
        System.out.println("吃饭"+NUM);
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
