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
public class db {
    private static String url = "";
    private static String dbName = "company";
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
            String strCheck = "SELECT * FROM users WHERE username = '" + username + "' and pass = '" + password + "'";
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
            System.out.println("the method is wrong");
        }
        return false;
        
    }
}
