/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.DBUserItems;
import java.sql.*;
/**
 *
 * @author Kamryn
 */
public class DBUserItems {
    public static void accessRead_Items(Connection conn){
        String query = "SELECT * FROM UserItems";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            int columnCount = rs.getMetaData().getColumnCount();
            
            while (rs.next())
            {
                for (int i = 1; i <= columnCount; i++)
                {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch(SQLException e){
            System.err.println("Database error, could not read UserItems table: " + e.getMessage());
        }
    }
    
    public static void accessInsert_Items(Connection conn, PreparedStatement pst,int userid, String item, int itemValue )
    {
        try{
            int itemChosen = 0;
            switch(item){
                case "PiggyBank":
                    itemChosen = 3;
                case "ReallyAwesomeMemory":
                    itemChosen = 4;
                case "CrissCrossConsole":
                    itemChosen = 5;
                case "Hourglass":
                    itemChosen = 6;
                case "AttendanceRecord":
                    itemChosen = 7;
            }
            // SQL Insert statement
            String sql = "INSERT INTO UserItems ("
                    + "ID,"
                    + " UserID,"
                    + " PiggyBank,"
                    + " ReallyAwesomeMemory,"
                    + " CrissCrossConsole,"
                    + " Hourglass,"
                    + "AttendanceRecord ) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);

            // Set parameter values
            pst.setInt(2,userid );
            if(itemChosen > 0)
            {  
              pst.setInt(itemChosen,itemValue);   
            }
            // Execute the insert
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("An item has been purchased or upgrade successfully!");
            }
            
            pst.close();
            //conn.close();
        }catch (SQLException e) {
            System.err.println("Error inserting items into database" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void accessUpdate_Items(Connection conn, PreparedStatement pst, int id, int userid, String item, int itemValue){
        try {
            int itemChosen = 0;
            switch(item){
                case "PiggyBank":
                    itemChosen = 3;
                case "ReallyAwesomeMemory":
                    itemChosen = 4;
                case "CrissCrossConsole":
                    itemChosen = 5;
                case "Hourglass":
                    itemChosen = 6;
                case "AttendanceRecord":
                    itemChosen = 7;
            }
            // Define your SQL UPDATE statement
            String sql = "UPDATE UserAccounts SET "
                    + "UserID = ?,"
                    + "PiggyBank = ?,"
                    + "ReallyAwesomeMemory = ?, "
                    + "CrissCrossConsole = ?, "
                    + " Hourglass = ?,"
                    + "AttendanceRecord = ?"
                    + " WHERE ID = ?";


            pst = conn.prepareStatement(sql);
    
            //Set the parameters for the prepared statement
            pst.setInt(1,id);
            pst.setInt(2,userid );
            if(itemChosen > 0)
            {  
              pst.setInt(itemChosen,itemValue);   
            }

            //Execute the update
            int rowsAffected = pst.executeUpdate();

            // Handle the result
            if (rowsAffected > 0) {
                System.out.println("An item has been purchased or upgrade successfully!");
                // Optionally, refresh a JTable or clear text fields
            } else {
                System.out.println("Record ID not found or no changes made.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }
    
    public static void accessDelete_Items(Connection conn, int n)
    {
        try{
            String query = "DELETE FROM UserItems WHERE USERID = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, n); 
            preparedStmt.execute();
            System.out.println("Users' item information deleted successfully from database!");
            accessRead_Items(conn);

        }catch(SQLException e){
            System.err.println("Error deleting user's item information from database" + e.getMessage());
            e.printStackTrace();
        }
    }
}
