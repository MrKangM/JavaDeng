package com.day9;

//被Final修饰的变量是无法更改的
public class finalDemo {
    public static void main(String[] args) {
        animal a = new animal();
//        a.NUM = 20;
    }
}

class animal {
    final int NUM;

    public animal() {
        NUM = 10;
    }
}
//被final修饰的方法无法被重写
//class dog extends animal{
//    @Override
//    public void shout(){
//        System.out.println("shout()");
//    }
//}

