package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // constructor for no rooms booked
    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // constructor for rooms booked
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // show how many suites are available
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    // basic rooms available
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // book suites or basic rooms available
    public boolean bookRoom(int roomCount, boolean suite){
        // edge case
        if(roomCount <= 0) return false;

        //
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }

        return false;
    }

}
