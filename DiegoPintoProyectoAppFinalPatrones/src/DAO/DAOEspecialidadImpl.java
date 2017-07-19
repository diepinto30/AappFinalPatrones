package DAO;

import Clases.Doctor;
import Clases.Especialidades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOEspecialidadImpl extends DAOConexion implements DAOInterfaces.DAOEspecialidades {

    @Override
    public ArrayList<Especialidades> Select() throws Exception {
         ArrayList<Especialidades> lstEspe = null;
        
        try{
            lstEspe = new ArrayList<>();
            PreparedStatement pst = this.AbrirConexion().prepareStatement("SELECT * FROM EspecialidadesMedicas");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Especialidades objEspe;
                int intIdCatalogo = rs.getInt("idEspecialidad");
                String strNombres = rs.getString("Nombre");
                objEspe = new Especialidades(intIdCatalogo, strNombres);
                lstEspe.add(objEspe);
            }
            rs.close();
            pst.close();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstEspe;   
    }


}
