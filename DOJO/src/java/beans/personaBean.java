/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import clases.Persona;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio Rueda
 */
public class personaBean {

    private Persona persona = new Persona();
    private List<Persona> lstPersonas = new ArrayList();

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public personaBean() {
    }

    public List<Persona> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(List<Persona> lstPersonas) {
       this.lstPersonas = lstPersonas;
    }

    public void registrarPersona() {
        this.lstPersonas.add(this.persona);
    }
    
    public void validar(FacesContext context,UIComponent toValidate,Object value){
        /**
         * - FacesContext: Este parámetro proporciona el contexto de ejecución de JSF, lo cual es crucial para interactuar con el entorno JSF.Permite acceder
         * a varias utilidades y servicios proporcionados por el framework.
         * - UIComponent: Este parámetro representa el componente que está invocando este método. Es decir, es el componente que se está validando, como un campo de entrada (<h:inputText>)
         * - objectValue: Es el valor representa el valor que se ha ingresado en el componente.
         */
        //Para capturar el contexto en JSF, es necesario para realizar operaciones dentro del entorno JSF:
        context = FacesContext.getCurrentInstance();
        //Valor de los argumentos.
        String texto = (String)value; //Casteamos porque es de tipo objeto.
        
        //Lógica de validación.
        if(! texto.equalsIgnoreCase("M") && !texto.equalsIgnoreCase("F")){
            //Si no tiene esos valores, invalidamos el componente
            ((UIInput)toValidate).setValid(false);//Primero lo casteamos para pasarlo a un objeto de tipo UIInput. (UIInput es una clase base para muchos componentes de entrada en JSF, como campos de texto <h:inputText>)
            context.addMessage(toValidate.getClientId(context),new FacesMessage("Sexo NO VÁLIDO"));
        }
    }
}
