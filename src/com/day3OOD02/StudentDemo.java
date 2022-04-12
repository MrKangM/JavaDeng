package com.day3OOD02;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getAge()+"--------"+s.getName());
        Student s1 = new Student("李四",19);
        System.out.println(s1.getAge()+"--------"+s1.getName());
    }
}
