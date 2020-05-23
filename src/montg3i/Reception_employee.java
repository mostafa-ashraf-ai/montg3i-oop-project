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
public class Reception_employee {
    private int ID ;
    private String username ;
    private String Pass ;
    private String FirstName ;
    private String LastName;
    private String email ;
    private double Salary ;
    private static int NoOfEmployee;
    
    
public Reception_employee(int id,String Username ,String pass, String firstname ,String lastname ,String mail, double salary) //to add employee
{ 
    ID =id ;
    username =Username ;
    Pass = pass ;
    FirstName =firstname ;
    LastName =lastname ;
    email = mail ;
    Salary = salary ;
//    Database.staff.Add("reception", id, username, pass, FirstName, LastName, email,Salary);
    NoOfEmployee++;
    
}

    public static int getNoOfEmployee() {
        return NoOfEmployee;
    }

    public void setID(int ID) {
        this.ID = ID;
         Database.staff.Add("reception","ID",ID);
        
    }

    public void setusername(String Username) {
        this.username = Username;
         Database.staff.Add("reception","username",username);
    }
    

    public String getusername() {
        return username;
    }

    public int getID() {
        return ID;
    }

    public void setFirstName(String firstname) {
        this.FirstName = firstname;
         Database.staff.Add("reception","FirstName",FirstName);
    }

    public void setLastName(String lastname) {
        this.LastName = lastname;
         Database.staff.Add("reception","LastName",LastName);
    }

    public void setPass(String pass) {
        this.Pass = pass;
         Database.staff.Add("reception","Pass",pass);
    }

    public void setemail(String email) {
        this.email = email;
         Database.staff.Add("reception","email",email);
    }

    public void setSalary(double salary) {
        this.Salary = salary;
        Database.staff.Add("reception","Salary",Salary);
    }

    public String getPass() {
        return Pass;
    }

    public String getFirstname() {
        return FirstName;
    }

    public String getLastname() {
        return LastName;
    }

    public String getemail() {
        return email;
    }

    public double getSalary() {
        return Salary;
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
    }
    
    
    public static ResultSet Select()
    {
       return Database.staff.Select("reception");
       
    }
}

