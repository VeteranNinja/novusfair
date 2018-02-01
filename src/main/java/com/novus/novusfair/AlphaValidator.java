package com.novus.novusfair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 *
 * @author colinbrophy
 */


public class AlphaValidator implements Validator {
    public void validate(FacesContext facesContext,
      UIComponent component, Object value) {
      String str = value.toString();
      if (str.length() == 0)
          throw new ValidatorException(new FacesMessage("Cannot be empty"));
      if (!str.matches("[a-zA-Z]+"))
          throw new ValidatorException(new FacesMessage("Must only contain alphabet characters"));
      
    }
}
