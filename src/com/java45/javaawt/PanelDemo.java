package com.java45.javaawt;

import java.awt.*;

public class PanelDemo extends Frame {
    public PanelDemo() {
        initComponents();
    }

    public static void main(String[] args) {
        new PanelDemo();
    }

    private void initComponents() {
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(new Button("button"));
        p.setBackground(Color.red);

        add(p);
        setSize(400, 300);
        setVisible(true);
    }
}
