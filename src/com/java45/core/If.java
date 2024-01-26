package com.java45.core;

public class If {
    public static void main(String[] args) {
        int a=5,b=6;

        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }


        double marks=45;
        if(marks>=90){
            System.out.println("Excellent");
        }else if (marks>=75){
            System.out.println("very good");
        } else if (marks>=60) {
            System.out.println("Good");
        }
        else if (marks>=45){
            System.out.println("Satisfactory");
        }else{
            System.out.println("Poor");
        }
    }
}
