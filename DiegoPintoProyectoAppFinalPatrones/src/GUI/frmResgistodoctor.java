package GUI;

import java.util.ArrayList;
import Clases.Especialidades;
import Clases.classFacade;
import javax.swing.JOptionPane;
import Validaciones.Validaciones;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class frmResgistodoctor extends javax.swing.JFrame {

    BL.BLDoctor ManejadorBL = new BL.BLDoctor();
    BL.BLEspecialidades ManejadorBLEs = new BL.BLEspecialidades();
    Validaciones validar = new Validaciones();
    classFacade objFacade = objFacade = new classFacade();
    DAOInterfaces.DAODoctor MJDDAODoctor = new DAO.DAODoctorImpl();
    
    int intIdCatalogo = 0;

    public frmResgistodoctor() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        CagarComboCatalogo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        strNameD = new javax.swing.JLabel();
        txtNameD = new javax.swing.JTextField();
        strNumeroC = new javax.swing.JLabel();
        txtNumeroC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        strEstado = new javax.swing.JLabel();
        btlimpiar = new javax.swing.JButton();
        btEntrar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        cmbEspedialidad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        strNameD.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strNameD.setText("Nombre:");

        txtNameD.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtNameD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameDActionPerformed(evt);
            }
        });
        txtNameD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameDKeyTyped(evt);
            }
        });

        strNumeroC.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strNumeroC.setText("Numero Consultorio:");

        txtNumeroC.setToolTipText("");
        txtNumeroC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel2.setText("Especialidad:");

        strEstado.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        strEstado.setText("Estado");

        btlimpiar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btlimpiar.setText("Limpiar");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        btEntrar.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Save_37110.png"))); // NOI18N
        btEntrar.setText("Guardar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 0));
        jTextField1.setFont(new java.awt.Font("OCR A Std", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("REGISTRAR DOCTORES");

        cmbEspedialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEspedialidad.setSelectedIndex(-1);
        cmbEspedialidad.setToolTipText("");
        cmbEspedialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbEspedialidadMouseClicked(evt);
            }
        });
        cmbEspedialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspedialidadActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jLabel1.setText("Apellidos:");

        txtApellido.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Activo", "Inactivo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(strEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strNameD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strNumeroC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEspedialidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(strNameD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(strNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEspedialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(strEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpiar)
                    .addComponent(btEntrar))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Método Limpiar">  
    public void limpiar() {
        txtNameD.setText("");
        txtNumeroC.setText("");
        txtApellido.setText("");
        cmbEspedialidad.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);

    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Insertar base">  
    public void Insertar() throws Exception {

        int intName = txtNameD.getText().length();
        int intNumeroC = txtNumeroC.getText().length();
        int intApellido = txtApellido.getText().length();

        String strNombre = txtNameD.getText();
        String strApellidos = txtApellido.getText();
        String intConsultorio = txtNumeroC.getText();
        String strEspecialidad = cmbEspedialidad.getSelectedItem().toString();
        int intEstado = cmbEstado.getSelectedIndex();

        if ((intName == 0) || (intNumeroC == 0) || (intApellido == 0)) {
            JOptionPane.showMessageDialog(null, "ERROR, NO ESTAN LLENOS TODO LOS REQUISITOS");
        } else {
            MJDDAODoctor.Insert(objFacade.Dotores(-1, strNombre, strApellidos, intConsultorio, strEspecialidad, intEstado));
            JOptionPane.showMessageDialog(null, "DATOS CORRECTAMENTE GUARDADOS");
            limpiar();
        }
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Cargar Combo box Base de datos">  
    public void CagarComboCatalogo() {
        DefaultComboBoxModel cmbModel = new DefaultComboBoxModel();
        ArrayList<Especialidades> lstEspecialidades = new ArrayList<>();
        lstEspecialidades = ManejadorBLEs.ConsultarCatalogo();

        for (Especialidades catalogo : lstEspecialidades) {
            Especialidades objCatalogo = new Especialidades(catalogo.getIntIdEspe(), catalogo.getStrNombre());
            cmbModel.addElement(objCatalogo);
            cmbEspedialidad.setModel(cmbModel);
        }
        cmbEspedialidad.insertItemAt("Seleccione...", 0);
        cmbEspedialidad.setSelectedIndex(0);
    }// </editor-fold>


    private void txtNameDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameDActionPerformed
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtNameDActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        try {
            Insertar();
        } catch (Exception ex) {
            Logger.getLogger(frmResgistodoctor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btEntrarActionPerformed

    private void txtNameDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameDKeyTyped
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtNameDKeyTyped

    private void txtNumeroCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumeros(evt);
    }//GEN-LAST:event_txtNumeroCKeyTyped

    private void cmbEspedialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspedialidadActionPerformed
        System.out.println("Index: " + cmbEspedialidad.getSelectedIndex());
        System.out.println("Item: " + cmbEspedialidad.getSelectedItem());
    }//GEN-LAST:event_cmbEspedialidadActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbEspedialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEspedialidadMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbEspedialidadMouseClicked

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
        validar.ForzarMayusculas(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbEspedialidad;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel strEstado;
    private javax.swing.JLabel strNameD;
    private javax.swing.JLabel strNumeroC;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNameD;
    private javax.swing.JTextField txtNumeroC;
    // End of variables declaration//GEN-END:variables
}
