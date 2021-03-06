package GUI;

import Clases.Doctor;
import Clases.Paciente;
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
public class frmResgistrocita extends javax.swing.JFrame {

    Validaciones validar = new Validaciones();
    classFacade objFacade = objFacade = new classFacade();
    DAOInterfaces.DAODoctor MJDDAODoctor = new DAO.DAODoctorImpl();
    DAOInterfaces.DAOPaciente MJDDAOPaciente = new DAO.DAOPacienteImpl();
    DAOInterfaces.DAOCita MJDDAOCita = new DAO.DAOCitaImpl();
    int intIdCatalogo = 0;

    public frmResgistrocita() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            CargavaloresDoctores();
            CargavaloresPacientes();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        strApellidos = new javax.swing.JLabel();
        strUsername = new javax.swing.JLabel();
        btLimpiar = new javax.swing.JButton();
        btEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        srtCelular = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblRessultado1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        strId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConsultorio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jbtActualizar = new javax.swing.JButton();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        cmbAnia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        strApellidos.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strApellidos.setText("Fecha de la cita:");
        getContentPane().add(strApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, 20));

        strUsername.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strUsername.setText("Hora:");
        getContentPane().add(strUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, -1, 20));

        btLimpiar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, -1, 40));

        btEnviar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Save_37110.png"))); // NOI18N
        btEnviar.setText(" Guardar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, 50));

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel2.setText("Medico Tratante:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 20));

        txtDoctor.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        getContentPane().add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 188, 30));

        srtCelular.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        srtCelular.setText("Paciente:");
        getContentPane().add(srtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, 20));

        txtPaciente.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        getContentPane().add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 180, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 123, -1, 162));
        getContentPane().add(lblRessultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(967, 536, -1, -1));

        jTable2.setFont(new java.awt.Font("OCR A Std", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 368, -1, 156));

        strId.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strId.setText("Id de la Cita:");
        getContentPane().add(strId, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, 20));

        txtId.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 75, 30));

        jLabel3.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel3.setText("Consultorio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, 20));

        txtConsultorio.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        getContentPane().add(txtConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 42, 30));

        jButton1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/x-mark-hi.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, -1, 40));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("PACIENTES");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));

        jbtActualizar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jbtActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reportbaby-iconos-04.png"))); // NOI18N
        jbtActualizar.setText("Actualizar Listas");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 554, -1, -1));

        cmbDia.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, 30));

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel1.setText("Día:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, 20));

        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel4.setText("Mes:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, 20));

        cmbMes.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" }));
        getContentPane().add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, 30));

        cmbAnia.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        cmbAnia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018" }));
        getContentPane().add(cmbAnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, 30));

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel5.setText("Año:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, 20));

        cmbHora.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana", "08h00", "08h30", "09h00", "09h30", "10h30", "11h00", "11h30", "12h00", "Trade", "14h00", "14h30", "15h00", "15h30", "16h00", "16h30", "17h00", "17h30", "18h00", "18h30", "19h00" }));
        getContentPane().add(cmbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 103, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 102, 255));
        jTextField2.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("REGISTRAR CITAS");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 970, 64));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 204, 51));
        jTextField3.setFont(new java.awt.Font("OCR A Std", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("DOCTORES");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 81, -1, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 102, 255));
        jTextField4.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, 620));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/citas.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Método Limpiar">  
    public void limpiar() {
        txtDoctor.setText("");
        txtId.setText("");
        txtConsultorio.setText("");
        txtPaciente.setText("");
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Método Tabla1 Doctores">  
    @SuppressWarnings("empty-statement")
    public void CargavaloresDoctores() {
        //Como el método de la BL retorna un ArrayList de la clase Estudiantes
        //Aqui lo recuperamos
        ArrayList<Doctor> lstDoctors = null;
        try {
            lstDoctors = MJDDAODoctor.Select();
        } catch (Exception ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        }

        Object columnas[] = {"Nombre", "Apellido", "Especialidad", "Consultorio"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTable1.setModel(modelo);

        for (Doctor objeto : lstDoctors) {
            String id = String.valueOf(objeto.getIdDoctor());
            //String strNombre=String.valueOf(objeto.getStrNombre());
            //String strApellido=String.valueOf(objeto.getStrApellido());
            //String strEspecialidad=String.valueOf(objeto.getStrEspecialidad());
            //String strConsultorio=String.valueOf(objeto.getStrNumeroConsultorio());

            String modeloTemp[] = {objeto.getStrNombres(), objeto.getStrApellidos(), objeto.getStrEspecialidad(), objeto.getStrNumeroConsultorio()};
            modelo.addRow(modeloTemp);
        }
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Método Tabla2 Pacientes">  
    @SuppressWarnings("empty-statement")
    public void CargavaloresPacientes() throws ClassNotFoundException, SQLException {
        //Como el método de la BL retorna un ArrayList de la clase Estudiantes
        //Aqui lo recuperamos
        ArrayList<Paciente> lstPacientes = null;
        try {
            lstPacientes = MJDDAOPaciente.Select();
        } catch (Exception ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object columnas[] = {"Nombre", "Apellido", "Identifacion", "Edad"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTable2.setModel(modelo);

        for (Paciente objeto : lstPacientes) {
            //String id=String.valueOf(objeto.getStrCodigo());
            String strNombres=String.valueOf(objeto.getStrNombres());
            String strApellidoss=String.valueOf(objeto.getStrApellidos());
            String strIdentifacion=String.valueOf(objeto.getStrIdentifacion());
            String intEdad=String.valueOf(objeto.getIntEdad());

            String modeloTemp[] = {strNombres,strApellidoss,strIdentifacion,intEdad};
            modelo.addRow(modeloTemp);
        }
    }/// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Validar y guardar datos">  
    public void Validar() {
        String strFecha = "";
        String strHora = "";
        int intPacientes = txtPaciente.getText().length();
        int intDoctor = txtDoctor.getText().length();

        String dia = (String) cmbDia.getSelectedItem();
        String mes = (String) cmbMes.getSelectedItem();
        String anio = (String) cmbAnia.getSelectedItem();
        strFecha = strFecha.format(dia + "/" + mes + "/" + anio);
        String hora = (String) cmbHora.getSelectedItem();

        String strIdCita = txtId.getText();
        String strNombreMe = txtDoctor.getText();
        String strConsultorio = txtConsultorio.getText();
        String strNombrePaciente = txtPaciente.getText();

        

        if ((intPacientes == 0) || (intDoctor == 0)) {
            JOptionPane.showMessageDialog(null, "ERROR, NO ESTAN LLENOS TODO LOS REQUISITOS");
        } else {
           MJDDAOCita.Insert(objFacade.Citas(-1, strIdCita, strFecha, hora, strNombreMe, strConsultorio, strNombrePaciente));
            JOptionPane.showMessageDialog(null, "CITA CORRECTAMENTE REGISTRADA");
            limpiar();
        }
    }// </editor-fold> 


    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
        Validar();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modelo1 = (DefaultTableModel) jTable2.getModel();
        


    }//GEN-LAST:event_btEnviarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //        String strId=jTable2.getModel().getValueAt(row, 0).toString();

        String strValor1 = null;
        String strValor2 = null;
        String strValor3 = null;
        int row = (int) jTable1.getSelectedRow();
        //Obtiene el valor de la seleccion
        //Muestra en la eqiqueta
        //Columna 0
        strValor1 = (String) jTable1.getModel().getValueAt(row, 0);
        strValor2 = (String) jTable1.getModel().getValueAt(row, 1);
        txtDoctor.setText(strValor1 + " " + strValor2);
        strValor3 = (String) jTable1.getModel().getValueAt(row, 3);
        txtConsultorio.setText(strValor3);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

        String strValorr1 = null;
        String strValorr2 = null;
        int row = (int) jTable2.getSelectedRow();
        //Obtiene el valor de la seleccion
        //Muestra en la eqiqueta
        //Columna 0
        strValorr1 = (String) jTable2.getModel().getValueAt(row, 0);
        strValorr2 = (String) jTable2.getModel().getValueAt(row, 1);
        txtPaciente.setText(strValorr1 + " " + strValorr2);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        try {
            CargavaloresDoctores();
            CargavaloresPacientes();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(frmResgistrocita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void cmbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDiaActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumeros(evt);
    }//GEN-LAST:event_txtIdKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JComboBox<String> cmbAnia;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JLabel lblRessultado1;
    private javax.swing.JLabel srtCelular;
    private javax.swing.JLabel strApellidos;
    private javax.swing.JLabel strId;
    private javax.swing.JLabel strUsername;
    private javax.swing.JTextField txtConsultorio;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
