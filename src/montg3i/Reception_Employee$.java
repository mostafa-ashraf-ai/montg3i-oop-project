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
public class Reception_Employee$ extends Staff${
    private static int NoOf_ReceptionEmployee ;
    private static double TotalRevenue=0 ;
    private static double Output=0 ;
    
    Reception_Employee$(String firstname ,String secondname , String lastname ,String passcode,int id ,String username ,double salary ,String email , String degree ,double newrevenue , double newout)
    {
       super(firstname,secondname,lastname,passcode,id,username,salary , email,degree); 
       NoOf_ReceptionEmployee ++ ;
       Database.staff.Add("reception", id, username, passcode, firstname, lastname,salary, email);
    }
    Reception_Employee$(double newrevenue , double newout)
    {
        TotalRevenue = TotalRevenue + newrevenue ;
        Output = Output +newout ;
    }

    public static int getNoOf_ReceptionEmployee() {
        return NoOf_ReceptionEmployee;
    }

    public static double getTotalRevenue() {
        return TotalRevenue;
    }
    

    public static double getOutput() {
        return Output;
    }
    
   /* public static void  Financial_and_accounting(double getTotalRevenue(),double getOutput())
    {
        double balance = 0;
        balance = 
        System.out.println();
        System.out.println();
        System.out.println();
    }*/
}
