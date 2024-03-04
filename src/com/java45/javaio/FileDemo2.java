package com.java45.javaio;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f=new File("doc.txt");
        f.delete();
        System.out.println("file deleted");

        File dir=new File("document");
        dir.delete();
        System.out.println("dir deleted");
    }
}
