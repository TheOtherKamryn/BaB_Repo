package user_interface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import user_interface.*;
import database.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;

import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Rectangle2D;
//import javax.swing.plaf.basic.BasicSliderUI;

//import java.util.Random;
//import java.util.Timer;

public class FGameFrame extends JFrame{
    CardLayout cl = new CardLayout();
    FLoginPanel login = new FLoginPanel();        
    FCutscenesPanel cutscenes = new FCutscenesPanel();
    //FWorkPanel workPanel = new FWorkPanel();
    //FTTTPanel tictactoePanel = new FTTTPanel();
    //FMemoryGamePanel memoryGamePanel = new FMemoryGamePanel();
    FYearPanel yearPanel = new FYearPanel();
    //FGamblingPanel gamblingPanel = new FGamblingPanel();
    //FSlotsPanel slotsPanel = new FSlotsPanel();
    //FRoulettePanel roulettePanel = new FRoulettePanel();
    //FItemsPanel itemsPanel = new FItemsPanel();
    //FPiggyBankPanel piggyBankPanel = new FPiggyBankPanel();
    //FCCCPanel cccPanel = new FCCCPanel();
    //FRAMPanel ramPanel = new FRAMPanel();
    //FHourglassPanel hourglassPanel = new FHourglassPanel();
    //FAttendanceRecordPanel attendanceRecordPanel = new FAttendanceRecordPanel(); 
    
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static double width = screenSize.getWidth();
    static double height = screenSize.getHeight();
        
    public FGameFrame()
    {
        
        
        SwingUtilities.invokeLater(() -> {
            this.setTitle("Bits and Bills");
            this.setLayout(cl);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize((int)width, (int)height);
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setLocationRelativeTo(null);
            this.setResizable(true);
            
            this.add(login, "LOGIN");
            this.add(login.playScreenPanel);
            this.add(login.playScreenPanel.mainMenuPanel);
            //this.add(cutscenes);
            //this.add(yearPanel);
            cl.show(login, "LOGIN");
        });
  
    }
    
    /*public class CardLayoutPanel {
        final static String BUTTONPANEL = "Card with JButtons";
        private CardLayout cardLayout = new CardLayout();
        private JPanel cardContainer;
        public CardLayoutPanel()
        {
            cardContainer = new JPanel();
            cardContainer.setLayout(cardLayout);
            
            // initialize, give name, add to cardlayout , then show the components
            
            cardContainer.add(login, "LOGIN");
            cardLayout.show(cardContainer, "LOGIN");
            
            cardContainer.setVisible(true);
            
            /*
            
            cardContainer.add(playScreenPanel,"play screen");
            cardContainer.add(cutscenes,"cutscenes");
            cardContainer.add(workPanel,"work");
            cardContainer.add(tictactoePanel,"tic tac toe");
            cardContainer.add(memoryGamePanel,"memory game");
            cardContainer.add(mainMenuPanel,"main menu");
            cardContainer.add(yearPanel,"year");
            cardContainer.add(gamblingPanel,"gambling");
            cardContainer.add(slotsPanel,"slots");
            cardContainer.add(roulettePanel,"roulette");
            cardContainer.add(itemsPanel,"items");
            cardContainer.add(piggyBankPanel,"piggy bank");
            cardContainer.add(cccPanel,"criss cross console");
            cardContainer.add(ramPanel,"really awesome memory");
            cardContainer.add(hourglassPanel,"hourglass");
            cardContainer.add(attendanceRecordPanel,"attendance record");
            
            
        } 
    }
*/

    
    /** method "setUpComponent": Created by Blake & Quan
     * Sets position, size, font, and color for component, then adds it to chosen panel
     * @param c: the component to be set up; can take any type of Component
     * @param weightPosx: the weight of the component's x-position; the larger the number, the further left
     * @param weightPosy: the weight of the component's y-position; the larger the number, the further up
     * @param weightWidth: the weight of the component's width; the larger the number, the smaller the width
     * @param weightHeight: the weight of the component's height; the larger the number, the smaller the height
     * @param fontWeight: the weight of the component's font size; the larger the number, the smaller the font
     * @param color: the color of the component's foreground
     * @param panel: the panel that the component will be added to
    */
    public static void setUpComponent(Component c, double weightPosx, double weightPosy, double weightWidth, double weightHeight, double fontWeight, Color color, JPanel panel)
    {
        c.setBounds((int)(width/weightPosx), (int)(height/weightPosy), (int)(width/weightWidth), (int)(height/weightHeight));
        c.setFont(new Font("Helvetica", Font.BOLD, (int)(width/fontWeight)));
        c.setForeground(color);
        panel.add(c);
    }
}
