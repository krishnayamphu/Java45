package com.java45.exceptions;

import javax.swing.*;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            System.out.println(10 / 10);
            System.out.println("statement 2");
            int[] num=new int[5];
            num[0]=10;
            System.out.println(num[100]);
            System.out.println("statement 3");
        }
        catch (ArithmeticException e){
            System.err.println("you can't divide number by zero");
//            System.err.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
