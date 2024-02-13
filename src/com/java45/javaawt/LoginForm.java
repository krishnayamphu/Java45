package com.java45.javaawt;

import java.awt.*;

public class LoginForm extends Frame {
    Label lblname, lblpassword;
    TextField tname, tpassword;
    Button btnLogin;
    public LoginForm() {
        initComponents();
    }

    private void initComponents() {
        lblname=new Label("Username:");
        lblname.setBounds(20,50,250,30);
        add(lblname);

        tname=new TextField();
        tname.setBounds(20,90,250,30);
        add(tname);

        lblpassword=new Label("Password");
        lblpassword.setBounds(20,130,250,30);
        add(lblpassword);

        tpassword=new TextField();
        tpassword.setBounds(20,170,250,30);
        add(tpassword);

        btnLogin=new Button("Login");
        btnLogin.setBounds(20,210,250,30);
        add(btnLogin);

        setLayout(null);
        setSize(290, 280);
        setTitle("Login Form");
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }

}
