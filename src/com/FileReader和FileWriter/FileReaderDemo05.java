package com.FileReader和FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo05 {
    public static void main(String[] args) throws IOException {
//        文件复制
        FileReader fr = new FileReader("C:\\Users\\阿灯\\Desktop\\code\\springboot\\JavaSe\\src\\com\\day6\\FileReaderDemo01.java");
        FileWriter fw = new FileWriter("b.java");
//         写数据
        char[] arr = new char[1024];
        int len;
        while((len = fr.read(arr)) != -1){
//            fw.write(len);
            fw.write(arr,0,len);
        }
        fw.close();
        fr.close();
    }
}
