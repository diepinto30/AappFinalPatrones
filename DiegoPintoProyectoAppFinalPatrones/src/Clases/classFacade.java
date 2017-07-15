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
    
    
}
