package com.example.mesima7.Q1;

public class Salesperson extends Employee implements BonusEligible{

    double salesCommission;
    double totalSales;

    public Salesperson(int employeeId, double baseSalary, String name,double salesCommission,  double totalSales ) {
        super(baseSalary, name, employeeId);
        this.salesCommission = salesCommission;
        this.totalSales = totalSales;
    }


    @Override
    public double calculateMonthlySalary(){
        return baseSalary + (totalSales * salesCommission);
    }
    @Override
    public double calculateBonus(){
        return (totalSales * 0.05 ) ;

    }
}
