package com.day8;
/*
* static: 为成员变量或方法进行初始化，将优先加载于创建类之前，并且可以共享数据
*
* */
public class staticDemo {
    public static void main(String[] args) {
//        初始化name为王二
        Student.name = "王二";
        System.out.println(Student.name);
        Student s = new Student();
//        将初始化数据覆盖为张三
        s.name = "张三";
        s.age = 18;
        s.show();
        System.out.println(Student.name);
        Student s1 = new Student();
//        由于s1.name没有设值，在默认没有static情况下为null
//        当成员变量添加static属性时，则会初始化为王二，但是s.name将值覆盖为张三，所以s1.name在没有赋值的情况下，他的值与s.name共享
        s1.age = 17;
        s1.show();
        System.out.println(Student.name);
    }
}
