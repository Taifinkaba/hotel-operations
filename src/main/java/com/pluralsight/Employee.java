package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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
}
