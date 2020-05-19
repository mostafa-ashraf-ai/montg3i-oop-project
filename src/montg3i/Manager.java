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
public class Manager {
    
    
    private double Balance;
    private String Employee_Information;
    private String Reservations;
    private String CV;
    private double update_balance;

    
    
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void setEmployee_Information(String Employee_Information) {
        this.Employee_Information = Employee_Information;
    }

    public void setReservations(String Reservations) {
        this.Reservations = Reservations;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public void setUpdate_balance(double update_balance) {
        this.update_balance = update_balance;
    }
    

    public double getBalance() {
        return Balance;
    }

    public String getEmployee_Information() {
        return Employee_Information;
    }

    public String getReservations() {
        return Reservations;
    }

    public String getCV() {
        return CV;
    }

    public double getUpdate_balance() {
        return update_balance;
    }

    public Manager(double Balance, String Employee_Information, String Reservations, String CV, double update_balance) {
        this.Balance = Balance;
        this.Employee_Information = Employee_Information;
        this.Reservations = Reservations;
        this.CV = CV;
        this.update_balance = update_balance;
    }
    
    public double balance(){
        
        Balance = Balance - update_balance;
        return Balance;
    }
    
    public void Print_Employee_Information(){
        System.out.println();
    }
    
    public void Print_Reservations(){
        System.out.println();
    }
    
    public void Print_CV(){
        System.out.println();
    }
    
    
    
    
}
