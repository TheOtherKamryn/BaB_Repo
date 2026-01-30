package user_interface.items;

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
public class FItemsPanel extends JPanel implements ActionListener {
    
    JPanel explainItemsMenu;
    JButton leaveInfocardIT;
    JLabel infocardIT;
    
    JPanel itemShopMenu;
    JButton exitToNavFITButton;
    JButton moneyDisplayedIT;
    JLabel itemShopTitle;
    
    JButton infoButtonIT;
    
    JButton piggyBankItemButton;
    ImageIcon piggyBankIcon;
    
    JButton secondItemButton;
    ImageIcon hourglassItem;
    
    JButton item3Button;
    ImageIcon reallyAwesomeMemoryIcon;
    
    JButton item4Button;
    ImageIcon crissCrossConsoleIcon;
    
    JButton item5Button;
    ImageIcon attendanceRecordIcon;
    
    JPanel purchasePromptBackdrop;

    
    public FItemsPanel(){
        explainItemsMenu = new JPanel();
        explainItemsMenu.setLayout(null);
        explainItemsMenu.setBackground(new Color(215,215,215));
        explainItemsMenu.setBounds(0, 0, 1600, 900);
        explainItemsMenu.setVisible(false);

        infocardIT = new JLabel();
        infocardIT.setBounds(100, 0, 1400, 800);
        infocardIT.setFont(new Font("Helvetica", Font.BOLD, 60));
        infocardIT.setText("<html>"
                + "Purchase, equip and upgrade items in this menu! Items can "
                    + "be a helpful boost when working!"
                + "<br>"
                + "<br> You cannot access "
                + "the Item Shop during the turorial, "
                + "come back next year!"
                + "<html>");
        explainItemsMenu.add(infocardIT);

        leaveInfocardIT = new JButton("X");
        leaveInfocardIT.setBounds(10,10,100,100);
        leaveInfocardIT.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardIT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardIT.setBackground(Color.gray);
        leaveInfocardIT.setFocusable(false);
        leaveInfocardIT.addActionListener(this);
        explainItemsMenu.add(leaveInfocardIT);

        this.setLayout(null);
        this.setBackground(new Color(215,215,215));
        this.setBounds(0, 0, 1600, 1800);
        this.setVisible(false);

        infoButtonIT = new JButton("i");
        infoButtonIT.setBounds(975, 50 ,100,100);
        infoButtonIT.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonIT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonIT.setBackground(Color.gray);
        infoButtonIT.setFocusable(false);
        infoButtonIT.addActionListener(this);
        this.add(infoButtonIT);

        exitToNavFITButton = new JButton("Back");
        exitToNavFITButton.setBounds(25,50,275,100);
        exitToNavFITButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitToNavFITButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitToNavFITButton.setBackground(Color.gray);
        exitToNavFITButton.setFocusable(false);
        exitToNavFITButton.addActionListener(this);
        this.add(exitToNavFITButton);

        //moneyDisplayedIT = new JButton("8Bit$: "+ money +"");
        moneyDisplayedIT.setBounds(1100,50,450,100);
        moneyDisplayedIT.setFont(new Font("Helvetica", Font.BOLD, 40));
        moneyDisplayedIT.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedIT.setBackground(Color.gray);
        moneyDisplayedIT.setForeground(Color.darkGray);

        moneyDisplayedIT.setFocusable(false);
        moneyDisplayedIT.setEnabled(false);
        this.add(moneyDisplayedIT);

        itemShopTitle = new JLabel("Item Shop");
        itemShopTitle.setBounds(425, 20, 800, 125);
        itemShopTitle.setFont(new Font("Helvetica", Font.BOLD, 100));
        this.add(itemShopTitle);

        piggyBankIcon = new ImageIcon("piggyBank.png");

        piggyBankItemButton = new JButton("Piggy Bank");
        piggyBankItemButton.setIcon(piggyBankIcon);
        piggyBankItemButton.setHorizontalTextPosition(SwingConstants.CENTER);
        piggyBankItemButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        piggyBankItemButton.setFont(new Font("Helvetica", Font.BOLD, 50));
        piggyBankItemButton.setFocusable(false);
        piggyBankItemButton.setBounds(100,175,400,300);
        piggyBankItemButton.setBackground(Color.gray);
        piggyBankItemButton.addActionListener(this);
        piggyBankItemButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));

        this.add(piggyBankItemButton);

        hourglassItem = new ImageIcon("hourglass_icon.png");

        secondItemButton = new JButton("Hourglass");
        secondItemButton.setIcon(hourglassItem);
        secondItemButton.setHorizontalTextPosition(SwingConstants.CENTER);
        secondItemButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        secondItemButton.setFont(new Font("Helvetica", Font.BOLD, 50));
        secondItemButton.setFocusable(false);
        secondItemButton.setBounds(1100,175,400,300);
        secondItemButton.setBackground(Color.gray);
        secondItemButton.addActionListener(this);
        secondItemButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        this.add(secondItemButton);

        reallyAwesomeMemoryIcon = new ImageIcon("reallyAwesomeMemoryIcon.png");

        item3Button = new JButton("Really Awesome Memory");
        item3Button.setIcon(reallyAwesomeMemoryIcon);
        item3Button.setHorizontalTextPosition(SwingConstants.CENTER);
        item3Button.setVerticalTextPosition(SwingConstants.BOTTOM);
        item3Button.setFont(new Font("Helvetica", Font.BOLD, 30));
        item3Button.setFocusable(false);
        item3Button.setBounds(250,500,400,300);
        item3Button.setBackground(Color.gray);
        item3Button.addActionListener(this);
        item3Button.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        this.add(item3Button);

        crissCrossConsoleIcon = new ImageIcon("crissCrossConsoleIcon.png");

        item4Button = new JButton("Criss-Cross Console");
        item4Button.setIcon(crissCrossConsoleIcon);
        item4Button.setHorizontalTextPosition(SwingConstants.CENTER);
        item4Button.setVerticalTextPosition(SwingConstants.BOTTOM);
        item4Button.setFont(new Font("Helvetica", Font.BOLD, 30));
        item4Button.setFocusable(false);
        item4Button.setBounds(800,500,400,300);
        item4Button.setBackground(Color.gray);
        item4Button.addActionListener(this);
        item4Button.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        this.add(item4Button);

        attendanceRecordIcon = new ImageIcon("attendanceRecord.png");

        item5Button = new JButton("Attendance Record");
        item5Button.setIcon(attendanceRecordIcon);
        item5Button.setHorizontalTextPosition(SwingConstants.CENTER);
        item5Button.setVerticalTextPosition(SwingConstants.BOTTOM);
        item5Button.setFont(new Font("Helvetica", Font.BOLD, 25));
        item5Button.setFocusable(false);
        item5Button.setBounds(600,175,400,300);
        item5Button.setBackground(Color.gray);
        item5Button.addActionListener(this);
        item5Button.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        this.add(item5Button);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
    
    }
}
