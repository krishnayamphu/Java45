package com.java45.inner;

public class University {
    class College{
        public void universityInfo(){
            System.out.println("university");
        }
        public void collegeInfo(){
            System.out.println("college");
        }
    }

    public static void main(String[] args) {
        University uni=new University();
        College college=uni.new College();

        college.collegeInfo();
        college.universityInfo();
    }
}
