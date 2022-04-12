package com.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
//        创建输入流
//        FileWriter fw = new FileWriter("a.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        匿名内部类创建方式：
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
    }
}
