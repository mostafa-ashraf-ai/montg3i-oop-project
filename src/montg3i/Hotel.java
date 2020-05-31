/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.util.Date;
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
    private static ArrayList<HotelRoom> HotelRoomList = new ArrayList<HotelRoom>();

    public static ArrayList<Staff> getReceptionEmployeeList() {
        return ReceptionEmployeeList;
    }

    public static void AddReceptionEmployeeList(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Language) {
        ReceptionEmployeeList.add(new ReceptionEmployee(FirstName, LastName, Id, Username, Password, Salary, Email, Language));
        Database.staff.Add("reception", Id, Username, Email, FirstName, LastName, Salary, Email, Language);
    }

    public static ArrayList<Staff> getManagerList() {
        return ManagerList;
    }

    public static void AddManagerList(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Position) {
        ManagerList.add(new Manager(FirstName, LastName, Id, Username, Password, Salary, Email, Position));
        Database.staff.Add("manager", Id, Username, Password, FirstName, LastName, Salary, Email, Position);
    }

    public static ArrayList<Guest> getGuestList() {
        return GuestList;
    }

    public static ArrayList<HotelRoom> getHotelRoomList() {
        return HotelRoomList;
    }

    public static void setHotelRoomList(ArrayList<HotelRoom> HotelRoomList) {
        Hotel.HotelRoomList = HotelRoomList;
    }

    public static void AddGuestList(int GuestNo, String FirstName, String SecondName, String LastName,String NationalId, int Age, String Phone, String National, int RoomNo, String Arrival, int Nights, String Departure, double Deposite, double TotalAmount, String Status) {
        GuestList.add(new Guest(GuestNo, FirstName, SecondName, LastName, NationalId, Age, Phone, National, RoomNo, Arrival, Nights, Departure, Deposite, TotalAmount, Status));
        Database.guest.Add(GuestNo, FirstName, SecondName, LastName, NationalId, Age, Phone, National, RoomNo, Arrival, Nights, Departure, Deposite, TotalAmount, Status);
    }
    
    private static void LoadReceptionEmployee ()
    {
        ResultSet rs = Database.staff.Select("reception");
        try 
        {
            while(rs.next())
            {
                Staff RecEmp = new ReceptionEmployee(rs.getString("FirstName"), rs.getString("LastName"), rs.getInt("ID"), rs.getString("username"), rs.getString("pass"), rs.getDouble("salary"), rs.getString("email"), rs.getString("language"));
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
        Guest.setGuestNextNo(0);
        ResultSet rs = Database.guest.Select("guest");
        try 
        {
            while(rs.next())
            {
                Guest gst = new Guest(rs.getInt("GuestNo"), rs.getString("FirstName"), rs.getString("SecondName"), rs.getString("LastName"), rs.getString("NationalID"), rs.getInt("age"), rs.getString("phone"), rs.getString("national"), rs.getInt("NumbersOfRooms"), rs.getString("arrival"), rs.getInt("nights"), rs.getString("departure"), rs.getDouble("deposit"), rs.getDouble("TotalAmount"), rs.getString("status"));
                GuestList.add(gst);
                Guest.setGuestNextNo(rs.getInt("GuestNo"));
            }
            rs.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void LoadHotelRooms ()
    {
        ResultSet rs = Database.room.Select("room");
        try 
        {
            while(rs.next())
            {
                HotelRoom hr = new HotelRoom(rs.getString("RoomNumber"), rs.getString("RoomType"), rs.getBoolean("Availability"), rs.getInt("GuestNo"));
                HotelRoomList.add(hr);
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
        LoadHotelRooms ();
    }
    
}
