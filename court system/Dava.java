/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1projev2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MUSTAFA
 */
public class Dava {

    private String davaSebei;
    private String davaDurumu;
    private int davaSuresi;
    private int davaNo;

    Scanner scan = new Scanner(System.in);
    ArrayList<Davaci> davacilar = new ArrayList<Davaci>();

    ArrayList<Davali> davalilar = new ArrayList<Davali>();
    int k = davalilar.size();
    String[] mesajlar = new String[10];

    public Dava() {
    }

    public String getDavaSebei() {
        return davaSebei;
    }

    public void setDavaSebei(String davaSebei) {
        this.davaSebei = davaSebei;
    }

    public void davaBilgileriGir() {
        System.out.println("Davanın sebebi =");
        this.davaSebei = scan.next();
        System.out.print("davanın Durumu =");
        this.davaDurumu = scan.next();
        System.out.print("Davanın Suresi =");
        this.davaSuresi = scan.nextInt();
        System.out.print("Dava no =");
        this.davaNo = scan.nextInt();

    }

    public Dava(String davaDurumu, int davaSuresi, int davaNo) {
        this.davaDurumu = davaDurumu;
        this.davaSuresi = davaSuresi;
        this.davaNo = davaNo;
    }

    public void DavaAc(Davaci d1, Davali d2) {
        davacilar.add(d1);
        davalilar.add(d2);

    }

    public void davacilariGoster() {
        for (Davaci i : davacilar) {
            System.out.println("Davacinin adi : " + i.getAd() + " " + "Davacini soyadi : " + i.getSoyad() + " " + "Davacini tc no : " + i.getTcNo());

        }
    }

    public void davalilariGoster() {
        for (Davali j : davalilar) {
            System.out.println("Davalinin adi : " + j.getDavaliniAdi() + " " + "Davalini soyadi : " + j.getDavalininSoyadi() + " " + "Davalinin tc no : " + j.getDavalininTcNo());

        }
    }

    public void davaliyaMesajGonder(Davali d2) {

        String a = scan.next();
        System.out.println(" davaliya giden mesaj");
        for (Davali i : davalilar) {
            if (i.getDavalininTcNo() == d2.getDavalininTcNo()) {
                for (int j = 0; j < mesajlar.length; j++) {
                    if (mesajlar[j] == null) {
                        mesajlar[j] = a;
                    } else {
                        System.out.println("hafıza da yer yok");
                    }
                }
            }

        }

        System.out.println("Mesajınız :" + a + ".Gönderilmiştir");
    }

    public void mesajiGoster(Davali d2) {

        for (int j = 0; j < mesajlar.length; j++) {
            if (mesajlar[j] == null) {
                System.out.println("sistemde mesaj bulunmamaktadır");
                break;
            }
        }

        for (Davali i : davalilar) {
            for (int j = 0; j < mesajlar.length; j++) {
                if (i.getDavalininTcNo() == d2.getDavalininTcNo()) {
                    System.out.println(mesajlar[j]);
                    break;
                }

            }

        }

    }

    public String getDavaDurumu() {
        return davaDurumu;
    }

    public void setDavaDurumu(String davaDurumu) {
        this.davaDurumu = davaDurumu;
    }

    public int getDavaSuresi() {
        return davaSuresi;
    }

    public void setDavaSuresi(int davaSuresi) {
        this.davaSuresi = davaSuresi;
    }

    public int getDavaNo() {
        return davaNo;
    }

    public void setDavaNo(int davaNo) {
        this.davaNo = davaNo;
    }

    public ArrayList<Davaci> getDavacilar() {
        return davacilar;
    }

    public void setDavacilar(ArrayList<Davaci> davacilar) {
        this.davacilar = davacilar;
    }

    public ArrayList<Davali> getDavalilar() {
        return davalilar;
    }

    public void setDavalilar(ArrayList<Davali> davalilar) {
        this.davalilar = davalilar;
    }

}
