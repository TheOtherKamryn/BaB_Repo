package database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Acts as abstract class for the various games
    Accessible to all User instances
*/
public class BGame {
    int year = 0;
    int bet = 0;
    double numOfTasks = 0.0;
    
    public class TicTacToe {
        //Holds info for tic-tac-toe
    }
    public class MemoryGame {
        //Holds info for memory game
    }
    public class SlotMachine {
        //Holds info for slots
    }
    public class Roulette {
        //Holds info for roulette
    }
    
    // abstract methods for winning/losing
    public void win()
    {
    
    }
    
    public void lose()
    {
    
    }
}
