package com.FileInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        FileInputStream fileIS = new FileInputStream(file);
        int c = fileIS.read();
        while(c != 1){
            System.out.print((char) c);
            c = fileIS.read();
        }
        fileIS.close();

        FileOutputStream fileOS = new FileOutputStream(file);

        String s = "Writed!!!";

        fileOS.write(s.getBytes(StandardCharsets.UTF_8));

        fileOS.close();

    }
}
