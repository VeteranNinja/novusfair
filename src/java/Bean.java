/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author colinbrophy
 */
@ViewScoped
@Named("bean")
public class Bean implements Serializable  {
 
 //private LogicLayer lg;    
    
 private String firstName;
 private String lastName;
 private String homeAddress;
 private String contactNumber;
 private String email;
 private String degree;
 
 private int yearIn;
 private int yearOut;
 private String interest;
 private String Availablity;
 //private Stream selectedStream;
// private Place selectedLocation;
 private int assesmentYear;
 
 private String password;
 
 private static String ADMIN_PASSWORD = "rob";
 
 /*
 static boolean isAlpha(String str) {
     return str.matches("[a-zA-Z]+");
 }
 
 static boolean isNum(String str) {
     return str.matches("[0-9]+");
 }

 public boolean dataValid() {
     boolean ret = true;
     
     if (name.length() == 0 || !isAlpha(name))
         ret = false;
     if (!isNum(contactNumber))
         ret = false;
     if (!isAlpha(degree))
         ret = false;
     
    if (yearIn > 3000 || yearIn < 2000)
         ret = false;
    if (yearOut > 3000 || yearOut < 2000)
        ret = false;
    if (assesmentYear > 3000 || assesmentYear < 2000)
         ret = false;

   return ret; 
 }*/
 
 public void handleSubmit() {

   // logic.createPerson();

 }
 
 public String adminLogin() {
    if(password.equals(ADMIN_PASSWORD))
        return "admin_page";
    else 
        return "login_failed";
}
}
