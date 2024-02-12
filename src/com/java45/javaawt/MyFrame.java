package com.java45.javaawt;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(){
        initComponents();
    }

    private void initComponents() {
        System.out.println("hello");
        add(new Button("Button1"));
        add(new Button("Button2"));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(300,250);
        setTitle("Frame Example");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
