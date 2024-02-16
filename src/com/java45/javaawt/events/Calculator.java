package com.java45.javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {
    private TextField t1,t2,t3;
    private Button btnp, btns, btnm, btnd;
    private double n1,n2,n3;
    public Calculator(){
        initComponents();
    }

    private void initComponents() {
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        btnp=new Button(" + ");
        btns=new Button(" - ");
        btnm=new Button(" x ");
        btnd=new Button(" / ");

        add(t1);
        add(t2);
        add(t3);

        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
            }
        });
        add(btnp);
        add(btns);
        add(btnm);
        add(btnd);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(200,200);
    }

    public void add(){
        n1=Double.parseDouble(t1.getText()); //string
        n2=Double.parseDouble(t2.getText());
        t3.setText(String.valueOf(n1+n2));

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
