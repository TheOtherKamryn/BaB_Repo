package user_interface;

import database.AccessJDBC1;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FLoginPanel extends JPanel implements ActionListener{
    Connection con = null;
    PreparedStatement psmt = null;
    int n = 2;
    
    JPanel createUserScreen;
    JLabel createLabel;
    JLabel userLabelA;
    JTextField newUser;
    JLabel passLabelA;
    JTextField newPass;
    JButton createUserButton;
    JButton logInButton;
    
    
    
    JPanel logInScreen;
    JLabel logInLabel;
    JLabel userLabelB;
    JTextField username;
    JLabel passLabelB;
    JPasswordField password;
    JButton createUserScreenButton;
    JButton signInButton;
    
    FPlayScreenPanel playScreenPanel = new FPlayScreenPanel();
    
    double width = FGameFrame.width;
    double height = FGameFrame.height;

    public FLoginPanel()
    {
        con = AccessJDBC1.connect();
        this.setLayout(null);
        this.setBackground(Color.orange);
        this.setBounds(0, 0, (int)width, (int)height);
        this.setVisible(true);
       
        createUserScreen = new JPanel();
        createUserScreen.setLayout(null);
        createUserScreen.setBackground(new Color(215,215,215));
        createUserScreen.setBounds(0, 0, (int)width, (int)height);
        createUserScreen.setVisible(false);
        this.add(createUserScreen);
       
        createLabel = new JLabel("Create a Username and Password");
        FGameFrame.setUpComponent(createLabel, 4.75, 12.0, 1.0, 12.0, 25.0, new Color(25, 100, 25), createUserScreen);

        userLabelA = new JLabel("New Username: ");
        FGameFrame.setUpComponent(userLabelA, 6.0, 4.0, 1.0, 12.0, 27.0, Color.darkGray, createUserScreen);

        newUser = new JTextField();
        newUser.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        newUser.setBackground(Color.gray);
        FGameFrame.setUpComponent(newUser, 2.0, 4.0, 2.5, 9.0, 30.0, null, createUserScreen);

        passLabelA = new JLabel("New Password: ");
        FGameFrame.setUpComponent(passLabelA, 6.0, 2.0, 1.0, 12.0, 27.0, Color.darkGray, createUserScreen);

        newPass = new JPasswordField();
        newPass.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        newPass.setBackground(Color.gray);
        FGameFrame.setUpComponent(newPass, 2.0, 2.0, 2.5, 9.0, 30.0, null, createUserScreen);

        createUserButton = new JButton("Create User");
        createUserButton.setFocusable(false);
        createUserButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        createUserButton.setBackground(Color.gray);
        createUserButton.addActionListener(this);
        FGameFrame.setUpComponent(createUserButton, 1.75, 1.5, 4.0, 9.0, 27.0, Color.darkGray, createUserScreen);

        logInButton = new JButton("I already have an account");
        logInButton.setFocusable(false);
        logInButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        logInButton.setBackground(Color.gray);
        logInButton.addActionListener(this);
        FGameFrame.setUpComponent(logInButton, 10.0, 1.5, 2.5, 9.0, 27.0, Color.darkGray, createUserScreen);

        logInScreen = new JPanel();
        logInScreen.setLayout(null);
        logInScreen.setBackground(new Color(215,215,215));
        logInScreen.setBounds(0, 0, (int)width, (int)height);
        logInScreen.setVisible(true);
        this.add(logInScreen);
       
        logInLabel = new JLabel("Enter your Username and Password");
        FGameFrame.setUpComponent(logInLabel, 5.0, 12.0, 1.0, 12.0, 25.0, new Color(25, 100, 25), logInScreen);

        userLabelB = new JLabel("Username: ");
        FGameFrame.setUpComponent(userLabelB, 6.0, 4.0, 1.0, 12.0, 27.0, Color.darkGray, logInScreen);

        username = new JTextField();
        username.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        username.setBackground(Color.gray);
        FGameFrame.setUpComponent(username, 2.0, 4.0, 2.5, 9.0, 30.0, null, logInScreen);

        passLabelB = new JLabel("Password: ");
        FGameFrame.setUpComponent(passLabelB, 6.0, 2.0, 1.0, 12.0, 27.0, Color.darkGray, logInScreen);

        password = new JPasswordField();
        password.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        password.setBackground(Color.gray);
        password.setEchoChar('*');
        FGameFrame.setUpComponent(password, 2.0, 2.0, 2.5, 9.0, 30.0, null, logInScreen);

        createUserScreenButton = new JButton("Create a New User");
        createUserScreenButton.setFocusable(false);
        createUserScreenButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        createUserScreenButton.setBackground(Color.gray);
        createUserScreenButton.addActionListener(this);
        FGameFrame.setUpComponent(createUserScreenButton, 1.75, 1.5, 4.0, 9.0, 27.0, Color.darkGray, logInScreen);
       
        signInButton = new JButton("Sign in");
        signInButton.setFocusable(false);
        signInButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        signInButton.setBackground(Color.gray);
        signInButton.addActionListener(this);
        FGameFrame.setUpComponent(signInButton, 4.5, 1.5, 5.0, 9.0, 27.0, Color.darkGray, logInScreen);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == createUserButton)
        {
             if(newUser.getText().equals("") || newPass.getText().equals(""))
            {
                JOptionPane.showMessageDialog(createUserScreen,
                    "No Password or Username entered, please try again",
                    "Enter a Password and Username",
                    JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                n++;
                database.DBUserAccounts.DBUserAccounts.accessInsert_Accounts(con, psmt, n, newUser.getText(), newPass.getText());
                JOptionPane.showMessageDialog(createUserScreen,
                         "New user has been created!",
                         "New User Created",
                         JOptionPane.INFORMATION_MESSAGE);
                createUserScreen.setVisible(false);
                logInScreen.setVisible(true);
            }
        }
        
        if(e.getSource() == logInButton)
        {
            /*
            database.DBUserAccounts.DBUserAccounts.accessRead_Accounts(con);*/
            createUserScreen.setVisible(false);
            logInScreen.setVisible(true);
        }
        
        if(e.getSource() == createUserScreenButton)
        {
            createUserScreen.setVisible(true);
            logInScreen.setVisible(false);
        }
            
        
        if(e.getSource() == signInButton)
        {
            if(username.getText().equals("") && password.getText().equals(""))
            {
                JOptionPane.showMessageDialog(logInScreen,
                         "No Password or Username Entered, please try again",
                         "Enter your Password or Username",
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                this.setVisible(false);
                this.playScreenPanel.setVisible(true);  
            }
        }
    }

}

