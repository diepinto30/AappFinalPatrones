/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JLabel;

/**
 *
 * @author diego
 */
public class Cita {

    private int intId;
    private String intIdCita;
    private String fecha;
    private String hora;
    private String nombreD;
    private String Consultorio;
    private String paciente;

    public Cita(int intId, String intIdCita, String fecha, String hora, String nombreD, String Consultorio, String paciente) {
        this.intId = intId;
        this.intIdCita = intIdCita;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreD = nombreD;
        this.Consultorio = Consultorio;
        this.paciente = paciente;
    }
    public Cita(){
        
    }

    

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getIntIdCita() {
        return intIdCita;
    }

    public void setIntIdCita(String intIdCita) {
        this.intIdCita = intIdCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(String Consultorio) {
        this.Consultorio = Consultorio;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    
}
