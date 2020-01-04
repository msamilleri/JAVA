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
public class Davali extends Davaci {

    private String davaliniAdi;
    private String davalininSoyadi;
    private long davalininTcNo;
    private String mesaj;

    public Davali() {

    }

    Scanner scan = new Scanner(System.in);

    public void DavaliBilgileri() {
        System.out.print("davalinin adi =");
        this.davaliniAdi = scan.next();
        System.out.print("davalinin soyadi =");
        this.davalininSoyadi = scan.next();
        System.out.print("davalinin tc no ");
        this.davalininTcNo = scan.nextLong();

    }

    /**
     * @return the davaliniAdi
     */
    public String getDavaliniAdi() {
        return davaliniAdi;
    }

    /**
     * @param davaliniAdi the davaliniAdi to set
     */
    public void setDavaliniAdi(String davaliniAdi) {
        this.davaliniAdi = davaliniAdi;
    }

    /**
     * @return the davalininSoyadi
     */
    public String getDavalininSoyadi() {
        return davalininSoyadi;
    }

    /**
     * @param davalininSoyadi the davalininSoyadi to set
     */
    public void setDavalininSoyadi(String davalininSoyadi) {
        this.davalininSoyadi = davalininSoyadi;
    }

    /**
     * @return the davalininTcNo
     */
    public long getDavalininTcNo() {
        return davalininTcNo;
    }

    /**
     * @param davalininTcNo the davalininTcNo to set
     */
    public void setDavalininTcNo(long davalininTcNo) {
        this.davalininTcNo = davalininTcNo;
    }

}
