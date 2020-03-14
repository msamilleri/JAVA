/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author MUSTAFA
 */
public class client  {
    private String customerName;
    private int accountNum;
    private double dolarBalance;
    private double euroBalance;
    private double tlBalance;

    public client(String customerName, int accountNum, double dolarBalance, double euroBalance, double tlBalance) {
        this.customerName = customerName;
        this.accountNum = accountNum;
        this.dolarBalance = dolarBalance;
        this.euroBalance = euroBalance;
        this.tlBalance = tlBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getDolarBalance() {
        return dolarBalance;
    }

    public void setDolarBalance(double dolarBalance) {
        this.dolarBalance = dolarBalance;
    }

    public double getEuroBalance() {
        return euroBalance;
    }

    public void setEuroBalance(double euroBalance) {
        this.euroBalance = euroBalance;
    }

    public double getTlBalance() {
        return tlBalance;
    }

    public void setTlBalance(double tlBalance) {
        this.tlBalance = tlBalance;
    }
    
     
}
