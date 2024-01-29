package com.java45.oop.inheritance;

class Shape {
    public void draw(String shape)
    {
        System.out.println("drawing "+shape+" shape");
    }
}
class Circle extends Shape{

}
class Rectangle extends Shape{

}
class Heirarchical {
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle g=new Rectangle();

        c.draw("circle");
        g.draw("Rectangle");
    }
}