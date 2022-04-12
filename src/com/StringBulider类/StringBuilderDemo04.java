package com.StringBulider类;

public class StringBuilderDemo04 {
    public static void main(String[] args) {
//        字符串反转
        String a = "hello";
        System.out.println(resever(a));
    }
    public static String resever(String s){
        StringBuilder sb = new StringBuilder();
        String result = sb.append(s).reverse().toString();
        return result;
    }
}
