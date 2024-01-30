package com.java45.oop.inheritance;

public class InstantInit {
    private int x;
    public InstantInit(){
        System.out.println("I'm constructor");
    }
    {
        System.out.println("I'm instant initializer block");
        x=10;
    }

    public static void main(String[] args) {
        InstantInit ob=new InstantInit();
        System.out.println(ob.x);
    }
}
