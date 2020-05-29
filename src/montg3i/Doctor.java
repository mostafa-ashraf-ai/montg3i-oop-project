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
public class Doctor extends Staff{
    private String Department ;
    private String Time ;
    private int Cost;
    private static int NoOfDoctors;

    public Doctor(String Department, String Time, int Cost, String FirstName, String LastName, int Id, String Username, String Password, double Salary, String Email) {
        super(FirstName, LastName, Id, Username, Password, Salary, Email);
        this.Department = Department;
        this.Time = Time;
        this.Cost = Cost;
        Database.staff.Add("doctor", Id, Username, Email, FirstName, LastName, Salary, Email);
    }
    
    
    public Doctor(String department ,String time,int cost)
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
