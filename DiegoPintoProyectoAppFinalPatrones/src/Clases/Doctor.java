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
public class Doctor extends Persona {
    int idDoctor;
    String strNumeroConsultorio;
    String strEspecialidad; 
    int intEstado;

    public Doctor(int idDoctor, String strNumeroConsultorio, String strEspecialidad, int intEstado, String strNombres, String strApellidos) {
        super(strNombres, strApellidos);
        this.idDoctor = idDoctor;
        this.strNumeroConsultorio = strNumeroConsultorio;
        this.strEspecialidad = strEspecialidad;
        this.intEstado = intEstado;
    }

    

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getStrNumeroConsultorio() {
        return strNumeroConsultorio;
    }

    public void setStrNumeroConsultorio(String strNumeroConsultorio) {
        this.strNumeroConsultorio = strNumeroConsultorio;
    }

    public String getStrEspecialidad() {
        return strEspecialidad;
    }

    public void setStrEspecialidad(String strEspecialidad) {
        this.strEspecialidad = strEspecialidad;
    }

    public int getIntEstado() {
        return intEstado;
    }

    public void setIntEstado(int intEstado) {
        this.intEstado = intEstado;
    }

    @Override
    public String toString() {
        return strEspecialidad;
    }

    
}
