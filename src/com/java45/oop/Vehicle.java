package com.java45.oop;

public class Vehicle {
    private String color;
    public Vehicle(){
        System.out.println("default vehicle constructor");
    }
    public Vehicle(String name){
        this();
        System.out.println("Running "+name+" vehicle");
    }
    public void setColor(String color){
        this.color=color;
    }
    public void test(){
        System.out.println("Testing vehicle");
    }
    public void vehicleInfo(){
        System.out.println("Vehicle color: "+this.color);
        this.test();
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle("Tata");
        v.setColor("red");
        System.out.println("Vehicle color: "+v.color);

        v.vehicleInfo();
    }
}
