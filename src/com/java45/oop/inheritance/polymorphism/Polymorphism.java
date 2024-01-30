package com.java45.oop.inheritance.polymorphism;
class Shape{
    public void draw(String shape){
        System.out.println("drawing "+shape+" shape");
    }
}

class Rectangle extends Shape{

}
class Circle extends Shape{

}
public class Polymorphism {
    public static void main(String[] args) {
        Shape s1=new Circle();
        Shape s2=new Rectangle();

        s1.draw("Rectangle");
        s2.draw("Circle");
    }
}
