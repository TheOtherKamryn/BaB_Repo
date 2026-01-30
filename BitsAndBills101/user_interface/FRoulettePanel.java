package user_interface.gambling;

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
public class FRoulettePanel extends JPanel implements ActionListener{
    JPanel explainRoulette;
    JButton leaveInfocardR;
    JLabel infocardR;
    
    JPanel roulettePanel = new JPanel();
    
    JButton infoButtonR;
    
    JButton rouletteTasks;
    JLabel rouletteProb2 = new JLabel();
    JLabel rolled;
    
    JPanel rouletteButtons = new JPanel();
        
    JButton zeroButtonR;
    JButton[] rButtons = new JButton[36];
    
    boolean buttonClicked = false;
    
    JPanel rowOfButtons = new JPanel();
    JButton[] rowButton = new JButton[12];
    
    boolean rB1_Selected = false;
    boolean rB2_Selected = false;
    boolean rB3_Selected = false;
    boolean rB4_Selected = false;
    boolean rB5_Selected = false;
    boolean rB6_Selected = false;
    boolean rB7_Selected = false;
    boolean rB8_Selected = false;
    boolean rB9_Selected = false;
    boolean rB10_Selected = false;
    boolean rB11_Selected = false;
    boolean rB12_Selected = false;
        
    JButton moneyDisplayedR;
    JPanel placeBet;
    JButton[] rouletteBets = new JButton[3]; 
    JButton exitFRTGM;
      
    JButton spinWheel;
    JButton rouletteAgain;
    
    public FRoulettePanel(){
        explainRoulette = new JPanel();
        explainRoulette.setLayout(null);
        explainRoulette.setBackground(new Color(215,215,215));
        explainRoulette.setBounds(0, 0, 1600, 900);
        explainRoulette.setVisible(false);

        infocardR = new JLabel();
        infocardR.setBounds(100, 0, 1400, 800);
        infocardR.setFont(new Font("Helvetica", Font.BOLD, 60));
        infocardR.setText("<html> Choose a number to bet on "
                + "and the amount of money you want to bet on it for, "
                + "click spin wheel to see if you've one. "
                + "Playing two games of roulette takes one task from you.<html>");
        explainRoulette.add(infocardR);

        leaveInfocardR = new JButton("X");
        leaveInfocardR.setBounds(10,10,100,100);
        leaveInfocardR.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardR.setBackground(Color.gray);
        leaveInfocardR.setFocusable(false);
        leaveInfocardR.addActionListener(this);
        explainRoulette.add(leaveInfocardR);

        roulettePanel = new JPanel();
        roulettePanel.setLayout(null);
        roulettePanel.setBounds(0, 0, 1600, 900);
        roulettePanel.setBackground(new Color(215,215,215));
        roulettePanel.setVisible(false);

        infoButtonR = new JButton("i");
        infoButtonR.setBounds(925, 50 ,100,100);
        infoButtonR.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonR.setBackground(Color.gray);
        infoButtonR.setFocusable(false);
        infoButtonR.addActionListener(this);
        roulettePanel.add(infoButtonR);

        //rouletteTasks = new JButton("Tasks:"+(int)numOfTasks+"/5");
        rouletteTasks.setBounds(25,475 ,300,100);
        rouletteTasks.setFont(new Font("Helvetica", Font.BOLD, 50));
        rouletteTasks.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        rouletteTasks.setBackground(Color.gray);
        roulettePanel.add(rouletteTasks);

        exitFRTGM = new JButton("Back");
        exitFRTGM.setBounds(25, 50 ,275,100);
        exitFRTGM.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitFRTGM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitFRTGM.setBackground(Color.gray);
        exitFRTGM.setFocusable(false);
        exitFRTGM.addActionListener(this);
        roulettePanel.add(exitFRTGM);


        ImageIcon wheelIcon = new ImageIcon("rouletteWheelImage.png");
        JLabel theWheel = new JLabel();
        theWheel.setIcon(wheelIcon);
        theWheel.setBounds(400,150,500,400);
        roulettePanel.add(theWheel);


        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(1050, 100, 300, 600);
        tablePanel.setBackground(new Color(50,200,50));
        tablePanel.setLayout(new BorderLayout());
        roulettePanel.add(tablePanel);

        zeroButtonR = new JButton("0");

        zeroButtonR.setBounds(1050, 50,300,50);
        zeroButtonR.setBackground(Color.lightGray);
        zeroButtonR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        zeroButtonR.setFont(new Font("Helvetica", Font.BOLD, 30));
        zeroButtonR.setFocusable(false);
        zeroButtonR.addActionListener(this);
        roulettePanel.add(zeroButtonR);

        rouletteButtons.setLayout(new GridLayout(12,3));
        rouletteButtons.setBackground(new Color(150,150,150));

        for(int i = 0; i<36; i++)
        {
            int num = i+1;
            rButtons[i] = new JButton();
            rouletteButtons.add(rButtons[i]);
            rButtons[i].setBackground(Color.lightGray);
            rButtons[i].setText(""+num);
            rButtons[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
            rButtons[i].setFont(new Font("Helvetica", Font.BOLD, 30));
            rButtons[i].setFocusable(false);
            rButtons[i].addActionListener(this);
        }

        tablePanel.add(rouletteButtons);

        JPanel rowPanel = new JPanel();
        rowPanel.setBounds(1350, 100, 75, 600);
        rowPanel.setBackground(new Color(50,200,50));
        rowPanel.setLayout(new BorderLayout());
        roulettePanel.add(rowPanel);

        rowOfButtons.setLayout(new GridLayout(12,1));

        for(int i = 0; i<12; i++)
        {
            rowButton[i] = new JButton();
            rowOfButtons.add(rowButton[i]);
            rowButton[i].setBackground(Color.lightGray);
            rowButton[i].setText("◀");
            rowButton[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
            rowButton[i].setFont(new Font("Helvetica", Font.BOLD, 30));
            rowButton[i].setFocusable(false);
            rowButton[i].addActionListener(this);
        }

        rowPanel.add(rowOfButtons);

        JLabel rouletteProbabilities = new JLabel("<html>Win a row of bets, get x11.<br> Win a single number bet, get x35<html>");
        rouletteProbabilities.setBounds(1050, 700, 800, 100);
        rouletteProbabilities.setFont(new Font("Helvetica", Font.BOLD, 25));
        rouletteProbabilities.setForeground(Color.darkGray);
        roulettePanel.add(rouletteProbabilities);

        JLabel placeBetText = new JLabel("Place Your Bet");
        placeBetText.setBounds(460, 500, 800, 100);
        placeBetText.setFont(new Font("Helvetica", Font.BOLD, 50));
        placeBetText.setForeground(Color.darkGray);
        roulettePanel.add(placeBetText);

        placeBet = new JPanel();
        placeBet.setLayout(new GridLayout(1,3));
        placeBet.setBounds(410,600,525,125);
        placeBet.setBackground(Color.gray);
        placeBet.setFont(new Font("Helvetica", Font.BOLD, 50));
        roulettePanel.add(placeBet);

        for(int i = 0; i < 3; i++)
        {
            rouletteBets[i] = new JButton();
            placeBet.add(rouletteBets[i]);
            rouletteBets[i].setBackground(Color.lightGray);
            rouletteBets[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
            rouletteBets[i].setFont(new Font("Helvetica", Font.BOLD, 50));
            rouletteBets[i].setFocusable(false);
            rouletteBets[i].addActionListener(this);
        }
        rouletteBets[0].setText("10");
        rouletteBets[1].setText("25");
        rouletteBets[2].setText("50");

        //moneyDisplayedR = new JButton("8Bit$: "+ money + "");
        moneyDisplayedR.setBounds(400,50,500,100);
        moneyDisplayedR.setFont(new Font("Helvetica", Font.BOLD, 60));
        moneyDisplayedR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedR.setBackground(Color.gray);
        moneyDisplayedR.setFocusable(false);
        moneyDisplayedR.setEnabled(false);
        roulettePanel.add(moneyDisplayedR);

        rouletteProb2 = new JLabel("<html>"
                + "There is a 2.70% chance of winning singular bets"
                + " and an 8.10% chance of winning row bets."                    
                + "<html>");
        rouletteProb2.setBounds(50, 200, 350, 400);
        rouletteProb2.setFont(new Font("Helvetica", Font.BOLD, 25));
        rouletteProb2.setForeground(Color.darkGray);
        roulettePanel.add(rouletteProb2);        


        rolled = new JLabel();
        rolled.setText("The wheel has landed on: ");
        rolled.setBounds(50, 160, 350, 125);
        rolled.setFont(new Font("Helvetica", Font.BOLD, 25));
        rolled.setForeground(Color.darkGray);
        roulettePanel.add(rolled);


        spinWheel = new JButton("Spin Wheel");
        spinWheel.setBounds(25, 600 ,300,100);
        spinWheel.setFont(new Font("Helvetica", Font.BOLD, 50));
        spinWheel.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        spinWheel.setBackground(Color.gray);
        spinWheel.setFocusable(false);
        spinWheel.addActionListener(this);
        roulettePanel.add(spinWheel);

        rouletteAgain = new JButton("Play again");
        rouletteAgain.setBounds(25, 600 ,300,100);
        rouletteAgain.setFont(new Font("Helvetica", Font.BOLD, 50));
        rouletteAgain.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        rouletteAgain.setBackground(Color.gray);
        rouletteAgain.setFocusable(false);
        rouletteAgain.setVisible(false);
        rouletteAgain.addActionListener(this);
        roulettePanel.add(rouletteAgain);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
