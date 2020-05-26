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
public class Person$ {
    private String FirstName ;
    private String SecondName;
    private String LastName ;
    private String PassCode ;
    
    public Person$(){
    }
    
    public Person$(String firstname ,String secondname ,String lastname ,String passcode)
    {
        FirstName =firstname ;
        SecondName =secondname ;
        LastName = lastname ;
        PassCode =passcode ;
    }

    public String getPassCode() {
        return PassCode;
    }
        
}
