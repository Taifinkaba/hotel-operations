package com.pluralsight;

public class Reservation {
    private String roomType;

    public Reservation(String roomType){
        this.roomType = roomType;
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

        return price;
    }

    public int getNumberOfNights(){

    }

    public void setNumberOfNights(int numberOfNights){

    }

    public boolean isWeekend(){

    }

    public void setWeekend(boolean weekend){

    }

    public double getReservationTotal(){

    }
}
