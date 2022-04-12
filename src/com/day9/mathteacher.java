package com.day9;
//mathteacher继承teacher类并重写teach方法
public class mathteacher extends teacher {

    @Override
    public void teach() {
        System.out.println(getName()+"数学老师正在讲课...");
    }
}
