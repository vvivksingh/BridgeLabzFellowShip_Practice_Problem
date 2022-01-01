package com.BridgeLabz.Day10PP;

import sun.corba.Bridge;

public class EmpWageBuilderUC8 {
    public static final int IS_FULL_TIME =1;
    public static final int IS_PART_TIME = 2;

    public static int calculateWageForCompany(String company, int empRatePerHour, int noOfWorkingDays,
                                    int maxWorkingHourPerMonth) {
        int empHours = 0;
        int total_empHrs = 0;
        int totalWorkingDay = 0;

        while (total_empHrs <= maxWorkingHourPerMonth && totalWorkingDay < noOfWorkingDays) {
            totalWorkingDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    System.out.println("Employee is Present");
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    empHours = 4;
                    break;
                default:
                    empHours = 0;

                    System.out.println("Employee is Absent");
            }
            total_empHrs += empHours;
        }
        int total_empWage = total_empHrs * empRatePerHour;
        System.out.println("Total employe wage for "+ company +" is "+ total_empWage);
        return total_empWage;
    }

    public static void main(String[] args) {
        calculateWageForCompany("BridgeLabz",15,20,80);
        calculateWageForCompany("Mastercard",125,18,100);
    }
}
