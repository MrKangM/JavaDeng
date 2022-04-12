package com.FileReader和FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo01 {
    public static void main(String[] args) throws IOException {
//        获取写入文件路径
        FileWriter fw = new FileWriter("D://dafen.txt");
//        写入内容
        fw.write("HelloWrold!/n");
        fw.flush();
        fw.close();
    }
}
