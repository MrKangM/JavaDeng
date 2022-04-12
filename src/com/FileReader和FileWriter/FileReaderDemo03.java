package com.FileReader和FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderDemo03 {
    public static void main(String[] args) throws IOException {
//        复制文件内容
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        ArrayList<String> arr = new ArrayList<String>();
//        获取文件内容
        int len;
        while(true){
            len = fr.read();
            if(len == -1){
                break;
            }else{
//                将读取的内容存入s，并添加到数组中
                String s = String.valueOf((char)len);
                arr.add(s);
            }
        }
//        遍历数组中的字符串内容，并写入到b.txt文件中
        for (int i = 0; i <arr.size() ; i++) {
            fw.write(arr.get(i));
        }
        fw.close();
        fr.close();
    }
}
