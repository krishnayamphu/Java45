package com.java45.strings;

public class StringDemo {
    public static void main(String[] args) {
        String s="abc";
        String ss=new String("Hello world");

        System.out.println(s);
        System.out.println(ss);

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(ss.indexOf('o'));
        System.out.println(ss.lastIndexOf('o'));
        System.out.println(ss.indexOf('o',5));
        System.out.println(ss.charAt(6));
        System.out.println(ss.substring(5));
        System.out.println(s.equalsIgnoreCase("ABC"));
        System.out.println(s=="abc");


    }
}
