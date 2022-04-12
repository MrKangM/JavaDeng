package com.day10;
//篮球运动员类，继承运动员类实现studyEnglish接口
public class basketballPlayer extends sportsman implements studyEnglish{
//    重写sportsman类中study方法
    @Override
    public void study() {
        System.out.println(getName()+"篮球运动员在学习");
    }
//    重写studyEnglish接口中studyeng方法
    @Override
    public void studyeng() {
        System.out.println(getName()+"正在学英语");
    }
}
