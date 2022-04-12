package com.day9;

public class abstractDemo01 {
    public static void main(String[] args) {
        two t = new two();
        t.run();
        t.test();
    }
}

abstract class one{
//    抽象方法
    public abstract void run();
//    非抽象方法可以不重写
    public void test(){
        System.out.println("test");
    }
}

class two extends one{
    @Override
    public void run() {
        System.out.println("two类已经重写了run()");
    }
}
