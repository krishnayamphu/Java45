package com.java45.inner;

interface Printable{
    void print();
}
public class AnonymousInnerInterface {
    void printTest(){
        Printable printer=new Printable() {
            @Override
            public void print() {
                System.out.println("Printing something");
            }
        };
        printer.print();
    }
    public static void main(String[] args) {
        new AnonymousInnerInterface().printTest();
    }
}
