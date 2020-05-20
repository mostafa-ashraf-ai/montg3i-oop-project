/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mostafa
 */
public class manager {
    private static String url = "";
    private static String dbName = "montag3i";
    private static Connection con;
    
    private static void setURL(){
        url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
    }
    
    private static void setConnection(){
        
        try {
            setURL();
            con = DriverManager.getConnection(url, "root", "");
        }
        catch (SQLException ex) {
            //Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("url is incorrect");
        }
        
    }
    
    public static boolean checkUserAndPass(String username, String password)
    {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            String strCheck = "SELECT username,pass FROM manager WHERE username = '" + username + "' and pass = '" + password + "'";
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
    
    public static void Add(String ColumnName, String value)
    {
        try
        {
            setConnection();
            Statement stmt = con.createStatement();
            String str = "INSERT INTO manager (" + ColumnName + ") VALUES ('" + value + "')";
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the add method is wrong");
        }
    }
    
    public static void Add(int id, String username,String pass,String FirstName,String LastName,String email)
    {
        try
        {
            setConnection();
            Statement stmt = con.createStatement();
            String str = "INSERT INTO manager VALUES (" + id + ",'" + username + "','" + pass + "','" + FirstName + "','" + LastName + "','" + email + "')";
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the add all method is wrong");
        }
    }
    
    public static void Update(String ColumnName, String value, int id)
    {
        try
        {
            setConnection();
            Statement stmt = con.createStatement();
            String str = "UPDARE manager SET " + ColumnName + " = '" + value + "' WHERE ID = " + id;
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the update method is wrong");
        }
    }
    
    public static void Delete(int id)
    {
        try
        {
            setConnection();
            Statement stmt = con.createStatement();
            String str = "DELETE FROM manager WHERE ID = " + id;
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the Delete method is wrong");
        }
    }
}
