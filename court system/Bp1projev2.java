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
public class Bp1projev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatih Sultan Mehmet Vakıf Üniversitesi Adliye Programı");
        Mahkeme m2 = new Mahkeme();
        Dava dava1 = new Dava();
        Davaci d1 = new Davaci();
        Davali d2 = new Davali();
        while (true) {

            System.out.println("Dava acmak icin (1)\nDava hakkında bilgi almak için (2)\nDava Silmek icin (3)\nDavalıya Mesaj göndermek için (4)\nMahkemede bulunan dava Sayisi için(5)\nDavalıya giden mesajı görmek için (6)");
            int input = scan.nextInt();
            if (input == 1) {

                System.out.println("Davacini adi soyadi ve tc no giriniz");
                d1.DavaciBilgileri();

                System.out.println("Davaclini adi soyadi ve tc no giriniz");
                d2.DavaliBilgileri();

                dava1.davaBilgileriGir();
                dava1.DavaAc(d1, d2);
                //Mahkeme m2 = new Mahkeme();
                m2.davaEkle(dava1);

                dava1.davacilariGoster();
                dava1.davalilariGoster();
                m2.davalilariGoster();

            }

            if (input == 2) {

//Davaci d1 = new Davaci();
                //d1.DavaciBilgileri();
                //Davali d2 = new Davali();
                //d2.DavaliBilgileri();
                //Dava dava1 = new Dava();
                //dava1.davaBilgileriGir();
                //dava1.DavaAc(d1, d2);
                //Mahkeme m2 = new Mahkeme();
                //m2.davaEkle(dava1);
                m2.davalariGoster();

            }
            if (input == 3) {

                m2.davaSil(dava1);

            }
            if (input == 4) {
                System.out.println(" lutfen mesaj gondermke istediğiniz davalinin adını soyadını ve tc no giriniz");

                d2.DavaliBilgileri();
                dava1.davaliyaMesajGonder(d2);

            }
            if (input == 5) {

                m2.kacTaneDavaVar();
            }
            if (input == 6) {

                dava1.mesajiGoster(d2);

            }
        }

    }
}
