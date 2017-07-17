package DAO;

import Clases.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOPacienteImpl extends DAOConexion implements DAOInterfaces.DAOPaciente {

    @Override
    public ArrayList<Paciente> Select() {
        ArrayList<Paciente> lstPaciente = null;
        
        try{
            lstPaciente = new ArrayList<>();
            PreparedStatement pst = this.AbrirConexion().prepareStatement("SELECT * FROM Pacientes");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Paciente objPa;
                int intIdCatalogo = rs.getInt("idPacientes");
                String strNombres = rs.getString("Nombres");
                String strApellidos = rs.getString("Apellidos");
                String strIdentifacion = rs.getString("Identifacion");
                String strDireccion = rs.getString("Direccion");
                String    intEdad = rs.getString("EdadAnios");
                objPa = new Paciente(intIdCatalogo, strNombres, strApellidos, strIdentifacion, strDireccion, intEdad);
                lstPaciente.add(objPa);
            }
            rs.close();
            pst.close();
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstPaciente;   
    }

    @Override
    public void Insert(Paciente objPa) {
        try {
            String strSQL="INSERT INTO Pacientes (Nombres,Apellidos,Identifacion,Direccion,EdadAnios) "
                    + "VALUES (?,?,?,?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, objPa.getStrNombres());
            pst.setString(2, objPa.getStrApellidos());
            pst.setString(3, objPa.getStrIdentifacion());
            pst.setString(4, objPa.getStrDireccion());
            pst.setString(5, objPa.getIntEdad());
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
