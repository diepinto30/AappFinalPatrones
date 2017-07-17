package DAOInterfaces;

import Clases.Doctor;
import java.util.ArrayList;

public interface DAODoctor {
    
    public void Insert(Doctor Dotores);
    public ArrayList<Doctor> Select() throws Exception;
    
    

    
}
