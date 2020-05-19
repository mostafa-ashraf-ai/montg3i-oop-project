/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

/**
 *
 * @author Muhammed Abuhashim
 */
public class Guest {
    
    
     private int Room_Number;
     private String Pass_Code;

    
     
    public void setRoom_Number(int Room_Number) {
        this.Room_Number = Room_Number;
    }

    public void setPass_Code(String Pass_Code) {
        this.Pass_Code = Pass_Code;
    }

    public int getRoom_Number() {
        return Room_Number;
    }

    public String getPass_Code() {
        return Pass_Code;
    }

    public Guest(int Room_Number, String Pass_Code) {
        this.Room_Number = Room_Number;
        this.Pass_Code = Pass_Code;
    }
    
}
