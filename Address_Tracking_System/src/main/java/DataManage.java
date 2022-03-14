
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mustafasamil.ileri
 */
public class DataManage {
    
    public static ArrayList<Admin> admins = new ArrayList<>();//kullanıcı için Arraylist
    public static ArrayList<Person> persons = new ArrayList<>();//kişiler için ArrayList
    
//deneme verisi
    public static void LoadTestDatas() {

        Admin ad1 = new Admin("samil", "1234");//ile giriş için admini kendimiz veriyoruz
        admins.add(ad1);
    }
    
   
    //admin kişilerin girişi için
    public static boolean LoginUser(String username, String password) {
        for (Admin ad1 : admins) {

            if (ad1.getUsername().compareTo(username) == 0 && ad1.getPassword().compareTo(password) == 0) {//karşılaştırma yapiyoruz doğru ise admini ekliyoruz
                return true;
            }
        }
        return false;
    }
    //admin eklemek için
    public static boolean AddUser(Admin admin) {
        for (Admin ad1 : admins) {

            if (ad1.getUsername().compareTo(admin.getUsername()) == 0) {
                return false;
            }

        }
        
        admins.add(admin);
        return true;
    }
    //kişi eklemek için
      public static boolean AddPerson(Person nperson) {
        
//          for (Person p1 : persons) {
//            if (p1.getUsername().compareTo(nperson.getUsername()) == 0) {
//                return false;
//            }
//        }
        persons.add(nperson);
        return true;
    }
      
      
    
}
