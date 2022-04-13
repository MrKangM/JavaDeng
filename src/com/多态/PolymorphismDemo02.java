package com.多态;
/*
*   多态成员特点：
*       成员变量：编译时看左边，运行时输出左边
*       成员方法：编译时看左边，运行时输出右边
*       静态方法：编译时看左边，运行时输出左边
*
*   总结：
*       编译时都看左边，只有运行成员方法时输出右边
* */
public class PolymorphismDemo02 {
    public static void main(String[] args) {
        father f = new kid();
        System.out.println(f.num);
        f.func();
        f.method();

    }
}

class father{
    int num = 20;
    public void func(){
        System.out.println("我是父类方法");
    }
    public static void method(){
        System.out.println("我是父类静态方法");
    }
}

class kid extends father{
    int num = 18;
    public void func(){
        System.out.println("我是子类方法");
    }
    public static void method(){
        System.out.println("我是子类静态方法");
    }
}
