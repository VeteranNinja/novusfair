package com.novus.novusfair;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek
 */
@Entity
@Table(name="People")
public class Person {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getSelectedStream() {
        return selectedStream;
    }

    public void setSelectedStream(String selectedStream) {
        this.selectedStream = selectedStream;
    }

    public String getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(String selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    public int getAssessmentYear() {
        return assessmentYear;
    }

    public void setAssessmentYear(int assessmentYear) {
        this.assessmentYear = assessmentYear;
    }

  

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    @Column(name="firstName")
    String firstName;
    @Column(name="surname")
    String surname;
    @Column(name="homeAddress")
    String homeAddress;
    @Column(name="contactNumber")
    String contactNumber;
    @Column(name="email")
    String email;
    @Column(name="degree")
    String degree;
    @Column(name="yearIn")
    int yearIn;
    @Column(name="yearOut")
    int yearOut;
    @Column(name="interest")
    String interest;
    @Column(name="availability")
    String availability;
    @Column(name="selectedStream")
    String selectedStream;
    @Column(name="selectedLocation")
    String selectedLocation;
    @Column(name="assessmentYear")
    int assessmentYear;
   
    public Person(){
        
    }
    public Person(String firstName, String surname, String homeAddress, String contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        this.firstName=firstName;
        this.surname=surname;
        this.homeAddress=homeAddress;
        this.contactNumber=contactNumber;
        this.email=email;
        this.degree=degree;
        this.yearIn=yearIn;
        this.yearOut=yearOut;
        this.interest=interest;
        this.availability=availability;
        this.selectedStream=selectedStream;
        this.selectedLocation=selectedLocation;
        this.assessmentYear=assessmentYear;
    }
     public Person(int id, String firstName, String surname, String homeAddress, String contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        this.id=id;
        this.firstName=firstName;
        this.surname=surname;
        this.homeAddress=homeAddress;
        this.contactNumber=contactNumber;
        this.email=email;
        this.degree=degree;
        this.yearIn=yearIn;
        this.yearOut=yearOut;
        this.interest=interest;
        this.availability=availability;
        this.selectedStream=selectedStream;
        this.selectedLocation=selectedLocation;
        this.assessmentYear=assessmentYear;
    }
     @Override
    public String toString(){
      return ("ID: "+id+" Name: "+firstName+" Surname: "+surname);
    }
    
}
