/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1projev2;

import java.util.ArrayList;

/**
 *
 * @author MUSTAFA
 */
public class Mahkeme extends Dava {

    static ArrayList<Dava> davalar = new ArrayList<>();

    public void davaEkle(Dava d) {
        davalar.add(d);
    }

    public void davaSil(Dava d) {
        davalar.remove(d);
    }

    public void davalariGoster() {
        System.out.println("FSMVU 1.bölge adliyesinde bulanan bütün davalar ");

        for (Dava i : davalar) {
            if (i.getDavaSebei() == null) {
                System.out.println("Mahkemede dava yok");

            } else {
                System.out.println("Davanın Sebei : " + i.getDavaSebei() + " " + "Dava no :" + i.getDavaNo() + " " + "Davanın Durumu :" + i.getDavaDurumu() + " " + " Davanın Süresi(ay) :" + i.getDavaSuresi());
                System.out.println("***********************");

            }
        }
    }

    public void kacTaneDavaVar() {
        System.out.println("FSMVU ADLİESİNDE BULUNAN TOPLAM DAVA : " + davalar.size());
    }

}
