package com.day10;
/*
 * 实现人、运动员、教练、篮球运动员、篮球教练
 * 运动员和教练是抽象类，可以继承person类
 * 篮球运动员和篮球教练实现运动员、教练和人中的方法和属性以及studyEnglish接口
 * */
public class abstract_And_interfaceDemo {
    public static void main(String[] args) {
        basketballCoach bc = new basketballCoach();
        basketballPlayer bp = new basketballPlayer();
        bc.setName("张三");
        bp.setName("李四");
        bc.teach();
        bc.eat();
        bc.sleep();
        bc.studyeng();
        System.out.println("===============");
        bp.eat();
        bp.study();
        bp.sleep();
        bc.studyeng();
    }
}
