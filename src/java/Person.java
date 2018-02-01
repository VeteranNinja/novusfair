/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek
 */
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

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
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

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
    int id;
    String firstName;
    String surname;
    String homeAddress;
    int contactNumber;
    String email;
    String degree;
    int yearIn;
    int yearOut;
    String interest;
    String availability;
    String selectedStream;
    String selectedLocation;
    int assessmentYear;
    String test;
    String test2;
    public Person(String firstName, String surname, String homeAddress, int contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
    this.id=1;
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
    
}
