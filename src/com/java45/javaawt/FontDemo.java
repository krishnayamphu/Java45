package com.java45.javaawt;

import java.awt.*;

public class FontDemo extends Frame{
    private Label lbltext;
    public FontDemo() {
        initComponents();
    }

    private void initComponents() {
        lbltext=new Label("Hello World");
        lbltext.setForeground(new Color(255,0,0));
        lbltext.setFont(new Font("arial",Font.ITALIC, 28));
        add(lbltext);
        setSize(500,500);
        setTitle("Awt Graphics");
        setVisible(true);
    }

    public static void main(String[] args) {
        new FontDemo();
    }


}
