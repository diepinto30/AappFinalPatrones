/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterfaces;

import Clases.Paciente;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface DAOPaciente {
    
    public void Insert(Paciente paciente);
    public ArrayList<Paciente> Select() throws Exception;
}
