package com.java45.oop;
public class Car {
    String brand;
    String model;
    public Car() {
    }
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void getCar(Car car){
        System.out.println("Car: "+car.brand);
        System.out.println("Model: "+car.model);
    }
    public void showCarDetail(){
        getCar(this);
    }
}
