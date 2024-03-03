package com.java45.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruitList=new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Mango");

        Iterator itr=fruitList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("=================");
        fruitList.remove("Apple");
        Iterator itr1=fruitList.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}
