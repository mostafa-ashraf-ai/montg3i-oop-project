/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed Eissa
 */
public class Staff extends Person{
    private int Id ;
    private String Username ;
    private String Password ;
    private double Salary ;
    private String Email ;
    private static int CurrentStaff;
    private static boolean TypeStaff;

    public Staff(){
    
    }

    public Staff(String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email) {
        super(FirstName, LastName);
        this.Id = Id;
        this.Username = Username;
        this.Password = Password;
        this.Salary = Salary;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public double getSalary() {
        return Salary;
    }

    public String getEmail() {
        return Email;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public static int getCurrentStaff() {
        return CurrentStaff;
    }

    public static void setCurrentStaff(int CurrentStaff) {
        Staff.CurrentStaff = CurrentStaff;
    }

    public static boolean isTypeStaff() {
        return TypeStaff;
    }

    public static void setTypeStaff(boolean TypeStaff) {
        Staff.TypeStaff = TypeStaff;
    }
    
    
    
    public void update(String coloum_name ,String updated){}
    public void update(String coloum_name ,double updated){}
    
    
}
