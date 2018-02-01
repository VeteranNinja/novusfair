/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novus.novusfair;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MDMD
 */
public class LogicLayer {
    
    public static void main(String [] args)
    {
        Person person = new Person();
        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.save(person);
    }
    public void addPerson(String firstName, String surname, String homeAddress, int contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        
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

