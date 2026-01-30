package user_interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khrom
 */
public class FCutscenesPanel extends JPanel implements ActionListener {
    JPanel prestartSequence;
    JLabel prequel;
    JButton goToWorkButton;
    
    JPanel startSequence1;
    JLabel dialouge1;
    JButton nextButton;

    JPanel startSequence2;
    JLabel dialouge2;
    JButton workOptionButton;
    ImageIcon workOptionIcon;
    JButton gamblingOptionButton;
    
    ImageIcon gamblingOptionIcon;

    JPanel cutscene3;
    JLabel story1;
    JButton goToYear4;
    
    JPanel cutscene4;
    JLabel story2;
    JButton goToYear7;
    
    JPanel finalCutscene;
    JLabel ending;
    JButton endGame;
    
    public FCutscenesPanel(){
        prestartSequence = new JPanel();
        prestartSequence.setLayout(null);
        prestartSequence.setBackground(new Color(215,215,215));
        prestartSequence.setBounds(0, 0, 1600, 900);
        prestartSequence.setVisible(false);

        prequel = new JLabel();
        prequel.setBounds(100, 0, 1400, 800);
        prequel.setFont(new Font("Helvetica", Font.BOLD, 75));
        prequel.setText("<html>You’re just some guy, working a dead-end job,"
                + "you feel like you aren’t making much money"
                + " and want to make it  fast <br> and 'easy'...<html>");
        prestartSequence.add(prequel);

        goToWorkButton = new JButton("Go to Work");
        goToWorkButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        goToWorkButton.setFocusable(false);
        goToWorkButton.setBounds(800,725,600,100);
        goToWorkButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        goToWorkButton.setBackground(Color.gray);
        goToWorkButton.addActionListener(this);
        prestartSequence.add(goToWorkButton);
        
        startSequence1 = new JPanel();
        startSequence1.setLayout(null);
        startSequence1.setBackground(new Color(215,215,215));
        startSequence1.setBounds(0, 0, 1600, 900);
        startSequence1.setVisible(false);

        dialouge1 = new JLabel("A casino opened near me...");
        dialouge1.setBounds(300, 0, 1200, 800);
        dialouge1.setFont(new Font("Helvetica", Font.BOLD, 75));

        startSequence1.add(dialouge1);

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        nextButton.setFocusable(false);
        nextButton.setBounds(1125,725,400,100);
        nextButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        nextButton.setBackground(Color.gray);
        nextButton.addActionListener(this);
        startSequence1.add(nextButton);

        startSequence2 = new JPanel();
        startSequence2.setLayout(null);
        startSequence2.setBackground(new Color(215,215,215));
        startSequence2.setBounds(0, 0, 1600, 900);
        startSequence2.setVisible(false);

        dialouge2 = new JLabel("I should probably...");
        dialouge2.setBounds(300, 0, 1200, 250);
        dialouge2.setFont(new Font("Helvetica", Font.BOLD, 100));
        startSequence2.add(dialouge2);

        workOptionIcon = new ImageIcon("workOption.jpg");

        workOptionButton = new JButton("Go to Work.");
        workOptionButton.setIcon(workOptionIcon);
        workOptionButton.setHorizontalTextPosition(SwingConstants.CENTER);
        workOptionButton.setVerticalTextPosition(SwingConstants.TOP);
        workOptionButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        workOptionButton.setFocusable(false);
        workOptionButton.setBounds(200,200,500,500);
        workOptionButton.setBackground(Color.gray);
        workOptionButton.addActionListener(this);
        workOptionButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        startSequence2.add(workOptionButton);

        gamblingOptionIcon = new ImageIcon("gamblingOption.jpg");

        gamblingOptionButton = new JButton("Go Gambling.");
        gamblingOptionButton.setIcon(gamblingOptionIcon);
        gamblingOptionButton.setHorizontalTextPosition(SwingConstants.CENTER);
        gamblingOptionButton.setVerticalTextPosition(SwingConstants.TOP);
        gamblingOptionButton.setFont(new Font("Helvetica", Font.BOLD, 50));
        gamblingOptionButton.setFocusable(false);
        gamblingOptionButton.setBounds(800,200,500,500);
        gamblingOptionButton.setBackground(Color.gray);
        gamblingOptionButton.addActionListener(this);
        gamblingOptionButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        startSequence2.add(gamblingOptionButton);
            
        cutscene3 = new JPanel();
        cutscene3.setLayout(null);
        cutscene3.setBackground(new Color(215,215,215));
        cutscene3.setBounds(0, 0, 1600, 900);
        cutscene3.setVisible(false);

        story1 = new JLabel();
        story1.setBounds(200, 0, 1400, 800);
        story1.setFont(new Font("Helvetica", Font.BOLD, 50));
        cutscene3.add(story1);

        goToYear4 = new JButton("Continue to Year 4");
        goToYear4.setFont(new Font("Helvetica", Font.BOLD, 50));
        goToYear4.setFocusable(false);
        goToYear4.setBounds(1000,725,500,100);
        goToYear4.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        goToYear4.setBackground(Color.gray);
        goToYear4.addActionListener(this);
        cutscene3.add(goToYear4); 

        cutscene4 = new JPanel();
        cutscene4.setLayout(null);
        cutscene4.setBackground(new Color(215,215,215));
        cutscene4.setBounds(0, 0, 1600, 900);
        cutscene4.setVisible(false);

        story2 = new JLabel();
        story2.setBounds(200, 0, 1400, 800);
        story2.setFont(new Font("Helvetica", Font.BOLD, 50));
        cutscene4.add(story2);

        goToYear7 = new JButton("Continue to Year 7");
        goToYear7.setFont(new Font("Helvetica", Font.BOLD, 50));
        goToYear7.setFocusable(false);
        goToYear7.setBounds(1000,725,500,100);
        goToYear7.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        goToYear7.setBackground(Color.gray);
        goToYear7.addActionListener(this);
        cutscene4.add(goToYear7);

        finalCutscene = new JPanel();
        finalCutscene.setLayout(null);
        finalCutscene.setBackground(new Color(215,215,215));
        finalCutscene.setBounds(0, 0, 1600, 900);
        finalCutscene.setVisible(false);

        ending = new JLabel();
        ending.setBounds(200, 0, 1400, 800);
        ending.setFont(new Font("Helvetica", Font.BOLD, 50));
        finalCutscene.add(ending);


        endGame = new JButton("Rebirth");
        endGame.setFont(new Font("Helvetica", Font.BOLD, 50));
        endGame.setFocusable(false);
        endGame.setBounds(1000,725,500,100);
        endGame.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        endGame.setBackground(Color.gray);
        endGame.addActionListener(this);
        finalCutscene.add(endGame);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
}
