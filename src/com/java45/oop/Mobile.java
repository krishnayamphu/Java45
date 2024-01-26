package com.java45.oop;

public class Mobile {
    public void test(){
        System.out.println("testing something");
    }
    public void test(String mobile){
        System.out.println("Currently testing: "+mobile);
    }
    public String test(String model,String version){
        return model+", "+version;
    }

    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.test();
        m.test("iphone 14");
        System.out.println(m.test("Iphone 14","ios 12.0"));
    }
}
