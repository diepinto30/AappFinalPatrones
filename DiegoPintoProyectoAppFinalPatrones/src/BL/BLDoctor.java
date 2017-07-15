package BL;
import Clases.Doctor;
import DAT.DATConexion;
import DAT.DATDoctor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLDoctor 
{
    DATDoctor mp = new DATDoctor();//Llama al clase DATDoctor crea un obj
    
    /*public int InsertarCatalogo(String Nombres, String Apellidos, String NumConsultrio, String Especialidad, int Estado) {
            return mp.InsertarCatalogo(Nombres, Apellidos, NumConsultrio, Especialidad, Estado);
    }*/
    
    //Recuperando el objeto que se envia desde la ui
    public int InsertarCatalogoObjeto(Doctor objDoctor) {
        return mp.InsertarCatalogo(objDoctor.getStrNombres(), objDoctor.getStrApellidos(), objDoctor.getStrNumeroConsultorio(), objDoctor.getStrEspecialidad(), objDoctor.getIntEstado());
        
    }
    
    public int InsertarCatalogoLista(ArrayList<Doctor>lstAdmin) {
        //return mp.InsertarCatalogo(CodCatalogo, NombreCatalogo, EstadoCatalogo);
        return 0;
    }
    
    public ArrayList<Doctor> ConsultarCatalogo() throws ClassNotFoundException, SQLException {
        ArrayList<Doctor> lstDoctor = new ArrayList<>();
        
        try{
            ResultSet rs = mp.ConsultarCatalogo();
            while(rs.next()){
                int intIdCatalogo = rs.getInt("idDoctores");
                String strNombres = rs.getString("Nombres");
                String strApellidos = rs.getString("Apellidos");
                String intNumConsultorio = rs.getString("NumConsultorio");
                String strEspecialidad = rs.getString("Especialidad");
                int    intEstado = rs.getInt("Estado");
                Doctor objDoctor = new Doctor(intIdCatalogo, intNumConsultorio, strEspecialidad, intEstado,strNombres, strApellidos);
                lstDoctor.add(objDoctor);
            }
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstDoctor;   
    }
   
}
