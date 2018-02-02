/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novus.novusfair;

import java.util.ArrayList;
import org.hibernate.Query;
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
       /* Person person = new Person("John", "Snow", "9 Walker Road", "00000009001", "superjohnsnow@gmail.com", "Computer Science", 2012, 2015, "Making potato salads", "2018-02-22", "SoftwareDevelopment", "Manchester", 2018);
        Person person2 = new Person("John", "GSnow", "9 Walker Road", "00000009001", "superjohnsnow@gmail.com", "Computer Science", 2012, 2015, "Making potato salads", "2018-02-22", "SoftwareDevelopment", "Manchester", 2018);
        Person person3 = new Person("John", "OGSnow", "9 Walker Road", "00000009001", "superjohnsnow@gmail.com", "Computer Science", 2012, 2015, "Making potato salads", "2018-02-22", "SoftwareDevelopment", "Manchester", 2018);
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        session.save(person2);
        session.save(person3);
        tx.commit();*/
       //getPeople("surname","Bane");
        //deletePerson(3);
        //getPeople();
       //editPerson(2, "John", "Bane", "9 Walker Road", "00000009001", "superjohnsnow@gmail.com", "Computer Science", 2012, 2015, "Making potato salads", "2018-02-22", "SoftwareDevelopment", "Manchester", 2018);
    }
    public static void addExamplePeople(){
        Person person = new Person("John", "Snow", "9 Walker Road", "007567567", "superjohnsnow@gmail.com", "Computer Science", 2012, 2015, "Making potato salads", "2018-02-22", "Software Development", "Manchester", 2018);
        Person person2 = new Person("John", "Jones", "23 A Road", "0794563463", "examplemail@gmail.com", "Computer Science", 2012, 2015, "Eating", "2018-02-22", "Software Development", "Manchester", 2018);
        Person person3 = new Person("Mike", "Snow", "29 B Road", "079567564", "mikesnow@gmail.com", "Computer Science", 2013, 2016, "Surfing", "2018-07-22", "Software Testing", "London", 2017);
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        session.save(person2);
        session.save(person3);
        tx.commit();
    }
    public static void addPerson(String firstName, String surname, String homeAddress, String contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        Person person = new Person(firstName, surname, homeAddress, contactNumber, email, degree, yearIn, yearOut, interest, availability, selectedStream, selectedLocation, assessmentYear);
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        session.flush();
        tx.commit();
        session.close();
        
        //Done
    }
     public static void addPerson(Person person){
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        session.flush();
        tx.commit();
        session.close();
        
        //Done
    }
    public static void deletePerson(int id){
        
        Person personToDelete = getPersonById(id);
        if(personToDelete!=null){
            Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            session.delete(personToDelete);
            session.flush();
            tx.commit();
            session.close();
        }
        
        //Done
    }
    
    public static void editPerson(int id, String firstName, String surname, String homeAddress, String contactNumber, String email, String degree, int yearIn, int yearOut, String interest, String availability, String selectedStream, String selectedLocation, int assessmentYear){
        Person updatedPerson = new Person(id, firstName, surname, homeAddress, contactNumber, email, degree, yearIn, yearOut, interest, availability, selectedStream, selectedLocation, assessmentYear);
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.update(updatedPerson);
        session.flush();
        tx.commit();
        session.close();
        
        //Done
    }
    public static void editPerson(Person updatedPerson){
        System.out.println("Edit person ---------------------");
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.update(updatedPerson);
        session.flush();
        tx.commit();
        session.close();
        
        //Done
    }
    public static Person getPersonById(int id){
        System.out.println("Get person by id start");
        Person person;         
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        person = (Person)session.get(Person.class, id);
        
        
        
        return person;
        
        //Done
    }
    public static ArrayList<Person> getPeople(){
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("from Person");
        //query.setParameter("sname", "snow");    
               
        ArrayList people = (ArrayList)query.list();
        System.out.println("List of people we got: ");
        System.out.println(people);
       
        return people;
        //Done
    }
    public static ArrayList<Person> getPeople(String columnName, String value){
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("from Person where "+columnName+" = :input_value");

        query.setParameter("input_value", value);    
               
        ArrayList people = (ArrayList)query.list();
        System.out.println("List of People we got: ");
        System.out.println(people);
       
        return people;
        //Done
    }
}

