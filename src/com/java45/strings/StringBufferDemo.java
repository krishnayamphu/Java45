package com.java45.strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" World");


        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb.indexOf("o"));
        System.out.println(sb.deleteCharAt(0));
    }
}
