/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1projev2;

import java.util.Scanner;

/**
 *
 * @author MUSTAFA
 */
public class Davaci {
    private String ad;
    private String soyad;
    private long tcNo;
Scanner scan=new Scanner (System.in);
    public Davaci() {
    }

    public Davaci(String ad, String soyad, long tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
    }
    public void DavaciBilgileri(){
        System.out.print("davacinin adi=");
        this.ad=scan.next();
        System.out.print("davacinin soyadi=");
        this.soyad=scan.next();
        System.out.print("davacini tc=");
        this.tcNo=scan.nextLong();
        
    }
 

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the tcNo
     */
    public long getTcNo() {
        return tcNo;
    }

    /**
     * @param tcNo the tcNo to set
     */
    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }
    
    
    
    
    
}
