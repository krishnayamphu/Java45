package com.java45.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter br=new BufferedWriter(new FileWriter("doc.txt"));
            br.write("Welcome to java io");
            br.flush();
            br.close();
            System.out.println("data written successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
