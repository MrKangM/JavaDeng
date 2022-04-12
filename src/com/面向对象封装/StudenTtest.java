package com.面向对象封装;

public class StudenTtest {
    private String name;
    private int age;
    public StudenTtest(){}
    public StudenTtest(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
