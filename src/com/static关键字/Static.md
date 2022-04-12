# static关键字使用：

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

![](C:\Users\阿灯\Desktop\笔记\java\static内存图.png)

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