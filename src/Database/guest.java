/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.db.setConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mostafa
 */
public class guest extends db {
    /*
    public static ResultSet Select(String PassCode)
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM guest WHERE PassCode = '" + PassCode + "'";
            rs = stmt.executeQuery(str);
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    */
    public static void Add(String table,String ColumnName, Date value)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO " + table + " (" + ColumnName + ") VALUES (" + value + ")";
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the add method is wrong");
        }
    }
    
    public static void Add(int GuestNo, String FirstName, String SecondName, String LastName, String NationalID, int age, String phone, String national, int NumbersOfRooms, String arrival, int nights, String departure, double deposit, double TotalAmount, String status)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO guest VALUES (" + GuestNo + ",'" + FirstName + "','" + SecondName + "','" + LastName + "','" + NationalID + "'," + age + ",'" + phone + "','" + national + "'," + NumbersOfRooms + ",'" + arrival + "'," + nights + ",'" + departure + "'," + deposit + "," + TotalAmount + ",'" + status + "')";
            stmt.executeUpdate(str);
            con.close();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(guest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void Update(String ColumnName, String value, int guestno)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE guest SET " + ColumnName + " = '" + value + "' WHERE GuestNo = " + guestno;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Update(String ColumnName, int value, int PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE guest SET " + ColumnName + " = " + value + " WHERE PassCode = " + PassCode;
            stmt.executeLargeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Update(String ColumnName, double value, int PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE guest SET " + ColumnName + " = " + value + " WHERE PassCode = " + PassCode;
            stmt.executeLargeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Update(String ColumnName, Date value, int PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE guest SET " + ColumnName + " = " + value + " WHERE PassCode = " + PassCode;
            stmt.executeLargeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Delete(int PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "DELETE FROM guest WHERE PassCode = " + PassCode;
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the Delete method is wrong");
        }
    }
    
}
