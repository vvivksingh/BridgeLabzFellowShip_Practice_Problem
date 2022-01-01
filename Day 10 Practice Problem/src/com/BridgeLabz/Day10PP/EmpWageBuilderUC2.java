package com.BridgeLabz.Day10PP;

public class EmpWageBuilderUC2 {
    public static void main(String[] args) {
        int IS_FULL_TIME =1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        //Checking if present or not
        double empCheck = Math.floor(Math.random()*10) % 2;
        if (empCheck == IS_FULL_TIME){
            empHours = 8;
            System.out.println("Employee is Present");
        }
        else{
            empHours = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHours*EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : "+ empWage);

    }
}
