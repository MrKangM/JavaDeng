package com.数组和random类;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){
//        实例化random类
        Random randow = new Random();
//         随机抽取一个数字
        int num = randow.nextInt(10);

        System.out.println(num);
        System.out.println("-----------------");
//         随机抽取十个数字
        for (int i = 0; i <10 ; i++) {
            int a = randow.nextInt(10);
            System.out.println("第二次："+a);
        }
    }

}
