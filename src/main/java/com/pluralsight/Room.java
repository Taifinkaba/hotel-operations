package com.pluralsight;

public class Room {
    // variables
    private int numOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

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
        return available;
    }
}
