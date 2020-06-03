/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montg3i;

import java.util.ArrayList;

/**
 *
 * @author mostafa
 */
public class HotelRoom {
    private String RoomNumber;
    private String RoomType;
    private boolean Availability;
    private int GuestNo;

    public HotelRoom(String RoomNumber, String RoomType, boolean Availability, int GuestNo) {
        this.RoomNumber = RoomNumber;
        this.RoomType = RoomType;
        this.Availability = Availability;
        this.GuestNo = GuestNo;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
        Database.room.Update("Availability", Availability, RoomNumber);
    }

    public int getGuestNo() {
        return GuestNo;
    }

    public void setGuestNo(int GuestNo) {
        this.GuestNo = GuestNo;
        Database.room.Update("GuestNo", GuestNo, RoomNumber);
    }

    public String getRoomNumber() {
        return RoomNumber;
    }
    
    public static int Search(String room)
    { 
        ArrayList<HotelRoom> h = Hotel.getHotelRoomList();
        for(int i=0; i<h.size(); i++)
        {
            if(room.equals(h.get(i).getRoomNumber()))
            {
                return h.get(i).getGuestNo();
            }
        }
        return 0;
    }
    
    public static String Search(int guestNo)
    { 
        ArrayList<HotelRoom> h = Hotel.getHotelRoomList();
        for(int i=0; i<h.size(); i++)
        {
            if(guestNo == h.get(i).getGuestNo())
            {
                return h.get(i).getRoomNumber();
            }
        }
        return "";
    }
    
}
