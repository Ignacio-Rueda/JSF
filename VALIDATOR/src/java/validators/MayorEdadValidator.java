/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validators;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

/**
 *
 * @author Ignacio Rueda
 */
@FacesValidator(value = "MayorEdadValidator")
public class MayorEdadValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        //Capturamos el valor:
        String texto = String.valueOf(value);
        int edad = Integer.parseInt(texto);
        
        if(edad<18){
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Edad no permitida","debe ser mayor a 18");
            throw new ValidatorException(msg);
        }

    
    }
}