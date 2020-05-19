package montg3i;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Eissa
 */
public class Reception_1 {
    private String first_name;
    private String second_name;
    private String last_name ;
    private String email ;
    private int national_id;
    private int age ;
    private String national;
    private String type_of_room ;
    private int no_of_rooms ;
    private int nights ;
    private String meals ;
    private String garage;
    private String transport ;
    private double deposit ;
    private String room_id ;
    private int pass_code ;
    private int c =0 ;
    private double blance ; 
    private int cost_of_garage ;
    private int cost_of_transport ;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void setType_of_room(String type_of_room) {
        this.type_of_room = type_of_room;
    }

    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    /*public void setRoom_id(String room_id) {
        this.room_id = room_id;
    } 

    public void setPass_code(int pass_code) {
        this.pass_code = pass_code; 
    } */

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public int getNational_id() {
        return national_id;
    }

    public int getAge() {
        return age;
    }

    public String getNational() {
        return national;
    }

    public String getType_of_room() {
        return type_of_room;
    }

    public int getNo_of_rooms() {
        return no_of_rooms;
    }

    public int getNights() {
        return nights;
    }

    public String getMeals() {
        return meals;
    }

    public String getGarage() {
        return garage;
    }

    public String getTransport() {
        return transport;
    }

    public double getDeposit() {
        return deposit;
    }

    public String getRoom_id() {
        if(c%2==1)
        return ("R100" +c );
        if(c%2!=1)
        {     
              return("R100"+c+1);
        }
          c=c+1 ;
        return null;
    }

    public int getPass_code() {
        return (491414);
    }
    
     public void store_data (){
         //to store data in data base 
     }
     
    public void totalcost(){     
        int cost_ofMeals=0 ;
        int cost_ofRoom =0;
        int cost_of_garage=0 ;
        int cost_of_transport=0 ;
        int total_cost_of_meals =1 ;
        int total_cost_of_room =1;
        int total_cost_of_garage=1;
        int total_cost_of_transport=1;
        double totalcost=1;
        double sumofcost=0 ;
        double taxs_services =1 ;
        double left =0 ;
          
        
        if(getType_of_room()=="Single"||getType_of_room()=="single")
        { 
            cost_ofRoom =1000;
             if(getMeals()=="yes" ||getMeals()=="Yes"||getMeals()=="YES" )
               cost_ofMeals =200 ;
        }                   
        if(getType_of_room()=="double"||getType_of_room()=="Double")
            {  
                cost_ofRoom=2000;
                if(getMeals()=="yes" ||getMeals()=="Yes"||getMeals()=="YES" )
              
                         cost_ofMeals=500 ;                       
            }  
        
        if(getGarage()=="yes"||getGarage()=="Yes"||getGarage()=="YES")
            cost_of_garage =100;
        if(getTransport()=="yes"||getTransport()=="Yes"||getTransport()=="YES")
            cost_of_transport =200 ;
        
        total_cost_of_meals = cost_ofMeals * getNights();
        total_cost_of_room = cost_ofRoom * getNights ();
        total_cost_of_garage= cost_of_garage * getNights();
        total_cost_of_transport = cost_of_transport * getNights();
        System.out.println("Room ID :"+getRoom_id());
        System.out.println("Room PassCode:"+getPass_code());
        System.out.println("Type of Room :"+getType_of_room());
        System.out.println("Durtion:"+getNights());
        System.out.println("Cost of Room="+total_cost_of_room);
        System.out.println("Cost of Meals ="+total_cost_of_meals);
        System.out.println("Cost of Garage ="+total_cost_of_garage);
        System.out.println("Cost of Transport="+total_cost_of_transport);
        sumofcost=total_cost_of_meals +total_cost_of_room+total_cost_of_garage +total_cost_of_transport ;
        taxs_services = sumofcost*0.14 ; 
        totalcost= sumofcost+ taxs_services;
        left=totalcost -getDeposit();
        System.out.println("Total Cost ="+totalcost);
        System.out.println("Taxs and Services (14%)="+taxs_services);
        System.out.println("paid ="+getDeposit());
        System.out.println("Left="+left);
        System.out.println("THANKS FOR CHOOSING OUR RESORT");
        
        
        
  
        
        
    }
  

    void getAge(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getGarage(String yes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getFirst_name(String ahmed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}