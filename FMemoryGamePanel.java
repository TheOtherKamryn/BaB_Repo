package user_interface.work;

import java.util.*;
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
public class FMemoryGamePanel extends JPanel implements ActionListener {
    JPanel memoryGamePanel;
    
    JPanel explainMemoryGame;
    JLabel infoCardMG;
    JButton leaveInfoCardMG;
    
    JButton exitFMGTWMGM;
    JButton infoButtonMG;
    JButton memoryStartButton;
    
    JButton memoryTasks;
    JButton moneyDisplayedMG;
    
    JPanel square_panel = new JPanel();
    
    //JLabel numCorrect;

    JButton square1;
    JButton square2;
    JButton square3;
    JButton square4;
    
    static ArrayList<String> buttonsPressed = new ArrayList<>();
    ArrayList<String> sequence = new ArrayList<>();

    
    //Timer timer = new Timer();
    long delay = 300;
    long period = 100;
    
    Random random;
    
    public FMemoryGamePanel(){
        explainMemoryGame = new JPanel();
        explainMemoryGame.setLayout(null);
        explainMemoryGame.setBackground(new Color(215,215,215));
        explainMemoryGame.setBounds(0, 0, 1600, 900);
        explainMemoryGame.setVisible(false);

        infoCardMG = new JLabel();
        infoCardMG.setBounds(100, 0, 1400, 800);
        infoCardMG.setFont(new Font("Helvetica", Font.BOLD, 60));
        infoCardMG.setText("<html> Completing three sequences of memory game will increase"
                + " the number of tasks you have completed for the year and your money."
                + "<br> Keep in mind that working hard is rewarded <html>");
        explainMemoryGame.add(infoCardMG);

        leaveInfoCardMG = new JButton("X");
        leaveInfoCardMG.setBounds(10,10,100,100);
        leaveInfoCardMG.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfoCardMG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfoCardMG.setBackground(Color.gray);
        leaveInfoCardMG.setFocusable(false);
        leaveInfoCardMG.addActionListener(this);
        explainMemoryGame.add(leaveInfoCardMG);
        
        memoryGamePanel = new JPanel();
        memoryGamePanel.setLayout(null);
        memoryGamePanel.setBounds(0, 0, 1600, 900);
        memoryGamePanel.setBackground(new Color(215,215,215));
        memoryGamePanel.setVisible(false);

        //memoryTasks = new JButton("Tasks:"+(int)numOfTasks+"/5");
        memoryTasks.setBounds(25,500 ,350,100);
        memoryTasks.setFont(new Font("Helvetica", Font.BOLD, 50));
        memoryTasks.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        memoryTasks.setBackground(Color.gray);
        memoryGamePanel.add(memoryTasks);

        //moneyDisplayedMG = new JButton("8Bit$: "+ money +"");
        moneyDisplayedMG.setBounds(1250,50,300,100);
        moneyDisplayedMG.setFont(new Font("Helvetica", Font.BOLD, 40));
        moneyDisplayedMG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedMG.setBackground(Color.gray);
        moneyDisplayedMG.setForeground(Color.darkGray);
        moneyDisplayedMG.setFocusable(false);
        moneyDisplayedMG.setEnabled(false);
        memoryGamePanel.add(moneyDisplayedMG);

        infoButtonMG = new JButton("i");
        infoButtonMG.setBounds(1250, 250 ,100,100);
        infoButtonMG.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonMG.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonMG.setBackground(Color.gray);
        infoButtonMG.setFocusable(false);
        infoButtonMG.addActionListener(this);
        memoryGamePanel.add(infoButtonMG);

        //numCorrect = new JLabel("0/5 Correct to 1 task");
        exitFMGTWMGM = new JButton("Back");
        exitFMGTWMGM.setBounds(25, 50 ,275,100);
        exitFMGTWMGM.setFont(new Font("Helvetica", Font.BOLD, 75));
        exitFMGTWMGM.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        exitFMGTWMGM.setBackground(Color.gray);
        exitFMGTWMGM.setFocusable(false);
        exitFMGTWMGM.addActionListener(this);
        memoryGamePanel.add(exitFMGTWMGM);

        memoryStartButton = new JButton("Start");
        memoryStartButton.setBounds(1250,500,275,100);
        memoryStartButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        memoryStartButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        memoryStartButton.setBackground(Color.gray);
        memoryStartButton.setFocusable(false);
        memoryStartButton.addActionListener(this);
        memoryGamePanel.add(memoryStartButton);


        JPanel memoryGameGrid = new JPanel();
        memoryGameGrid.setBounds(400, 75, 800, 700);
        memoryGameGrid.setLayout(new BorderLayout());
        memoryGamePanel.add(memoryGameGrid);

        square_panel.setLayout(new GridLayout(2,2));
        square_panel.setBackground(new Color(150,150,150));


        square1 = new JButton();
        square1.setFont(new Font("Helvetica", Font.BOLD, 75));
        square1.setBackground(Color.blue);
        square1.setEnabled(false);
        square1.addActionListener(this);
        square_panel.add(square1);

        square2 = new JButton();
        square2.setFont(new Font("Helvetica", Font.BOLD, 75));
        square2.setBackground(Color.RED);
        square2.setEnabled(false);
        square2.addActionListener(this);
        square_panel.add(square2);

        square3 = new JButton();
        square3.setFont(new Font("Helvetica", Font.BOLD, 75));
        square3.setBackground(Color.YELLOW);
        square3.setEnabled(false);
        square3.addActionListener(this);
        square_panel.add(square3);

        square4 = new JButton();
        square4.setBackground(Color.GREEN);
        square4.setFont(new Font("Helvetica", Font.BOLD, 75));
        square4.setEnabled(false);
        square4.addActionListener(this);
        square_panel.add(square4);

        memoryGameGrid.add(square_panel);

        //int addToSequence = 1;
        //random.nextInt(1,2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
}
