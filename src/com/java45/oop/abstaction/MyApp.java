package com.java45.oop.abstaction;

public class MyApp implements Shape,Sound{
    @Override
    public void draw(String shape) {
        System.out.println("Drawing "+shape+" shape.");
    }

    public static void main(String[] args) {
        MyApp app=new MyApp();

        app.draw("circle");
        app.play();
        app.print();
    }

    @Override
    public void play() {
        System.out.println("playing sound");
    }
}
