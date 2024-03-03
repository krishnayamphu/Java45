package com.java45.collections;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Employee> empList=new ArrayList<>();
        Employee e=new Employee("Ram",20000);

        empList.add(e);
        empList.add(new Employee("Hari",22000));

        for(Employee emp:empList){
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
        }
    }
}
