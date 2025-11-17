package com.example.mesima7.Q1;

public class HourlyEmployee extends Employee {

    double hoursWorked;

    double hourlyRate;

    public HourlyEmployee(int employeeId, double baseSalary, String name, double hourlyRate, double hoursWorked) {
        super(baseSalary, name,  employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }


    @Override
    public  double calculateMonthlySalary(){
        return hoursWorked * hourlyRate;

    }

}

