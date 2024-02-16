package com.java45.javaawt.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame {
    private TextField tuser,tpass;
    private Button btnLogin;
    private Label lblerr;

    public Login() {
    initComponents();
    }

    private void initComponents() {
        tuser=new TextField(20);
        tpass=new TextField(20);
        lblerr=new Label();
        btnLogin=new Button("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auth();
            }
        });

        add(new Label("Username:"));
        add(tuser);

        add(new Label("Password:"));
        add(tpass);

        add(lblerr);

        add(btnLogin);

        setSize(220,200);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Login");
        setVisible(true);
    }

    private void auth() {
        if(tuser.getText().isEmpty()){
            System.out.println("username required");
            JOptionPane.showMessageDialog(this,"Username required");
        } else if(tpass.getText().isEmpty()){
            lblerr.setText("Password required");
        }else{
            String username=tuser.getText();
            String password=tpass.getText();
            if(username.equals("admin") && password.equals("a123")){
                System.out.println("Login successfull");
            }else{
                System.out.println("Invalid username or password");
            }

        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
