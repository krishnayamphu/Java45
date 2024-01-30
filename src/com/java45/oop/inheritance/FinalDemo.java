package com.java45.oop.inheritance;
//final class Abc {
class Abc {
    public final void test() {
        System.out.println("Testing something");
    }
}

public class FinalDemo extends Abc {
    private final int a = 10;

//    @Override
//    public void test() {
//        System.out.println("Testing machine");
//    }


    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        System.out.println(demo.a);
        //demo.a=15; //can't change value
        System.out.println(demo.a);

        demo.test();
    }
}
