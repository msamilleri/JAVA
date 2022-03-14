/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mustafasamil.ileri
 */
public class Person extends Admin{

    private String name;
    private String surname;
    private String country;
    private String city;
    private String state;
    private int ptzpcode;
    private String address;
    private String categoriy;
    
    //Person sınınfının constrcutor 
     public Person( String username, String password,String name, String surname) {
        super(username, password);
        this.name = name;
        this.surname = surname;
        
    }
//Person sınınfının boş constrcutor 
    public Person() {
        super(null, null);
    }
     
       
   //Person sınınfının 3 constrcutor 
    //ayrıca burada 2 defa overload yapılmıştır
       public Person(String name, String surname, String country, String city, String state, int ptzpcode, String address, String categoriy) {
        super(null, null);
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.state = state;
        this.ptzpcode = ptzpcode;
        this.address = address;
        this.categoriy = categoriy;
    }
       
       
       
    
//iligli nesneler için get set değerleri
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPtzpcode() {
        return ptzpcode;
    }

    public void setPtzpcode(int ptzpcode) {
        this.ptzpcode = ptzpcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategoriy() {
        return categoriy;
    }

    public void setCategoriy(String categoriy) {
        this.categoriy = categoriy;
    }
    
    
    
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



  
}
