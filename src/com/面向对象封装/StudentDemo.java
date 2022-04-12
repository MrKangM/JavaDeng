package com.面向对象封装;

public class StudentDemo {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.name = "张三";
        sc.study();
        sc.setAge(-28);
        sc.year();
    }
}
