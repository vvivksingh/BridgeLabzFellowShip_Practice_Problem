package com.BridgeLabz.Day10PP;

public class EmpWageBuilderObjectUC9 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxWorkingHoursPerMonth;
    private int totalEmpWage;

    public EmpWageBuilderObjectUC9(String company, int empRatePerHour, int numOfWorkingDays,
                             int maxWorkingHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxWorkingHoursPerMonth = maxWorkingHoursPerMonth;
    }
        public void computeWage() {
            int empHours = 0;
            int total_empHrs = 0;
            int totalWorkingDay = 0;

            while (total_empHrs <= maxWorkingHoursPerMonth && totalWorkingDay < numOfWorkingDays) {
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
            totalEmpWage = total_empHrs * empRatePerHour;
        }
        @Override
        public String toString() {
            return "Total Emp wage for company : " +company+ " is " + totalEmpWage;
        }
        public static void main (String[] args){
            EmpWageBuilderObjectUC9 bridgeLabz = new EmpWageBuilderObjectUC9("BridgeLabz", 20, 20, 100);
            EmpWageBuilderObjectUC9 masterCard = new EmpWageBuilderObjectUC9("MasterCard", 20, 20, 100);
            bridgeLabz.computeWage();
            System.out.println(bridgeLabz);
            masterCard.computeWage();
            System.out.println(masterCard);
        }
}

