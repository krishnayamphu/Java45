package com.java45.javaio;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo {
    public static void main(String[] args){
        try {
            FileWriter writer=new FileWriter("test.java");
            writer.write("hello world");
            writer.flush();
            writer.close();
            System.out.println("data write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
