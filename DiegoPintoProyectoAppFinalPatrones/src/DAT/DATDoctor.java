package DAT;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Hacve el CRUD

public class DATDoctor {

    DATConexion c = new DATConexion();

    public ResultSet ConsultarCatalogo() throws ClassNotFoundException, SQLException {
        PreparedStatement pst = c.AbrirConexion().prepareStatement("SELECT * FROM Doctores");
        ResultSet rs = pst.executeQuery();//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }

    public ResultSet ConsultarIdCatalogo(String strNombre) throws ClassNotFoundException, SQLException {
        PreparedStatement pst = c.AbrirConexion().prepareStatement("SELECT * FROM Doctores where Nombres = " + "'" + strNombre + "'");
        ResultSet rs = pst.executeQuery();//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }

    public int InsertarCatalogo(String Nombres, String Apellidos, String NumConsultrio, String Especialidad, int Estado) {
        int retorno = 0;
        try {

            /*
            INSERT INTO `Doctores`(`idDoctores`, `Nombres`, `Apellidos`, `NumConsultorio`, `Especialidad`, `Estado`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6])
             */
            String strSQL = "INSERT INTO Doctores (Nombres,Apellidos,NumConsultorio,Especialidad,Estado) "
                    + "VALUES (?,?,?,?,?)";

            PreparedStatement pst = c.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, Nombres);
            pst.setString(2, Apellidos);
            pst.setString(3, NumConsultrio);
            pst.setString(4, Especialidad);
            pst.setInt(5, Estado);
            retorno = pst.executeUpdate();
            pst.close();
            c.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return retorno;

    }

}
