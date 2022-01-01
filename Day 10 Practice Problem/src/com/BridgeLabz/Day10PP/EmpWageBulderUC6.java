package com.BridgeLabz.Day10PP;

public class EmpWageBulderUC6 {
    public static final int IS_FULL_TIME =1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {

        int empHours = 0;
        int total_empHrs = 0;
        int totalWorkingDay = 0;

            while (total_empHrs <= MAX_WORKING_HOURS_IN_MONTH && totalWorkingDay < NO_OF_WORKING_DAYS) {
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
        int total_empWage = total_empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage : "+ total_empWage);
        System.out.println("Total Employee Hours : "+ total_empHrs);
        System.out.println("Total Working Days : "+ totalWorkingDay);
    }
}

