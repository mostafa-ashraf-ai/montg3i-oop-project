/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muhammed Abuhashim
 */
public class MONTG3I  {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("hellooooooooooooooooooooooooo");
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String UserName;
        String Password;
        int Room_Number;
        String Pass_Code;
       
        
        // users class get username and password
        // show what is incorrect 
        
        Users users = new Users("Ahmed","12345");
        
        System.out.print("Enter Name :");
        UserName = scan.nextLine();
        System.out.print("Enter Password");
        Password = scan.nextLine();
        
        if ( UserName.equals(users.getUserName()) )
        {
            if(Password.equals(users.getPassword()))
            {
                System.out.println("Done");
            }
            else 
            {
                System.out.println("Password Incorrect");
            }
        }
        else
        {
            System.out.println("UserName Incorrect");
        }
        
        // not show what is incorrect 
        
        if ( UserName.equals(users.getUserName()) )
        {
             if (Password.equals(users.getPassword()))
            {
                System.out.println("Done");
            }
            else 
            {
                System.out.println("UserName or Password Incorrect");
            }
        }
        else
        {
            System.out.println("UserName or Password Incorrect");
        }
        
        // guest class get room number and pass code 
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        Guest guest = new Guest(200,"1a2b3");
        
        System.out.print("Enter Room Number :");
        Room_Number = Integer.parseInt(reader.readLine());
        System.out.print("Enter Your Pass Code :");
        Pass_Code = scan.nextLine();
        
        int n = guest.getRoom_Number();
        
          if (Room_Number == n)
        {
              if (Pass_Code.equals(guest.getPass_Code()))
            {
                System.out.println("Done");
            }
            else 
            {
                System.out.println("Room Number or Pass Code Incorrect");
            }
        }
            else
            {
                System.out.println("Room Number or Pass Code Incorrect");
            }
          
          // manager class 
          
          Manager manager = new Manager(200,"ahmed","ahmed","ahmed",150);
          //ArrayList<String>Employee_Information=new ArrayList<String>();
          double m = manager.balance();
          System.out.print(n);
          
          // information class
          
          Information information = new Information("MUHAMMED","YASSIR","ABUHASHIM",17101902,'C',6,"ENGINEER");
          information.Print_Imformation();
          information.Print_Imformation_2();
          
        // staff class
        
        Staff staff= new Staff(2000,"Monday","Carfour","El Andalosya Hospital","nothing");
        staff.Print_Salary();
        
    } 
            
}
