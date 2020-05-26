/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

/**
 *
 * @author Ahmed Eissa
 */
public class Doctor$ extends Staff${
    private String Department ;
    private String Time ;
    private int Cost;
    private static int NoOfDoctors;
    
    public Doctor$(String firstname ,String secondname , String lastname ,String passcode,int id ,String username ,double salary ,String email , String degree ,String department ,String time , int cost )
   {
       super(firstname,secondname,lastname,passcode,id,username,salary,email,degree);
       Department =department ;
       Time = time ;
       Cost =cost ;
       NoOfDoctors ++ ;
       Database.staff.Add("doctor", id, username, passcode, firstname, lastname,salary, email);
    }
    public Doctor$(String department ,String time,int cost)
    {
        Department =department ;
        Time = time ;
        Cost =cost ;
    }
    public static int getNoOfDoctors()
    {
        return NoOfDoctors ;
    }
}
