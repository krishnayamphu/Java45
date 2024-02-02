package com.java45.oop;

public class Dog {
    public Dog(){
        System.out.println("dog constructor");
    }
    public Dog(String dogname){
        System.out.println("Dog name: "+dogname);
    }

    public static void main(String[] args) {
        new Dog("Puppy");
        new Dog().test("laptop");
    }

    public void test(){
        System.out.println("test 1");
    }
    public void test(String testname){
        System.out.println("Testing "+testname);
    }

}
