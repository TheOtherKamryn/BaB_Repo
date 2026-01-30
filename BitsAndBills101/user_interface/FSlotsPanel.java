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
public class FSlotsPanel extends JPanel implements ActionListener{
    JPanel explainSlotMachine;
    JButton leaveInfocardSM;
    JLabel infocardSM;
    
    JPanel slotMachinePanel;
    
    JButton infoButtonS;
    
    JButton slotsTasks;
    JButton moneyDisplayedSM;
    JButton slot1;
    JButton slot2;
    JButton slot3;
    
    JLabel slotsProbabilities;
    
    JButton[] slotsBets = new JButton[3]; 
    JButton exitFSMTGM;
    
    public FSlotsPanel(){
        explainSlotMachine = new JPanel();
        explainSlotMachine.setLayout(null);
        explainSlotMachine.setBackground(new Color(215,215,215));
        explainSlotMachine.setBounds(0, 0, 1600, 900);
        explainSlotMachine.setVisible(false);

        infocardSM = new JLabel();
        infocardSM.setBounds(100, 0, 1400, 800);
        infocardSM.setFont(new Font("Helvetica", Font.BOLD, 50));
        infocardSM.setText("<html>The slot machine has 3 columns and "
                + "each column will display a symbol of different chances."
                + " There are 5 different symbols, all with different chances "
                + "of being displayed when the user clicks the button to randomize"
                + " the machine.If the three columns match, "
                + "you could win money based on your bet"
                + " amount multiplied by the rarity of the symbols."
                + " <br>"
                + "<br> Good Luck!"
                + "<html>");
        explainSlotMachine.add(infocardSM);

        leaveInfocardSM = new JButton("X");
        leaveInfocardSM.setBounds(10,10,100,100);
        leaveInfocardSM.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfocardSM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfocardSM.setBackground(Color.gray);
        leaveInfocardSM.setFocusable(false);
        leaveInfocardSM.addActionListener(this);
        explainSlotMachine.add(leaveInfocardSM);
        
        slotMachinePanel = new JPanel();
        slotMachinePanel.setLayout(null);
        slotMachinePanel.setBounds(0, 0, 1600, 900);
        slotMachinePanel.setBackground(new Color(215,215,215));
        slotMachinePanel.setVisible(false);

        infoButtonS = new JButton("i");
        infoButtonS.setBounds(1175, 10 ,100,100);
        infoButtonS.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonS.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonS.setBackground(Color.gray);
        infoButtonS.setFocusable(false);
        infoButtonS.addActionListener(this);
        slotMachinePanel.add(infoButtonS);

        //slotsTasks = new JButton("Tasks:"+(int)numOfTasks+"/5");
        slotsTasks.setBounds(800,10 ,350,100);
        slotsTasks.setFont(new Font("Helvetica", Font.BOLD, 50));
        slotsTasks.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        slotsTasks.setBackground(Color.gray);
        slotMachinePanel.add(slotsTasks);

        exitFSMTGM = new JButton("Back");
        exitFSMTGM.setBounds(25, 50 ,275,100);
        exitFSMTGM.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitFSMTGM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitFSMTGM.setBackground(Color.gray);
        exitFSMTGM.setFocusable(false);
        exitFSMTGM.addActionListener(this);
        slotMachinePanel.add(exitFSMTGM);

        JPanel uhhh = new JPanel();
        uhhh.setLayout(null);
        uhhh.setBounds(500, 100, 900, 700);
        uhhh.setBackground(Color.darkGray);
        slotMachinePanel.add(uhhh);

        JPanel slotsBox = new JPanel();
        slotsBox.setLayout(null);
        slotsBox.setBounds(25, 50, 850, 450);
        slotsBox.setBackground(Color.lightGray);
        uhhh.add(slotsBox);

        slot1 = new JButton();
        slot1.setBounds(75,100,200,225);
        slot1.setFont(new Font("Helvetica", Font.BOLD, 50));
        slot1.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        slot1.setBackground(Color.gray);
        slot1.setFocusable(false);
        slotsBox.add(slot1);

        slot2 = new JButton();
        slot2.setBounds(325,100,200,225);
        slot2.setFont(new Font("Helvetica", Font.BOLD, 50));
        slot2.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        slot2.setBackground(Color.gray);
        slot2.setFocusable(false);
        slotsBox.add(slot2);

        slot3 = new JButton();
        slot3.setBounds(575,100,200,225);
        slot3.setFont(new Font("Helvetica", Font.BOLD, 50));
        slot3.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        slot3.setBackground(Color.gray);
        slot3.setFocusable(false);
        slotsBox.add(slot3);

        JSlider slotHandle = new JSlider(0,100,100);
        slotHandle.setFont(new Font("Helvetica", Font.BOLD, 18));
        slotHandle.setBounds(300,150,200,450);
        slotHandle.setPaintTrack(true);
        slotHandle.setOrientation(SwingConstants.VERTICAL);
        slotHandle.setBackground(new Color(215,215,215));
        //slotHandle.setUI(new slotHandleUI(slotHandle));
        slotMachinePanel.add(slotHandle);

        slotsProbabilities = new JLabel("<html>"
                + "These symbols will have weighted "
                + "chances to be displayed on each column, "
                + "the most common being 60%, the next "
                + "common being 25%, then 10%, then 4%,"
                + " then the most rare being 1%. "
                + "<html>");
        slotsProbabilities.setBounds(50, 200, 225, 400);
        slotsProbabilities.setFont(new Font("Helvetica", Font.BOLD, 25));
        slotsProbabilities.setForeground(Color.darkGray);
        slotMachinePanel.add(slotsProbabilities);

        //moneyDisplayedSM = new JButton("8Bit$: "+ money + "");
        moneyDisplayedSM.setBounds(10,650,400,100);
        moneyDisplayedSM.setFont(new Font("Helvetica", Font.BOLD, 50));
        moneyDisplayedSM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedSM.setBackground(Color.gray);
        moneyDisplayedSM.setFocusable(false);
        moneyDisplayedSM.setEnabled(false);
        slotMachinePanel.add(moneyDisplayedSM);


        JLabel slotsBetText = new JLabel("Place Your Bet");
        slotsBetText.setBounds(50, 485, 800, 75);
        slotsBetText.setFont(new Font("Helvetica", Font.BOLD, 40));
        slotsBetText.setForeground(Color.lightGray);
        uhhh.add(slotsBetText);


        JPanel slotsBet = new JPanel();
        slotsBet.setLayout(new GridLayout(1, 3));
        slotsBet.setBounds(50,550,800,125);
        slotsBet.setBorder(BorderFactory.createLineBorder(Color.gray, 10));
        slotsBet.setBackground(Color.lightGray);
        slotsBet.setFont(new Font("Helvetica", Font.BOLD, 50));
        uhhh.add(slotsBet);

        for(int i = 0; i < 3; i++)
        {
            slotsBets[i] = new JButton();
            slotsBet.add(slotsBets[i]);
            slotsBets[i].setBackground(Color.lightGray);
            slotsBets[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
            slotsBets[i].setFont(new Font("Helvetica", Font.BOLD, 50));
            slotsBets[i].setFocusable(false);
            slotsBets[i].addActionListener(this);
        }
        slotsBets[0].setText("10");
        slotsBets[1].setText("25");
        slotsBets[2].setText("50");
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
