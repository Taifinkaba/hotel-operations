package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    /*
     * The room type can be
     *   "king" = night is $139.00
     *   "double" = price per night is $124.00
     * If the stay is over a weekend
     *   the price per night increase by 10%
     *
     * */

    // setters and getters
    public Reservation(String roomType, int numberOfNights, boolean weekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice(){
        double price = 0;

        switch (this.roomType){
            case "king" -> {price = 139.00;}
            case "double" -> {price = 124.00;}
            default -> {
                System.out.println("That's not a room type, try again!");
            }
        }

        if(weekend) price = price * 1.10;

        return price;
    }

    public int getNumberOfNights(){
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return weekend;
    }

    public void setWeekend(boolean weekend){
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
