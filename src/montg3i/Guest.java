/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Ahmed Eissa
 */
public class Guest extends Person {
    private int GuestNo;
    private String SecondName;
    private String NationalId;
    private int Age;
    private String Phone;
    private String National;
    private int NumbersOfRooms;
    private String Arrival;
    private int Nights;
    private String Departure;
    private double Deposite;
    private double TotalAmount;
    private String Status;
    private static int GuestNextNo;
    private static int CurrentGuestNo;

    public Guest(int GuestNo, String FirstName, String SecondName, String LastName,String NationalId, int Age, String Phone, String National, int NumbersOfRooms, String Arrival, int Nights, String Departure, double Deposite, double TotalAmount, String Status) {
        super(FirstName, LastName);
        this.GuestNo = GuestNo;
        this.SecondName = SecondName;
        this.NationalId = NationalId;
        this.Age = Age;
        this.Phone = Phone;
        this.National = National;
        this.NumbersOfRooms = NumbersOfRooms;
        this.Arrival = Arrival;
        this.Nights = Nights;
        this.Departure = Departure;
        this.Deposite = Deposite;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
    }

    public static int getCurrentGuestNo() {
        return CurrentGuestNo;
    }

    public static void setCurrentGuestNo(int CurrentGuestNo) {
        Guest.CurrentGuestNo = CurrentGuestNo;
    }
    
    public static int getGuestNextNo() {
        return GuestNextNo;
    }

    public static void setGuestNextNo(int GuestNextNo) {
        Guest.GuestNextNo = GuestNextNo + 1;
    }

    public int getGuestNo() {
        return GuestNo;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getNationalId() {
        return NationalId;
    }

    public int getAge() {
        return Age;
    }

    public String getPhone() {
        return Phone;
    }

    public String getNational() {
        return National;
    }

    public int getNumbersOfRooms() {
        return NumbersOfRooms;
    }

    public String getArrival() {
        return Arrival;
    }

    public int getNights() {
        return Nights;
    }

    public String getDeparture() {
        return Departure;
    }

    public double getDeposite() {
        return Deposite;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public String getStatus() {
        return Status;
    }
    
    public static int Search(String name)
    { 
        ArrayList<Guest> g = Hotel.getGuestList();
        String Name[] = name.split(" ");
        for(int i=0; i<g.size(); i++)
        {
            if(Name[0].equals(g.get(i).getFirstName()))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean login(String Room ,String passCode)
    { 
        ArrayList<HotelRoom> g = Hotel.getHotelRoomList();
        for(int i=0; i<g.size(); i++)
        {
            if(Room.equals(g.get(i).getRoomNumber()))
            {
                System.out.println(passCode.equals(g.get(i).getGuestNo()));
                Guest.setCurrentGuestNo(i);
                return (passCode.equals(g.get(i).getGuestNo()+""));
            }
        }
        return false;
    }
    
    public void update(String ColumnName, String Value)
    {
        Database.guest.Update(ColumnName, Value, getGuestNo());
        Hotel.getGuestList().clear();
        Hotel.LoadGuest();
    }
    public void update(String ColumnName, double Value)
    {
        Database.guest.Update(ColumnName, Value, getGuestNo());
        Hotel.getGuestList().clear();
        Hotel.LoadGuest();
    }
}
