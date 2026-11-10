package com.pluralsight;

public class Room {
    /*
    * The Room class is responsible for knowing everything related to a hotel room.
    * A room is only available if:
    *   clean
    *   not currently occupied.
    * */
    // variables
    private int numOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    // private boolean available;

    public Room(int numOfBeds, double price, boolean occupied, boolean dirty){
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        // this.available = available;
    }

    // getters
    public int getNumOfBeds() {
        return numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    // cleaning makes it false
    void cleanRoom() {
        dirty = false;
    }

    // checked in = marked occupied and marked as dirty
    void checkIn() {
        if(isAvailable()){
            occupied = true;
            dirty = true;
        } else{
            System.out.println("Room is not available, try again!");
        }
    }

    //  checks out = must first be cleaned
    void checkOut() {
        if(isAvailable()){
            occupied = false;
            dirty = true;
        } else{
            System.out.println("Room is available!");
        }
    }
}
