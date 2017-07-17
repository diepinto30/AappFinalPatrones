/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Cita;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class DAOCitaImpl extends DAOConexion implements DAOInterfaces.DAOCita {

    @Override
    public void Insert(Cita objCita) {
       try {
            String strSQL="INSERT INTO CitasMedicas (idCita,Fecha,Hora,NombreMedico,Consultorio,NombrePaciente) "
                    + "VALUES (?,?,?,?,?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, objCita.getIntIdCita());
            pst.setString(2, objCita.getFecha());
            pst.setString(3, objCita.getHora());
            pst.setString(4, objCita.getNombreD());
            pst.setString(5, objCita.getConsultorio());
            pst.setString(6, objCita.getPaciente());
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<Cita> Select() throws Exception {
        ArrayList<Cita> lstCita = new ArrayList<>();
        
        try{
            
            PreparedStatement pst = this.AbrirConexion().prepareStatement("SELECT * FROM CitasMedicas");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cita objCita;
                int intIdCatalogo = rs.getInt("idCitasMedicas");
                String strIdCitas = rs.getString("idCita");
                String strFecha = rs.getString("Fecha");
                String strHora = rs.getString("Hora");
                String strNombreMedico = rs.getString("NombreMedico");
                String strConsultorio= rs.getString("Consultorio");
                String strNombrePaciente = rs.getString("NombrePaciente");
                objCita = new Cita(intIdCatalogo, strIdCitas, strFecha, strHora, strHora, strConsultorio, strFecha);
            }
            pst.close();
            rs.close();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstCita;   
    }
    
}
