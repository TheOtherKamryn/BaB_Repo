/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.DBUserStatistics;
import java.sql.*;
/**
 *
 * @author Kamryn
 */
public class DBUserStatistics {
    public static void accessRead_Statistics(Connection conn){
        String query = "SELECT * FROM UserStatistics";
        
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
            System.err.println("Database error, could not read UserStatistics table: " + e.getMessage());
        }
    }
    
    public static void accessInsert_Statisics(Connection conn, PreparedStatement pst, int userid, int money, int years, int karma, int tasks)
    {
        try{
            // SQL Insert statement
            String sql = "INSERT INTO UserStatistics ("
                    + "ID,"
                    + " UserID,"
                    + " Money,"
                    + " Years,"
                    + " Karma,"
                    + "Tasks ) VALUES (?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);

            // Set parameter values
            pst.setInt(2, userid);
            pst.setInt(3, money);
            pst.setInt(4, years);
            pst.setInt(5, karma);
            pst.setInt(6, tasks);

            // Execute the insert
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("In-game statistics have been inserted successfully!");
            }
            pst.close();
            //conn.close();
        } catch (SQLException e) {
            System.err.println("Error inserting statistics into database" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void accessUpdate_Statistics(Connection conn, PreparedStatement pst, int userid, int money, int years, int karma, int tasks){
       try {
    
            // Define your SQL UPDATE statement
            String sql = "UPDATE UserStatistics SET UserID = ?, Money = ?, Years = ?, Karma = ?, Tasks = ? WHERE ID = ?";

            pst = conn.prepareStatement(sql);
    
            //Set the parameters for the prepared statement
            pst.setInt(2, userid);
            pst.setInt(3, money);
            pst.setInt(4, years);
            pst.setInt(5, karma);
            pst.setInt(6, tasks);

            //Execute the update
            int rowsAffected = pst.executeUpdate();

            // Handle the result
            if (rowsAffected > 0) {
                System.out.println("In-game statistics have been inserted successfully!");
                // Optionally, refresh a JTable or clear text fields
            } else {
                System.out.println("Record ID not found or no changes made in UserStatisics.");
            }

        } catch (SQLException e) {
            System.err.println("Error updating statistics into database" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void accessDelete_Statistics(Connection conn, int n)
    {
        try{
            String query = "DELETE FROM UserStatistics WHERE UserID = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, n);
            preparedStmt.execute();
            System.out.println("User statistics deleted successfully!");
            accessRead_Statistics(conn);

        }catch(SQLException e){
            System.err.println("Error deleting User's statistics from database" + e.getMessage());
            e.printStackTrace();
        }
    }
}
