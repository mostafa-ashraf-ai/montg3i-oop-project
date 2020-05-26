/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.Date;

/**
 *
 * @author Ahmed Eissa
 */
public class Calculate extends Guest$ {
    private double SingleRoom =1000;
    private double DoubleRoom = 1500 ;
    private double SweetRoom = 2500 ;
    private String TypeOfRoom ;
    double totalcost ;
    double totalcost_AfterDeposite;

    public Calculate(String firstname, String secondname, String lastname, String passcode, String nationalid, int age, String phone, String national, int noofrooms, String roomno, Date arrival, int nights, Date departure, double deposite, String typeofroom) {
        super(firstname, secondname, lastname, passcode, nationalid, age, phone, national, noofrooms, roomno, arrival, nights, departure, deposite);
       
        TypeOfRoom =typeofroom ;
        if(TypeOfRoom == "Single"||TypeOfRoom=="single")
        {
        totalcost=(nights*noofrooms*SingleRoom) ;
        }
        if(TypeOfRoom=="Double"|| TypeOfRoom=="double")
        {
         totalcost=(nights*noofrooms*DoubleRoom) ;   
        }
        if(TypeOfRoom=="Sweet"||TypeOfRoom=="sweet")
        {
            totalcost=(nights*noofrooms*SweetRoom) ;
        }
        totalcost_AfterDeposite=totalcost-deposite;
    }
    
    
   public void Print_Data ()
   {
       System.out.println(getRoomNo());
        System.out.println(getPassCode());
         System.out.println(totalcost);
         System.out.println(totalcost_AfterDeposite);
         System.out.println(totalcost-totalcost_AfterDeposite);
         
        
       
        
        
   }
    
}
