package com.BridgeLabz.Day10PP;

public class EmpWageBuilderUC5 {
    public static final int IS_FULL_TIME =1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {

        int empHours = 0;
        int empWage = 0;
        int total_empWage = 0;
        //Checking if present or not
        for(int day=1; day <=NO_OF_WORKING_DAYS; day++) {
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

            empWage = empHours * EMP_RATE_PER_HOUR;
            total_empWage += empWage;
            System.out.println("Employee Wage : " + empWage);
        }
        System.out.println("Total Employee Wage : "+ total_empWage);
    }
}
