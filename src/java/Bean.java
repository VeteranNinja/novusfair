/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author colinbrophy
 */
@ViewScoped
@Named("bean")
public class Bean implements Serializable  {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYearIn() {
        return yearIn;
    }

    public void setYearIn(int yearIn) {
        this.yearIn = yearIn;
    }

    public int getYearOut() {
        return yearOut;
    }

    public void setYearOut(int yearOut) {
        this.yearOut = yearOut;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getAvailablity() {
        return Availablity;
    }

    public void setAvailablity(String Availablity) {
        this.Availablity = Availablity;
    }

    public int getAssesmentYear() {
        return assesmentYear;
    }

    //private LogicLayer lg;
    public void setAssesmentYear(int assesmentYear) {
        this.assesmentYear = assesmentYear;
    }
    
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
 private String classification;

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
 
 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
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
 
 public void adminLogin() throws IOException {
    if(password.equals(ADMIN_PASSWORD))
        FacesContext.getCurrentInstance().getExternalContext().dispatch("/admin_page.xhtml");
    else 
        FacesContext.getCurrentInstance().getExternalContext().dispatch("/login_failed.xhtml");
}
}
