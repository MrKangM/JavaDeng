package com.方法和switch;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
            case 2:
            case 3:
                System.out.println("春");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬");
                break;
            default:
                System.out.println("错误");
                break;
        }
    }
}
