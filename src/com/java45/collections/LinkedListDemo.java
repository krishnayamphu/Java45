package com.java45.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> stdList=new LinkedList<>();
        stdList.add("Ram");
        stdList.add("Sita");
        stdList.add("Hari");

        for(String s:stdList){
            System.out.println(s);
        }
        stdList.remove("Hari");

        System.out.println("=================");
        for(String s:stdList){
            System.out.println(s);
        }
    }
}
