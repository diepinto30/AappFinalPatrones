package DAOInterfaces;

import Clases.Cita;
import java.util.ArrayList;

public interface DAOCita {

    public void Insert(Cita citas);

    public ArrayList<Cita> Select() throws Exception;

    public void Update(String strIdCita, String strFecha, String strHora, String strMedico, String strConsultorio) throws Exception;
    
    public boolean Delete(String idCita) throws Exception;
}
