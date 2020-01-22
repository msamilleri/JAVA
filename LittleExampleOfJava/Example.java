/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samildeney;

import java.util.Scanner;

/**
 *
 * @author MUSTAFA
 */
public class Example {
    //FİND factorial NUMBER
   public static int faktrtelHesap(int b){
        int fak=1;
        while(b>0){
            fak*=b;
            b--;
        }
        return fak;
        //System.out.println(fak);
    }
   public static void primeNumber(int b){
       for (int i = 2; i <b; i++) {
           if(b/i==0){
               System.out.println("asal değil");
               break;
           }else{
               System.out.println("asal");
           break;
           }
       }
       if(b==2){
           System.out.println("en kucuk asal ");
       }
       
       
   }
   
   public static int ustHesaplama(int sayi,int kuvvet){
       int sonuc=1;
       for (int i = 1; i <=kuvvet; i++) {
           sonuc*=sayi;
           
       }
       return sonuc;
   }
   public static int basamakHesaplama(int b){
       int sayac=0;
       while(b!=0){
           sayac++;
           b/=10;
       }
       return sayac;
   }
   public static char createPasswordChar(char a,char b){
       return (char)(a+(Math.random()*(b-a)));
       
   }
   public static int creatPasswordInt(int x,int y){
       return (int)(x+(Math.random()*(y-x)));
       
   }
   
   public static void passWord(){
       String password=" ";
       for (int i = 0; i < 10; i++) {
           if(i%2==0){
               password+=createPasswordChar('A', 'Z');
           }else{
               password+=creatPasswordInt(1,100);
           }
           
       }
       System.out.println(password);
   }
   public static int TransisNumber(int year){
       int yeras=year-2000;
       int mounth=yeras*12;
       int howMonth=mounth/18;
       int trasnsis=42;
       for (int i = 0; i < howMonth; i++) {
           trasnsis*=2;
       }
       System.out.println(trasnsis);
       return trasnsis;
   }
    public static void main(String[] args) {
        faktrtelHesap(5);
        System.out.println("-----------------");
        primeNumber(2);
        System.out.println(ustHesaplama(3, 2));
        System.out.println(basamakHesaplama(789));
        System.out.println("-------------------**********------");
        for (int i = 1; i < 6; i++) {
            for (int j =1; j <6-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    passWord();
    
        TransisNumber(2019);
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j <=i; j++) {
                if(i==j){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        Scanner scan=new Scanner (System.in);
        int a=scan.nextInt();
        int temp=a;
        int sonuc=0;
        while(temp>0){
            int b=temp%10;
            sonuc+=faktrtelHesap(b);
            temp/=10;
        }
        if(a==sonuc){
            System.out.println("strig sayi");
        }else{
            System.out.println("nothing");
        }
    }
    
}
