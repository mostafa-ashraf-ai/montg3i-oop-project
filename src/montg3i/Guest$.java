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
public class Guest$ extends Person$ {
    private String NationalId ;
    private int Age ;
    private String Phone ;
    private String National ;
    private static int NoOfRooms ;
    private static String RoomNo ;
    private Date Arrival ;
    private static int Nights ;
    private Date Departure ;
    private static double Deposite ;
    private static double TotalAmount ;
    private static int NoofRooms_taken ;
    private static int AllRooms=100 ;
    
    Guest$(String firstname ,String secondname ,String lastname ,String passcode,String nationalid,int age ,String phone,String national, int noofrooms,String roomno ,Date arrival , int nights , Date departure ,double deposite)
    { 
        super(firstname ,secondname,lastname,passcode);
        NationalId= nationalid;
        Age=age ;
        Phone =phone ;
        National=national;
        NoOfRooms=noofrooms;
        RoomNo =roomno ;
        Arrival = arrival ;
        Nights = nights ;
        Departure = departure ; 
        Deposite = deposite ;
        //TotalAmount = getTotalAmount() ;
        NoofRooms_taken++ ;
        //Database.guest.Add(firstname, secondname, lastname, nationalid, age, phone, national, noofrooms, roomno, arrival, nights, departure, Totalamount, deposite, passcode);
      //  Database.guest.Add(firstname, secondname, lastname, nationalid, age, phone, national, noofrooms, roomno, arrival, nights, departure, deposite, deposite, passcode);
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

    public static int getNoOfRooms() {
        return NoOfRooms;
    }

    public static String getRoomNo() {
        return RoomNo;
    }

    public static int getNights() {
        return Nights;
    }
    
    
}
