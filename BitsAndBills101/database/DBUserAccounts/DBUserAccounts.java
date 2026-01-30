/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.DBUserAccounts;
import database.DBUserItems.DBUserItems;
import java.sql.*;
/**
 *
 * @author Kamryn 
 */
public class DBUserAccounts {
    public static void accessRead_Accounts(Connection conn){
        String query = "SELECT * FROM UserAccounts";
        
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
            System.err.println("Database error, could not read UserAccount table: " + e.getMessage());
        }
    } 
    
    public static String getUsername(Connection conn)
    {
        String query = "SELECT Username FROM UserAccounts WHERE ID = ?";
        String username;
        try{
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            username = rs.getString(query);
            
            return username;
        }
        catch(SQLException e){
            return "Unable to retrieve username";
        } 
    }
    
    public static String getPassword(Connection conn)
    {
        String query = "SELECT Password FROM UserAccounts";
        String password;
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            password = rs.getString(query);
            
            return password;
        }
        catch(SQLException e){
            return "Unable to retrieve password";
        } 
    }

    public static void accessInsert_Accounts(Connection conn, PreparedStatement pst,int id, String user, String pass)
    {
        try{
         // SQL Insert statement
            String sql = "INSERT INTO UserAccounts (ID, Username, Password ) VALUES (?, ?, ?)";
            pst = conn.prepareStatement(sql);

            // Set parameter values
            pst.setInt(1, id);
            pst.setString(2, user);
            pst.setString(3, pass);
            //LocalDateTime currentDateTime = LocalDateTime.now();
            //pst.setString(4, ""+currentDateTime+"");
            //pst.setString(5, ""+currentDateTime+"");

            // Execute the insert
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            
        }catch (SQLException e) {
            System.err.println("Error inserting accounts into database" + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
    public static void accessUpdate_Accounts(Connection conn, PreparedStatement pst, String newUsername, String newPass){
        try {
    
            // Define your SQL UPDATE statement
            String sql ="UPDATE UserAccounts SET Username = ?, Password = ? WHERE ID = ?"; 
            
            pst = conn.prepareStatement(sql);
    
            //Set the parameters for the prepared statement
            pst.setString(1, newUsername);
            pst.setString(2, newPass);

            //Execute the update
            int rowsAffected = pst.executeUpdate();

            // Handle the result
            if (rowsAffected > 0) {
                System.out.println("Database record updated successfully!");
                // Optionally, refresh a JTable or clear text fields
            } else {
                System.out.println("Record ID not found or no changes made.");
            }

        } catch (SQLException e) {
            System.err.println("Error updating accounts in database" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // this method should be used to delete duplicates and empty rows.
    public static void accessDelete_Accounts(Connection conn)
    {
        try{
            String query = "DELETE FROM UserAccounts WHERE Username = ? AND Password = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, "");
            preparedStmt.setString(2, ""); 
            preparedStmt.execute();
            System.out.println("Users deleted successfully!");
            accessRead_Accounts(conn);

        }catch(SQLException e){
            System.err.println("Error deleting accounts in database" + e.getMessage());
            e.printStackTrace();
        }
    }
}
