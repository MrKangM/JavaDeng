package com.StringBulider类;

public class StringBuliderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        添加元素
        sb.append(123);
        sb.append('c');
        sb.append(1.23);
        sb.append(false);
        System.out.println(sb);//输出sb字符串内容
//        元素反转
        sb.reverse();
        System.out.println(sb);//输出sb字符串内容
    }
}
