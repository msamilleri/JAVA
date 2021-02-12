/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescotter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mustafasamil.ileri
 */
public class Functions {

    public Functions() {
    }
    
    
    public void rentaScotter(Client c) throws InterruptedException{
        System.out.println("Please wait we checek some information");
       
        long start = System.currentTimeMillis();
                        Thread.sleep(4000);
        if(c.chechAge()){
            
            System.out.println("Enjoy with  SHAMIl BIKE");
            
        }else{
            System.out.println("Sorry ..");
        }
    }
public void Add_Client(Client c,Pay p){
    Scanner scan=new Scanner (System.in);
    System.out.print("Name :");
    String name=scan.next();
    c.setName(name);
        System.out.print("Surname :");
        String Surname=scan.next();
        c.setSurname(Surname);
            System.out.print("Birth Year  :");
            int Birth_year=scan.nextInt();
            c.setBirthYear(Birth_year);
                System.out.print("Phone number :");
                String phone_number=scan.next();
                c.setPhoneNumber(phone_number);
                    System.out.print("Mail :");
                    String mail=scan.next();
                    c.setPersonelEmail(mail);
                    p.setCardOwn(name);
                   System.out.print("Card Type :");
                    String cardtype=scan.next();   
                      p.setCardType(cardtype);
                      System.out.print("Card No :");
                        String cardNo=scan.next();   
                         p.setCardno(cardNo);
                         System.out.print("Due To :");
                          int lastyear=scan.nextInt();   
                          p.setLastYear(lastyear);
                      
                      
}
  
   
    public String  passwordClient(){
        Random rndm=new Random();
        String password="";
        for (int i = 0; i < 4; i++) {
            password+=rndm.nextInt(10);
        }
        return password;
    }
    public void takePhoto(){
        
    }
    public boolean  endTheRent(){
        Scanner scan=new Scanner (System.in);
        System.out.println("Do you wanna finished the rent now?\nyes-no");
        String check=scan.next();
        if(check.equals("yes")){
            System.out.println("you have to take the bike's photo");
           return true;
            
        }
        return false;
    }
    public void payBill(Pay p){
        p.showPay();//ödeme 
         Scanner scan=new Scanner (System.in);
        if(p.chechTheCard()){
           //dakika başı 0,75 krş aciliş ücreti 1,99         }
           int time=scan.nextInt();
           double cost=(1.99)+(time*0.75);
            System.out.println("you bill"+cost);
    }
    }
        public void puchPay(){
            
        }
    }


