package com.java45.oop.inheritance;
class School{
    String schoolname;
    public School(String contact){
        System.out.println("School constructor: "+contact);
    }
    public String getSchoolAddress(){
        return "Kumaripati, Lalitur";
    }
}
public class Student extends School{
    String studentname;
    public Student(){
        super("1234567");
        System.out.println("Student constructor");
    }

    public void getStudentInfo(String studentname,String schoolname){
        this.studentname=studentname;
        super.schoolname=schoolname;
        System.out.println("Student name: "+this.studentname);
        System.out.println("School name: "+super.schoolname);
        System.out.println("School address: "+super.getSchoolAddress());
    }

    public static void main(String[] args) {
        new Student().getStudentInfo("Ram","ABC School");
    }
}
