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
import javax.faces.bean.SessionScoped;
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

    public Person getEditPerson() {
        return editPerson;
    }

    public void setEditPerson(Person editPerson) {
        this.editPerson = editPerson;
    }
 
 private Person submitPerson = new Person();

    public Person getSubmitPerson() {
        return submitPerson;
    }

    public void setSubmitPerson(Person submitPerson) {
        this.submitPerson = submitPerson;
    }
 private Person editPerson;
  
 public void submit() {
     LogicLayer.addPerson(submitPerson);

 }
    public String editPerson(int personId) {
        editPerson = LogicLayer.getPersonById(personId);
        return "/edit_page.xhtml";
    }
    
    public String editBack() {
        LogicLayer.editPerson(editPerson);
        return "/admin_page.xhtml";
    }
    public void deletePerson(int personId) {
        LogicLayer.deletePerson(personId);
    }
 
 private List<Person> people;

    public List<Person> getPeople() {
        return LogicLayer.getPeople();
        //return singletonList(testPerson);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
 private String password;
 
 private static final String ADMIN_PASSWORD = "rob";
 
 public String adminLogin() throws IOException {
    if(password.equals(ADMIN_PASSWORD))
        return "/admin_page.xhtml";
    else 
       return "/login_failed.xhtml";
}
 private static final Person testPerson = new Person("Joe", "Bloggs", "nowhere" , "4", "ffs@2.com", 
         "Degree", 344, 434, "", "any" ,"soon", "duno", 2018);
}
