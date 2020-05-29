/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.Date;
import java.sql.ResultSet;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Ahmed Eissa
 */
public class Guest extends Person {
    private String SecondName;
    private String NationalId ;
    private int Age ;
    private String Phone ;
    private String National ;
    private int RoomNo ;
    private Date Arrival ;
    private int Nights ;
    private Date Departure ;
    private double Deposite ;
    private double TotalAmount ;
    private static int NoofRooms_taken ;
    private static int AllRooms=100 ;

    public Guest(String FirstName, String SecondName, String LastName,String NationalId, int Age, String Phone, String National, int RoomNo, Date Arrival, int Nights, Date Departure, double Deposite, double TotalAmount) {
        super(FirstName, LastName);
        this.SecondName = SecondName;
        this.NationalId = NationalId;
        this.Age = Age;
        this.Phone = Phone;
        this.National = National;
        this.RoomNo = RoomNo;
        this.Arrival = Arrival;
        this.Nights = Nights;
        this.Departure = Departure;
        this.Deposite = Deposite;
        this.TotalAmount = TotalAmount;
        Database.guest.Add(FirstName, SecondName, LastName, NationalId, Age, Phone, National, RoomNo, Arrival, Nights, Departure, TotalAmount, Deposite);
    }

    
    
    public static int getNoofRooms_taken()
    {
        return NoofRooms_taken;
    }
    public static int Avaliable_Rooms()
    {
    return (getNoofRooms_taken()-AllRooms) ;
    }
    
    /* public static boolean login(String Username ,String pass)
    { 
      
      return Database.guest.checkUserAndPass("guest", Username, pass) ;
      
    }*/
    public static void delete (int id)
    {
        //Database.guest.Delete("guest", 0);
        Database.guest.Delete(id);
    }
    public static void update(int id ,String coloum_name ,String updated,int x ,double y ,Date z)
    {
        Database.guest.Update(coloum_name, z, id);
        Database.guest.Update(coloum_name, updated, id);
        Database.guest.Update(coloum_name, y, id);
        Database.guest.Update(coloum_name, x, id);
        
    }
    
    public static ResultSet Select(String Coloum_name ,int id,String elihnghero)
    {
      
          return Database.guest.Select("guest", Coloum_name, elihnghero);
      
    }
    
    
    public static ResultSet Select(String passcode)
    {
       return Database.guest.Select(passcode);
       
    }
/*
    public static int getNoOfRooms() {
        return NoOfRooms;
    }

    public static String getRoomNo() {
        return RoomNo;
    }

    public static int getNights() {
        return Nights;
    }
    
    */
}
