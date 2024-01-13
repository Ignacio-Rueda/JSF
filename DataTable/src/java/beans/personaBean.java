/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio Rueda
 */
public class personaBean {

    private Persona persona = new Persona();
    private static List<Persona> lstPersonas = new ArrayList();

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
        personaBean.lstPersonas = lstPersonas;
    }

    public void agregarPersona() {
        personaBean.lstPersonas.add(this.persona);
    }

    public void eliminarPersona(Persona per) {
        personaBean.lstPersonas.remove(per);
    }

}
