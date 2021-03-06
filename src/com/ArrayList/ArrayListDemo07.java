package com.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
//学生管理系统项目
public class ArrayListDemo07 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请输入选择：");
            System.out.println("1.查询学生");
            System.out.println("2.添加学生");
            System.out.println("3.退出");
            int choce = sc.nextInt();
            if(choce == 3){
                break;
            }
            switch (choce){
                case 1:
//                    查询学生
                    checkStudent(arr);
                    break;
                case 2:
//                    添加学生
                    addStudent(arr);
                    break;
                case 3:
                    break;
            }
        }
    }
//    添加学生
    public static void addStudent(ArrayList<Student> arr){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
/*
*       判断是否等于0
*       如果等于0则直接添加
*       不等于0则遍历数组查询添加姓名是否存在
* */
        if(arr.size()==0){
            student.setName(name);
            student.setAge(age);
            arr.add(student);
        }else{
            for (int i = 0; i <arr.size() ; i++) {
                student = arr.get(i);
                if(student.getName().equals(name)){
                    System.out.println("存在");
                }
            }
        }
    }

    public static void checkStudent(ArrayList<Student> arr){
        System.out.println("请输入查询姓名");
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        String name = sc.nextLine();
        for (int i = 0; i <arr.size() ; i++) {
            student = arr.get(i);
            if(student.getName().equals(name)){
                System.out.println("年龄是："+student.getAge()+"=="+"姓名是："+student.getName());
            }else{
                System.out.println("不存在");
            }
        }
    }
}
