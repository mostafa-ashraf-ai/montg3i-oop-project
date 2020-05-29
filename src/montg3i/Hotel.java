/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed Eissa
 */
public class Hotel {
    private static ArrayList<Staff> ReceptionEmployeeList = new ArrayList<Staff>();
    private static ArrayList<Staff> ManagerList = new ArrayList<Staff>();
    private static ArrayList<Guest> GuestList = new ArrayList<Guest>();

    public static ArrayList<Staff> getReceptionEmployeeList() {
        return ReceptionEmployeeList;
    }

    public static void setReceptionEmployeeList(ArrayList<Staff> ReceptionEmployeeList) {
        Hotel.ReceptionEmployeeList = ReceptionEmployeeList;
    }

    public static ArrayList<Staff> getManagerList() {
        return ManagerList;
    }

    public static void setManagerList(ArrayList<Staff> ManagerList) {
        Hotel.ManagerList = ManagerList;
    }

    public static ArrayList<Guest> getGuestList() {
        return GuestList;
    }

    public static void setGuestList(ArrayList<Guest> GuestList) {
        Hotel.GuestList = GuestList;
    }
    
    private static void LoadReceptionEmployee ()
    {
        ResultSet rs = Database.staff.Select("reception");
        try 
        {
            while(rs.next())
            {
                Staff RecEmp = new Reception_Employee(rs.getString("FirstName"), rs.getString("LastName"), rs.getInt("ID"), rs.getString("username"), rs.getString("pass"), rs.getDouble("salary"), rs.getString("email"), rs.getString("language"));
                ReceptionEmployeeList.add(RecEmp);
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void LoadManager ()
    {
        ResultSet rs = Database.staff.Select("manager");
        try 
        {
            while(rs.next())
            {
                Staff mng = new Manager(rs.getString("FirstName"), rs.getString("LastName"), rs.getInt("ID"), rs.getString("username"), rs.getString("pass"), rs.getDouble("salary"), rs.getString("email"), rs.getString("position"));
                ManagerList.add(mng);
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void LoadGuest ()
    {
        ResultSet rs = Database.guest.Select("guest");
        try 
        {
            while(rs.next())
            {
                Guest gst = new Guest(rs.getString("FirstName"), rs.getString("SecondName"), rs.getString("LastName"), rs.getString("NationalID"), rs.getInt("age"), rs.getString("phone"), rs.getString("national"), rs.getInt("RoomNo"), rs.getDate("arrival"), rs.getInt("nights"), rs.getDate("departure"), rs.getDouble("deposit"), rs.getDouble("TotalAmount"));
                GuestList.add(gst);
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void LoadData ()
    {
        LoadReceptionEmployee ();
        LoadManager ();
        LoadGuest ();
    }
    
}
