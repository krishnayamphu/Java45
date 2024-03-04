package com.java45.javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("books.txt");
        if(f.createNewFile()){
            System.out.println("file created");
        }else{
            System.out.println("error in file creation");
        }

        File dir=new File("document");
        dir.mkdir();
        System.out.println("directory created");
    }
}
