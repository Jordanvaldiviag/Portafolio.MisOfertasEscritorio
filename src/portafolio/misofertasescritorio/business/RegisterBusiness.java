/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.business;

import Helpers.EmpresaHelper;
import Services.ServiceEmpresa;
import Atxy2k.CustomTextField.RestrictedTextField;
import Models.Regiones;
import Services.ServiceAdditional;
import Services.Validations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Acer
 */
public final class RegisterBusiness extends javax.swing.JFrame {

    /**
     * Creates new form RegisterBusiness
     */
    public RegisterBusiness() {
        initComponents();
        Restricciones();
        CargarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cbcComuna = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbcRegion = new javax.swing.JComboBox<>();
        txtActividad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblIconoGuardar = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Empresa");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 657));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 617));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 617));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 617));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbcComuna.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcComuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcComuna.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Comuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 350, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 72, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 760, 60));

        txtRut.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtRut.setForeground(new java.awt.Color(102, 102, 102));
        txtRut.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Rut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 380, -1));

        txtTelefono.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 380, -1));

        cbcRegion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcRegion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Region", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 350, 50));
        cbcRegion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                RellenarComuna((String)cbcRegion.getSelectedItem());
            }
        });

        txtActividad.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtActividad.setForeground(new java.awt.Color(102, 102, 102));
        txtActividad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Actividad Economica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 350, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(78, 204, 44));
        btnGuardar.setText("Registrar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 204, 44), 2, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 250, 50));

        lblIconoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoGuardar.png"))); // NOI18N
        jPanel1.add(lblIconoGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 60, 50));

        txtRazonSocial.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtRazonSocial.setForeground(new java.awt.Color(102, 102, 102));
        txtRazonSocial.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Razon Social", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        jPanel1.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, -1));

        lblTitulo.setBackground(new java.awt.Color(255, 127, 0));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ingrese los datos de la Empresa");
        lblTitulo.setOpaque(true);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 690, 20));

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 620, 80));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel5.setText("Direccion: No debe superar los 500 caracteres.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 250, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel3.setText("Rut: Sin puntos y con guion verificador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 270, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 120, 120));
        jLabel2.setText("Nota*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 290, 20));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel4.setText("Telefono: Solo debe ser caracteres numericos.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 290, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 690, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        ServiceEmpresa servicio = new ServiceEmpresa();
        
        
        String nombre = txtRazonSocial.getText();
        String direccion = txtDireccion.getText();
        long telefono = Validations.validarNumeroLong(txtTelefono.getText());
        String comuna = (String)cbcComuna.getSelectedItem();
        String region = (String)cbcRegion.getSelectedItem();
        String rut = txtRut.getText();
        String actividad = txtActividad.getText();
        
        //Validaciones
        ArrayList<String> listaErrores = new ArrayList<>();
        
        if (!Validations.validarNoVacio(nombre)) {
            listaErrores.add("La Razon Social no puede estar en blanco");
        }
        
        if (telefono == 0 ) {
            listaErrores.add("El Telefono no puede contener caracteres alfanumericos");
        }
        
        if (!Validations.validarNoVacio(direccion)) {
            listaErrores.add("La Direccion no puede estar en blanco");
        }
        if (!Validations.validarNoVacio(rut)) {
            listaErrores.add("El RUT no puede estar en blanco");
        }
        if (!Validations.validarNoVacio(actividad)) {
            listaErrores.add("La Actividad Economica no puede estar en blanco");
        }
        
        
        //Agregar Empresa
        if (listaErrores.isEmpty()) {
            EmpresaHelper empresa = new EmpresaHelper(nombre, direccion, telefono, comuna, region, rut, actividad);
            servicio.AgregarEmpresa(empresa);
            JOptionPane.showMessageDialog(null, "Empresa Creada");
            dispose();
        }else{
            String errores = "";
            for (int i = 0; i < listaErrores.size(); i++) {
                errores += listaErrores.get(i)+"\n";
            }
            JOptionPane.showMessageDialog(null, errores);
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonSocialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterBusiness().setVisible(true);
            }
        });
    }
    
    //Capa de restricciones
    public void Restricciones(){
        //Restriccion de telefono
        RestrictedTextField restricted = new RestrictedTextField(txtTelefono);
        restricted.setOnlyNums(true);
    }
    //Fin de restricciones
    
    //Comienzo de Carga de JComboBox dinamico y dependiente
    ServiceAdditional serviceAdditional = new ServiceAdditional();
    
    public void CargarComponentes(){
        
        ArrayList <Regiones> regiones;
        regiones = serviceAdditional.ListarRegiones();
        
        for (Regiones regione : regiones) {
            cbcRegion.addItem(regione.getRegion());
        }
    }
    
    public void RellenarComuna(String selectItemCbc){
        cbcComuna.removeAllItems();
        ArrayList <Regiones> regiones;
        regiones = serviceAdditional.ListarRegiones();
        
        for (int i = 0; i < regiones.size(); i++) {
            if (regiones.get(i).getRegion().equals(selectItemCbc)) {
                cbcComuna.setModel(new javax.swing.DefaultComboBoxModel<>(regiones.get(i).getComunas()));
                break;
            }
        }
    }
    //Fin de la carga dinamica
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbcComuna;
    private javax.swing.JComboBox<String> cbcRegion;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblIconoGuardar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
