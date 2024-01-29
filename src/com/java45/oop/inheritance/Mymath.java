package com.java45.oop.inheritance;
class Math{
    public void sum(int x, int y){
        System.out.println("do your calcuation");
    }
}
public class Mymath extends Math{
    @Override
    public void sum(int x, int y){
        System.out.println("Total sum: "+(x+y));
    }

    public static void main(String[] args) {
        new Mymath().sum(10,5);
    }
}
