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
import Models.Usuario;
import Services.ServiceAdditional;
import Services.ServiceEmpresa;
import Services.ServiceUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author Acer
 */
public final class UpdateUsers extends javax.swing.JFrame {

    ServiceUsuario service = new ServiceUsuario();
    
    /**
     * Creates new form RegisterBusiness
     */
    public UpdateUsers() {
        initComponents();
        CargarComplementos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOfertas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDateNacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtComuna = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtPuntosObtenidos = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblIconoActualizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbcTipoUsuario = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        cbcEmpresas = new javax.swing.JComboBox<>();
        rbNo = new javax.swing.JRadioButton();
        rbSi = new javax.swing.JRadioButton();
        lblOferta = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cbcRegion = new javax.swing.JComboBox<>();
        cbcComuna = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        lblNuevaComuna = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Empresa");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(844, 895));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateNacimiento.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jDateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 360, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 72, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, 760, 30));

        txtComuna.setEditable(false);
        txtComuna.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtComuna.setForeground(new java.awt.Color(255, 51, 51));
        txtComuna.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true), "Comuna Anterior", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.add(txtComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 340, -1));

        txtApellidos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Apellidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 380, -1));

        txtPuntosObtenidos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtPuntosObtenidos.setForeground(new java.awt.Color(102, 102, 102));
        txtPuntosObtenidos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Puntos Obtenidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPuntosObtenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 150, 70));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(78, 204, 44));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 204, 44), 2, true));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 800, 160, 50));

        lblIconoActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoActualizarVerde.png"))); // NOI18N
        jPanel1.add(lblIconoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 800, 60, 50));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel5.setText("Direccion: No debe superar los 500 caracteres.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, 250, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel6.setText("Rut: Sin puntos y con guion verificador");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 270, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel7.setText("Puntos Obtenidos: Solo deben ser caracteres numericos.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, 270, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel4.setText("Telefono: Solo debe ser caracteres numericos.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 290, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel3.setText("Password: Ingrese una password segura.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 710, 270, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 120, 120));
        jLabel2.setText("Nota*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, 290, 20));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 670, 100));

        cbcTipoUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcTipoUsuario.setForeground(new java.awt.Color(120, 120, 120));
        cbcTipoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Tipo de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 370, 50));

        txtNombres.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(102, 102, 102));
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 380, -1));

        cbcEmpresas.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcEmpresas.setForeground(new java.awt.Color(120, 120, 120));
        cbcEmpresas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 370, 50));

        bgOfertas.add(rbNo);
        rbNo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        rbNo.setForeground(new java.awt.Color(102, 102, 102));
        rbNo.setText("No");
        jPanel1.add(rbNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, -1, 30));

        bgOfertas.add(rbSi);
        rbSi.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        rbSi.setForeground(new java.awt.Color(102, 102, 102));
        rbSi.setSelected(true);
        rbSi.setText("Si");
        jPanel1.add(rbSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 40, 30));

        lblOferta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "¿Suscribir a nuevas ofertas?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(lblOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 220, 70));

        txtTelefono.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, -1));

        txtRut.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtRut.setForeground(new java.awt.Color(102, 102, 102));
        txtRut.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Rut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 380, 60));

        txtPassword.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 380, -1));

        cbcRegion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcRegion.setForeground(new java.awt.Color(120, 120, 120));
        cbcRegion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Region", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 340, 50));
        cbcRegion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                RellenarComuna((String)cbcRegion.getSelectedItem());
            }
        });

        cbcComuna.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcComuna.setForeground(new java.awt.Color(120, 120, 120));
        cbcComuna.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Comuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 340, 50));

        txtCorreo.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 380, -1));

        lblNuevaComuna.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        lblNuevaComuna.setForeground(new java.awt.Color(120, 120, 120));
        lblNuevaComuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevaComuna.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Nueva Region o Comuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(lblNuevaComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 380, 220));

        lblFechaNacimiento.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(120, 120, 120));
        lblFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Fecha Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 380, 60));

        lblTitulo.setBackground(new java.awt.Color(255, 127, 0));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Actualice los datos del Usuario");
        lblTitulo.setOpaque(true);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 760, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        String nombre = txtNombres.getText();
        String rut = txtRut.getText();
        String apellido = txtApellidos.getText();
        String correo = txtComuna.getText();
        String password = txtRut.getText();
        String comuna = (String)cbcComuna.getSelectedItem();
        DateFormat f = new SimpleDateFormat("yyyy/MM/dd");
        String fechaNacimiento = f.format(jDateNacimiento.getDate());
        Long telefono = Long.parseLong(txtTelefono.getText());
        Long puntos = Long.parseLong(txtPuntosObtenidos.getText());
        Boolean suscrito = rbSi.isSelected();
        
        Empresas empresa = (Empresas)cbcEmpresas.getSelectedItem();
        Long idEmpresa = empresa.getIDEmpresa();
        TipoUsuario tipoUsuario = (TipoUsuario)cbcTipoUsuario.getSelectedItem();
        Long idTipoUsuario = tipoUsuario.getIDTipoUsuario();
        
        UsuarioHelper usuario = new UsuarioHelper(rut, nombre, apellido, correo, password, telefono, comuna, fechaNacimiento, suscrito, puntos, idTipoUsuario, idEmpresa);
        
        service.ActualizarUsuario(usuario);
        
        dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UpdateUsers().setVisible(true);
            }
        });
    }
    
    public void CargarUsuario(){
        int idUsuario = MaintainerUsers.varSessionUser;
        
        ArrayList<Usuario> listaUsuario;
        listaUsuario = service.ListarUsuarios();
        
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (idUsuario == listaUsuario.get(i).getIDUsuario()) {
                
                txtNombres.setText(listaUsuario.get(i).getNombre());
                txtRut.setText(listaUsuario.get(i).getRut());
                txtPassword.setText(listaUsuario.get(i).getPassword());
                txtApellidos.setText(listaUsuario.get(i).getApellido());
                txtCorreo.setText(listaUsuario.get(i).getCorreo());
                txtTelefono.setText(Long.toString(listaUsuario.get(i).getTelefono()));
                txtComuna.setText(listaUsuario.get(i).getComuna());
                SeleccionarTipoUsuario(listaUsuario.get(i).getTipoUsuario());
                
                if (listaUsuario.get(i).getEmpresa() != null) {
                    SeleccionarEmpresa(listaUsuario.get(i).getEmpresa());
                }
                
                rbSi.setSelected(listaUsuario.get(i).getSuscrito());
                txtPuntosObtenidos.setText(Long.toString(listaUsuario.get(i).getPuntos()));
                
                DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try{
                    date = f.parse(listaUsuario.get(i).getFechaNacimiento());
                }catch (ParseException e) {
                    e.printStackTrace();
                }
                jDateNacimiento.setDate(date);
                
                
                break;
                
            }
        }
    }
    
    private void SeleccionarTipoUsuario(TipoUsuario tipoUsuario){
        for (int i = 0; i < cbcTipoUsuario.getItemCount(); i++) {
            if (tipoUsuario.getIDTipoUsuario() == cbcTipoUsuario.getItemAt(i).getIDTipoUsuario()) {
                cbcTipoUsuario.setSelectedItem(cbcTipoUsuario.getItemAt(i));
                break;
            }
        }
        
    }
    
    private void SeleccionarEmpresa(Empresas empresa){
        for (int i = 0; i < cbcEmpresas.getItemCount(); i++) {
            if (empresa.getIDEmpresa() == cbcEmpresas.getItemAt(i).getIDEmpresa()) {
                cbcEmpresas.setSelectedItem(cbcEmpresas.getItemAt(i));
                break;
            }
        }
    }
    
    
    public void CargarComplementos(){
        CargarEmpresa();
        CargarTipousuario();
        CargarComponentes();
        CargarUsuario();
    }
    
    
    public void CargarEmpresa(){
        ServiceEmpresa serviceEmpresa = new ServiceEmpresa();
        ArrayList listaEmpresas = serviceEmpresa.ListarEmpresas();
        for (int i = 0; i < listaEmpresas.size(); i++) {
            cbcEmpresas.addItem((Empresas)listaEmpresas.get(i));
        }
    }
    
    public void CargarTipousuario(){
        ServiceUsuario serviceUsuario = new ServiceUsuario();
        ArrayList listaTipoUsuario = serviceUsuario.ListaTipoUsuario();
        for (int i = 0; i < listaTipoUsuario.size(); i++) {
            cbcTipoUsuario.addItem((TipoUsuario)listaTipoUsuario.get(i));
        }
    }
    
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
    private javax.swing.ButtonGroup bgOfertas;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cbcComuna;
    private javax.swing.JComboBox<Empresas> cbcEmpresas;
    private javax.swing.JComboBox<String> cbcRegion;
    private javax.swing.JComboBox<TipoUsuario> cbcTipoUsuario;
    private com.toedter.calendar.JDateChooser jDateNacimiento;
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
    private javax.swing.JLabel lblIconoActualizar;
    private javax.swing.JLabel lblNuevaComuna;
    private javax.swing.JLabel lblOferta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPuntosObtenidos;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
