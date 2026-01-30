package user_interface;
import database.BUser.*;
import database.BGame.*;
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
public class FYearPanel extends JPanel implements ActionListener{
        JPanel explainYearMenu;
        JButton leaveInfocardYM;
        JLabel infocardYM;
        
        JPanel yearPanel;
        JLabel yearTYW;

        JButton infoButtonYM;

        JButton exitToNavFYButton;

        JButton moneyDisplayedYM;

        JButton depositButton;
        JButton infoButtonDeposit;

        JPanel explainDeposit;
        JButton leaveInfocardD;
        JLabel infocardD;

        JButton taskButton;

        JPanel explainTasks;
        JButton leaveInfocardT;
        JLabel infocardT;

        JButton karmaButton;

        JPanel explainKarma;
        JButton leaveInfocardK;
        JLabel infocardK;
        
    public FYearPanel(){
        this.setLayout(null);
        this.setBounds(0, 0, 1600, 900);
        this.setBackground(Color.darkGray);
        this.setVisible(false);

        yearPanel = new JPanel();
        yearPanel.setLayout(null);
        yearPanel.setBounds(250,50,1000,750);
        yearPanel.setBackground(new Color(215,215,215));
        yearPanel.setVisible(false);
        this.add(yearPanel);

        infoButtonYM = new JButton("i");
        infoButtonYM.setBounds(160, 75 ,50,50);
        infoButtonYM.setFont(new Font("Helvetica", Font.BOLD, 30));
        infoButtonYM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        infoButtonYM.setBackground(Color.gray);
        infoButtonYM.setFocusable(false);
        infoButtonYM.addActionListener(this);
        yearPanel.add(infoButtonYM);

        yearTYW = new JLabel();
        yearTYW.setBounds(225,0,400,125);
        yearTYW.setFont(new Font("Helvetica", Font.BOLD, 100));
        yearPanel.add(yearTYW);

        moneyDisplayedYM = new JButton("8Bit$: 0");
        moneyDisplayedYM.setBounds(585,20,390,100);
        moneyDisplayedYM.setFont(new Font("Helvetica", Font.BOLD, 50));
        moneyDisplayedYM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedYM.setBackground(Color.gray);
        moneyDisplayedYM.setForeground(Color.darkGray);
        moneyDisplayedYM.setFocusable(false);
        moneyDisplayedYM.setEnabled(false);
        yearPanel.add(moneyDisplayedYM);

        depositButton = new JButton("Deposit: " + (200*(0+1))+ " $8Bits");
        depositButton.setFont(new Font("Helvetica", Font.BOLD, 50));
        depositButton.setFocusable(false);
        depositButton.setBounds(100,175,800,150);
        depositButton.setBackground(Color.gray);
        depositButton.addActionListener(this);
        depositButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        yearPanel.add(depositButton);

        infoButtonDeposit = new JButton("i");
        infoButtonDeposit.setBounds(915, 225 ,50,50);
        infoButtonDeposit.setFont(new Font("Helvetica", Font.BOLD, 30));
        infoButtonDeposit.setBorder(BorderFactory.createLineBorder(Color.darkGray, 5));
        infoButtonDeposit.setBackground(Color.gray);
        infoButtonDeposit.setFocusable(false);
        infoButtonDeposit.addActionListener(this);
        yearPanel.add(infoButtonDeposit);

        explainDeposit = new JPanel();
        explainDeposit.setLayout(null);
        explainDeposit.setBackground(new Color(215,215,215));
        explainDeposit.setBounds(0, 0, 1600, 900);
        explainDeposit.setVisible(false);

        infocardD = new JLabel();
        infocardD.setBounds(100, 0, 1400, 800);
        infocardD.setFont(new Font("Helvetica", Font.BOLD, 45));
        infocardD.setText("<html> After you've completed all your taks for the year,"
                + " you can deposit your money and move to the next year. "
                + "If you successfully deposit you'll see good cutscenes."
                + "If you have negative karma you'll be able to deposit "
                + "but you'll see bad cutscenes."
                + "<br>"
                + "<br> When you've completed all your tasks, deposit to continue to the next year!<html>");
        explainDeposit.add(infocardD);

        leaveInfocardD = new JButton("X");
        leaveInfocardD.setBounds(10,10,100,100);
        leaveInfocardD.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardD.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardD.setBackground(Color.gray);
        leaveInfocardD.setFocusable(false);
        leaveInfocardD.addActionListener(this);
        explainDeposit.add(leaveInfocardD);

        taskButton = new JButton("Task List: "+ (int)0+ "/5 Complete");
        taskButton.setFont(new Font("Helvetica", Font.BOLD, 60));
        taskButton.setFocusable(false);
        taskButton.setBounds(100,375,800,150);
        taskButton.addActionListener(this);
        taskButton.setBackground(Color.gray);
        taskButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        yearPanel.add(taskButton);

        explainTasks = new JPanel();
        explainTasks.setLayout(null);
        explainTasks.setBackground(new Color(215,215,215));
        explainTasks.setBounds(0, 0, 1600, 900);
        explainTasks.setVisible(false);

        infocardT = new JLabel();
        infocardT.setBounds(100, 0, 1400, 800);
        infocardT.setFont(new Font("Helvetica", Font.BOLD, 60));
        infocardT.setText("<html> There are a set amount of "
                + "tasks to complete each year by going to work or gambling."
                + "<br>"
                + "<br> The tasks you choose to spend your year doing will have consequences so choose wisely!  <html>");
        explainTasks.add(infocardT);

        leaveInfocardT = new JButton("X");
        leaveInfocardT.setBounds(10,10,100,100);
        leaveInfocardT.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardT.setBackground(Color.gray);
        leaveInfocardT.setFocusable(false);
        leaveInfocardT.addActionListener(this);
        explainTasks.add(leaveInfocardT);

        karmaButton = new JButton("Karma: "+ (int)0);
        karmaButton.setFont(new Font("Helvetica", Font.BOLD, 60));
        karmaButton.setFocusable(false);
        karmaButton.setBounds(100,575,800,150);
        karmaButton.setBackground(Color.gray);
        karmaButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        karmaButton.addActionListener(this);
        yearPanel.add(karmaButton);

        explainKarma = new JPanel();
        explainKarma.setLayout(null);
        explainKarma.setBackground(new Color(215,215,215));
        explainKarma.setBounds(0, 0, 1600, 900);
        explainKarma.setVisible(false);

        infocardK = new JLabel();
        infocardK.setBounds(100, 0, 1400, 800);
        infocardK.setFont(new Font("Helvetica", Font.BOLD, 50));
        infocardK.setText("<html>   Karma increases and decreased "
                + "depending on your money choices. If you go to work your gain positive karma,"
                + " if you go gambling you'll gain negative karma or lose karma."
                + " Karma is important to the continuation of the game, depositing"
                + " after a certain amount of years will lead to good and bad cutscenes "
                + "and eventually a good or bad ending at the end of year ten."
                + "<br>"
                + "<br> Be sure to keep track of karma each year!"
                + "<html>");
        explainKarma.add(infocardK);

        leaveInfocardK = new JButton("X");
        leaveInfocardK.setBounds(10,10,100,100);
        leaveInfocardK.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardK.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardK.setBackground(Color.gray);
        leaveInfocardK.setFocusable(false);
        leaveInfocardK.addActionListener(this);
        explainKarma.add(leaveInfocardK);

        exitToNavFYButton = new JButton("X");
        exitToNavFYButton.setBounds(10,10,100,100);
        exitToNavFYButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitToNavFYButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitToNavFYButton.setBackground(Color.gray);
        exitToNavFYButton.setFocusable(false);
        exitToNavFYButton.addActionListener(this);
        yearPanel.add(exitToNavFYButton);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
    
}
