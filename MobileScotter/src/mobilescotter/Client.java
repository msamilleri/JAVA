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
public class Client {
    private String Name;
    private String Surname;
    private String phoneNumber;
    private String personelEmail;
    private  int birthYear;
    ArrayList<Client>client=new ArrayList<Client>();
    public Client(String Name, String Surname, String phoneNumber, String personelEmail, int birthYear) {
        this.Name = Name;
        this.Surname = Surname;
        this.phoneNumber = phoneNumber;
        this.personelEmail = personelEmail;
        this.birthYear = birthYear;
    }

    public Client() {
    }
    public void clientAdd(Client c){
        client.add(c);
    }
    public void showClient(){
        for (Client show:client) {
            System.out.println("Name  :"+show.getName()+"\nSuraname :"+show.getSurname()+"\nPersone Mail :"+show.personelEmail+"\nBirth Year :"+show.getBirthYear());
            
        }
    }
    
    public boolean chechAge(){
        
        if(2021-this.birthYear<18){
            System.out.println(" You under 18 !!! ,you cant usee SHAMIL BIKE");
        return false;
        }else{
            
        return true;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonelEmail() {
        return personelEmail;
    }

    public void setPersonelEmail(String personelEmail) {
        this.personelEmail = personelEmail;
    }

    public int getBirthYear() {
      
            return birthYear;
    
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    
}
