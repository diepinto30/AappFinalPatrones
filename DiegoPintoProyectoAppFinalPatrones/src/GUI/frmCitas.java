/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cita;
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

    BL.BLCitas ManejadorBL = new BL.BLCitas();
    Validaciones validar = new Validaciones();
    
    public frmCitas() throws ClassNotFoundException, SQLException {
        
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            CargavaloresCitas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Método Limpiar">
    public void limpiar(){
        txtConsultorio.setText("");
        txtFecha.setText("");
        txtHora.setText("");   
    }// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Método Tabla1 Citas">  
    @SuppressWarnings("empty-statement")
    public void CargavaloresCitas() throws ClassNotFoundException, SQLException {
        //Como el método de la BL retorna un ArrayList de la clase Estudiantes
        //Aqui lo recuperamos
        ArrayList<Cita> lstCitas = ManejadorBL.ConsultarCatalogo();

        Object columnas[] = {"Id Cita","Paciente", "Medico", "Consultorio", "Fecha de la consulta", "Hora"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTable1.setModel(modelo);

        for (Cita objeto : lstCitas) {
            //String id = String.valueOf(objeto.getIntId());
            String strNombreP=String.valueOf(objeto.getPaciente());
            String strNombreM=String.valueOf( objeto.getNombreD());
            String strConsultorio=String.valueOf(objeto.getConsultorio());
            String strFecha=String.valueOf(objeto.getFecha());
            String strHora=String.valueOf(objeto.getHora());
            String stridCita=String.valueOf(objeto.getIntIdCita());

            String modeloTemp[] = {stridCita, strNombreP, strNombreM, strConsultorio, strFecha, strHora};
            modelo.addRow(modeloTemp);
        }
    }// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Modificar">
    public void Modificar(){ 
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
            ManejadorBL.ActualizarCatalogo(strIdCita, strFecha, strHora, strMedico, strConsultorio);
            JOptionPane.showMessageDialog(null, "El registro hacido modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El registro no fue modificado");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 255));
        jTextField1.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CITAS ACTUALES");

        jbtActualizar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jbtActualizar.setText("Actualizar Listas");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });

        jbtModificar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel1.setText("Nombre Medico");

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

        txtConsultorio.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtConsultorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultorioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel2.setText("Fecha de la Cita");

        txtFecha.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel3.setText("Hora de la Cita");

        txtHora.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel4.setText("Nombre Paciente");

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

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel5.setText("Id Cita");

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

        jLabel6.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel6.setText("Consultorio");

        txtMedico.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedicoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtidCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtActualizar)
                        .addGap(324, 324, 324))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jbtModificar)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jbtActualizar)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtModificar)
                    .addComponent(jButton2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void TxtBloqueados(){
        txtidCitas.setEditable(false);
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
        try {
            // TODO add your handling code here:
            CargavaloresCitas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        // TODO add your handling code here:
        Modificar();
        TxtBloqueados();
        try {
            CargavaloresCitas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    // End of variables declaration//GEN-END:variables
}
