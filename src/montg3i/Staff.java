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
public class Staff extends Person{
    private int Id ;
    private String Username ;
    private String Password ;
    private double Salary ;
    private String Email ;
   
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
    
    public void update(String coloum_name ,String updated){}
    public void update(String coloum_name ,double updated){}
    
}
