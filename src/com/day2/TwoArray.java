package com.day2;

public class TwoArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        arr1[0][0]=1;
        arr1[1][1]=2;
        int arr2[][] = {{1,2},{4,3}};
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("==========");
        for (int a = 0; a < arr2.length ; a++) {
            for (int i = 0; i < arr2.length ; i++) {
                System.out.print(arr2[a][i]);
            }
            System.out.println();
        }
    }
}
