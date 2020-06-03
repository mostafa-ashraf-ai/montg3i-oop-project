/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.db.setConnection;
import java.sql.SQLException;

/**
 *
 * @author mostafa
 */
public class room extends db{
    public static void Update(String ColumnName, boolean value, String RoomNumber)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE room SET " + ColumnName + " = " + value + " WHERE RoomNumber = '" + RoomNumber + "'";
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Update(String ColumnName, int value, String RoomNumber)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE room SET " + ColumnName + " = " + value + " WHERE RoomNumber = '" + RoomNumber + "'";
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
}
