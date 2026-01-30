package user_interface.items;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FRAMPanel extends JPanel implements ActionListener {
    boolean reallyAwesomeMemoryisPurchased = false;
    boolean reallyAwesomeMemoryisEquipped = reallyAwesomeMemoryisPurchased;
    
    int reallyAwesomeMemoryLevel = 1;
    
    JButton leaveRAMPrompt;
    JPanel ramPurchasePrompt;
    JLabel wouldyoulikeRAM;
    JLabel itemDescriptionRAM;
    JLabel nextUpgradeRAM;
    
    JButton confirmPurchaseRAM;
    JButton confirmEquipRAM;
    JButton confirmUpgradeRAM;
    
    public FRAMPanel( JPanel purchasePromptBackdrop){
        ramPurchasePrompt = new JPanel();
        ramPurchasePrompt.setLayout(null);
        ramPurchasePrompt.setBounds(250,50,1150,700);
        ramPurchasePrompt.setBackground(new Color(215,215,215));
        ramPurchasePrompt.setVisible(false);
        purchasePromptBackdrop.add(ramPurchasePrompt);

        leaveRAMPrompt = new JButton("X");
        leaveRAMPrompt.setBounds(10,10,100,100);
        leaveRAMPrompt.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveRAMPrompt.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveRAMPrompt.setBackground(Color.gray);
        leaveRAMPrompt.setFocusable(false);
        leaveRAMPrompt.addActionListener(this);
        ramPurchasePrompt.add(leaveRAMPrompt);

        wouldyoulikeRAM = new JLabel("Really Awesome Memory "
                + "(Level " + (reallyAwesomeMemoryLevel - 1) + ")");
        wouldyoulikeRAM.setBounds(200, 0, 1000, 125);
        wouldyoulikeRAM.setFont(new Font("Helvetica", Font.BOLD, 50));
        wouldyoulikeRAM.setForeground(Color.darkGray);
        ramPurchasePrompt.add(wouldyoulikeRAM);

        JLabel ram = new JLabel();
        ram.setBounds(140,200,500,300);
        //ram.setIcon(reallyAwesomeMemoryIcon);
        ramPurchasePrompt.add(ram);

        itemDescriptionRAM = new JLabel("<html><p style=\"width:400px\"> "
                + "Each Correct input in the Memory game rewards you with a flat rate of 1 8BitCoins. "
                + "<br> "
                + "<br> Purchase for 50 8BitCoins. </p></html>");

        itemDescriptionRAM.setBounds(650, 100, 600, 500);
        itemDescriptionRAM.setFont(new Font("Helvetica", Font.BOLD, 45));
        itemDescriptionRAM.setForeground(Color.darkGray);
        ramPurchasePrompt.add(itemDescriptionRAM);

        nextUpgradeRAM = new JLabel();
        nextUpgradeRAM.setText("<html><p style=\"width:400px\"> Upgrade to level " + (reallyAwesomeMemoryLevel)
                + " for 150 8BitCoins and a flat rate of 3 8BitCoins"
                + " for each correct input.</p></html>");
        nextUpgradeRAM.setBounds(650, 100, 600, 250);
        nextUpgradeRAM.setFont(new Font("Helvetica", Font.BOLD, 45));
        nextUpgradeRAM.setForeground(Color.darkGray);
        nextUpgradeRAM.setVisible(false);
        ramPurchasePrompt.add(nextUpgradeRAM);

        confirmPurchaseRAM = new JButton("Purchase");
        confirmPurchaseRAM.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmPurchaseRAM.setFocusable(false);
        confirmPurchaseRAM.setBounds(140,500,400,150);
        confirmPurchaseRAM.setBackground(Color.gray);
        confirmPurchaseRAM.addActionListener(this);
        confirmPurchaseRAM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        ramPurchasePrompt.add(confirmPurchaseRAM);

        confirmEquipRAM = new JButton("Equip");
        confirmEquipRAM.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmEquipRAM.setFocusable(false);
        confirmEquipRAM.setBounds(140,500,400,150);
        confirmEquipRAM.setBackground(Color.gray);
        confirmEquipRAM.addActionListener(this);
        confirmEquipRAM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        ramPurchasePrompt.add(confirmEquipRAM);

        confirmUpgradeRAM = new JButton("Upgrade");
        confirmUpgradeRAM.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmUpgradeRAM.setFocusable(false);
        confirmUpgradeRAM.setVisible(false);
        confirmUpgradeRAM.setBounds(650,500,400,150);
        confirmUpgradeRAM.setBackground(Color.gray);
        confirmUpgradeRAM.addActionListener(this);
        confirmUpgradeRAM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        ramPurchasePrompt.add(confirmUpgradeRAM);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    
    }
}
