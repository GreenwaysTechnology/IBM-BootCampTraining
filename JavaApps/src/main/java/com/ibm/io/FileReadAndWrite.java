package com.ibm.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadAndWrite {
    public static void main(String[] args) {
        try {
            String filename = "E:\\session\\ibm\\2022\\july\\bootcamp\\javaApps\\src\\main\\resources\\hello.txt";        //

            FileInputStream fileInputStream = new FileInputStream(filename);

            FileOutputStream fileOutputStream = new FileOutputStream("hello_copy.txt", true);
            System.out.println(fileOutputStream.getFD());
            int data;
            while ((data = fileInputStream.read()) != -1) {
                //System.out.print((char) data);
                fileOutputStream.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file Not found" + e);
        } catch (IOException e) {
            System.out.println("IO Exception" + e.getMessage());
        }

    }
}
