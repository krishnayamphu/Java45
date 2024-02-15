package com.java45.javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame {
    private Button btn;
    private Label lbltext;
    private int h;
    private int w;


    public EventDemo() {
        Dimension size= Toolkit.getDefaultToolkit().getScreenSize();
        this.w = ((int)size.getWidth()/2)-150;
        this.h = ((int)size.getHeight()/2)-50;
        initComponents();
    }

    public static void main(String[] args) {
        new EventDemo();
    }

    private void initComponents() {
        lbltext=new Label();
        btn = new Button("Click Me!");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dimension size= Toolkit.getDefaultToolkit().getScreenSize();
                int width = (int)size.getWidth();
                int height = (int)size.getHeight();
                System.out.println("Current Screen resolution : "
                        + "width : " + width
                        + " height : " + height);
                System.out.println("Hello world");
                lbltext.setText("Hello World");
            }
        });
        add(btn);
        add(lbltext);
        setSize(300, 100);
        setLayout(new FlowLayout());
        setLocation(w,h);
        setVisible(true);
    }
}
