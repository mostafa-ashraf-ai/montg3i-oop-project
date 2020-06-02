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
public class Calculate {
    private final static double SingleRoom =1000;
    private final static double DoubleRoom = 1500 ;
    private final static double SweetRoom = 2500 ;
    
    public static double TotalAmount(int RoomsNo[], int Nights)
    {
        return (RoomsNo[2]*SingleRoom + RoomsNo[1]*DoubleRoom + RoomsNo[0]*SweetRoom)*Nights;
    }
    
    
    
}
