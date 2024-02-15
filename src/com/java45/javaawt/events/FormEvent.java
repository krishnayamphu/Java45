package com.java45.javaawt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormEvent extends Frame implements ActionListener {
    private Button btn;
    public FormEvent(){
        initComponents();
    }

    private void initComponents() {
        btn=new Button("Click Me!");
        btn.addActionListener(this);
        add(btn);
        setSize(300,100);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
    new FormEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("button clicked");
            System.exit(0);
        }
    }
}
