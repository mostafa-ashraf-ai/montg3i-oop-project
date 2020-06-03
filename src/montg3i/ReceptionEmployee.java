/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Eissa
 */
public class ReceptionEmployee extends Staff{
    private String Language;
    private static int NextID;
    
    public ReceptionEmployee(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Language) {
        super(FirstName, LastName, Id, Username, Password, Salary, Email);
        this.Language = Language;
    }

    public String getLanguage() {
        return Language;
    }
    
    public static boolean login(String Username ,String pass)
    { 
        ArrayList<Staff> r = Hotel.getReceptionEmployeeList();
        for(int i=0; i<r.size(); i++)
        {
            if(Username.equals(r.get(i).getUsername()))
            {
                Staff.setCurrentStaff(i);
                return (pass.equals(r.get(i).getPassword()));
            }
        }
        return false;
    }

    public static int getNextID() {
        return NextID;
    }

    public static void setNextID(int NextID) {
        ReceptionEmployee.NextID = NextID + 1;
    }
    
    public static void delete (int id)
    {
        Database.staff.Delete("reception", id);
    }
    
    @Override
    public void update(String coloum_name ,String updated)
    {
        Database.staff.Update("reception", coloum_name, updated, getId());
        Hotel.getReceptionEmployeeList().clear();
        Hotel.LoadReceptionEmployee();
    }
    
    @Override
    public void update(String coloum_name ,double updated)
    {
        Database.staff.Update("reception", coloum_name, updated, getId());
        Hotel.getReceptionEmployeeList().clear();
        Hotel.LoadReceptionEmployee();
    }
}
