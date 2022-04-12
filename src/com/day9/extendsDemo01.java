package com.day9;

public class extendsDemo01 {
    public static void main(String[] args) {
        /*
        * 继承：将父类的成员变量及方法继承给子类
        * */
        Lol l = new Lol();
        l.start();
        l.stop();
    }
}
class Game{
    String name;//游戏名
    double version;//版本号

    public void start(){
        System.out.println("game started");
    }

    public void stop(){
        System.out.println("game stoped");
    }
}

class Lol extends Game{

}
