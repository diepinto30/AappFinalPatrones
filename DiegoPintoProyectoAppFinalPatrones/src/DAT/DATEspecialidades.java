
package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Hacve el CRUD
public class DATEspecialidades {
    
    DATConexion c = new DATConexion();
    
    public ResultSet ConsultarCatalogo()  throws ClassNotFoundException, SQLException
    {
        PreparedStatement pst = c.AbrirConexion().prepareStatement("SELECT * FROM EspecialidadesMedicas");
        ResultSet rs = pst.executeQuery();//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }
    
   
}
