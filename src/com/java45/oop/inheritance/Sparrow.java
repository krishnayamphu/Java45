package com.java45.oop.inheritance;
class Animal{
    String color;
}
class Bird extends Animal{
    int weight;
}
public class Sparrow  extends Bird
{
    String name;

    public static void main(String[] args) {
        Sparrow s=new Sparrow();
        s.color="Red";
        s.name="Little Bird";
        s.weight=100;

        System.out.println(s.color);
        System.out.println(s.name);
        System.out.println(s.weight);
    }
}
