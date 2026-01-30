package user_interface.items;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FHourglassPanel extends JPanel implements ActionListener {
    boolean hourglassisPurchased = false;
    boolean hourglassisEquipped = hourglassisPurchased;
    
    int hourglassLevel = 1;
    
    JButton leaveHGPrompt;
    JPanel hourglassPurchasePrompt;
    JLabel wouldyoulikeHG;
    JLabel itemDescriptionHG;
    JLabel nextUpgradeHG;
    
    JButton confirmPurchaseHG;
    JButton confirmEquipHG;
    JButton confirmUpgradeHG;
    
    public FHourglassPanel( JPanel purchasePromptBackdrop){
        hourglassPurchasePrompt = new JPanel();
        hourglassPurchasePrompt.setLayout(null);
        hourglassPurchasePrompt.setBounds(250,50,1150,700);
        hourglassPurchasePrompt.setBackground(new Color(215,215,215));
        hourglassPurchasePrompt.setVisible(false);
        purchasePromptBackdrop.add(hourglassPurchasePrompt);

        wouldyoulikeHG = new JLabel("Hourglass (Level " + (hourglassLevel - 1) + ")");
        wouldyoulikeHG.setBounds(200, 0, 1000, 125);
        wouldyoulikeHG.setFont(new Font("Helvetica", Font.BOLD, 75));
        wouldyoulikeHG.setForeground(Color.darkGray);
        hourglassPurchasePrompt.add(wouldyoulikeHG);

        itemDescriptionHG = new JLabel();
        itemDescriptionHG.setText("<html><p style=\"width:400px\">"
                + "Grants 1 extra task for the whole year."
                 + "<br>  " 
                + "<br> Purchase for 75 8BitCoins." 
                + "</p></html>");
        itemDescriptionHG.setBounds(650, 100, 600, 500);
        itemDescriptionHG.setFont(new Font("Helvetica", Font.BOLD, 45));
        itemDescriptionHG.setForeground(Color.darkGray);
        hourglassPurchasePrompt.add(itemDescriptionHG);

        nextUpgradeHG = new JLabel();
        nextUpgradeHG.setText("<html><p style=\"width:400px\">"
                + "Upgrade to level " +  hourglassLevel 
                + " for 200 8BitCoins and get 2 extra tasks for the whole year."
                + "</p></html>");
        nextUpgradeHG.setBounds(650, 100, 600, 250);
        nextUpgradeHG.setFont(new Font("Helvetica", Font.BOLD, 45));
        nextUpgradeHG.setForeground(Color.darkGray);
        nextUpgradeHG.setVisible(false);
        hourglassPurchasePrompt.add(nextUpgradeHG);

        leaveHGPrompt = new JButton("X");
        leaveHGPrompt.setBounds(10,10,100,100);
        leaveHGPrompt.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveHGPrompt.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveHGPrompt.setBackground(Color.gray);
        leaveHGPrompt.setFocusable(false);
        leaveHGPrompt.addActionListener(this);
        hourglassPurchasePrompt.add(leaveHGPrompt);

        JLabel hourglass = new JLabel();
        hourglass.setBounds(150,200,500,300);
        //hourglass.setIcon(hourglassItem);
        hourglassPurchasePrompt.add(hourglass);

        confirmPurchaseHG = new JButton("Purchase");
        confirmPurchaseHG.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmPurchaseHG.setFocusable(false);
        confirmPurchaseHG.setBounds(140,500,400,150);
        confirmPurchaseHG.setBackground(Color.gray);
        confirmPurchaseHG.addActionListener(this);
        confirmPurchaseHG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        hourglassPurchasePrompt.add(confirmPurchaseHG);

        confirmEquipHG = new JButton("Equip");
        confirmEquipHG.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmEquipHG.setFocusable(false);
        confirmEquipHG.setBounds(140,500,400,150);
        confirmEquipHG.setBackground(Color.gray);
        confirmEquipHG.addActionListener(this);
        confirmEquipHG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        hourglassPurchasePrompt.add(confirmEquipHG);

        confirmUpgradeHG = new JButton("Upgrade");
        confirmUpgradeHG.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmUpgradeHG.setFocusable(false);
        confirmUpgradeHG.setVisible(false);
        confirmUpgradeHG.setBounds(650,500,400,150);
        confirmUpgradeHG.setBackground(Color.gray);
        confirmUpgradeHG.addActionListener(this);
        confirmUpgradeHG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        hourglassPurchasePrompt.add(confirmUpgradeHG);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    
    }
}
