package com.java45.javaawt.events;

import java.awt.*;

public class Second extends Frame {
    private Button btn;
    public Second(){
        initComponents();
    }

    public static void main(String[] args) {
        new Second();
    }

    private void initComponents() {
        First e=new First(this);
        btn=new Button("Click Me!");
        btn.addActionListener(e);
        add(btn);
        setSize(300,100);
        setLayout(new FlowLayout());
        setVisible(true);
    }

}
