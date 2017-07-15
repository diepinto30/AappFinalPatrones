/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author diego
 */
public class Paciente extends Persona {
    
    int intId;
    String strIdentifacion;
    String strDireccion;
    String intEdad;

    public Paciente(int intId, String strIdentifacion, String strDireccion, String intEdad, String strNombres, String strApellidos) {
        super(strNombres, strApellidos);
        this.intId = intId;
        this.strIdentifacion = strIdentifacion;
        this.strDireccion = strDireccion;
        this.intEdad = intEdad;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrIdentifacion() {
        return strIdentifacion;
    }

    public void setStrIdentifacion(String strIdentifacion) {
        this.strIdentifacion = strIdentifacion;
    }

    public String getStrDireccion() {
        return strDireccion;
    }

    public void setStrDireccion(String strDireccion) {
        this.strDireccion = strDireccion;
    }

    public String getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(String intEdad) {
        this.intEdad = intEdad;
    }

}
