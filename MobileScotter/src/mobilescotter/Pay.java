/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescotter;

import java.util.ArrayList;

/**
 *
 * @author mustafasamil.ileri
 */
public class Pay  extends Client{
    private String CardOwn;
    private String cardType;
    private String cardno;
    private int lastYear;
    ArrayList<Pay>pay=new ArrayList<Pay>();
    public Pay(String CardOwn, String cardType, String cardno, int lastYear) {
        this.CardOwn = CardOwn;
        this.cardType = cardType;
        this.cardno = cardno;
        this.lastYear = lastYear;
    }
    public Pay() {
    }
  public void addPay(Pay p){
      pay.add(p);
  }
  public void showPay(){
      for(Pay py: pay){
          System.out.println("Card Owner :"+py.getCardOwn()+"\nCard Type :"+py.cardType+"\nCard No :"+py.cardno+"\nLast year :"+py.lastYear);
          
      }
  }
public boolean chechTheCard(){
    if(this.lastYear<2021){
        System.out.println("Change your card please.");
        return false;
    }else{
        return true;
    }
}
    

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    

    public int getLastYear() {
        return lastYear;
    }

    public void setLastYear(int lastYear) {
        this.lastYear = lastYear;
    }
    
    public String getCardOwn() {
        return CardOwn;
    }

    public void setCardOwn(String CardOwn) {
        this.CardOwn = CardOwn;
    }
    
}
