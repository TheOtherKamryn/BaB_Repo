package user_interface;

import database.AccessJDBC1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khrom
 */
public class FPlayScreenPanel extends JPanel implements ActionListener {
    JPanel startScreen;
    JLabel title;
    JButton logOutButton;

    JButton startButton;
    boolean isNewPlayer = true;
    boolean gambledBefore = false;
    boolean exitedEarly = false;
    JButton continueButton;
    
    FMainMenuPanel mainMenuPanel = new FMainMenuPanel();
    
    double width = FGameFrame.width;
    double height = FGameFrame.height;

    public FPlayScreenPanel(){
        // all JComponents in PlayScreenPanel should use the "setUpComponent" method
            this.setLayout(null);
            this.setBackground(new Color(215,215,215));
            this.setBounds(0, 0, (int)width, (int)height);
            this.setVisible(false);
            
            title = new JLabel("Bit$ and Bill$");
            title.setBounds(500, 0, 800, 250);
            title.setFont(new Font("Helvetica", Font.BOLD, 100));
            title.setForeground(new Color(25,100,25));

            logOutButton = new JButton("Log Out");
            logOutButton.setFont(new Font("Helvetica", Font.BOLD, 50));
            logOutButton.setForeground(Color.darkGray);
            logOutButton.setFocusable(false);
            logOutButton.setBounds(60,75,275,100);
            logOutButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
            logOutButton.setBackground(Color.gray);
            logOutButton.addActionListener(this);


            startButton = new JButton("Start a New Game");
            startButton.setFont(new Font("Helvetica", Font.BOLD, 75));
            startButton.setForeground(new Color(25,25,100));
            startButton.setFocusable(false);
            startButton.setBounds(400,175,800,250);
            startButton.setBackground(new Color(100,100,235));
            startButton.addActionListener(this);
            startButton.setBorder(BorderFactory.createLineBorder(new Color(25,25,100), 10));


            continueButton = new JButton("Continue a Game");
            continueButton.setFont(new Font("Helvetica", Font.BOLD, 75));
            continueButton.setForeground(new Color(25,100,25));
            continueButton.setFocusable(false);
            continueButton.setBounds(400,450,800,250);
            continueButton.setBackground(new Color(100,235,100));
            continueButton.addActionListener(this);
            continueButton.setBorder(BorderFactory.createLineBorder(new Color(25,100,25), 10));

            this.add(title);
            this.add(logOutButton);
            this.add(startButton);
            this.add(continueButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == logOutButton)
        {
            
        }


        if(e.getSource() == startButton)
        {
            
        }
        
        if(e.getSource() == continueButton)
        {
           mainMenuPanel.setVisible( true);
           this.setVisible(false);
        }
    }
    
}
