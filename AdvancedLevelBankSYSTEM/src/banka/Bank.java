/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MUSTAFA
 */
public class Bank {

    private String bankName;
    private String bankAdd;
    private int maxCustomerNum;
   // private client customers[] = new client[100];
    private double dolarExchgangeRate;
    private double euroExchgangeRate;
    private double tlExchgangeRate;
    private int actifCustmerNum;
 private ArrayList<client>custemers=new ArrayList<>();
 
    public Bank(String bankName, String bankAdd, int maxCustomerNum,  double dolarExchgangeRate, double euroExchgangeRate, double tlExchgangeRate, int actifCustmerNum) {
        this.bankName = bankName;
        this.bankAdd = bankAdd;
        this.maxCustomerNum = maxCustomerNum;
     
        this.dolarExchgangeRate = dolarExchgangeRate;
        this.euroExchgangeRate = euroExchgangeRate;
        this.tlExchgangeRate = tlExchgangeRate;
        this.actifCustmerNum = actifCustmerNum;
    }

    public ArrayList<client> getCustemers() {
        return custemers;
    }

    public void setCustemers(ArrayList<client> custemers) {
        this.custemers = custemers;
    }
  
  

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAdd() {
        return bankAdd;
    }

    public void setBankAdd(String bankAdd) {
        this.bankAdd = bankAdd;
    }

    public int getMaxCustomerNum() {
        return maxCustomerNum;
    }

    public void setMaxCustomerNum(int maxCustomerNum) {
        this.maxCustomerNum = maxCustomerNum;
    }

   
    public double getDolarExchgangeRate() {
        return dolarExchgangeRate;
    }

    public void setDolarExchgangeRate(double dolarExchgangeRate) {
        this.dolarExchgangeRate = dolarExchgangeRate;
    }

    public double getEuroExchgangeRate() {
        return euroExchgangeRate;
    }

    public void setEuroExchgangeRate(double euroExchgangeRate) {
        this.euroExchgangeRate = euroExchgangeRate;
    }

    public double getTlExchgangeRate() {
        return tlExchgangeRate;
    }

    public void setTlExchgangeRate(double tlExchgangeRate) {
        this.tlExchgangeRate = tlExchgangeRate;
    }

    public int getActifCustmerNum() {
        return actifCustmerNum;
    }

    public void setActifCustmerNum(int actifCustmerNum) {
        this.actifCustmerNum = actifCustmerNum;
    }
    public void addNewCustomer(client c1){
        custemers.add(c1);
        
    }

    public void tlMoneySent(client c1, client c2, double miktar) {
        /*this code type is another solution of this problem
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getAccountNum() == c1.getAccountNum()) {

                c1.setTlBalance(c1.getTlBalance() - miktar);

            }
            if (customers[i].getAccountNum() == c2.getAccountNum()) {

                c2.setTlBalance(c2.getTlBalance() + miktar);
            }

        }*/
        for (int i = 0; i < custemers.size(); i++) {
            if(custemers.get(i).getAccountNum()==c1.getAccountNum()){
                c1.setTlBalance(c1.getTlBalance()-miktar);
            }
            if(custemers.get(i).getAccountNum()==c2.getAccountNum()){
                c1.setTlBalance(c2.getTlBalance()+miktar);
            }
        }
       
    
    }
public void euroMoneytSent(client c1, client c2,double miktar){
    for (int i = 0; i <custemers.size(); i++) {
         if(custemers.get(i).getAccountNum()==c1.getAccountNum()){
                c1.setTlBalance(c1.getEuroBalance()-miktar);
            }
            if(custemers.get(i).getAccountNum()==c2.getAccountNum()){
                c1.setTlBalance(c2.getEuroBalance()+miktar);
            }
        }   
    }
    

public void dollarMonettSent(client c1, client c2,double miktar){
    for (int i = 0; i < custemers.size(); i++) {
          if(custemers.get(i).getAccountNum()==c1.getAccountNum()){
                c1.setTlBalance(c1.getDolarBalance()-miktar);
            }
            if(custemers.get(i).getAccountNum()==c2.getAccountNum()){
                c1.setTlBalance(c2.getDolarBalance()+miktar);
            }
    }
    
}
    public void excahngeMoneyDollarToTL(client c1,double miktar ) {
        for (int i = 0; i < custemers.size(); i++) {
            if(custemers.get(i).getAccountNum()==c1.getAccountNum()){
        
                c1.setTlBalance(c1.getDolarBalance()+(dolarExchgangeRate*miktar));
                c1.setDolarBalance(c1.getDolarBalance()-miktar);
            }

    }
        
    }
    public void excahngeMoneyEuroToTL(client c1,double miktar ) {
        for (int i = 0; i < custemers.size(); i++) {
            if(custemers.get(i).getAccountNum()==c1.getAccountNum()){
        
                c1.setTlBalance(c1.getTlBalance()+(this.euroExchgangeRate*miktar));
            c1.setEuroBalance(c1.getEuroBalance()-miktar);
            }

    }
        
    }
    public void printfAllCoustomer() {
        for (int i = 0; i <custemers.size(); i++) {
            System.out.println("name:"+custemers.get(i).getCustomerName()+" "+"account number:"+custemers.get(i).getAccountNum()+" "+" tl :"+custemers.get(i).getTlBalance()+" Dollar :"+custemers.get(i).getDolarBalance()+" euro :"+custemers.get(i).getEuroBalance());
        }
    }
public void showMyCustomer(client c1){
  for (int i = 0; i <custemers.size(); i++) {
      if(custemers.get(i).getAccountNum()==c1.getAccountNum()){      
      System.out.println("name:"+c1.getCustomerName()+" "+"account number:"+c1.getAccountNum()+" "+" tl :"+c1.getTlBalance()+" Dollar :"+c1.getDolarBalance()+" euro :"+c1.getEuroBalance());
        } 
}
}
}
