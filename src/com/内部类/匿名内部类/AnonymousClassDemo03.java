package com.内部类.匿名内部类;

public class AnonymousClassDemo03 {
    public static void main(String[] args) {
//        多态写法
        sports s = new sports() {
            @Override
            public void run() {
                System.out.println("多态写法");
            }
        };
        s.run();
//        直接调用方法
        jump(new sports() {
            @Override
            public void run() {
                System.out.println("调用方法");
            }
        });
    }
//    定义方法 将接口以参数的形式传递
    public static void jump(sports s){
        s.run();
    }
}
//定义接口
interface sports{
    public void run();
}
