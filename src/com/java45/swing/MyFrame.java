package com.java45.swing;

import com.java45.javaawt.MyForm;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        init();
    }

    private void init() {
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
    }

    public static void main(String[] args) {
        new MyFrame().setVisible(true);
    }
}
