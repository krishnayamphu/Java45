package com.java45.javaawt;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(300,250);
        f.setVisible(true);
        f.setTitle("Frame Demo");
        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.setLayout(new FlowLayout());
    }
}
