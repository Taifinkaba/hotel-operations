package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    // private int startTime;
    // private boolean punchedIn;
    private LocalDate startDate;
    private LocalTime startTime;
    private boolean isPunchedIn;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.isPunchedIn = false;
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
        calculateHoursWorked(LocalTime.now());
    }

    // punch out, calculate hours worked and add time to their hours worked
    void punchedOut(int time) {
        calculateHoursWorked(LocalTime.of(time, 0));
    }

    // helper function
    void calculateHoursWorked(LocalTime endTime) {
        if(isPunchedIn) {
            // convert time into minutes for punch in and out
            int startMin = (startTime.getHour() * 60) + startTime.getMinute();
            int endMin = (endTime.getHour() * 60) + endTime.getMinute();

            // total min worked
            int totalMin = endMin - startMin;

            // convert min to hours
            hoursWorked += totalMin / 60.0;
            isPunchedIn = false;
        } else {
            System.out.println("Punch in, try again");
        }

    }
}
