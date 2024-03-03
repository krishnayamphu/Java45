package com.java45.multithreading;

public class RunnableThread implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new RunnableThread());
        thread.start();
    }
}
