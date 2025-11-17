package com.example.mesima7.Q1;

public class Manager extends Employee implements BonusEligible{

    String department;

    double managementBonusPercentage;

    public Manager(int employeeId, double baseSalary, String name, String department,double managementBonusPercentage ) {
        super(baseSalary, name, employeeId);
        this.department = department;
        this.managementBonusPercentage = managementBonusPercentage;
    }

    @Override
    public double calculateMonthlySalary(){
        return baseSalary;
    }
    @Override
    public double calculateBonus(){
        return baseSalary * managementBonusPercentage;

    }


    @Override
    public String toString() {

        return (super.toString()  + ", Department: " + department);
    }





}


