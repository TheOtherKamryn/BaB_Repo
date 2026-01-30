package user_interface.work;

import database.BGame.*;
import database.BGame.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khrom
 */
public class FTTTPanel extends JPanel implements ActionListener {
    JPanel tictactoePanel;
    JPanel explainTicTacToe;
    JLabel infoCardTTT;
    JButton leaveInfoCardTTT;
    JButton exitFTTTTWMGM;
    JButton infoButtonTTT;
    JButton moneyDisplayedTTT;
    
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    
    JButton[] buttons = new JButton[9];
    boolean player1_turn = true;
    
    JButton nextGameTTT;  
    
    JLabel ticTacToeTasks;
    
    public FTTTPanel(){
        explainTicTacToe = new JPanel();
        explainTicTacToe.setLayout(null);
        explainTicTacToe.setBackground(new Color(215,215,215));
        explainTicTacToe.setBounds(0, 0, 1600, 900);
        explainTicTacToe.setVisible(false);

        infoCardTTT = new JLabel();
        infoCardTTT.setBounds(100, 0, 1400, 800);
        infoCardTTT.setFont(new Font("Helvetica", Font.BOLD, 60));
        infoCardTTT.setText("<html>Try to put three crosses in a row while block circles from doing the same."
                + " Winning two games of tic-tac-toe will increase the amount of tasks you have"
                + " completed for the year and the amount of money you've made."
                + "<br> Keep in mind that working hard is rewarded. <html>");

        explainTicTacToe.add(infoCardTTT);

        leaveInfoCardTTT = new JButton("X");
        leaveInfoCardTTT.setBounds(10,10,100,100);
        leaveInfoCardTTT.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfoCardTTT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfoCardTTT.setBackground(Color.gray);
        leaveInfoCardTTT.setFocusable(false);
        leaveInfoCardTTT.addActionListener(this);
        explainTicTacToe.add(leaveInfoCardTTT);
        
        tictactoePanel = new JPanel();
        tictactoePanel.setLayout(null);
        tictactoePanel.setBounds(0, 0, 1600, 900);
        tictactoePanel.setBackground(new Color(215,215,215));
        tictactoePanel.setVisible(false);


        //moneyDisplayedTTT = new JButton("8Bit$: "+ money +"");
        moneyDisplayedTTT.setBounds(1250,50,300,100);
        moneyDisplayedTTT.setFont(new Font("Helvetica", Font.BOLD, 40));
        moneyDisplayedTTT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedTTT.setBackground(Color.gray);
        moneyDisplayedTTT.setForeground(Color.darkGray);
        moneyDisplayedTTT.setFocusable(false);
        moneyDisplayedTTT.setEnabled(false);
        tictactoePanel.add(moneyDisplayedTTT);

        infoButtonTTT = new JButton("i");
        infoButtonTTT.setBounds(1300, 50 ,100,100);
        infoButtonTTT.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonTTT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonTTT.setBackground(Color.gray);
        infoButtonTTT.setFocusable(false);
        infoButtonTTT.addActionListener(this);
        tictactoePanel.add(infoButtonTTT);

        //ticTacToeTasks = new JLabel("Tasks:"+(int)numOfTasks+"/5");
        ticTacToeTasks.setBounds(1275, 250 ,300,100);
        ticTacToeTasks.setFont(new Font("Helvetica", Font.BOLD, 60));
        ticTacToeTasks.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        ticTacToeTasks.setBackground(Color.gray);
        tictactoePanel.add(ticTacToeTasks);

        JPanel tttGrid = new JPanel();
        tttGrid.setBounds(400, 25, 800, 800);
        tttGrid.setBackground(new Color(50,200,50));
        tttGrid.setLayout(new BorderLayout());
        tictactoePanel.add(tttGrid);


        textfield.setBackground(Color.gray);
        textfield.setForeground(Color.darkGray);
        textfield.setFont(new Font("Helvetica", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        title_panel.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));

        for(int i = 0; i<9; i++)
        {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setBackground(Color.lightGray);
            buttons[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
            buttons[i].setFont(new Font("Helvetica", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

            //firstTurn();
        }

        title_panel.add(textfield);
        tttGrid.add(title_panel, BorderLayout.NORTH);
        tttGrid.add(button_panel);



        exitFTTTTWMGM = new JButton("Back");
        exitFTTTTWMGM.setBounds(25, 50 ,275,100);
        exitFTTTTWMGM.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitFTTTTWMGM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitFTTTTWMGM.setBackground(Color.gray);
        exitFTTTTWMGM.setFocusable(false);
        exitFTTTTWMGM.addActionListener(this);

        tictactoePanel.add(exitFTTTTWMGM);


        nextGameTTT = new JButton("Next");
        nextGameTTT.setBounds(1250,600,300,100);
        nextGameTTT.addActionListener(this);
        nextGameTTT.setFont(new Font("Helvetica", Font.BOLD, 75));
        nextGameTTT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        nextGameTTT.setBackground(Color.gray);
        nextGameTTT.setVisible(false);
        tictactoePanel.add(nextGameTTT);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
}
