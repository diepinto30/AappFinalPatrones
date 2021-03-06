package Clases;

public class Doctor extends Persona {
    int idDoctor;
    String strNumeroConsultorio;
    String strEspecialidad; 
    int intEstado;
    
    public Doctor(){
        
    }
    
    public Doctor(int idDoctor, String strNombres, String strApellidos, String strNumeroConsultorio, String strEspecialidad, int intEstado) {
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
