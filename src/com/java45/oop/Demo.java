package com.java45.oop;

public class Demo {
    public static void main(String[] args) {
//        new Car().getCar(new Car("Scorpio","Mahindra"));
        new Car("Scorpio","Mahindra").showCarDetail();

        Bike b=new Bike().getBike();
        b.brand="Bajaj";
        b.maxSpeed=140;
        System.out.println(b.brand+", "+b.maxSpeed);
    }
}
