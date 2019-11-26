/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.business;

import Models.Empresas;
import Services.ServiceEmpresa;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import portafolio.misofertasescritorio.IconCellRenderer;

/**
 *
 * @author Acer
 */
public class MaintainerBusiness extends javax.swing.JFrame {
    
    //Variable Local estatica de session
    public static int varSessionEmpresa;
    
    /**
     * Creates new form MaintainerBusiness
     */
    public MaintainerBusiness() {
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
        jTableBusiness = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jTableBusiness.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razon Social", "Rut", "Telefono", "Region", "Comuna", "Direccion", "Actividad Economica", "Actualizar", "Eliminar", "idEmpresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBusiness.setRowHeight(35);
        jTableBusiness.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBusinessMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBusiness);
        if (jTableBusiness.getColumnModel().getColumnCount() > 0) {
            jTableBusiness.getColumnModel().getColumn(9).setMinWidth(0);
            jTableBusiness.getColumnModel().getColumn(9).setPreferredWidth(0);
            jTableBusiness.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 810, 210));

        lblTitulo.setBackground(new java.awt.Color(0, 153, 204));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Datos de las Empresas");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 390, 50));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 127, 0));
        btnGuardar.setText("Registrar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0), 2));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoRegistrarEmpresa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        RegisterBusiness registerBusiness = new RegisterBusiness();
        registerBusiness.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableBusinessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBusinessMouseClicked
        int fila = jTableBusiness.rowAtPoint(evt.getPoint());
        int columna = jTableBusiness.columnAtPoint(evt.getPoint());
        
        if (columna == 7){
            String idEmpresa = jTableBusiness.getValueAt(fila, 9).toString();
            System.out.println(idEmpresa);
            varSessionEmpresa = Integer.parseInt(idEmpresa);
            
            UpdateBusiness updateBusiness = new UpdateBusiness();
            updateBusiness.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            updateBusiness.setVisible(true);
        }
        
        if (columna == 8) {
            String idEmpresa = jTableBusiness.getValueAt(fila, 9).toString();
            varSessionEmpresa = Integer.parseInt(idEmpresa);
            System.out.println(varSessionEmpresa);
            PopupDeleteBusiness popupDeleteBusiness = new PopupDeleteBusiness();
            popupDeleteBusiness.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            popupDeleteBusiness.setVisible(true);
        }
    }//GEN-LAST:event_jTableBusinessMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        RefrescarLista();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaintainerBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintainerBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintainerBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintainerBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MaintainerBusiness().setVisible(true);
            
        });
    }
    
    //instancia del servicio empresa
    ServiceEmpresa servicio = new ServiceEmpresa();
    
    
    public void CargarLista(){
    //Recuperar lista por servicio API
    ArrayList<Empresas> listaEmpresas;   
    listaEmpresas = servicio.ListarEmpresas();
    
    //modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableBusiness.getModel();
    Object[] O = new Object[10];
    
    //Renderizador de Iconos
    jTableBusiness.setDefaultRenderer(Object.class, new IconCellRenderer());
    ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/iconoActualizar.png"));
    ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/iconoEliminar.png"));
    
        for (int i = 0; i < listaEmpresas.size(); i++) {
            //Icono Actualizar
                JLabel actualizar = new JLabel();
                actualizar.setIcon(icon1);
                
            //Icono Eliminar
                JLabel eliminar = new JLabel();
                eliminar.setIcon(icon2);
            
            O[0] =  listaEmpresas.get(i).getNombre();
            O[1] =  listaEmpresas.get(i).getRut();
            O[2] =  listaEmpresas.get(i).getTelefono();
            O[3] =  listaEmpresas.get(i).getRegion();
            O[4] =  listaEmpresas.get(i).getComuna();
            O[5] =  listaEmpresas.get(i).getDireccion();
            O[6] =  listaEmpresas.get(i).getActividad();
            O[7] =  actualizar;
            O[8] =  eliminar;
            O[9] =  listaEmpresas.get(i).getIDEmpresa();
            
            modelo.addRow(O);
            
        }
        
            
    }
    
    public void RefrescarLista(){
        DefaultTableModel modelo = (DefaultTableModel) jTableBusiness.getModel();
        modelo.setRowCount(0);
        CargarLista();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBusiness;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
