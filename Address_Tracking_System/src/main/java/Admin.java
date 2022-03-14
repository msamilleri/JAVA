/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mustafasamil.ileri
 */
public class Admin {
   
    private String username ;
    private String password ;
   
//Admin sınınıfn contrcutoru
    public Admin( String username, String password) {
       
        this.username = username;
        this.password = password;
      
    }
//iligli ddeğerler için get ve set methodları
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    
   
    
    
}
