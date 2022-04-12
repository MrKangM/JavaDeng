package com.StringBulider类;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
//        将数组转换String
        int [] arr = {1,2,3};
        System.out.println(ArraytoString(arr));
    }
    public static String ArraytoString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length ; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        String result = sb.toString();
        return result;
    }
}
