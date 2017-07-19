package DAOInterfaces;

import Clases.Paciente;
import java.util.ArrayList;

public interface DAOPaciente {
    
    public void Insert(Paciente paciente);
    public ArrayList<Paciente> Select() throws Exception;
}
