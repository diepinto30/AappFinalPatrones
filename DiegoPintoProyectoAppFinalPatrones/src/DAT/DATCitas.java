
package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Hacve el CRUD
public class DATCitas {
    
    DATConexion c = new DATConexion();
    public ResultSet ConsultarCatalogo() throws ClassNotFoundException, SQLException
    {
        PreparedStatement pst = c.AbrirConexion().prepareStatement("SELECT * FROM CitasMedicas");
        ResultSet rs = pst.executeQuery();//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }
    
    public int InsertarCatalogo(String idCitas, String Fecha, String Hora, String NombreMedico, String Consultorio, String NombrePaciente) {
        int retorno=0;
        try{
            
            /*
            INSERT INTO `CitasMedicas`(`idCitasMedicas`, `idCita`, `Fecha`, `Hora`, `NombreMedico`, `Consultorio`, `NombrePaciente`)
            */
            String strSQL="INSERT INTO CitasMedicas (idCita,Fecha,Hora,NombreMedico,Consultorio,NombrePaciente) "
                    + "VALUES (?,?,?,?,?,?)";

            PreparedStatement pst = c.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1,idCitas);
            pst.setString(2,Fecha);
            pst.setString(3, Hora);
            pst.setString(4, NombreMedico);
            pst.setString(5, Consultorio);
            pst.setString(6, NombrePaciente);
            retorno = pst.executeUpdate();
            pst.close();
            c.CerrarConexion();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return retorno;
        
    }
    
    public int ActualizarCatalogo(String id, String Fecha, String Hora, String NombreMedico, String Consultorio){
        int retorno =0;
           
        try{
            String strSQL ="UPDATE CitasMedicas SET  Fecha=?,Hora=?,NombreMedico=?,"
                    + "Consultorio=? WHERE idCita = " +id;
            PreparedStatement pst = c.AbrirConexion().prepareStatement(strSQL);
            
            pst.setString(1,Fecha);
            pst.setString(2, Hora);
            pst.setString(3, Consultorio);
            pst.setString(4, NombreMedico);
            retorno = pst.executeUpdate();
            pst.close();
            c.CerrarConexion();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return retorno;
        
    }
   
}
