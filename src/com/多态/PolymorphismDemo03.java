package com.多态;
/*
* 多态转型
*   向上转型
*   向下转型
* */
public class PolymorphismDemo03 {
    public static void main(String[] args) {
//        向上转型
//        编译看左边，运行看右边
//        eat方法在B类中被重写，所以执行到B 而ha方法没有被重新则执行A类中的方法
        A a = new B();
        a.eat();
        a.ha();
//        a.drink();
//        向下转型 父类可以调用到子类方法
//        因为父类a已经被转换到B类,所以我们可以直接调用到B类中的drink和eat方法
        B c = (B)a;
        c.drink();
        c.eat();
        c.run();
    }
}

class A {
    public void eat(){
        System.out.println("吃");
    }
    public void ha(){
        System.out.println("ha");
    }
}

class B extends A{
    public void eat(){
        System.out.println("重写eat");
    }
    public void drink(){
        System.out.println("喝");
    }
    public void run(){
        System.out.println("run");
    }
//    public void ha(){
//        System.out.println("重写ha");
//    }
}
