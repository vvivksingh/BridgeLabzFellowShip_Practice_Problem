package com.BridgeLabz.Day10PP;
 // use case 11 implemented
public interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int empRatePerhour,
                                   int numOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);

}

