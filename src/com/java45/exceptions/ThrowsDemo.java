package com.java45.exceptions;

public class ThrowsDemo {
    public void calc() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        System.out.println("Output: "+(10/10));
        int a[]=new int[2];
        System.out.println(a[10]);
    }

    public static void main(String[] args) {
        ThrowsDemo demo=new ThrowsDemo();
        try{
            demo.calc();
        }catch (ArithmeticException e){
            System.err.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
