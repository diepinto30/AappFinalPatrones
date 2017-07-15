package BL;
import Clases.Cita;
import DAT.DATConexion;
import DAT.DATCitas;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BLCitas 
{
    DATCitas mp = new DATCitas();//Llama al clase DATCitas crea un obj
    
    //Recuperando el objeto que se envia desde la ui
    public int InsertarCatalogoObjeto(Cita objCitas) {
        return mp.InsertarCatalogo(objCitas.getIntIdCita(), objCitas.getFecha(), objCitas.getHora(), objCitas.getNombreD(), objCitas.getConsultorio(), objCitas.getPaciente());
    }
    
    public int InsertarCatalogoLista(ArrayList<Cita>lstAdmin) {
        //return mp.InsertarCatalogo(CodCatalogo, NombreCatalogo, EstadoCatalogo);
        return 0;
    }
            /*
            INSERT INTO `CitasMedicas`(`idCitasMedicas`, `idCita`, `Fecha`, `Hora`, `NombreMedico`, `Consultorio`, `NombrePaciente`)
            */
    
    public ArrayList<Cita> ConsultarCatalogo() {
        ArrayList<Cita> lstCitas = new ArrayList<>();
        try{
            ResultSet rs = mp.ConsultarCatalogo();
            while(rs.next()){
                int intIdCatalogo = rs.getInt("idCitasMedicas");
                String strIdCitas = rs.getString("idCita");
                String strFecha = rs.getString("Fecha");
                String strHora = rs.getString("Hora");
                String strNombreMedico = rs.getString("NombreMedico");
                String strConsultorio= rs.getString("Consultorio");
                String strNombrePaciente = rs.getString("NombrePaciente");
                Cita objCitas = new Cita(intIdCatalogo, strIdCitas, strFecha, strHora, strNombreMedico, strConsultorio, strNombrePaciente);
                lstCitas.add(objCitas);
            }
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return lstCitas;   
    }
    
    public int ActualizarCatalogo(String idcitas, String Fecha, String Hora, String Consultorio,String nombreDoc){
        int resultado = mp.ActualizarCatalogo(idcitas, Fecha, Hora, nombreDoc, Consultorio);
        return resultado;
    }
    
    
}
