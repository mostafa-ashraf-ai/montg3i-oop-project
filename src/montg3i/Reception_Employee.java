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
public class Reception_Employee extends Staff{
    String Language;
    
    public Reception_Employee(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Language) {
        super(FirstName, LastName, Id, Username, Password, Salary, Email);
        this.Language = Language;
    }
    
    public static boolean login(String Username ,String pass)
    { 
        return Database.staff.checkUserAndPass("reception", Username, pass) ;
    }
    
    public static void Add (String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email)
    {
        Database.staff.Add("reception", Id, Username, Password, FirstName, LastName, Salary, Email);
    }
    
    public static void delete (int id)
    {
        Database.staff.Delete("reception", id);
    }
    
    @Override
    public void update(String coloum_name ,String updated)
    {
        Database.staff.Update("reception", coloum_name, updated, getId());
    }
    
    @Override
    public void update(String coloum_name ,double updated)
    {
        Database.staff.Update("reception", coloum_name, updated, getId());
    }
}
