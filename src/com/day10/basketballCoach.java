package com.day10;
//basketballCoch类继承coach类实现studyEnglish接口
public class basketballCoach extends coach implements studyEnglish{
//    重写coach类中teach方法
    @Override
    public void teach() {
        System.out.println(getName() + "篮球教练在教篮球");
    }
//    重写studyEnglish接口中studyeng方法
    @Override
    public void studyeng() {
        System.out.println(getName() + "教练正在学英语");
    }
}
