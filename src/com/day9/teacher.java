package com.day9;
//创建teacher抽象类
public abstract class teacher {
    String name;
    int age;
    public abstract void teach();

    public teacher() {
    }

    public teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
