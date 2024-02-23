package com.java45.javaawt.layouts;

import java.awt.*;

public class GridLayoutDemo extends Frame {
    public GridLayoutDemo(){
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(2,3));

        add(new Button("Btn 1"));
        add(new Button("Btn 1"));
        add(new Button("Btn 1"));
        add(new Button("Btn 1"));
        add(new Button("Btn 1"));


        setSize(500,500);
        setTitle("Grid Layout");
        setVisible(true);
    }

    public static void main(String[] args) {
    new GridLayoutDemo();
    }
}
