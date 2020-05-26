/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.ResultSet;

/**
 *
 * @author Ahmed Eissa
 */
public class Staff$ extends Person${
    private int Id ;
    private String Username ;
    private double Salary ;
    private String Email ;
    private String Degree ;
    private static int NoOfEmployee ;
   
    public Staff$(){
    
    }
    
    public Staff$(String firstname ,String secondname , String lastname ,String passcode,int id ,String username ,double salary ,String email , String degree )
   {
       super(firstname,secondname,lastname,passcode);
       Id =id ;
       Username =username ;
       Salary =salary ;
       Email =email ;
       Degree = degree ;
       NoOfEmployee ++ ;
   }   
    public static int getNoOfEmployee(){
         return NoOfEmployee ;
    }
    
    public static boolean login(String Username ,String pass)
    { 
      
      return Database.staff.checkUserAndPass("reception", Username, pass) ;
    }
    public static void delete (int id)
    {
        Database.staff.Delete("reception", 0);
    }
    public static void update(int id ,String coloum_name ,String updated)
    {
        Database.staff.Update("reception", coloum_name, updated, id);
    }
    
    public static ResultSet Select(int id)
    {
       return Database.staff.Select("reception",id);
      // Database.staff.Add(table, id, username, pass, FirstName, LastName, id, email);
    }
    
    
    public static ResultSet Select()
    {
       return Database.staff.Select("reception");
       
    }
}
