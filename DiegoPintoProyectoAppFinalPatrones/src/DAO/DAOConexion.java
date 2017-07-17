package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConexion {
    
    protected Connection con;//obj tipo Conecction
    
    private final String driver="com.mysql.jdbc.Driver";
    private final String user="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost:3306/CentroMedicoDiego";
    
    public Connection getConnection () throws SQLException, ClassNotFoundException{
        
        Class.forName(driver) ;//Diver jdbc para trabajar con access
        con =DriverManager.getConnection(url,user,password);
        return con;//retorna la cioneccion url+ruta bd
    }
    //Objeto tipo Connection para majenar la conecion
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException
    {
        con = getConnection();
        return con;
    }
    //cerrar la coneccion 
    public void CerrarConexion() throws SQLException
    {
       con.close();
    }

}
