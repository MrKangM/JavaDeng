package com.day6;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D://dafen.txt");
        fw.write("HelloWrold!/n");
        fw.flush();
        fw.close();
    }
}
