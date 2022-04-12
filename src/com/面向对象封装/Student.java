package com.面向对象封装;

public class Student {
    //成员变量
    String name;
    private int age;
    String sex;
    //成员方法
    public void study(){
        System.out.println(name+"正在学习...");
    }
    public void year(){
        System.out.println(age+"岁");
    }
    public void eat(){
        System.out.println(name+"吃饭中...");
    }
    public void setAge(int a){
        if(age<=0){
            System.out.println("年龄错误");
        }else{
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
}
