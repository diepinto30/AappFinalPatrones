/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterfaces;

import Clases.Cita;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public interface DAOCita {
    public void Insert(Cita citas);
    public ArrayList<Cita> Select() throws Exception;
    //public void Update(Doctor objDoc) throws Exception;
    //public void Delete(Doctor objDoc) throws Exception;
}
