package DAO;

import Clases.Doctor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAODoctorImpl extends DAOConexion implements DAOInterfaces.DAODoctor {

    @Override
    public ArrayList<Doctor> Select() throws Exception {
         ArrayList<Doctor> lstDoctor = null;
        
        try{
            lstDoctor = new ArrayList<>();
            PreparedStatement pst = this.AbrirConexion().prepareStatement("SELECT * FROM Doctores");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Doctor objDoc;
                int intIdCatalogo = rs.getInt("idDoctores");
                String strNombres = rs.getString("Nombres");
                String strApellidos = rs.getString("Apellidos");
                String intNumConsultorio = rs.getString("NumConsultorio");
                String strEspecialidad = rs.getString("Especialidad");
                int    intEstado = rs.getInt("Estado");
                objDoc = new Doctor(intIdCatalogo, strNombres, strApellidos, intNumConsultorio, strEspecialidad, intEstado);
                lstDoctor.add(objDoc);
            }
            rs.close();
            pst.close();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstDoctor;   
    }

    @Override
    public void Insert(Doctor objDoc) {
        try {
            String strSQL = "INSERT INTO Doctores (Nombres,Apellidos,NumConsultorio,Especialidad,Estado) "
                    + "VALUES (?,?,?,?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, objDoc.getStrNombres());
            pst.setString(2, objDoc.getStrApellidos());
            pst.setString(3, objDoc.getStrNumeroConsultorio());
            pst.setString(4, objDoc.getStrEspecialidad());
            pst.setInt(5, objDoc.getIntEstado());
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }


}
