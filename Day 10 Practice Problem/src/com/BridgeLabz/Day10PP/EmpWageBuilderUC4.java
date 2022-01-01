package com.BridgeLabz.Day10PP;
public class EmpWageBuilderUC4 {
    public static final int IS_FULL_TIME =1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHours = 0;
        int empWage = 0;
        //Checking if present or not
        int empCheck = (int)Math.floor(Math.random()*10) % 3;
        switch (empCheck){
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
        empWage = empHours*EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage : "+ empWage);

    }
}



