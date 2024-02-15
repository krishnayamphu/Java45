package com.java45.javaawt.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First implements ActionListener {
    private Second obj;
    public First(Second obj){
        this.obj=obj;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
    }
}
