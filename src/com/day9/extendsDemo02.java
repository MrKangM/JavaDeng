package com.day9;

public class extendsDemo02 {
    public static void main(String[] args) {
        son s = new son();
        s.Gradpa();
        s.father();
        s.son();
    }
}
class Grandpa{
    public void Gradpa(){
        System.out.println("我是爷爷");
    }
}

class father extends Grandpa{
    public void father(){
        System.out.println("我是爸爸");
    }
}

class son extends father{
    public void son(){
        System.out.println("我是儿子");
    }
}
