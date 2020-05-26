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
public class Manager$ extends Staff$ {
    private double Current_Balance ;
    
    public Manager$(String firstname ,String secondname , String lastname ,String passcode,int id ,String username ,double salary ,String email , String degree ,double currentbalance){
        super(firstname,secondname,lastname,passcode,id,username,salary,email,degree);
        Current_Balance =currentbalance ;
        Database.staff.Add("manager", id, username, passcode, firstname, lastname,salary, email);
    }
    
    /*public double Financial_and_accounting(getTotalRevenue());
    {
        getTotalRevenue() ;
    }*/
    public void ListOfEmployee()
    {
    }
    public void Cameras(int noOfCamera)
    {
    }
    
    
    
}
