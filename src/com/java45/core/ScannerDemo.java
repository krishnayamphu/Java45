package com.java45.core;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter value of a:");
        int a=scanner.nextInt();
        System.out.println("Value of a :"+a);
    }
}
