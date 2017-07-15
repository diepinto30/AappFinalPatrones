/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author diego
 */
public class Especialidades {
    
    public int intIdEspecialiadades;
    public String strNombre;

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
    
    
}
