package com.面向对象封装;

public class StudentTestDemo {
    public static void main(String[] args) {
        StudenTtest s = new StudenTtest();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getAge()+"--------"+s.getName());
        StudenTtest s1 = new StudenTtest("李四",19);
        System.out.println(s1.getAge()+"--------"+s1.getName());
    }
}
