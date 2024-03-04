package com.java45.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        int i;
        try {
            FileReader reader = new FileReader("test.txt");
            while ((i = reader.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
