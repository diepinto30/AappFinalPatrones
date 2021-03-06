package GUI;

import Validaciones.Validaciones;
import java.util.Calendar;
import Clases.classFacade;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class frmResgistopaciente extends javax.swing.JFrame {

    Validaciones validar = new Validaciones();
    classFacade objFacade = objFacade = new classFacade();
    DAOInterfaces.DAOPaciente MJDDAOPaciente = new DAO.DAOPacienteImpl();
    int intIdCatalogo = 0;

    public frmResgistopaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        strNameD = new javax.swing.JLabel();
        strNumeroC = new javax.swing.JLabel();
        txtNameP = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        txtDreccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        Dia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jlbApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtIdentifacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        strNameD.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strNameD.setText("Nombres:");

        strNumeroC.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strNumeroC.setText("Direccion:");

        txtNameP.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtNameP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamePActionPerformed(evt);
            }
        });
        txtNameP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamePKeyTyped(evt);
            }
        });

        btEntrar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Save_37110.png"))); // NOI18N
        btEntrar.setText(" Guardar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btlimpiar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btlimpiar.setText("Limpiar");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        txtDreccion.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtDreccion.setToolTipText("");
        txtDreccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDreccionKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDreccionKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel2.setText("Edad:");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiaActionPerformed(evt);
            }
        });

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "septiempre", "Octubre", "Nombre", "Diembre" }));

        Dia.setText("Dia");

        jLabel3.setText("Mes");

        jLabel4.setText("Año");

        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnioKeyPressed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 255, 0));
        jTextField1.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("REGISTRAR PACIENTES");

        jlbApellidos.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jlbApellidos.setText("Apellidos:");
        jlbApellidos.setToolTipText("");

        txtApellidos.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });

        txtIdentifacion.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel1.setText("Identicación:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strNameD)
                            .addComponent(jlbApellidos)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameP)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(strNumeroC)
                                .addGap(18, 18, 18)
                                .addComponent(txtDreccion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdentifacion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(262, 262, 262))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btlimpiar)
                                .addGap(95, 95, 95)))
                        .addComponent(btEntrar)
                        .addGap(158, 158, 158)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Dia)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strNameD)
                            .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDreccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbApellidos)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdentifacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Dia, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(5, 5, 5))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btlimpiar)
                            .addComponent(btEntrar))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Método Limpiar">  
    public void limpiar() {
        txtNameP.setText("");
        txtDreccion.setText("");
        txtApellidos.setText("");
        txtIdentifacion.setText("");
        txtAnio.setText("");
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Validar y Guardar los datos">  
    public void Validar() {

        int anio = Integer.parseInt(txtAnio.getText());
        String mes = (String) cmbMes.getSelectedItem();
        int meses = 0;
        if (mes.equals("Enero")) {
            meses = 1;
        }
        if (mes.equals("Febrero")) {
            meses = 2;
        }
        if (mes.equals("Marzo")) {
            meses = 3;
        }
        if (mes.equals("Abril")) {
            meses = 4;
        }
        if (mes.equals("Mayo")) {
            meses = 5;
        }
        if (mes.equals("Junio")) {
            meses = 6;
        }
        if (mes.equals("Julio")) {
            meses = 7;
        }
        if (mes.equals("Agosto")) {
            meses = 8;
        }
        if (mes.equals("Septiembre")) {
            meses = 9;
        }
        if (mes.equals("Octubre")) {
            meses = 10;
        }
        if (mes.equals("Noviembre")) {
            meses = 11;
        }
        if (mes.equals("Diciembre")) {
            meses = 12;
        }

        Calendar today = Calendar.getInstance();

        int diff_year = today.get(Calendar.YEAR) - anio;
        int diff_month = today.get(Calendar.MONTH) - meses;

        if ((diff_month < 0) || (diff_month == 0)) {
            diff_year = diff_year - 1;
        }
        txtEdad.setText(String.valueOf(diff_year));

        int intName = txtNameP.getText().length();
        int intApellido = txtApellidos.getText().length();
        int intIdenticacion = txtIdentifacion.getText().length();
        int intEad = txtAnio.getText().length();
        int intDireccion = txtDreccion.getText().length();

        String strNombre = txtNameP.getText();
        String strApellidos = txtApellidos.getText();
        String strIdentifacion = txtIdentifacion.getText();
        String intEdad = txtEdad.getText();
        String strDireccion = txtDreccion.getText();

        if ((intName == 0) || (intApellido == 0) || (intIdenticacion == 0) || (intEad == 0) || (intDireccion == 0)) {
            JOptionPane.showMessageDialog(null, "ERROR, NO ESTAN LLENOS TODO LOS REQUISITOS");
        } else {
            MJDDAOPaciente.Insert(objFacade.Pacientes(-1, strNombre, strApellidos, strIdentifacion, strDireccion, intEdad));
            JOptionPane.showMessageDialog(null, "DATOS CORRECTAMENTE GUARDADOS");
            limpiar();
        }
    } // </editor-fold> 

    private void txtNamePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamePActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
        Validar();
    }//GEN-LAST:event_btEntrarActionPerformed

    private void cmbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDiaActionPerformed

    private void txtNamePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamePKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtNamePKeyTyped

    private void txtDreccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDreccionKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtDreccionKeyTyped

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumeros(evt);
    }//GEN-LAST:event_txtAnioKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDreccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDreccionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDreccionKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtAnioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioKeyPressed

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtApellidosKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dia;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlbApellidos;
    private javax.swing.JLabel strNameD;
    private javax.swing.JLabel strNumeroC;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDreccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentifacion;
    private javax.swing.JTextField txtNameP;
    // End of variables declaration//GEN-END:variables
}
