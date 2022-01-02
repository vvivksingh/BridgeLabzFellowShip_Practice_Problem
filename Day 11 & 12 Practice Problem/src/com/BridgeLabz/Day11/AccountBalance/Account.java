package com.BridgeLabz.Day11.AccountBalance;

import java.util.Scanner;

public class Account extends AccountBalance {
    public void credit(double credit_amt){
        double prev_amt = super.getAcc_bal();
        double new_amt = prev_amt + credit_amt;
        super.setAcc_bal(new_amt);
        //System.out.println(super.setAcc_bal()); //super.getAcc_bal();
    }
    public void debit(double debit_amt){
        // compare the amount present in the account with the amount to be debited
        if (super.getAcc_bal() >= debit_amt){
            double remg_amt = super.getAcc_bal() - debit_amt;
            super.setAcc_bal(remg_amt);
            System.out.println("The new balance = "+super.getAcc_bal());
        } else if (super.getAcc_bal() < debit_amt){
            System.out.println("Debit amount exceeded account balance!");
        }
        //super.getAcc_bal();
    }

    public static void main(String []args){
        Account acc = new Account();
        acc.credit(1000);
        acc.debit(500);
    }
}
