package com.ibm.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //E:\session\IBM\2022\july\BootCamp\JavaApps\src\main\resources
        String filename = "E:\\session\\ibm\\2022\\july\\bootcamp\\javaApps\\src\\main\\resources\\hello.txt";        //
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            //read file content
            int data;
            while ((data = fileInputStream.read()) != -1) {
                //  System.out.println(data + "  " + (char) data);
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.fillInStackTrace());
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
