package com.java45.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> list=new PriorityQueue<>();

        list.add("red");
        list.add("green");
        list.add("aliceblue");


        System.out.println("Head:"+list.element());

        for(String s: list){
            System.out.println(s);
        }
        System.out.println("===============");
        list.poll();
        for(String s: list){
            System.out.println(s);
        }


    }
}
