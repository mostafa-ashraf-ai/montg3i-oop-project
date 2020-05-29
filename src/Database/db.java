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

/**
 *
 * @author mostafa
 */
abstract class db {
    private static String url = "";
    private static String dbName = "montag3i";
    static Connection con;
    static Statement stmt;
    
    static void setURL(){
        url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
    }
    
    static void setConnection(){
        
        try {
            setURL();
            con = DriverManager.getConnection(url, "root", "");
        }
        catch (SQLException ex) {
            //Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("url is incorrect");
        }
        
    }
    
    public static void Add(String table,String ColumnName, String value)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO " + table + " (" + ColumnName + ") VALUES ('" + value + "')";
            stmt.executeUpdate(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the add method is wrong");
        }
    }
    
    public static void Add(String table,String ColumnName, int value)
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
    
    public static void Add(String table,String ColumnName, double value)
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
    
    public static ResultSet Select(String table)
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM " + table;
            rs = stmt.executeQuery(str);
            return rs;
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
    public static ResultSet Select(String table,String ColumnName, String value)
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT * FROM " + table + "WHERE " + ColumnName + "=" + "'" + value +"'";
            rs = stmt.executeQuery(str);
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
}
