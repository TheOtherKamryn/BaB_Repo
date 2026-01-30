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
public class FPiggyBankPanel extends JPanel implements ActionListener {
    boolean piggyBankisPurchased = false;
    boolean piggyBankisEquipped = piggyBankisPurchased;
    
    int piggyBankLevel = 1;
    
    JButton leavePBPrompt;
    JPanel piggyBankPurchasePrompt;
    JLabel wouldyoulikePB;
    JLabel itemDescriptionPB;
    JLabel nextUpgradePB;
    
    JButton confirmPurchasePB;
    JButton confirmEquipPB;
    JButton confirmUpgradePB;
    
    public FPiggyBankPanel( JPanel purchasePromptBackdrop){
        purchasePromptBackdrop.setLayout(null);
        purchasePromptBackdrop.setBounds(0, 0, 1600, 900);
        purchasePromptBackdrop.setBackground(Color.darkGray);
        purchasePromptBackdrop.setVisible(false);

        piggyBankPurchasePrompt = new JPanel();
        piggyBankPurchasePrompt.setLayout(null);
        piggyBankPurchasePrompt.setBounds(250,50,1150,700);
        piggyBankPurchasePrompt.setBackground(new Color(215,215,215));
        piggyBankPurchasePrompt.setVisible(false);
        purchasePromptBackdrop.add(piggyBankPurchasePrompt);

        leavePBPrompt = new JButton("X");
        leavePBPrompt.setBounds(10,10,100,100);
        leavePBPrompt.setFont(new Font("Helvetica", Font.BOLD, 75));
        leavePBPrompt.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leavePBPrompt.setBackground(Color.gray);
        leavePBPrompt.setFocusable(false);
        leavePBPrompt.addActionListener(this);
        piggyBankPurchasePrompt.add(leavePBPrompt);

        wouldyoulikePB = new JLabel("Piggy Bank (Level " + (piggyBankLevel - 1) + ")" );
        wouldyoulikePB.setBounds(150, 0, 1000, 125);
        wouldyoulikePB.setFont(new Font("Helvetica", Font.BOLD, 100));
        wouldyoulikePB.setForeground(Color.darkGray);
        piggyBankPurchasePrompt.add(wouldyoulikePB);

        itemDescriptionPB = new JLabel("<html><p style=\"width:400px\">"
                + "This little piggy increases work-related money gain"
                + "<br> " 
                + "<br> Purchase this for 50 8BitCoins" 
                + "</p></html>");

        itemDescriptionPB.setBounds(625, 100, 600, 500);
        itemDescriptionPB.setFont(new Font("Helvetica", Font.BOLD, 45));
        itemDescriptionPB.setForeground(Color.darkGray);
        piggyBankPurchasePrompt.add(itemDescriptionPB);

        nextUpgradePB = new JLabel();
        nextUpgradePB.setText("<html><p style=\"width:400px\">"
                + "Upgrade to level " +  piggyBankLevel 
                + " for 50 8Bitcoins to boost the item’s effect by 5%"
                + "</p></html>");
        nextUpgradePB.setBounds(650, 75, 600, 250);
        nextUpgradePB.setFont(new Font("Helvetica", Font.BOLD, 45));
        nextUpgradePB.setForeground(Color.darkGray);
        nextUpgradePB.setVisible(false);
        piggyBankPurchasePrompt.add(nextUpgradePB);

        JLabel piggy = new JLabel();
        piggy.setBounds(250,200,500,300);
        //piggy.setIcon(piggyBankIcon);
        piggyBankPurchasePrompt.add(piggy);

        confirmPurchasePB = new JButton("Purchase");
        confirmPurchasePB.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmPurchasePB.setFocusable(false);
        confirmPurchasePB.setBounds(140,500,400,150);
        confirmPurchasePB.setBackground(Color.gray);
        confirmPurchasePB.addActionListener(this);
        confirmPurchasePB.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        piggyBankPurchasePrompt.add(confirmPurchasePB);

        confirmEquipPB = new JButton("Equip");
        confirmEquipPB.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmEquipPB.setFocusable(false);
        confirmEquipPB.setBounds(140,500,400,150);
        confirmEquipPB.setBackground(Color.gray);
        confirmEquipPB.addActionListener(this);
        confirmEquipPB.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        piggyBankPurchasePrompt.add(confirmEquipPB);

        confirmUpgradePB = new JButton("Upgrade");
        confirmUpgradePB.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmUpgradePB.setFocusable(false);
        confirmUpgradePB.setVisible(false);
        confirmUpgradePB.setBounds(650,500,400,150);
        confirmUpgradePB.setBackground(Color.gray);
        confirmUpgradePB.addActionListener(this);
        confirmUpgradePB.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        piggyBankPurchasePrompt.add(confirmUpgradePB);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
}
