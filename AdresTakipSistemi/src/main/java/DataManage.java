
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mustafasamil.ileri
 */
public class DataManage {
    
    public static ArrayList<Admin> admins = new ArrayList<>();
    public static ArrayList<Person> persons = new ArrayList<>();
    

    public static void LoadTestDatas() {

        Admin ad1 = new Admin("samil", "1234");
        admins.add(ad1);
    }
    
    public static boolean LoginUser(String username, String password) {
        for (Admin ad1 : admins) {

            if (ad1.getUsername().compareTo(username) == 0 && ad1.getPassword().compareTo(password) == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean AddUser(Admin admin) {
        for (Admin ad1 : admins) {

            if (ad1.getUsername().compareTo(admin.getUsername()) == 0) {
                return false;
            }

        }
        
        admins.add(admin);
        return true;
    }
    
      public static boolean AddPerson(Person nperson) {
        for (Person p1 : persons) {

            if (p1.getUsername().compareTo(nperson.getUsername()) == 0) {
                return false;
            }

        }
        
        persons.add(nperson);
        return true;
    }
      
      public static void copyPersons(Person nperson, Person copyPerson){
          
          
          
          
      }
    
}
