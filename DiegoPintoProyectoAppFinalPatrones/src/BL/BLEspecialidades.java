package BL;

import Clases.Especialidades;
import DAT.DATConexion;
import DAT.DATEspecialidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLEspecialidades {

    DATEspecialidades mp = new DATEspecialidades();//Llama al clase DATEspecialidades crea un obj

    public ArrayList<Especialidades>ConsultarCatalogo() {
        ArrayList<Especialidades> lstEspecialidades = new ArrayList<>();
        try{
            ResultSet rs = mp.ConsultarCatalogo();
            while(rs.next()){
                int intIdCatalogo = rs.getInt("idEspecialidad");
                String strNombres = rs.getString("Nombre");
                Especialidades objEspecialidades = new Especialidades(intIdCatalogo, strNombres);
                lstEspecialidades.add(objEspecialidades);
            }
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstEspecialidades;   
    }
}
