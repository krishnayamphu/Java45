package com.java45.exceptions;

import javax.swing.*;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("statement 1");
            System.out.println(10 /0);
            System.out.println("statement 2");
        }
        catch (ArithmeticException e) {
            System.err.println("you can't divide number by zero");
        }
        finally {
            System.out.println("statement 3");
        }
    }
}
