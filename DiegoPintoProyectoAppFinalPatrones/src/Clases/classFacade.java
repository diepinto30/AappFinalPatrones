package Clases;
public class classFacade {
    private Cita citas;
    private Doctor doctores;
    private Especialidades especialidades;
    private Paciente pacientes;
    private Persona persona;
    
    public classFacade() {
        citas = new Cita();
        doctores = new Doctor();
        especialidades = new Especialidades();
        pacientes = new Paciente();
        persona = new Persona();
    }
    
    // metodo de la clase persona
    public Persona Person(String strNombres, String strApellidos){
        return  persona = new Persona(strNombres, strApellidos);
    }
    
    // metodo de la clase citas
    public Cita Citas(int intId, String intIdCita, String fecha, String hora, String nombreD, String Consultorio, String paciente){
        return  citas = new Cita(intId, intIdCita, fecha, hora, nombreD, Consultorio, paciente);
    }
    
    // metodo de la clase citas
    public Cita Citas2(String strIdCita, String strFecha, String strHora, String strMedico, String strConsultorio){
        return  citas = new Cita(strIdCita, strFecha, strHora, strMedico, strConsultorio);
    }
    
    // metodo de la clase doctores
    public Doctor Dotores(int idDoctor, String strNombres, String strApellidos, String strNumeroConsultorio, String strEspecialidad, int intEstado){
        return  doctores = new Doctor(idDoctor, strNombres, strApellidos, strNumeroConsultorio, strEspecialidad, intEstado);
    }
    
    // metodo de la clase pacientes
    public Paciente Pacientes(int intId, String strIdentifacion, String strDireccion, String intEdad, String strNombres, String strApellidos){
        return pacientes = new Paciente(intId, strIdentifacion, strDireccion, intEdad, strNombres, strApellidos);
    }
    
    
}
