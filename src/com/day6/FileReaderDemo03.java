package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderDemo03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        ArrayList<String> arr = new ArrayList<String>();
        int len;
        while(true){
            len = fr.read();
            if(len == -1){
                break;
            }else{
                String s = String.valueOf((char)len);
                arr.add(s);
            }
        }
        for (int i = 0; i <arr.size() ; i++) {
            fw.write(arr.get(i));
        }
        fw.close();
        fr.close();
    }
}
