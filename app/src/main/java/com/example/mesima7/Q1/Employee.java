package com.example.mesima7.Q1;

public abstract class  Employee {

    private int employeeId ;
    String name;

    double baseSalary;

    public Employee(double baseSalary, String name, int employeeId) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.employeeId = employeeId;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateMonthlySalary();


    @Override
    public String toString() {
        return ("Eployee ID is: " +" , Eployee name is: " + name + " , Base salary is:" +baseSalary);
    }


}
