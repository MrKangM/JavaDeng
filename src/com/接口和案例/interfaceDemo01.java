package com.接口和案例;

public class interfaceDemo01 {
    public static void main(String[] args) {
        Boss b = new Boss();
        b.code();
        b.duty();
    }
}
//people接口提供了duty()和code()方法
interface  people{
    public void duty();
    public void code();
}
//coder类 定义了一个code方法
class coder {
    public void code(){
        System.out.println("敲代码");
    }
}
/*
* Boos类想获取coder的code方法可以直接通过extends来继承
* 如何获取到duty方法呢？
* 可以使用implements来实现people中的duty方法
* 但是实现了之后我们是需要重写该方法
* */
class Boss extends coder implements people{
    @Override
    public void duty(){
        System.out.println("上班");
    }
}
