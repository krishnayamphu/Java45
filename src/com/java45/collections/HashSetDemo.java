package com.java45.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("a");
        set.add("b");
//        set.add("a");


        for(String s:set){
            System.out.println(s);
        }
    }
}
