package com.内部类.成员内部类;

public class InnerClassDemo01 {
    public static void main(String[] args) {
//        正常创建对象
        Outer o = new Outer();
//        调用对象的方法
        o.method();
//        那么如何来调用外部类中的内部类呢？
//        通过外部类.内部类的方式进行调用
//        在创建时，我们需要首先开辟外部类的空间然后再开辟出内部类的空间
        Outer.Inner in = new Outer().new Inner();
//        调用内部类的方法
        in.func();
    }
}

//定义外部类
class Outer{
//    定义成员变量
    private int num = 10;
//    定义成员方法
    public void method(){
        System.out.println("这是外部类的方法");
    }
//    定义内部类
    class Inner{
        public void func(){
            System.out.println("这是内部类的方法，并且能获取到外部类的成员变量num="+num);
        }
}
}
