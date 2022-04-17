# JavaDeng

### 简介：

​		该项目是小白从0开始学习java路段的一些笔记和一些个人心得。目前仍有不足，后续会持续更新完善。



### 目录：

[static](#static篇)

[抽象类](#abstract(抽象类))

### 更新记录：

2022-4-17 修改了目录文件和包名，并对多态进行重命名，新添了多态和权限修饰符笔记。



# 笔记总结：

## static篇：<a href="static篇" ></a>

### static测试类：

```java
package com.day8;
/*
* static: 为成员变量或方法进行初始化，将优先加载于创建类之前，并且可以共享数据
*
* */
public class staticDemo {
    public static void main(String[] args) {
//        初始化name为王二
        Student.name = "王二";
        Student s = new Student();
//        将初始化数据覆盖为张三
        s.name = "张三";
        s.age = 18;
        s.show();

        Student s1 = new Student();
//        由于s1.name没有设值，在默认没有static情况下为null
//        当成员变量添加static属性时，则会初始化为王二，但是s.name将值覆盖为张三，所以s1.name在没有赋值的情况下，他的值与s.name共享
        s1.age = 17;
        s1.show();
    }
}

```

### Student类:

```java
package com.day8;

public class Student {
    static String name;
    int age;
    public void show(){
        System.out.println(name + "," + age);
    }
}
```

------

### static内存图：

![image](C:\Users\阿灯\Desktop\笔记\java\static内存图.png)

------

### static关键字的注意事项:

#### 	静态方法

- 可以调用静态的成员变量
- 可以调用静态的成员方法
- 不可以调用非静态的成员变量
- 不可以调用非静态的成员方法
- 只能在静态的方法中调用静态的成员

#### 	非静态的方法

- 可以调用静态的成员变量
- 可以调用静态的成员方法
- 可以调用非静态的成员变量
- 可以调用非静态的成员方法

#### 在静态的方法中是否有this对象?

- 在静态的方法中没有this当前对象的引用，因为静态的方法随着类的加载而加载，优先于所有的对象

------

## abstract(抽象类):<a name="abstract(抽象类)" ></a>

#### 概念：		

​		关键字，用于修饰类和方法。

```java
abstract class one{
    //使用abstract来定义抽象类
}
```



------

#### 抽象方法：

​		不同类的成员方法是相似的，但是具体内容不一样，所以我们可以抽取他的声明，没有具体的方法体，没有具体方法体的方法就是抽象方法。

```java
abstract class one{
//    抽象方法
    public abstract void run();
//    非抽象方法可以不重写
    public void test(){
        System.out.println("test");
    }
}
```



------

#### 抽象类：

​		一个类继承了抽象类需要重写他所有的的抽象方法，否则这个类就是抽象类。

```java
abstract class one{
//    抽象方法
    public abstract void run();
//    非抽象方法可以不重写
    public void test(){
        System.out.println("test");
    }
}

class two extends one{
    @Override
    public void run() {
        System.out.println("two类已经重写了run()");
    }
}
```

------

#### 抽象类特点：

1. 抽象方法只能在抽象类中
2. 抽象类和抽象方法必须被abstract修饰
3. 抽象类不能被实例化(new)
4. 抽象类中可以有非抽象方法
5. 抽象类和类的关系是继承
6. 一个类继承了抽象类必须重写所有抽象方法，要么他自己是抽象类
