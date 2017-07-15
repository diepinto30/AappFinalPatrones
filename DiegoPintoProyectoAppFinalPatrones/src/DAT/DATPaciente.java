
package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Hacve el CRUD
public class DATPaciente {
    
    DATConexion c = new DATConexion();
    public ResultSet ConsultarCatalogo() throws ClassNotFoundException, SQLException
    {
        PreparedStatement pst = c.AbrirConexion().prepareStatement("SELECT * FROM Pacientes");
        ResultSet rs = pst.executeQuery();//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }
    
    
    public ResultSet ConsultarIdCatalogo(String strNombre) throws ClassNotFoundException, SQLException
    {
        PreparedStatement pst = c.AbrirConexion().prepareStatement("SELECT * FROM Pacientes where Nombres = "+"'"+strNombre+"'");
        ResultSet rs = pst.executeQuery();//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }
    
    
    public int InsertarCatalogo(String Nombres, String Apellidos, String Identifacion, String Edad, String Direccion) {
        int retorno=0;
        try{
            
            /*
            INSERT INTO `Pacientes`(`idPacientes`, `Nombres`, `Apellidos`, `Identifacion`, `Direccion`, `EdadAnios`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6])
            */
            String strSQL="INSERT INTO Pacientes (Nombres,Apellidos,Identifacion,Direccion,EdadAnios) "
                    + "VALUES (?,?,?,?,?)";

            PreparedStatement pst = c.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1,Nombres);
            pst.setString(2,Apellidos);
            pst.setString(3, Identifacion);
            pst.setString(4, Direccion);
            pst.setString(5, Edad);
            retorno = pst.executeUpdate();
            pst.close();
            c.CerrarConexion();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return retorno;
        
    }
    
    
    
    
}
