package BL;
import Clases.Paciente;
import DAT.DATConexion;
import DAT.DATPaciente;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BLPaciente 
{
    DATPaciente mp = new DATPaciente();//Llama al clase DATPaciente crea un obj
    
    //Recuperando el objeto que se envia desde la ui
    public int InsertarCatalogoObjeto(Paciente objPaciente) {
        return mp.InsertarCatalogo(objPaciente.getStrNombres(), objPaciente.getStrApellidos(), objPaciente.getStrIdentifacion(), objPaciente.getStrDireccion(), objPaciente.getIntEdad());
        
    }
    
    public int InsertarCatalogoLista(ArrayList<Paciente>lstAdmin) {
        //return mp.InsertarCatalogo(CodCatalogo, NombreCatalogo, EstadoCatalogo);
        return 0;
    }
    /*
            INSERT INTO `Pacientes`(`idPacientes`, `Nombres`, `Apellidos`, `Identifacion`, `Direccion`, `EdadAnios`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6])
            */
    public ArrayList<Paciente> ConsultarCatalogo() {
        ArrayList<Paciente> lstPaciente = new ArrayList<>();
        try{
            ResultSet rs = mp.ConsultarCatalogo();
            while(rs.next()){
                int intIdCatalogo = rs.getInt("idPacientes");
                String strNombres = rs.getString("Nombres");
                String strApellidos = rs.getString("Apellidos");
                String intNumConsultorio = rs.getString("Identifacion");
                String strEspecialidad = rs.getString("Direccion");
                String    intEdad = rs.getString("EdadAnios");
                Paciente objPaciente = new Paciente(intIdCatalogo, strNombres, strApellidos, intNumConsultorio, strEspecialidad, intEdad);
                lstPaciente.add(objPaciente);
            }
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstPaciente;   
    }
    
    
    
}
