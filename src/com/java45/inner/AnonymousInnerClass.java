package com.java45.inner;
abstract class Animal{
    abstract void eat();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal=new Animal() {
            @Override
            void eat() {
                System.out.println("Animal eating food.");
            }
        };
        animal.eat();
    }
}
