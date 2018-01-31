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
