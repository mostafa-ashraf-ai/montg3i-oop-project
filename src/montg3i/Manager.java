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
public class Manager extends Staff {
    String Position;
    
    public Manager(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email, String Position) {
        super(FirstName, LastName, Id, Username, Password, Salary, Email);
        this.Position = Position;
    }
    
    public static boolean login(String Username ,String pass)
    { 
        ArrayList<Staff> m = Hotel.getManagerList();
        for(int i=0; i<m.size(); i++)
        {
            if(Username.equals(m.get(i).getUsername()))
            {
                Staff.setCurrentStaff(i);
                return (pass.equals(m.get(i).getPassword()));
            }
        }
        return false;
    }
    
    public static void delete (int id)
    {
        Database.staff.Delete("manager", id);
    }
    
    @Override
    public void update(String coloum_name ,String updated)
    {
        Database.staff.Update("manager", coloum_name, updated, getId());
    }
    
    @Override
    public void update(String coloum_name ,double updated)
    {
        Database.staff.Update("manager", coloum_name, updated, getId());
    }
}
