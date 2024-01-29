package com.java45.oop.inheritance;
class Mobile{
    String brand;
    public String model;
}
public class Samsung extends Mobile{
    double price;

    public static void main(String[] args) {
        Samsung s=new Samsung();
        s.brand="samsung";
        s.model="g s21";
        s.price=1000;
        System.out.println(s.brand);
        System.out.println(s.model);
        System.out.println(s.price);
    }
}
