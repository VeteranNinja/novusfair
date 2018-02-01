package com.novus.novusfair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.Serializable;
import static java.util.Collections.singletonList;
import java.util.List;
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

    public String getAvailability() {
        return availablity;
    }

    public void setAvailability(String Availablity) {
        this.availablity = Availablity;
    }

    public int getAssesmentYear() {
        return assesmentYear;
    }

    private LogicLayer logic = new LogicLayer();
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
 private String availablity;
  
 public void submit() {
     logic.addPerson(firstName, lastName, homeAddress, contactNumber, email, degree, yearIn, 
             yearOut, interest, availablity, stream, location, assesmentYear);

 }
 
    public void deletePerson(int personId) {
        logic.deletePerson(personId);
    }
    public void setAvailablity(String availablity) {
        this.availablity = availablity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
 private String stream;
 private String location;

    public String getAvailablity() {
        return availablity;
    }

    public String getStream() {
        return stream;
    }

    public String getLocation() {
        return location;
    }

    public void setStream(String selectedStream) {
        this.stream = selectedStream;
    }

    public void setSelectedLocation(String selectedLocation) {
        this.location = selectedLocation;
    }
 private int assesmentYear;
 private String classification;
 
 private List<Person> people;

    public List<Person> getPeople() {
        //return logic.getPeople();
        return singletonList(testPerson);
    }

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
 
 private static final String ADMIN_PASSWORD = "rob";
 
 public void adminLogin() throws IOException {
    if(password.equals(ADMIN_PASSWORD))
        FacesContext.getCurrentInstance().getExternalContext().dispatch("/admin_page.xhtml");
    else 
        FacesContext.getCurrentInstance().getExternalContext().dispatch("/login_failed.xhtml");
}
 private static final Person testPerson = new Person("Joe", "Bloggs", "nowhere" , "4", "ffs@2.com", 
         "Degree", 344, 434, "", "any" ,"soon", "duno", 2018);
}
