package com.FileReader和FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo03 {
    public static void main(String[] args) throws IOException {
//        IO换行
//        Windows:\r\n
//        FileWriter fw = new FileWriter("a.txt");
//        追加内容
        FileWriter fw = new FileWriter("a.txt",true);

        for (int i = 0; i <10 ; i++) {
            fw.write("hello"+i);
            fw.write("\r\n");
        }
        fw.close();
    }
}
