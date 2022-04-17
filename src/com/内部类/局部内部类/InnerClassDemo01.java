package com.内部类.局部内部类;
/*
*       局部内部类：
*           在方法内，出了方法之后无效
* */
public class InnerClassDemo01 {
    public static void main(String[] args) {
//        创建外部类
        Outer o = new Outer();
//        调用外部类方法
        o.func();
    }
}

//创建外部类
class Outer{
//    创建成员方法
    public void func(){
//        局部内部类
        class Inner{
            public void method(){
                System.out.println("局部类的方法");
            }
        }
//        创建局部内部类
        Inner i = new Inner();
//        调用局部内部类的方法
        i.method();
    }
}
