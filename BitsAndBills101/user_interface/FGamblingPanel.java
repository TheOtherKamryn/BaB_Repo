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
public class FGamblingPanel extends JPanel implements ActionListener {
    JPanel gamblingMenu;
    JPanel explainGambling;
    JButton leaveInfocardG;
    JLabel infocardG;   
    JButton gamblingTasks;
    
    JPanel gamblingWarnings;
    JLabel warning;
    JButton exitWarning;
    
    JLabel gambling;
    JButton infoButtonG;
        
    JButton exitToNavFGButton;
    JButton moneyDisplayedG;
    
    JButton slotMachineButton;
    
    JButton rouletteWheelButton;
    
    ImageIcon slotMachineIcon;
    ImageIcon rouletteIcon;
    
    public FGamblingPanel(){
        explainGambling = new JPanel();
        explainGambling.setLayout(null);
        explainGambling.setBackground(new Color(215,215,215));
        explainGambling.setBounds(0, 0, 1600, 900);
        explainGambling.setVisible(false);

        infocardG = new JLabel();
        infocardG.setBounds(100, 0, 1400, 800);
        infocardG.setFont(new Font("Helvetica", Font.BOLD, 60));
        infocardG.setText("<html> Gambling isn't all fun and games."
                + " Gambling is extremely addicting and can negatively "
                + "affect your physical and mental health. "
                + "In this game, participating in gambling will negatively affect your karma."
                + "<br> You will have NEGATIVE consequences if you continue down this path.<html>");
        explainGambling.add(infocardG);

        leaveInfocardG = new JButton("X");
        leaveInfocardG.setBounds(10,10,100,100);
        leaveInfocardG.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardG.setBackground(Color.gray);
        leaveInfocardG.setFocusable(false);
        leaveInfocardG.addActionListener(this);
        explainGambling.add(leaveInfocardG);

        gamblingWarnings = new JPanel();
        gamblingWarnings.setLayout(null);
        gamblingWarnings.setBackground(new Color(215,215,215));
        gamblingWarnings.setBounds(0, 0, 1600, 900);
        gamblingWarnings.setVisible(false);

        warning = new JLabel();
        warning.setBounds(100, 0, 1400, 800);
        warning.setFont(new Font("Helvetica", Font.BOLD, 60));
        warning.setText("<html>"
                + "......"
                + "<html>");
        gamblingWarnings.add(warning);

        exitWarning = new JButton("X");
        exitWarning.setBounds(10,10,100,100);
        exitWarning.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitWarning.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitWarning.setBackground(Color.gray);
        exitWarning.setFocusable(false);
        exitWarning.addActionListener(this);
        gamblingWarnings.add(exitWarning);
        
        gamblingMenu = new JPanel();
        gamblingMenu.setLayout(null);
        gamblingMenu.setBounds(0, 0, 1600, 900);
        gamblingMenu.setBackground(new Color(215,215,215));
        gamblingMenu.setVisible(false);

        gambling = new JLabel("Gambling");
        gambling.setBounds(500, 25, 800, 125);
        gambling.setFont(new Font("Helvetica", Font.BOLD, 75));
        gambling.setForeground(Color.darkGray);
        gamblingMenu.add(gambling);

        //gamblingTasks = new JButton("Tasks:"+(int)numOfTasks+"/5");
        gamblingTasks.setBounds(1325,250 ,350,100);
        gamblingTasks.setFont(new Font("Helvetica", Font.BOLD, 50));
        gamblingTasks.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        gamblingTasks.setBackground(Color.gray);
        gamblingMenu.add(gamblingTasks);

        infoButtonG = new JButton("i");
        infoButtonG.setBounds(875, 50 ,100,100);
        infoButtonG.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonG.setBackground(Color.gray);
        infoButtonG.setFocusable(false);
        infoButtonG.addActionListener(this);
        gamblingMenu.add(infoButtonG);

        exitToNavFGButton = new JButton("Back");
        exitToNavFGButton.setBounds(25,50,275,100);
        exitToNavFGButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitToNavFGButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitToNavFGButton.setBackground(Color.gray);
        exitToNavFGButton.setFocusable(false);
        exitToNavFGButton.addActionListener(this);
        gamblingMenu.add(exitToNavFGButton);

        //moneyDisplayedG = new JButton("8Bit$: "+ money +"");
        moneyDisplayedG.setBounds(1000,50,500,100);
        moneyDisplayedG.setFont(new Font("Helvetica", Font.BOLD, 75));
        moneyDisplayedG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedG.setBackground(Color.gray);
        moneyDisplayedG.setForeground(Color.darkGray);
        moneyDisplayedG.setFocusable(false);
        moneyDisplayedG.setEnabled(false);

        gamblingMenu.add(moneyDisplayedG);

        slotMachineIcon = new ImageIcon("slotmachine_icon.png");

        slotMachineButton = new JButton("Slots Machine");
        slotMachineButton.setIcon(slotMachineIcon);
        slotMachineButton.setHorizontalTextPosition(SwingConstants.CENTER);
        slotMachineButton.setVerticalTextPosition(SwingConstants.TOP);
        slotMachineButton.setBounds(200,200,500,500);
        slotMachineButton.setFont(new Font("Helvetica", Font.BOLD, 50));
        slotMachineButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        slotMachineButton.setBackground(Color.gray);
        slotMachineButton.setFocusable(false);
        slotMachineButton.addActionListener(this);
        gamblingMenu.add(slotMachineButton);
        
        rouletteIcon = new ImageIcon("roulette_icon.png");

        rouletteWheelButton = new JButton("Roulette");
        rouletteWheelButton.setIcon(rouletteIcon);
        rouletteWheelButton.setHorizontalTextPosition(SwingConstants.CENTER);
        rouletteWheelButton.setVerticalTextPosition(SwingConstants.TOP);
        rouletteWheelButton.setBounds(800,200,500,500);
        rouletteWheelButton.setFont(new Font("Helvetica", Font.BOLD, 60));
        rouletteWheelButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        rouletteWheelButton.setBackground(Color.gray);
        rouletteWheelButton.setFocusable(false);
        rouletteWheelButton.addActionListener(this);
        gamblingMenu.add(rouletteWheelButton);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
