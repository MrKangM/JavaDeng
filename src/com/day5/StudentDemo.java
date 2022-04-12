package com.day5;

public class StudentDemo {
    public static void main(String[] args) {
//        创建学生数组
        Student[] stu =new Student[3];
//        创建学生对象
        Student s1 = new Student("曹操",5);
        Student s2 = new Student("孙权",10);
        Student s3 = new Student("刘备",11);
//        把学生对象作为元素赋值给数组
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
//        遍历
        for (int i = 0; i < stu.length ; i++) {
            Student s = stu[i];
            System.out.println(s.getName()+"=="+s.getAge());
        }

    }
}
