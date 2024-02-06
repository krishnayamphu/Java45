package com.java45.p2;

import com.java45.p1.*;

//jdk lib (built in)
import javax.swing.JOptionPane;

public class MyApp{
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.msg();
        Bike bike=new Bike();
        bike.run();
//        JOptionPane.showMessageDialog(null,"Hello Java World");

        Employee e=new Employee();
        e.setName("Ram");
        System.out.println(e.getName());

        e.setAge(45);
        System.out.println(e.getAge());
    }
}
