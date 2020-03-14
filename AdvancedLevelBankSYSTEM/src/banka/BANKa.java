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
public class BANKa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        client c1 = new client("aysenur", 1721, 100, 100, 1000);
        client c2 = new client("şamil", 1722, 100, 100, 1000);
        Bank b1 = new Bank("aksam bank", "ss", 222, 6, 7, 0.98, 85);
        b1.addNewCustomer(c1);
        b1.addNewCustomer(c2);
        b1.showMyCustomer(c1);
        System.out.println("------------------");
        b1.showMyCustomer(c2);
        System.out.println("dollar rate :" + b1.getDolarExchgangeRate());
        System.out.println("euro rate :" + b1.getEuroExchgangeRate());

        b1.excahngeMoneyEuroToTL(c1, 50);
        b1.excahngeMoneyEuroToTL(c2, 50);
        b1.excahngeMoneyEuroToTL(c1, 35);
        b1.excahngeMoneyEuroToTL(c2, 14);
        System.out.println("new euro balance for " + c1.getCustomerName() + " :" + c1.getEuroBalance());
        System.out.println("new euro balance for " + c2.getCustomerName() + " :" + c2.getEuroBalance());
        System.out.println("new dollar balance for " + c1.getCustomerName() + " :" + c1.getDolarBalance());
        System.out.println("new dollar balance for " + c1.getCustomerName() + " :" + c1.getDolarBalance());
        b1.showMyCustomer(c1);
        b1.showMyCustomer(c2);
    }

}
