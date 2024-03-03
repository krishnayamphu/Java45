package com.java45.javaawt.graphics;

import java.awt.*;
import java.awt.event.*;

public class MyCanvasApp extends Frame {
    private Button btn1, btn2;
    public MyCanvasApp() {
        init();
    }
    private void init() {
        setLayout(new BorderLayout());
        Panel top = new Panel();
        Panel center = new Panel();
        center.setBackground(Color.cyan);
        btn1 = new Button("Draw");
        btn2 = new Button("Clear");
        add(top, BorderLayout.NORTH);
        top.setBackground(Color.PINK);
        top.add(btn1);
        top.add(btn2);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = getGraphics();
                g.fillRect(100, 100, 100, 100);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = getGraphics();
                g.clearRect(0, 0, 400, 300);
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g=getGraphics();
                g.setColor(Color.blue);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }
        });
        setTitle("Canvas Demo");
        setSize(400, 300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new MyCanvasApp().setVisible(true);
    }
}
