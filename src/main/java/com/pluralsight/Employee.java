package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;
    private boolean punchedIn;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchedIn = false;
    }

    public double getTotalPay(){
        double totalPay = this.hoursWorked * this.payRate;
        return totalPay;
    }

    public double getRegularHours(){
        if(this.hoursWorked > 40){
            return 40;
        }else{
            return this.hoursWorked;
        }
    }

    public double getOvertimeHours(){
        if(this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        else {
            return 0;
        }
    }

    // employee punches in, track start time
    void setPunchedIn(int time) {
        if(!punchedIn){
            startTime = time;
            punchedIn = true;
        } else {
            System.out.println("Already punched in, try again!");
        }

    }

    // punch out, calculate hours worked and add time to their hours worked
    void punchedOut(int time) {
        if(punchedIn){
            hoursWorked += time - startTime;
            punchedIn = false;
        } else{
            System.out.println("Punch in again, try again!");
        }

    }
}
