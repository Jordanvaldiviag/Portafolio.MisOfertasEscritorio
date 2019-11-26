/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.Users;

import Models.Usuario;
import Services.ServiceUsuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import portafolio.misofertasescritorio.IconCellRenderer;

/**
 *
 * @author Acer
 */
public final class MaintainerUsers extends javax.swing.JFrame {

    
    public static int varSessionUser;
    
    ServiceUsuario service = new ServiceUsuario();
    
    /**
     * Creates new form MaintainerBusiness
     */
    public MaintainerUsers() {
        initComponents();
        CargarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empresas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 127, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoActualizarLista.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 90, 20));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Rut", "Correo", "Password", "Telefono", "Comuna", "Fecha Nacimiento", "Suscrito", "Puntos", "Actualizar", "Eliminar", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Boolean.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setRowHeight(35);
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(12).setMinWidth(0);
            jTableUsuarios.getColumnModel().getColumn(12).setPreferredWidth(0);
            jTableUsuarios.getColumnModel().getColumn(12).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 810, 210));

        lblTitulo.setBackground(new java.awt.Color(0, 153, 204));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Datos de los Usuarios");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 390, 50));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 127, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0), 2));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setOpaque(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 40));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconoRegistrarUsuario.png"))); // NOI18N
        jPanel1.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        AddUser addUser = new AddUser();
        addUser.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        RefrescarLista();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        int fila = jTableUsuarios.rowAtPoint(evt.getPoint());
        int columna = jTableUsuarios.columnAtPoint(evt.getPoint());
        
        if (columna == 10){
            String idUsuario = jTableUsuarios.getValueAt(fila, 12).toString();
            System.out.println(idUsuario);
            varSessionUser = Integer.parseInt(idUsuario);
            
            UpdateUsers updateUsers = new UpdateUsers();
            updateUsers.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            updateUsers.setVisible(true);
        }
        
        if (columna == 11) {
            String idUsuario = jTableUsuarios.getValueAt(fila, 12).toString();
            varSessionUser = Integer.parseInt(idUsuario);
            System.out.println(varSessionUser);
            
            PopupDeleteUsers popupDeleteUsers = new PopupDeleteUsers();
            popupDeleteUsers.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            popupDeleteUsers.setVisible(true);
        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaintainerUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintainerUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintainerUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintainerUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new MaintainerUsers().setVisible(true);
        });
    }
    
    public void CargarLista(){
    //Recuperar lista por servicio API
    ArrayList<Usuario> listaUsuario;   
    listaUsuario = service.ListarUsuarios();
    
    //modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel();
    Object[] O = new Object[13];
    
    //Renderizador de Iconos
    jTableUsuarios.setDefaultRenderer(Object.class, new IconCellRenderer());
    ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/iconoActualizar.png"));
    ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/iconoEliminar.png"));
    
        for (int i = 0; i < listaUsuario.size(); i++) {
            //Icono Actualizar
                JLabel actualizar = new JLabel();
                actualizar.setIcon(icon1);
                
            //Icono Eliminar
                JLabel eliminar = new JLabel();
                eliminar.setIcon(icon2);
            
            O[0] =  listaUsuario.get(i).getNombre();
            O[1] =  listaUsuario.get(i).getApellido();
            O[2] =  listaUsuario.get(i).getRut();
            O[3] =  listaUsuario.get(i).getCorreo();
            O[4] =  listaUsuario.get(i).getPassword();
            O[5] =  listaUsuario.get(i).getTelefono();
            O[6] =  listaUsuario.get(i).getComuna();
            O[7] =  listaUsuario.get(i).getFechaNacimiento();
            O[8] =  listaUsuario.get(i).getSuscrito();
            O[9] =  listaUsuario.get(i).getPuntos();
            O[10] =  actualizar;
            O[11] =  eliminar;
            O[12] =  listaUsuario.get(i).getIDUsuario();
            
            modelo.addRow(O);
            
        }
        
    }
    
    public void RefrescarLista(){
        DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel();
        modelo.setRowCount(0);
        CargarLista();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}