package com.java45.javaawt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyForm extends Frame {
    public MyForm() {
        initComponents();
    }

    private void initComponents() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
        add(new Label("Name"));
        add(new TextField(20));

        add(new Label("Checkbox"));
        add(new Checkbox("Basic", true));
        add(new Checkbox("Java", false));

        CheckboxGroup gender = new CheckboxGroup();
        add(new Label("Gender"));
        add(new Checkbox("Male", gender, false));
        add(new Checkbox("Female", gender, false));

        add(new Label("Fruits"));
        Choice fruits = new Choice();
        fruits.addItem("Apple");
        fruits.addItem("Mango");
        fruits.add("Orange");
        add(fruits);

        add(new Label("List"));
        Choice list = new Choice();
        list.addItem("List 1");
        list.addItem("List 2");
        list.addItem("List 3");
        add(list);

        add(new Label("TextArea"));
        TextArea ta = new TextArea(5, 20);
        add(ta);

        add(new Button("Submit"));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(300, 250);
        setTitle("My Form");
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }

}
