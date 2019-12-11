/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.Users;

import Helpers.UsuarioHelper;
import Models.Empresas;
import Models.Regiones;
import Models.TipoUsuario;
import Services.ServiceAdditional;
import Services.ServiceEmpresa;
import Services.ServiceUsuario;
import Services.Validations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import portafolio.misofertasescritorio.Home;

/**
 *
 * @author Acer
 */
public final class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form RegisterBusiness
     */
    public AddUser() {
        initComponents();
        CargarComplementos();
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
        bgOfertas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblIconoGuardar = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbcRegion = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JTextField();
        rbNo = new javax.swing.JRadioButton();
        rbSi = new javax.swing.JRadioButton();
        lblOferta = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPuntos = new javax.swing.JTextField();
        cbcEmpresas = new javax.swing.JComboBox<>();
        cbcTipoUsuario = new javax.swing.JComboBox<>();
        cbcComuna = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtPassword1 = new javax.swing.JPasswordField();
        txtPassword0 = new javax.swing.JPasswordField();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Empresa");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(866, 961));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 72, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 740, 20));

        txtCorreo.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 870, 180, 50));

        lblIconoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoGuardar.png"))); // NOI18N
        jPanel1.add(lblIconoGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 870, 60, 50));
        jPanel1.add(jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 360, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel5.setText("Direccion: No debe superar los 500 caracteres.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 800, 250, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel4.setText("Telefono: Solo debe ser caracteres numericos.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 780, 290, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel3.setText("Puntos: Solo debe ser caracteres numericos.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 780, 270, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel6.setText("Rut: Sin puntos y con guion verificador.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, 260, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel7.setText("Password: Ingrese una password segura.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, 270, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 120, 120));
        jLabel2.setText("Nota*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, 290, 20));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 800, 100));

        cbcRegion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcRegion.setForeground(new java.awt.Color(120, 120, 120));
        cbcRegion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Region", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 380, 50));
        cbcRegion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                RellenarComuna((String)cbcRegion.getSelectedItem());
            }
        });

        txtRut.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtRut.setForeground(new java.awt.Color(102, 102, 102));
        txtRut.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Rut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 380, -1));

        rbNo.setBackground(new java.awt.Color(255, 255, 255));
        bgOfertas.add(rbNo);
        rbNo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        rbNo.setForeground(new java.awt.Color(102, 102, 102));
        rbNo.setText("No");
        jPanel1.add(rbNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, 30));

        rbSi.setBackground(new java.awt.Color(255, 255, 255));
        bgOfertas.add(rbSi);
        rbSi.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        rbSi.setForeground(new java.awt.Color(102, 102, 102));
        rbSi.setSelected(true);
        rbSi.setText("Si");
        jPanel1.add(rbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 40, 30));

        lblOferta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "¿Suscribir a nuevas ofertas?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(lblOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 220, 70));

        lblFechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Fecha Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 380, 200));

        txtNombres.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 380, -1));

        txtApellidos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Apellidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 380, -1));

        txtTelefono.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 380, -1));

        txtPuntos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtPuntos.setForeground(new java.awt.Color(102, 102, 102));
        txtPuntos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Puntos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 150, 70));

        cbcEmpresas.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcEmpresas.setForeground(new java.awt.Color(120, 120, 120));
        cbcEmpresas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 380, 50));

        cbcTipoUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcTipoUsuario.setForeground(new java.awt.Color(120, 120, 120));
        cbcTipoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Tipo de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 380, 50));
        cbcTipoUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                SeleccionarCliente((TipoUsuario)cbcTipoUsuario.getSelectedItem());
            }
        });

        cbcComuna.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcComuna.setForeground(new java.awt.Color(120, 120, 120));
        cbcComuna.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Comuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 380, 50));

        lblTitulo.setBackground(new java.awt.Color(255, 127, 0));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ingrese los datos del Usuario");
        lblTitulo.setOpaque(true);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, 740, 20));

        txtPassword1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Repetir Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 380, 50));

        txtPassword0.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPassword0, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 380, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ServiceUsuario service = new ServiceUsuario();
        
        String nombre = txtNombres.getText();//
        String rut = txtRut.getText();//
        String apellido = txtApellidos.getText();//
        String correo = txtCorreo.getText();//
        String password = txtPassword0.getText();//
        String telefono0 = txtTelefono.getText();//
        String comuna = (String)cbcComuna.getSelectedItem();
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String fechaNacimiento = f.format(jCalendar.getDate());
        Boolean suscrito = rbSi.isSelected();
        String puntos0 = txtPuntos.getText();//
        Empresas empresa = (Empresas)cbcEmpresas.getSelectedItem();
        Long idEmpresa = empresa.getIDEmpresa();
        TipoUsuario tipoUsuario = (TipoUsuario)cbcTipoUsuario.getSelectedItem();
        Long idTipoUsuario = tipoUsuario.getIDTipoUsuario();
        
        //Formateo de entradas
        Long telefono1 = null;
        Long puntos1 = null;
        
        //Fin de formateo de entradas
        
        //Validaciones
        ArrayList<String> listaErrores = new ArrayList<>();
        
        if (!txtPassword0.getText().equals(txtPassword1.getText())) {
            listaErrores.add("Las password deben ser identicas");
        }
        
        if (!Validations.validarNoVacio(nombre)) {
            listaErrores.add("El nombre  no puede estar en blanco");
        }
        
        if (!Validations.validarNoVacio(rut)) {
            listaErrores.add("El RUT  no puede estar en blanco");
        }
        
        if (!Validations.validarNoVacio(apellido)) {
            listaErrores.add("El Apellido  no puede estar en blanco");
        }
        
        if (!Validations.validarNoVacio(correo)) {
            listaErrores.add("El Correo  no puede estar en blanco");
        }
        
        if (!Validations.validarNoVacio(password)) {
            listaErrores.add("El Password  no puede estar en blanco");
        }
        
        
        if (!Validations.validarNoVacio(telefono0)) {
            listaErrores.add("El Telefono no puede estar en blanco");
        }
        telefono1 = Validations.validarNumeroLong(telefono0);
        if (telefono1 == Long.parseLong("0")) {
            listaErrores.add("El Telefono no puede contener letras");
        }
        
        if (!Validations.validarNoVacio(puntos0)) {
            listaErrores.add("Los puntos no pueden estar en blanco");
        }
        puntos1 = Validations.validarNumeroLong(puntos0);
        if (puntos1 == Long.parseLong("0")) {
            listaErrores.add("Los puntos no pueden contener letras");
        }
        //Fin validaciones
        
        System.out.println(fechaNacimiento);
        
        //Agregar Usuario
        if (listaErrores.isEmpty()) {
            JPasswordField pass0 = new JPasswordField();
            JOptionPane.showConfirmDialog(null, pass0, "Ingrese su Password", JOptionPane.OK_CANCEL_OPTION);
            String pass1 = Convertir(pass0.getPassword());
            
            if (pass1.equals(Home.passTemporal)) {
                UsuarioHelper usuario = new UsuarioHelper(rut, nombre, apellido, correo, password, telefono1, comuna, fechaNacimiento, suscrito, puntos1, idTipoUsuario, idEmpresa);
                service.AgregarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                dispose();
            }else{
                 JOptionPane.showMessageDialog(null, "Password Incorrecto");
            }
            
            
        }else{
            String errores = "";
            for (int i = 0; i < listaErrores.size(); i++) {
                errores += listaErrores.get(i)+"\n";
            }
            JOptionPane.showMessageDialog(null, errores);
        }
        //Fin agregar usuario
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }
    
    public void CargarComplementos(){
        ServiceEmpresa serviceEmpresa = new ServiceEmpresa();
        
        ArrayList<Empresas> listaEmpresas;
        listaEmpresas = serviceEmpresa.ListarEmpresas();
        
        for (int i = 0; i < listaEmpresas.size(); i++) {
            cbcEmpresas.addItem(listaEmpresas.get(i));
        }
    }
    
    //Comienzo de Carga de JComboBox dinamico y dependiente
    ServiceAdditional serviceAdditional = new ServiceAdditional();
    
    public void CargarComponentes(){
        
        CargarRegion();
        CargarTipousuario();
        
    }
    
    public void CargarTipousuario(){
        ServiceUsuario serviceUsuario = new ServiceUsuario();
        ArrayList<TipoUsuario> listaTipousuario;
        listaTipousuario = serviceUsuario.ListaTipoUsuario();
        
        for (int i = 0; i < listaTipousuario.size(); i++) {
            cbcTipoUsuario.addItem(listaTipousuario.get(i));
        }
    }
    
    public void CargarRegion(){
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
    
    private String Convertir(char[] pass){
        String contra = "";
        
        for (int i = 0; i < pass.length; i++) {
            contra += pass[i];
        }
        return contra;
    }
    
    public void SeleccionarCliente(TipoUsuario usuario){
        cbcEmpresas.setEnabled(true);
        if (usuario.getIDTipoUsuario() == 2) {
            for (int i = 0; i < cbcEmpresas.getItemCount(); i++) {
                if (cbcEmpresas.getItemAt(i).getIDEmpresa() == 1007) {
                    cbcEmpresas.setSelectedItem(cbcEmpresas.getItemAt(i));
                    cbcEmpresas.setEnabled(false);
                    break;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOfertas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbcComuna;
    private javax.swing.JComboBox<Empresas> cbcEmpresas;
    private javax.swing.JComboBox<String> cbcRegion;
    private javax.swing.JComboBox<TipoUsuario> cbcTipoUsuario;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIconoGuardar;
    private javax.swing.JLabel lblOferta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword0;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtPuntos;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
