package com.java45.core;

public class Switch {
    public static void main(String[] args) {
        int day=40;
        switch (day){
            case 1:
                System.out.println("sun");
                break;
            case 2:
                System.out.println("mon");
                break;
            case 3:
                System.out.println("tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("th");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid day no");
                break;
        }
    }
}
