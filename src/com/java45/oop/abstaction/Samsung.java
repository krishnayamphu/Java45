package com.java45.oop.abstaction;
abstract class Mobile{
    public String brand;
    public String model;
    public Mobile(String mobile){
        System.out.println(mobile+" mobile is created");
    }

    public abstract void info(); //abstract method
}
public class Samsung extends Mobile {
    public Samsung(){

        super("Samsung");
    }
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
//        samsung.brand="Samsung";
//        samsung.model="Galaxy S24";
        samsung.info();


    }

    @Override
    public void info() {
        super.brand="Samsung Inc.";
        super.model="Galaxy A34";

        System.out.println("Brand: "+super.brand);
        System.out.println("Model: "+super.model);
    }
}
