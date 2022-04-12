package com.FileReader和FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D://dafen.txt");
//        fw.write(1);
//        fw.write("hello");
        fw.write("hello",2,2);
        fw.flush();
        fw.close();
    }
}
