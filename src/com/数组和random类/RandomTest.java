package com.数组和random类;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
//        猜数小游戏
        Random r = new Random();
        int num = r.nextInt(200)+1;

        while(true){
            Scanner sc = new Scanner(System.in);
            int guessnum = sc.nextInt();

            if(guessnum>num){
                System.out.println("大了");
            }else if(guessnum<num){
                System.out.println("小了");
            }else if(guessnum==num){
                System.out.println("正确");
                break;
            }
        }
    }
}
