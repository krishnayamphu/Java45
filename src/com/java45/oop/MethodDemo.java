package com.java45.oop;

public class MethodDemo {
    //method declaration
    public void hello() {
        System.out.println("hello world");
    }

    public void test() {
        System.out.println("test method");
    }
    public int maxSpeed(){
        return 150;
    }
    public void sum(int x, int y){
        System.out.println("total sum="+(x+y));
    }
    public double calcDiscount(double price,double p){
        return price*(p/100);
    }

    public static void main(String[] args) {
        MethodDemo ob = new MethodDemo(); //create a new object
        ob.hello(); //method calling
        ob.test();
        System.out.println("Maximum speed limit is: "+ob.maxSpeed());
        ob.sum(10,5);
        System.out.println("discount: "+ ob.calcDiscount(1000,10));

    }
}
