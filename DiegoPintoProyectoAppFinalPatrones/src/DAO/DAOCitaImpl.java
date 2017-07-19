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
    public ArrayList<Cita> Select() {
        ArrayList<Cita> lstCita = null;
        
        try{
            lstCita = new ArrayList<>();
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
                objCita = new Cita(intIdCatalogo, strIdCitas, strFecha, strHora, strNombreMedico, strConsultorio, strNombrePaciente);
                lstCita.add(objCita);
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

    public void Update(String strIdCita, String strFecha, String strHora, String strMedico, String strConsultorio){
        try {
            String strSQL ="UPDATE CitasMedicas SET  Fecha = ?, Hora = ?, NombreMedico = ?,"
                    + "Consultorio = ? WHERE idCita ="+strIdCita;

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, strFecha);
            pst.setString(2, strHora);
            pst.setString(3, strMedico);
            pst.setString(4, strConsultorio);
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public boolean Delete(String intEliminar) {
        PreparedStatement st = null;
        
        try{
            
            st = AbrirConexion().prepareStatement("DELETE FROM CitasMedicas WHERE idCita = ?");
            st.setString(1, intEliminar);
            st.executeUpdate();
            st.close();
            return true;
        }
        catch(Exception ex){
            String msn = ex.getMessage();
        }
        return  false;
    }
    

    
}
