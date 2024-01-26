package com.java45.oop;
public class Employee {
    String name;  //field/member
    double salary;
    public void info(){
        System.out.println("showing employee info");
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Jhon";
        e.salary=25000;

        System.out.println(e.name);
        System.out.println(e.salary);

        e.info();
        new Employee().info();
    }
}
