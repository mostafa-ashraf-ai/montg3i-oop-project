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

/**
 *
 * @author mostafa
 */
public class guest extends db {
    
    public static ResultSet Select()
    {
        ResultSet rs = null;
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "SELECT FirstName,SecondName,LastName,NationalID,age,phone,national,NumbersOfRooms,RoomNo,arrival,nights,departure,TotalAmount,deposit,PassCode FROM guest";
            rs = stmt.executeQuery(str);
        }
        catch(SQLException ex)
        {
            System.out.println("the select method is wrong");
        }
        return rs;
    }
    
    public static void Add(String FirstName, String SecondName,String LastName,String NationalID,int age,String phone,String national,int NumbersOfRooms,String RoomNo,Date arrival,int nights,Date departure,double TotalAmount,double deposit,String PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "INSERT INTO guest VALUES (" + FirstName + ",'" + SecondName + "','" + LastName + "','" + NationalID + "'," + age + ",'" + phone + "','" + national + "'," + NumbersOfRooms + ",'" + RoomNo + "'," + arrival + "," + nights + "," + departure + "," + TotalAmount + "," + deposit + ",'" + PassCode + "')";
            stmt.executeQuery(str);
            con.close();
        }
        catch(SQLException ex)
        {
            System.out.println("the add all method is wrong");
        }
    }
    
    public static void Update(String ColumnName, String value, int PassCode)
    {
        try
        {
            setConnection();
            stmt = con.createStatement();
            String str = "UPDARE guest SET " + ColumnName + " = '" + value + "' WHERE PassCode = " + PassCode;
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
