/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mostafa
 */
public class staff extends db{
    
    public static boolean checkUserAndPass(String table,String username, String password)
    {
        try {
            setConnection();
            stmt = con.createStatement();
            String strCheck = "SELECT username,pass FROM " + table + " WHERE username = '" + username + "' and pass = '" + password + "'";
            stmt.executeQuery(strCheck);
            while(stmt.getResultSet().next())
            {
                con.close();
                return true;
            }
            con.close();
        } 
        catch (SQLException ex) {
            //Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("the check method is wrong");
        }
        return false;
        
    }
    
    public static ResultSet Select(String table,int id)
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM " + table + "WHERE ID = " + id;
            rs = stmt.executeQuery(str);
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
    public static void Add(String table,int id, String username,String pass,String FirstName,String LastName,double salary,String email,String value)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO " + table + " VALUES (" + id + ",'" + username + "','" + pass + "','" + FirstName + "','" + LastName + "'," + salary + ",'" + email + "','" + value + "')";
            stmt.executeUpdate(str);
            con.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Update(String table,String ColumnName, String value, int id)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE " + table + " SET " + ColumnName + " = '" + value + "' WHERE ID = " + id;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Update(String table,String ColumnName, double value, int id)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDATE " + table + " SET " + ColumnName + " = " + value + " WHERE ID = " + id;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Delete(String table,int id)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "DELETE FROM " + table + " WHERE ID = " + id;
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the Delete method is wrong");
        }
    }
    
}
