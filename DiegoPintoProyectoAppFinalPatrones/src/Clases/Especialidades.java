package Clases;

public class Especialidades {

    public int intIdEspe;
    public String strNombre;

    public Especialidades() {

    }

    public Especialidades(int intIdEspe, String strNombre) {
        this.intIdEspe = intIdEspe;
        this.strNombre = strNombre;
    }

    public int getIntIdEspe() {
        return intIdEspe;
    }

    public void setIntIdEspe(int intIdEspe) {
        this.intIdEspe = intIdEspe;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }
    
    @Override
    public String toString() {
        return strNombre;
    }

}
