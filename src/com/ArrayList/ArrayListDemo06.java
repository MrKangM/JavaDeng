package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo06 {
    public static void main(String[] args) {
//        创建学生类数组
        ArrayList<Student> arr = new ArrayList<Student>();
//        创建Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
//        创建学生对象
        Student student = new Student();
//        将输入的数据存放到学生类中
        student.setName(name);
        student.setAge(age);
//        将对象以元素的方式存入对象数组
        arr.add(student);
//        遍历数组
        for (int i = 0; i <arr.size() ; i++) {
            Student s = arr.get(i);
            System.out.println(s.getName()+"="+s.getAge());
        }
    }
}
