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
public class Users {
    
    
    private String UserName;
    private String Password;

   

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserName() {
        return UserName;
    }


    public String getPassword() {
        return Password;
    }

    public Users(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }
    
    
   
    
    
}
