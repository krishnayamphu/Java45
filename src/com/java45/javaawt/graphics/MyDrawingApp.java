package com.java45.javaawt.graphics;

import java.awt.*;

public class MyDrawingApp extends Frame {
    public MyDrawingApp(){
        initComponents();
    }

    private void initComponents() {
        setSize(600,500);
    }

    @Override
    public void paint(Graphics g) {
       g.fillRect(50,50,100,100);
       g.drawOval(200,50, 100,100);
        g.setColor(Color.GREEN);
       g.drawLine(50,200, 200,300);
       g.setFont(new Font("Arial",Font.BOLD,50));
       g.setColor(Color.red);
       g.drawString("Hello",200,200);

       int x[]={150,200,50};
       int y[]={50,150,150};
       g.drawPolygon(x,y,3);

       g.fillArc(300,300,100,100,0,180);
    }

    public static void main(String[] args) {
        new MyDrawingApp().setVisible(true);
    }

}
