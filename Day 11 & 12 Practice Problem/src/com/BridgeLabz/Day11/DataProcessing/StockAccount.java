package com.BridgeLabz.Day11.DataProcessing;

import java.util.ArrayList;

public class StockAccount extends CompanyShares implements CustomerAccountData {



    /*
    Function1:Create a new account from file
    */
    @Override
    public void stockAccount(String stock_name,int stock_nos, double stock_val )
    {
        // Add stock name
        ArrayList <String> temp_stock_symb_arr = super.getStock_symbol();
        temp_stock_symb_arr.add(stock_name);
        super.setStock_symbol(temp_stock_symb_arr);

        // Add number of stocks
        ArrayList <Integer> temp_stock_num_arr = super.getStock_nos();
        temp_stock_num_arr.add(stock_nos);
        super.setStock_nos(temp_stock_num_arr);

        // Add stock value
        ArrayList <Double> temp_stock_val_arr = super.getStock_val();
        temp_stock_val_arr.add(stock_val);
        super.setStock_val(temp_stock_val_arr);
    }
    /*
    Function2:    Compute total value of all the stocks
    */
    @Override
    public double valueOf()  // total value of account dollars
    {   double val_stock = 0.0;
        for (int i=0;i<super.getStock_val().size();i++){
            val_stock +=(double) super.getStock_val().get(i);
        }
        System.out.println("The total value of all the stocks in account = "+ val_stock);
        return val_stock;
    }
    /*
    Function3:    Add shares of stock from account
    */

    @Override
    public void buy(int amount,double value, String symbol) // add shares of stock to account
    {   int indx = -1;
        // find the stock in stock symbol arraylist
        for (int i=0;i<super.getStock_symbol().size();i++){
            if (symbol.equals(super.getStock_symbol().get(i))){
                indx = i;
                break;
            }
        }
        if (indx==-1){
            System.out.println("You don't have any shares of this company at present.");
            //super.setStock_symbol((super.getStock_symbol().add(symbol)));
        }
        int new_stock_nos = amount +(int) super.getStock_nos().get(indx);
        double new_stock_val = value + (double) super.getStock_val().get(indx);
        // update number of stocks
        ArrayList <Integer> temp_stok_nos_arr = super.getStock_nos();
        temp_stok_nos_arr.set(indx, new_stock_nos);
        super.setStock_nos(temp_stok_nos_arr);

        // update value of stocks
        ArrayList <Double> temp_stok_val_arr = super.getStock_val();
        temp_stok_val_arr.set(indx, new_stock_val);
        super.setStock_val(temp_stok_val_arr);
        System.out.println("The shares have been added successfully");
    }

    /*
    Function4: subtract shares of stock from account
    */
    @Override
    public void sell(int amount,double value, String symbol)
    {   int indx = -1, stocks_nos =-1;
        // find the stock in stock symbol arraylist
        for (int i=0;i<super.getStock_symbol().size();i++){
            if (symbol.equals(super.getStock_symbol().get(i))){
                indx = i;
                stocks_nos = (int) super.getStock_nos().get(indx);
                break;
            }
        }
        if (indx==-1){
            System.out.println("Sorry , You dont own any shares of this company");
        }
        else if (stocks_nos<amount){
            System.out.println("Sorry, You dont have enough shares of this company");
        }
        else if (stocks_nos>amount){
            int new_stock_nos = (int) super.getStock_nos().get(indx) - amount;
            double new_stock_val = (double) super.getStock_val().get(indx) - value;

            // update no of stocks
            ArrayList <Integer> temp_stok_nos_arr = super.getStock_nos();
            temp_stok_nos_arr.set(indx, new_stock_nos);
            super.setStock_nos(temp_stok_nos_arr);

            //update value of the stocks
            ArrayList <Double> temp_stok_val_arr = super.getStock_val();
            temp_stok_val_arr.set(indx, new_stock_val);
            super.setStock_val(temp_stok_val_arr);
            System.out.println("The shares have been subtracted successfully");
        }
    }
    /*
    Function 5: Save account to file
    */
    @Override
    public void save(String filename)
    {
        System.out.println("To be understood");
    }
    /*
    Function 6: Print a detailed report of stocks, numbers and values
    */
    @Override
    public void printreport()
    {
        System.out.println("Stockname-------StockNumbers--------StockValue");
        for (int i=0;i<super.getStock_symbol().size();i++){
            System.out.println(super.getStock_symbol().get(i) +"------------"
                    + super.getStock_nos().get(i)+ "------------"
                    + super.getStock_val().get(i));
        }
    }
    public static void main(String []args){
        StockAccount sa = new StockAccount();
        sa.stockAccount("Infosys",23,3400);
        sa.valueOf();
        sa.buy(1, 100, "Infosys");
        sa.valueOf();
        sa.sell(10, 500, "Infosys");
        sa.valueOf();
    }
}