package Clases;

public class Persona {

    private String strNombres;
    private String strApellidos;

    public Persona(String strNombres, String strApellidos) {
        this.strNombres = strNombres;
        this.strApellidos = strApellidos;
    }

    public Persona() {

    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrApellidos() {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

}
