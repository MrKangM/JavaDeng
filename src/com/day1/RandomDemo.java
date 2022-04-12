package com.day1;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){

        Random randow = new Random();

        int num = randow.nextInt(10);

        System.out.println(num);
        System.out.println("-----------------");

        for (int i = 0; i <10 ; i++) {
            int a = randow.nextInt(10);
            System.out.println("第二次："+a);
        }
    }

}
