package com.java45.exceptions;

public class ThrowDemo {
    public int checkVoterAge(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Invalid age");
        }
        return age;
    }

    public static void main(String[] args) {
        ThrowDemo ob=new ThrowDemo();
        try{
            System.out.println("Voter Age: "+ob.checkVoterAge(5));
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("you can't vote because you're under 18");
        }
    }
}
