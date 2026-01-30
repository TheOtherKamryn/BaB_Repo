package user_interface;

import database.BUser.*;
import database.BGame.*;

import user_interface.work.*;
import user_interface.gambling.*;
import user_interface.items.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FMainMenuPanel extends JPanel implements ActionListener{
    JPanel mainNavigationScreen;
    
    JButton infoButtonMN1;
    JPanel explainMainNav;
    JLabel infocardMN;
    JButton leaveInfocardMN;
    
    JButton yearButton;
    JButton exitButton;    
    JButton moneyDisplayedMN;    
    JButton itemShopButton;
    JButton workMenuButton;
    JButton gamblingMenuButton;
    
    ImageIcon workIcon;
    ImageIcon gamblingIcon;
    
    double width = FGameFrame.width;
    double height = FGameFrame.height;
    
    public FMainMenuPanel(){
        this.setLayout(null);
        this.setBackground(new Color(215,215,215));
        this.setBounds(0, 0, (int)width, (int)height);
        this.setVisible(false);

        infoButtonMN1 = new JButton("i");
        infoButtonMN1.setBounds(500, 50 ,100,100);
        infoButtonMN1.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonMN1.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonMN1.setBackground(Color.gray);
        infoButtonMN1.setFocusable(false);
        infoButtonMN1.addActionListener(this);
        this.add(infoButtonMN1);

        exitButton = new JButton("Back");
        exitButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitButton.setForeground(new Color(100,25,25));
        exitButton.setBorder(BorderFactory.createLineBorder(new Color(100,25,25), 10));
        exitButton.setBackground(new Color(235,100,100));
        exitButton.setFocusable(false);
        exitButton.setBounds(25,50,275,100);
        exitButton.addActionListener(this);

        this.add(exitButton);


        yearButton = new JButton();
        //yearButton.setText("Year " + (int)year + " ");
        yearButton.setBounds(625, 50, 400, 100);
        yearButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        yearButton.setFocusable(false);
        yearButton.setBackground(Color.gray);
        yearButton.addActionListener(this);
        yearButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));

        this.add(yearButton);


        moneyDisplayedMN = new JButton("8Bit$: 0");
        moneyDisplayedMN.setBounds(1100,50,400,100);
        moneyDisplayedMN.setFont(new Font("Helvetica", Font.BOLD, 60));
        moneyDisplayedMN.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedMN.setBackground(Color.gray);
        moneyDisplayedMN.setForeground(Color.darkGray);
        moneyDisplayedMN.setFocusable(false);
        moneyDisplayedMN.setEnabled(false);
        this.add(moneyDisplayedMN);

        workIcon = new ImageIcon("computer1.png");

        workMenuButton = new JButton("Work");
        workMenuButton.setForeground(new Color(25,25,100));
        workMenuButton.setIcon(workIcon);
        workMenuButton.setHorizontalTextPosition(SwingConstants.CENTER);
        workMenuButton.setVerticalTextPosition(SwingConstants.TOP);
        workMenuButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        workMenuButton.setFocusable(false);
        workMenuButton.setBounds(275,200,500,500);
        workMenuButton.setBackground(new Color(100,100,235));
        workMenuButton.addActionListener(this);
        workMenuButton.setBorder(BorderFactory.createLineBorder(new Color(25,25,100), 10));

        this.add(workMenuButton);
        
        gamblingIcon = new ImageIcon("cards1.png");

        gamblingMenuButton = new JButton("Gambling");
        gamblingMenuButton.setForeground(new Color(100,100,25));
        gamblingMenuButton.setIcon(gamblingIcon);
        gamblingMenuButton.setHorizontalTextPosition(SwingConstants.CENTER);
        gamblingMenuButton.setVerticalTextPosition(SwingConstants.TOP);
        gamblingMenuButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        gamblingMenuButton.setFocusable(false);
        gamblingMenuButton.setBounds(875,200,500,500);
        gamblingMenuButton.setBackground(new Color(235,235,100));
        gamblingMenuButton.addActionListener(this);
        gamblingMenuButton.setBorder(BorderFactory.createLineBorder(new Color(100,100,25), 10));

        this.add(gamblingMenuButton);

        itemShopButton = new JButton("Items");
        itemShopButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        itemShopButton.setFocusable(false);
        itemShopButton.setBounds(625,725,400,100);
        itemShopButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        itemShopButton.setBackground(Color.gray);
        itemShopButton.addActionListener(this);

        this.add(itemShopButton);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    
    }    
}
