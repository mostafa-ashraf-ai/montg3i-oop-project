/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.sql.Date;
import java.sql.ResultSet;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Ahmed Eissa
 */
public class Guest extends Person {
    private int GuestNo;
    private String SecondName;
    private String NationalId;
    private int Age;
    private String Phone;
    private String National;
    private int NumbersOfRooms;
    private String Arrival;
    private int Nights;
    private String Departure;
    private double Deposite;
    private double TotalAmount;
    private String Status;
    private static int GuestNextNo;

    public static int getGuestNextNo() {
        return GuestNextNo;
    }

    public static void setGuestNextNo(int GuestNextNo) {
        Guest.GuestNextNo = GuestNextNo + 1;
    }

    public int getGuestNo() {
        return GuestNo;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getNationalId() {
        return NationalId;
    }

    public int getAge() {
        return Age;
    }

    public String getPhone() {
        return Phone;
    }

    public String getNational() {
        return National;
    }

    public int getNumbersOfRooms() {
        return NumbersOfRooms;
    }

    public String getArrival() {
        return Arrival;
    }

    public int getNights() {
        return Nights;
    }

    public String getDeparture() {
        return Departure;
    }

    public double getDeposite() {
        return Deposite;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public String getStatus() {
        return Status;
    }

    public Guest(int GuestNo, String FirstName, String SecondName, String LastName,String NationalId, int Age, String Phone, String National, int NumbersOfRooms, String Arrival, int Nights, String Departure, double Deposite, double TotalAmount, String Status) {
        super(FirstName, LastName);
        this.GuestNo = GuestNo;
        this.SecondName = SecondName;
        this.NationalId = NationalId;
        this.Age = Age;
        this.Phone = Phone;
        this.National = National;
        this.NumbersOfRooms = NumbersOfRooms;
        this.Arrival = Arrival;
        this.Nights = Nights;
        this.Departure = Departure;
        this.Deposite = Deposite;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
    }
    
    
}
