package com.BridgeLabz.Day10PP;
import java.util.*;

import java.util.LinkedList;

public class EmpWageBuilder implements IComputeEmpWage{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWagesList;
    private Map<String,CompanyEmpWage> companyToEmpWageMap;

    public EmpWageBuilder(){
        companyEmpWagesList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }
    public void addCompanyEmpWage(String company, int empRatePerhour,
                                   int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerhour, numOfWorkingDays, maxHoursPerMonth);

        companyEmpWagesList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
    public void computeEmpWage(){
        for (int i = 0; i < companyEmpWagesList.size(); i++){
            CompanyEmpWage companyEmpWage = companyEmpWagesList.get(i);
            companyEmpWage.setTotalEmpwage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    @Override
    public int getTotalWage(String company){
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    public static void main(String[] args) {
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("BridgeLabz", 25, 20, 80);
        empWageBuilder.addCompanyEmpWage("MasterCard", 30, 22, 100);
        empWageBuilder.computeEmpWage();
    }
}
