package com.example.mesima7.Q1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> allEmployees = new ArrayList<>();


        allEmployees.add(new Manager(1, 5000, "Gili", "Marketing", 0.20));

        allEmployees.add(new HourlyEmployee(2, 0, "Shelly", 30, 100));
        allEmployees.add(new Salesperson(3, 3500, "Darya", 0.10, 20));
        allEmployees.add(new HourlyEmployee(4, 0, "Albert", 20, 50));
        allEmployees.add(new Salesperson(5, 4000, "Noa", 0.05, 15000));


        for (Employee employee : allEmployees) {
            System.out.println(employee.toString());

            System.out.println("Employee Monthly salary is: " + employee.calculateMonthlySalary());

        }


        double totalBonuses = 0;

        for (Employee employee : allEmployees) {

            if (employee instanceof BonusEligible) {

                BonusEligible bonus = (BonusEligible) employee;
                totalBonuses += bonus.calculateBonus();
            }
        }

        System.out.println("Employee Total bonuses are: " + totalBonuses);


    }



}