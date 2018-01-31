/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 *
 * @author colinbrophy
 */
public class NumberValidator implements Validator {
    public void validate(FacesContext facesContext,
      UIComponent component, Object value) {
      String str = value.toString();
      if (!str.matches("[0-9]+"))
          throw new ValidatorException(new FacesMessage("Must be a number"));
    }
}