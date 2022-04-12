#### final概念：

​		修饰符，可以用于修饰类，成员方法和成员变量。

------

#### final修饰类的特点：

​		不能有子类，不能被继承。

**例：**

```java
public class finalDemo {
    public static void main(String[] args) {
		dog d = new dog();
    }
}

final class animal {
    public void shout(){
        System.out.println("shout()");
    }
}
//被final修饰的类无法被继承
class dog extends animal{

}
```

![image-20220411223403269](C:\Users\阿灯\AppData\Roaming\Typora\typora-user-images\image-20220411223403269.png)



------

#### final修饰方法的特点：

​		不能被重写

**例：**

```java
public class finalDemo {
    public static void main(String[] args) {
        dog d = new dog();
    }
}

class animal {
    final public void shout(){
        System.out.println("shout()");
    }
}
//被final修饰的方法无法被重写
class dog extends animal{
    @Override
    public void shout(){
        System.out.println("shout()");
    }
}
```

![image-20220411223800420](C:\Users\阿灯\AppData\Roaming\Typora\typora-user-images\image-20220411223800420.png)

------

#### final修饰变量的特点：

​		不能被修改，是常量。（用final修饰的变量通常用全部使用大写命名）

**例：**

```java
//被Final修饰的变量是无法更改的
public class finalDemo {
    public static void main(String[] args) {
        animal a = new animal();
        a.NUM = 20;
    }
}

class animal {
    final int NUM;

    public animal() {
        NUM = 10;
    }
}
```

![image-20220411224230022](C:\Users\阿灯\AppData\Roaming\Typora\typora-user-images\image-20220411224230022.png)