package GUI;

import Clases.Cita;
import Clases.classFacade;
import Validaciones.Validaciones;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class frmCitas extends javax.swing.JFrame {

    Validaciones validar = new Validaciones();
    DAOInterfaces.DAOCita MJDDAOCita = new DAO.DAOCitaImpl();
    classFacade objFacade = new classFacade();

    public frmCitas() throws ClassNotFoundException, SQLException {

        initComponents();
        TxtBloqueados();
        this.setLocationRelativeTo(null);
        CargavaloresCitas();

    }

    // <editor-fold defaultstate="collapsed" desc="Método Limpiar">
    public void limpiar() {
        txtConsultorio.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtidCitas.setText("");
        txtMedico.setText("");
        txtPaciente.setText("");
        txtidCitas1.setText("");
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Método Tabla1 Citas">  
    @SuppressWarnings("empty-statement")
    public void CargavaloresCitas() {
        //Como el método de la BL retorna un ArrayList de la clase Estudiantes
        //Aqui lo recuperamos

        ArrayList<Cita> lstCitas = null;
        try {
            lstCitas = MJDDAOCita.Select();
        } catch (Exception ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }

        Object columnas[] = {"Id Cita", "Paciente", "Medico", "Consultorio", "Fecha de la consulta", "Hora"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTable1.setModel(modelo);

        for (Cita objeto : lstCitas) {
            String strNombreP = String.valueOf(objeto.getPaciente());
            String strNombreM = String.valueOf(objeto.getNombreD());
            String strConsultorio = String.valueOf(objeto.getConsultorio());
            String strFecha = String.valueOf(objeto.getFecha());
            String strHora = String.valueOf(objeto.getHora());
            String stridCita = String.valueOf(objeto.getIntIdCita());

            String modeloTemp[] = {stridCita, strNombreP, strNombreM, strConsultorio, strFecha, strHora};
            modelo.addRow(modeloTemp);
        }
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Modificar">
    public void Modificar() throws Exception {
        Cita objCitas;
        String strNombrePaciente = txtPaciente.getText();
        String strFecha = txtFecha.getText();
        String strHora = txtHora.getText();
        String strIdCita = txtidCitas.getText();
        String strMedico = txtMedico.getText();
        String strConsultorio = txtConsultorio.getText();

        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "Desea Actualizar los datos seleccionados", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            MJDDAOCita.Update(strIdCita, strFecha, strHora, strMedico, strConsultorio);
            JOptionPane.showMessageDialog(null, "El registro hacido modificado exitosamente");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "El registro no fue modificado");
        }

    }// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Eliminar">
    public void Eliminar() throws Exception {
        String IdCitas = txtidCitas1.getText();

        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "Desea Eliminar los datos seleccionados", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            MJDDAOCita.Delete(IdCitas);
            JOptionPane.showMessageDialog(null, "El registro que  fue seleccionado hacido eliminado correctamente");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "El registro no fue eliminado");
        }

    }
    // </editor-fold> 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jbtActualizar = new javax.swing.JButton();
        jbtModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtConsultorio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtidCitas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtidCitas1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 82, 970, 119));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 255));
        jTextField1.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CITAS ACTUALES");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 64));

        jbtActualizar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jbtActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reportbaby-iconos-04.png"))); // NOI18N
        jbtActualizar.setText("Actualizar Listas");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 224, -1, -1));

        jbtModificar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jbtModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reportbaby-iconos-04.png"))); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 368, -1, -1));

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel1.setText("Nombre Medico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 295, -1, -1));

        jButton2.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/x-mark-hi.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 372, -1, -1));

        txtConsultorio.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtConsultorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultorioKeyTyped(evt);
            }
        });
        getContentPane().add(txtConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 322, 45, -1));

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel2.setText("Fecha de la Cita");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 295, -1, -1));

        txtFecha.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 324, 144, -1));

        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel3.setText("Hora de la Cita");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 299, -1, -1));

        txtHora.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 324, 132, -1));

        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel4.setText("Nombre Paciente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        txtidCitas.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtidCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidCitasActionPerformed(evt);
            }
        });
        txtidCitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidCitasKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidCitasKeyPressed(evt);
            }
        });
        getContentPane().add(txtidCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 71, -1));

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel5.setText("Id Cita");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 72, -1));

        txtPaciente.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteActionPerformed(evt);
            }
        });
        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 144, -1));

        jLabel6.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel6.setText("Consultorio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 295, -1, -1));

        txtMedico.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedicoKeyTyped(evt);
            }
        });
        getContentPane().add(txtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 322, 144, -1));

        jButton1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        jButton1.setText("Eliminar Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, 50));

        jLabel7.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel7.setText("Id Cita");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 72, -1));

        txtidCitas1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtidCitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidCitas1ActionPerformed(evt);
            }
        });
        txtidCitas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidCitas1KeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidCitas1KeyPressed(evt);
            }
        });
        getContentPane().add(txtidCitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 71, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void TxtBloqueados() {
        txtidCitas.setEditable(false);
        txtidCitas1.setEditable(false);
        txtPaciente.setEditable(false);
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String strValor1 = null;
        String strValor2 = null;
        String strValor3 = null;
        String strValor4 = null;
        String strValor5 = null;
        String strValor6 = null;
        int row = (int) jTable1.getSelectedRow();
        //Obtiene el valor de la seleccion
        //Muestra en la eqiqueta
        //Columna 0
        strValor1 = (String) jTable1.getModel().getValueAt(row, 0);
        txtidCitas.setText(strValor1);
        txtidCitas1.setText(strValor1);

        strValor2 = (String) jTable1.getModel().getValueAt(row, 1);
        txtPaciente.setText(strValor2);

        strValor3 = (String) jTable1.getModel().getValueAt(row, 2);
        txtMedico.setText(strValor3);

        strValor4 = (String) jTable1.getModel().getValueAt(row, 3);
        txtConsultorio.setText(strValor4);

        strValor5 = (String) jTable1.getModel().getValueAt(row, 4);
        txtFecha.setText(strValor5);

        strValor6 = (String) jTable1.getModel().getValueAt(row, 5);
        txtHora.setText(strValor6);
        TxtBloqueados();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        // TODO add your handling code here:
        CargavaloresCitas();
        TxtBloqueados();
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        try {
            // TODO add your handling code here:
            Modificar();
        } catch (Exception ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        TxtBloqueados();
        CargavaloresCitas();

    }//GEN-LAST:event_jbtModificarActionPerformed

    private void txtConsultorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultorioKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumeros(evt);
    }//GEN-LAST:event_txtConsultorioKeyTyped

    private void txtidCitasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidCitasKeyTyped

    }//GEN-LAST:event_txtidCitasKeyTyped

    private void txtidCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidCitasActionPerformed
        // TODO add your handling code here:
        TxtBloqueados();

    }//GEN-LAST:event_txtidCitasActionPerformed

    private void txtPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacienteActionPerformed

    }//GEN-LAST:event_txtPacienteActionPerformed

    private void txtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtPacienteKeyTyped

    private void txtMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicoKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtMedicoKeyTyped

    private void txtidCitasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidCitasKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtidCitasKeyPressed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtidCitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidCitas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidCitas1ActionPerformed

    private void txtidCitas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidCitas1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidCitas1KeyTyped

    private void txtidCitas1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidCitas1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidCitas1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Eliminar();
            CargavaloresCitas();
        } catch (Exception ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtidCitas;
    private javax.swing.JTextField txtidCitas1;
    // End of variables declaration//GEN-END:variables
}
