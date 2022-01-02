package com.BridgeLabz.Day10.EmpWage;

public class EmpWageBuilderUC3 {
    public static void main(String[] args) {
        int IS_FULL_TIME =1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        //Checking if present or not
        double empCheck = Math.floor(Math.random()*10) % 3;
        if (empCheck == IS_FULL_TIME){
            empHours = 8;
            System.out.println("Employee is Present");
        }
        else if(empCheck == IS_PART_TIME) {
            System.out.println("Employee is Part Time");
            empHours = 4;
        }
        else{
            empHours = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHours*EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : "+ empWage);

    }
}
