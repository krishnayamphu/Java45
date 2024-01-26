package com.java45.core;

public class Array {
    public static void main(String[] args) {
        int[] num=new int[2];
        num[0]=100;
        num[1]=200;

        System.out.println(num[1]);

        String staffs[]={"Ram","Hari","Sita","Gita"};
        System.out.println(staffs[0]);
        System.out.println("------------------");
        for(int i=0; i<3; i++){
            System.out.println(staffs[i]);
        }

        System.out.println("----------------");
        for(String staff:staffs){
            System.out.println(staff);
        }


    }
}
