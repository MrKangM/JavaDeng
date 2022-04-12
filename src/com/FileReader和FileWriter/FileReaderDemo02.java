package com.FileReader和FileWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        char[] arr = new char[1024];
        int len;
        while((len = fr.read(arr))!= -1){
            System.out.println(new String(arr,0,len));
        }
        fr.close();
    }
}
