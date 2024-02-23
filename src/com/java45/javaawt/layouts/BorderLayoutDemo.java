package com.java45.javaawt.layouts;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    public BorderLayoutDemo(){
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        Panel p=new Panel();
        p.add(new Button("Button 1"));
        p.add(new Button("Button 2"));
        p.add(new TextField(20));
        p.setBackground(Color.PINK);

        add(p,BorderLayout.NORTH);
        add(new Button("East"),BorderLayout.EAST);
        add(new Button("West"),BorderLayout.WEST);
        add(new Button("South"),BorderLayout.SOUTH);
        add(new Button("Center"),BorderLayout.CENTER);

        setSize(500,500);
        setTitle("Border Layout");
        setVisible(true);
    }

    public static void main(String[] args) {
    new BorderLayoutDemo();
    }
}
