package com.BufferedReader和BufferedWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.java"));

//        一次读取一个字符
//        int ch;
//        while((ch = br.read())!=-1){
//            System.out.print((char)ch);
//        }
//        一次读取一个数组
        int len;
        char [] arr = new char[1024];
        while((len = br.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }
        br.close();
    }
}
