package DAOInterfaces;

import Clases.Doctor;
import Clases.Especialidades;
import Clases.Especialidades;
import java.util.ArrayList;

public interface DAODoctor {

    public void Insert(Doctor Dotores);

    public ArrayList<Doctor> Select() throws Exception;

}
