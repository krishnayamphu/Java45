package com.java45.javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApp extends Frame {
    public MyApp() {
        initComponents();
    }

    public static void main(String[] args) {
        new MyApp();
    }

    private void initComponents() {
        MenuBar mb = new MenuBar();
        Menu file = new Menu("File");
        MenuItem miOpen = new MenuItem("Open");
        MenuItem miClose = new MenuItem("Close");
        file.add(miOpen);
        file.add(miClose);
        miClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Menu edit = new Menu("Edit");
        mb.add(file);
        mb.add(edit);
        setMenuBar(mb);
        setSize(400, 300);
        setVisible(true);
    }
}
