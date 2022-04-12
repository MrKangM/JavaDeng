package com.day6;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        int ch;
//        while((ch = fr.read())!= -1){
//            System.out.println((char)ch);
//        }
        while(true){
            ch = fr.read();
            if(ch == -1){
                break;
            }else{
                System.out.println((char)ch);
            }
        }
        fr.close();
    }
}
