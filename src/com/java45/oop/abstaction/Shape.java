package com.java45.oop.abstaction;

public interface Shape {
    void draw(String shape);
    default void print(){
        System.out.println("Ready to print");
    }
}
