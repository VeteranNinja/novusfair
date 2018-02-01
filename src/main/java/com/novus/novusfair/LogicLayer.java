/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novus.novusfair;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author MDMD
 */
public class LogicLayer {
    
    public static void main(String [] args) // FOR TESTING ONLY
    {
        Person person = new Person("John", "Snow", "9 Walker Road", "00000009001", "superjohnsnow@gmail.com", "Computer Science", 2012, 2015, "Making potato salads", "2018-02-22", "SoftwareDevelopment", "Manchester", 2018);
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        tx.commit();
    }
    public void addPerson(String firstName, String surname, String homeAddress, String contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        Person person = new Person(firstName, surname, homeAddress, contactNumber, email, degree, yearIn, yearOut, interest, availability, selectedStream, selectedLocation, assessmentYear);
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        tx.commit();
    }
    public void deletePerson(int id){
        
    }
    public void editPerson(int id, String firstName, String surname, String homeAddress, int contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        
    }
    public ArrayList<Person> getPeople(){
        return null;
        
    }
    public ArrayList<Person> getPeople(String columnName, String value){
        return null;
        
    }
}

