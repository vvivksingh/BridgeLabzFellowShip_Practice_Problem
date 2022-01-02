package com.BridgeLabz.Day10PP;

public class EmpWageBuilderArray {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWagesArray;

    public EmpWageBuilderArray() {
        companyEmpWagesArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerhour,
                                   int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWagesArray[numOfCompany] = new CompanyEmpWage(company, empRatePerhour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 1; i <= numOfCompany; i++) {
            companyEmpWagesArray[i].setTotalEmpwage(this.computeEmpWage(companyEmpWagesArray[i]));
            System.out.println(companyEmpWagesArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        //variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        return  totalEmpHrs * companyEmpWage.empRatePerHour;
    }
    public static void main (String[]args){
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("BridgeLabz", 25, 20, 80);
        empWageBuilder.addCompanyEmpWage("MasterCard", 30, 22, 100);
        empWageBuilder.computeEmpWage();
    }

}


