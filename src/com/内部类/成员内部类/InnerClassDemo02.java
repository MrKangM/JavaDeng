package com.内部类.成员内部类;
/*
*   成员内部类的修饰符：
*       我们可以使用权限修饰符修饰成员内部类，但是如果使用私有private来修饰，则无法在其他类中访问
*       我们可以使用static修饰成员内部类，不用在创建外部类的对象了
*
* */
public class InnerClassDemo02 {
    public static void main(String[] args) {
//        当我们使用private修饰符来修饰内部类时，外部类则无法访问
//          Outer2.Inner2 in = new Outer2().new Inner2();
//        当我们使用static修饰时，则不需要使用new来创建对象，可以直接通过外部类进行调用
//          Outer2.test.func();
//        当内部类是抽象时，我们可以通过重写来实现
            Outer2.test in = new Outer2().new test();
            in.func();
    }
}

//创建外部类
class Outer2{

//    创建private内部类
//    private class Inner2{
//        public void func(){
//            System.out.println("function");
//        }
//    }
//    使用static创建内部类
    public void func(){
        System.out.println("123");
    };
    abstract class Inner2{
        public abstract void func();
    }
    class test extends Inner2{
        @Override
        public void func() {
            System.out.println("重写");
        }
    }
}