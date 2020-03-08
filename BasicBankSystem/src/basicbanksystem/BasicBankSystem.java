/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbanksystem;

/**
 *
 * @author MUSTAFA
 */
public class BasicBankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank b1=new bank("ayse", "ertas", 1, 100, 100, 1000, 5, 6);
        bank b2=new bank("samil", "ileri", 2, 100, 100, 1000, 5, 6);
        b1.musterekle(b1, b2);
        b1.dollartolTl(b1, 20);
        b1.eurotoTl(b1, 20);
        
        System.out.println(b1.muusteriAd+"yeni tl tutarı"+b1.tl);
        System.out.println(b2.muusteriAd+"yeni tl tutarı"+b2.tl+" "+b2.euro);
        
//System.out.println("samilin parası"+b2.tl);
        
    }
    
}
