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
public class Staff {
    
    private double Salary;
    private String Vacations;
    private String Offers_And_Featuers;
    private String Insurance;
    private String Complain;

    
    
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setVacations(String Vacations) {
        this.Vacations = Vacations;
    }

    public void setOffers_And_Featuers(String Offers_And_Featuers) {
        this.Offers_And_Featuers = Offers_And_Featuers;
    }

    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    public void setComplain(String Complain) {
        this.Complain = Complain;
    }

    public double getSalary() {
        return Salary;
    }

    public String getVacations() {
        return Vacations;
    }

    public String getOffers_And_Featuers() {
        return Offers_And_Featuers;
    }

    public String getInsurance() {
        return Insurance;
    }

    public String getComplain() {
        return Complain;
    }

    public Staff(double Salary, String Vacations, String Offers_And_Featuers, String Insurance, String Complain) {
        this.Salary = Salary;
        this.Vacations = Vacations;
        this.Offers_And_Featuers = Offers_And_Featuers;
        this.Insurance = Insurance;
        this.Complain = Complain;
    }
    
    public void Print_Salary(){
        System.out.println("Salary is :"+Salary);
    }
        
     public void Print_Vacations(){
        System.out.println();
    }
    
    public void Print_Offers_And_Featuers(){
        System.out.println();
    }
    
    public void Print_Insurance(){
        System.out.println();
    }
    
    
    
}
