package user_interface.items;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class FAttendanceRecordPanel extends JPanel implements ActionListener{
    boolean attendanceRecordisPurchased = false;
    boolean attendanceRecordisEquipped = attendanceRecordisPurchased;
    
    int attendanceRecordLevel = 1;
    
    JButton leaveARPrompt;
    JPanel arPurchasePrompt;
    JLabel wouldyoulikeAR;
    JLabel itemDescriptionAR;
    JLabel nextUpgradeAR;
    
    JButton confirmPurchaseAR;
    JButton confirmEquipAR;
    JButton confirmUpgradeAR;
    
    public FAttendanceRecordPanel( JPanel purchasePromptBackdrop){
        arPurchasePrompt = new JPanel();
        arPurchasePrompt.setLayout(null);
        arPurchasePrompt.setBounds(250,50,1150,700);
        arPurchasePrompt.setBackground(new Color(215,215,215));
        arPurchasePrompt.setVisible(false);
        purchasePromptBackdrop.add(arPurchasePrompt);

        leaveARPrompt = new JButton("X");
        leaveARPrompt.setBounds(10,10,100,100);
        leaveARPrompt.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveARPrompt.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveARPrompt.setBackground(Color.gray);
        leaveARPrompt.setFocusable(false);
        leaveARPrompt.addActionListener(this);
        arPurchasePrompt.add(leaveARPrompt);

        wouldyoulikeAR = new JLabel("Attendance Record (Level " + (attendanceRecordLevel-1) + ")");
        wouldyoulikeAR.setBounds(200, 0, 1000, 125);
        wouldyoulikeAR.setFont(new Font("Helvetica", Font.BOLD, 50));
        wouldyoulikeAR.setForeground(Color.darkGray);
        arPurchasePrompt.add(wouldyoulikeAR);

        JLabel record = new JLabel();
        record.setBounds(200,200,500,300);
        //record.setIcon(attendanceRecordIcon);
        arPurchasePrompt.add(record);

        itemDescriptionAR = new JLabel("<html><p style=\"width:400px\"> "
                + " Using 3 tasks consecutively for work grants the user"
                + " with a flat 175 8BitCoins."
                + "<br>"
                + "<br> Purchase for 200 8Bitcoins</p></html>");

        itemDescriptionAR.setBounds(650, 100, 600, 500);
        itemDescriptionAR.setFont(new Font("Helvetica", Font.BOLD, 45));
        itemDescriptionAR.setForeground(Color.darkGray);
        arPurchasePrompt.add(itemDescriptionAR);

        nextUpgradeAR = new JLabel();
        nextUpgradeAR.setText("<html><p style=\"width:400px\">"
                + "  Upgrade to level 1 for 400 8BitCoins "
                + "and get 350 8BitCoins for 3 consecutive tasks used on work. </p></html>");
        nextUpgradeAR.setBounds(650, 100, 600, 250);
        nextUpgradeAR.setFont(new Font("Helvetica", Font.BOLD, 35));
        nextUpgradeAR.setForeground(Color.darkGray);
        nextUpgradeAR.setVisible(false);
        arPurchasePrompt.add(nextUpgradeAR);

        confirmPurchaseAR = new JButton("Purchase");
        confirmPurchaseAR.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmPurchaseAR.setFocusable(false);
        confirmPurchaseAR.setBounds(100,500,400,150);
        confirmPurchaseAR.setBackground(Color.gray);
        confirmPurchaseAR.addActionListener(this);
        confirmPurchaseAR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        arPurchasePrompt.add(confirmPurchaseAR);

        confirmEquipAR = new JButton("Equip");
        confirmEquipAR.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmEquipAR.setFocusable(false);
        confirmEquipAR.setBounds(140,500,400,150);
        confirmEquipAR.setBackground(Color.gray);
        confirmEquipAR.addActionListener(this);
        confirmEquipAR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        arPurchasePrompt.add(confirmEquipAR);

        confirmUpgradeAR = new JButton("Upgrade");
        confirmUpgradeAR.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmUpgradeAR.setFocusable(false);
        confirmUpgradeAR.setVisible(false);
        confirmUpgradeAR.setBounds(650,500,400,150);
        confirmUpgradeAR.setBackground(Color.gray);
        confirmUpgradeAR.addActionListener(this);
        confirmUpgradeAR.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        arPurchasePrompt.add(confirmUpgradeAR);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    
    }
}
