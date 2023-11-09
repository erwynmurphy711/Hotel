package main.java.com.example;

import java.util.ArrayList;

public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;
    private ArrayList<Guest> guestlist;

    public Room(int occupancy, double price, boolean occupied) {
        this.occupancy = occupancy;
        this.price = price;
        this.occupied = false;
        this.guestlist = new ArrayList<Guest>();
    }

    public void addGuest(Guest guest) {
        this.guestlist.add(guest);
    }

    // adding a guest to the guest list
    public void removeGuest(Guest guest) {
        this.guestlist.remove(guest);
    }

    // removing a guest to the guest list
    public ArrayList<Guest> getGuestlist() {
        return this.guestlist;
    }

    public int getOccupancy() {
        return this.occupancy;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getOccupied() {
        return this.occupied;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

}