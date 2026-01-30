package user_interface.items;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FCCCPanel extends JPanel implements ActionListener {
    boolean crissCrossConsoleisPurchased = false;
    boolean crissCrossConsoleisEquipped = crissCrossConsoleisPurchased;

    int crissCrossConsoleLevel = 1;

    JButton leaveCCCPrompt;
    JPanel cccPurchasePrompt;
    JLabel wouldyoulikeCCC;
    JLabel itemDescriptionCCC;
    JLabel nextUpgradeCCC;

    JButton confirmPurchaseCCC;
    JButton confirmEquipCCC;
    JButton confirmUpgradeCCC;
    
    public FCCCPanel(JPanel purchasePromptBackdrop ){
        cccPurchasePrompt = new JPanel();
        cccPurchasePrompt.setLayout(null);
        cccPurchasePrompt.setBounds(250,50,1150,700);
        cccPurchasePrompt.setBackground(new Color(215,215,215));
        cccPurchasePrompt.setVisible(false);
        purchasePromptBackdrop.add(cccPurchasePrompt);

        wouldyoulikeCCC = new JLabel("Criss-Cross Console (Level "+(crissCrossConsoleLevel - 1)+")");
        wouldyoulikeCCC.setBounds(200, 0, 1000, 125);
        wouldyoulikeCCC.setFont(new Font("Helvetica", Font.BOLD, 50));
        wouldyoulikeCCC.setForeground(Color.darkGray);
        cccPurchasePrompt.add(wouldyoulikeCCC);

        leaveCCCPrompt = new JButton("X");
        leaveCCCPrompt.setBounds(10,10,100,100);
        leaveCCCPrompt.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveCCCPrompt.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveCCCPrompt.setBackground(Color.gray);
        leaveCCCPrompt.setFocusable(false);
        leaveCCCPrompt.addActionListener(this);
        cccPurchasePrompt.add(leaveCCCPrompt);

        JLabel console = new JLabel();
        console.setBounds(200,150,500,300);
        //console.setIcon(crissCrossConsoleIcon);
        cccPurchasePrompt.add(console);

        itemDescriptionCCC = new JLabel("<html><p style=\"width:400px\"> Winning via diagonals during a tic-tac-toe game"
                + " will give you an extra 25% 8BitCoins from regular winnings."
                + "<br> "
                + "<br> Purchase for 50 8BitCoins. </p></html>");

        itemDescriptionCCC.setBounds(650, 100, 600, 500);
        itemDescriptionCCC.setFont(new Font("Helvetica", Font.BOLD, 45));
        itemDescriptionCCC.setForeground(Color.darkGray);
        cccPurchasePrompt.add(itemDescriptionCCC);

        nextUpgradeCCC = new JLabel();
        nextUpgradeCCC.setText("<html><p style=\"width:400px\"> Upgrade to level 1 for 100 8BitCoins,"
                + " to get 50% extra earnings.</p></html>");
        nextUpgradeCCC.setBounds(650, 100, 600, 250);
        nextUpgradeCCC.setFont(new Font("Helvetica", Font.BOLD, 45));
        nextUpgradeCCC.setForeground(Color.darkGray);
        nextUpgradeCCC.setVisible(false);
        cccPurchasePrompt.add(nextUpgradeCCC);

        confirmPurchaseCCC = new JButton("Purchase");
        confirmPurchaseCCC.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmPurchaseCCC.setFocusable(false);
        confirmPurchaseCCC.setBounds(140,500,400,150);
        confirmPurchaseCCC.setBackground(Color.gray);
        confirmPurchaseCCC.addActionListener(this);
        confirmPurchaseCCC.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        cccPurchasePrompt.add(confirmPurchaseCCC);

        confirmEquipCCC = new JButton("Equip");
        confirmEquipCCC.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmEquipCCC.setFocusable(false);
        confirmEquipCCC.setBounds(140,500,400,150);
        confirmEquipCCC.setBackground(Color.gray);
        confirmEquipCCC.addActionListener(this);
        confirmEquipCCC.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        cccPurchasePrompt.add(confirmEquipCCC);

        confirmUpgradeCCC = new JButton("Upgrade");
        confirmUpgradeCCC.setFont(new Font("Helvetica", Font.BOLD, 75));
        confirmUpgradeCCC.setFocusable(false);
        confirmUpgradeCCC.setVisible(false);
        confirmUpgradeCCC.setBounds(650,500,400,150);
        confirmUpgradeCCC.setBackground(Color.gray);
        confirmUpgradeCCC.addActionListener(this);
        confirmUpgradeCCC.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        cccPurchasePrompt.add(confirmUpgradeCCC);        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    
    }
}
