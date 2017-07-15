package Clases;

public class Especialidades {

    public int intIdEspecialiadades;
    public String strNombre;

    public Especialidades() {

    }

    public Especialidades(int intIdEspecialiadades, String strNombre) {
        this.intIdEspecialiadades = intIdEspecialiadades;
        this.strNombre = strNombre;
    }

    public int getIntIdEspecialiadades() {
        return intIdEspecialiadades;
    }

    public void setIntIdEspecialiadades(int intIdEspecialiadades) {
        this.intIdEspecialiadades = intIdEspecialiadades;
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
