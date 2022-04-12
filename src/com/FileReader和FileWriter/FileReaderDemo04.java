package com.FileReader和FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo04 {
    public static void main(String[] args) throws IOException {
//        文件复制
        FileReader fr = new FileReader("com\\day6\\FileReaderDemo01.java");
        FileWriter fw = new FileWriter("a.java");
//         写数据
        int len;
        while((len = fr.read()) != -1){
                fw.write((char)len);
        }
        fw.close();
        fr.close();
    }
}
