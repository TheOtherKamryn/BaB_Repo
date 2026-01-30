
import user_interface.FGameFrame;
import database.BUser;
import database.BShop;
import database.BItems;
import database.BGame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import user_interface.FLoginPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Has instances of both BUser and BGame classes
        BUser user1 = new BUser();
        BGame game1 = new BGame();
        //Has instances of both BItems and BShop class
        BItems items1 = new BItems();
        //BShop shop1 = new BShop();

        FGameFrame frame = new FGameFrame();
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
