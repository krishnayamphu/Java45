package com.java45.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReader2 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name:");
            String name=br.readLine();
            System.out.println(name);

            Scanner scanner=new Scanner(new InputStreamReader(System.in));
            System.out.print("age:");
            int age=scanner.nextInt();
            System.out.println(age);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
