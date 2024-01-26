package com.java45.oop;

public class Student {
    String stdname;
    static String schoolname="abc";
    public Student(){
        System.out.println("Student Instance is created");
    }
    public Student(String s){
        System.out.println(s);
    }

    public static void getAddress(){
        System.out.println("School Address: Patan, Lalitpur");
    }

    public static void main(String[] args) {
        new Student("Student Object");

        Student s=new Student();
        s.stdname="Ram";

        Student s1=new Student();

        s1.stdname="hari";

        System.out.println("Student name: "+s.stdname);
        System.out.println("School name: "+Student.schoolname);

        System.out.println("Student name: "+s1.stdname);
        System.out.println("School name: "+Student.schoolname);

        Student.getAddress();

    }
}
