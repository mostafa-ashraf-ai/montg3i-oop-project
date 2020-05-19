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
public class Information {
    
    private String First_Name;
    private String Middle_Name;
    private String Last_Name;
    private int ID;
    private char Building;
    private int Floor;
    private String Degree;

    
    
    
    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public void setMiddle_Name(String Middle_Name) {
        this.Middle_Name = Middle_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBuilding(char Building) {
        this.Building = Building;
    }

    public void setFloor(int Floor) {
        this.Floor = Floor;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }
    
    public int getID() {
        return ID;
    }

    public char getBuilding() {
        return Building;
    }

    public int getFloor() {
        return Floor;
    }

    public String getDegree() {
        return Degree;
    }

    public Information(String First_Name, String Middle_Name, String Last_Name, int ID, char Building, int Floor, String Degree) {
        this.First_Name = First_Name;
        this.Middle_Name = Middle_Name;
        this.Last_Name = Last_Name;
        this.ID = ID;
        this.Building = Building;
        this.Floor = Floor;
        this.Degree = Degree;
    }

   
    public void Print_Imformation(){
    
    System.out.println("Name :" + First_Name + Middle_Name + Last_Name  + "    \t  " + "ID :" + ID + "    \t  " + "Degree :" + Degree);
    
}
    
 public void Print_Imformation_2(){
    
    System.out.println("Name :" + First_Name + Middle_Name + Last_Name  + "    \t  " + "ID :" + ID + "    \t  " + "Degree :" + Degree + "    \t  " +"Building :" + Building + "    \t  " + "Floor :" +Floor);
    
}   
    
    
}
