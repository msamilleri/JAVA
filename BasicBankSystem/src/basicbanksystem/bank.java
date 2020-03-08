/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbanksystem;

import java.util.ArrayList;

/**
 *
 * @author MUSTAFA
 */
public class bank {
   String muusteriAd;
   String muusteriSoyAd;
   long musteriN0;
   double dollar;
   double euro;
   double tl;
   double dolarkur;
   double eurokur;
   
 
    ArrayList<bank>musteri=new ArrayList<>();
    

    public bank(String muusteriAd, String muusteriSoyAd, long musteriN0, double dollar, double euro, double tl, double dolarkur, double eurokur) {
        this.muusteriAd = muusteriAd;
        this.muusteriSoyAd = muusteriSoyAd;
        this.musteriN0 = musteriN0;
        this.dollar = dollar;
        this.euro = euro;
        this.tl = tl;
        this.dolarkur = dolarkur;
        this.eurokur = eurokur;
    }

 public void musterekle(bank b1,bank b2){
     musteri.add(b1);
     musteri.add(b2);
     

 }
   public void tlgonder(bank b1,bank b2,int miktar){
       for (bank i: musteri) {
           if(i.musteriN0==b1.musteriN0){
               b1.tl-=miktar;
             b2.tl+=miktar;
               System.out.println("trasnfer gerçekleştirlidi");
           }
           
           
       }
       
       
   }
   public void eoruGonder(bank b1,bank b2,int miktar){
       for (bank i: musteri) {
           if(i.musteriN0==b1.musteriN0){
               b1.euro-=miktar;
             b2.euro+=miktar;
               System.out.println("trasnfer gerçekleştirlidi");
           } 
   }
    
    
    
}
   public void dollarGonder(bank b1,bank b2,int miktar){
       for (bank i: musteri) {
           if(i.musteriN0==b1.musteriN0){
               b1.dollar-=miktar;
             b2.dollar+=miktar;
               System.out.println("trasnfer gerçekleştirlidi");
           } 
   }
    
    
    
}
   public void dollartolTl(bank b1,double miktar){
       for (bank i: musteri) {
           if(i.musteriN0==b1.musteriN0){
             b1.tl+=miktar*dolarkur;
              b1.dollar-=miktar;
            
               System.out.println("toplam tutar"+b1.tl);
              
               
           } 
   }    
   }
   
   public void eurotoTl(bank b1,int miktar){
        for (bank i: musteri) {
           if(i.musteriN0==b1.musteriN0){
             b1.tl+=miktar*eurokur;
              b1.euro-=miktar;
            
               System.out.println("toplam tutar"+b1.tl);
              
               
           } 
   }    
     
   
}
}