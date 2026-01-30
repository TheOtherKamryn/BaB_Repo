package user_interface.work;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FWorkPanel extends JPanel implements ActionListener {
    
    JPanel workMenu;
    JLabel work;
    JButton infoButtonWork;
     JPanel explainWork;
    JLabel infoCardW;
    JButton leaveInfoCardW;
    JButton workTasks;
    
    JButton ticTacToeButton;
    ;
    
    JButton memoryGameButton;
    
    JButton exitToNavFWButton;
    JButton moneyDisplayedW;
    ImageIcon ticTacToeIcon;
    ImageIcon memoryGameIcon;
    
    public FWorkPanel(){
        this.setLayout(null);
        this.setBounds(0, 0, 1600, 900);
        this.setBackground(new Color(215,215,215));
        this.setVisible(false);

        work = new JLabel("Work");
        work.setBounds(525, 20, 800, 125);
        work.setFont(new Font("Helvetica", Font.BOLD, 100));
        work.setForeground(Color.darkGray);
        this.add(work);

        infoButtonWork = new JButton("i");
        infoButtonWork.setBounds(850, 50 ,100,100);
        infoButtonWork.setFont(new Font("Helvetica", Font.BOLD, 75));
        infoButtonWork.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        infoButtonWork.setBackground(Color.gray);
        infoButtonWork.setFocusable(false);
        infoButtonWork.addActionListener(this);
        this.add(infoButtonWork);

        explainWork.setLayout(null);
        explainWork.setBackground(new Color(215,215,215));
        explainWork.setBounds(0, 0, 1600, 900);
        explainWork.setVisible(false);

        infoCardW = new JLabel();
        infoCardW.setBounds(100, 0, 1400, 800);
        infoCardW.setFont(new Font("Helvetica", Font.BOLD, 60));
        infoCardW.setText("<html> Working is crucial to depositing enough money at the end of the year, you can make money from winning games of tic-tac-toe or memory game."
                + "<br> This also will effect your karma, spending your yearly amount of tasks doing work"
                + "<br> will have POSITIVE consequences.<html>");
        explainWork.add(infoCardW);

        leaveInfoCardW = new JButton("X");
        leaveInfoCardW.setBounds(10,10,100,100);
        leaveInfoCardW.setFont(new Font("Helvetica", Font.BOLD, 75));
        leaveInfoCardW.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        leaveInfoCardW.setBackground(Color.gray);
        leaveInfoCardW.setFocusable(false);
        leaveInfoCardW.addActionListener(this);
        explainWork.add(leaveInfoCardW);
        
        //workTasks = new JButton("Tasks:"+(int)numOfTasks+"/5");
        workTasks.setBounds(1350, 250 ,275,100);
        workTasks.setFont(new Font("Helvetica", Font.BOLD, 50));
        workTasks.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        workTasks.setBackground(Color.gray);
        this.add(workTasks);

        //moneyDisplayedW = new JButton("8Bit$: "+ money +"");
        moneyDisplayedW.setBounds(1000,50,500,100);
        moneyDisplayedW.setFont(new Font("Helvetica", Font.BOLD, 75));
        moneyDisplayedW.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        moneyDisplayedW.setBackground(Color.gray);
        moneyDisplayedW.setForeground(Color.darkGray);
        moneyDisplayedW.setFocusable(false);
        moneyDisplayedW.setEnabled(false);
        this.add(moneyDisplayedW);

        ticTacToeIcon = new ImageIcon("tictactoe_icon.png");

        ticTacToeButton = new JButton("Tic-Tac-Toe");
        ticTacToeButton.setIcon(ticTacToeIcon);
        ticTacToeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        ticTacToeButton.setVerticalTextPosition(SwingConstants.TOP);
        ticTacToeButton.setBounds(200,200,500,500);
        ticTacToeButton.setFont(new Font("Helvetica", Font.BOLD, 75));
        ticTacToeButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        ticTacToeButton.setBackground(Color.gray);
        ticTacToeButton.setFocusable(false);
        ticTacToeButton.addActionListener(this);

        this.add(ticTacToeButton);

        memoryGameIcon = new ImageIcon("memorygame_icon.png");

        memoryGameButton = new JButton("Memory Game");
        memoryGameButton.setIcon(memoryGameIcon);
        memoryGameButton.setHorizontalTextPosition(SwingConstants.CENTER);
        memoryGameButton.setVerticalTextPosition(SwingConstants.TOP);
        memoryGameButton.setBounds(800,200,500,500);
        memoryGameButton.setFont(new Font("Helvetica", Font.BOLD, 60));
        memoryGameButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 10));
        memoryGameButton.setBackground(Color.gray);
        memoryGameButton.setFocusable(false);
        memoryGameButton.addActionListener(this);

        this.add(memoryGameButton);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
}
