/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import portafolio.misofertasescritorio.Users.MaintainerUsers;
import portafolio.misofertasescritorio.Offers.MaintainerOffers;
import portafolio.misofertasescritorio.business.MaintainerBusiness;
import portafolio.misofertasescritorio.products.MaintainerProducts;

/**
 *
 * @author Acer
 */
public class AdminStart extends javax.swing.JFrame {

    /**
     * Creates new form AdminStart
     */
    public AdminStart() {
        initComponents();
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
        lblBienvenido = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JButton();
        lblIconoUsiario = new javax.swing.JLabel();
        lblIconoEmpresa = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JLabel();
        lblIconoProducto = new javax.swing.JLabel();
        lblIconoOferta = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        btnOferta = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setLocationByPlatform(true);
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(680, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 571));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 571));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 571));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setText("Bienvenido: ");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 30));

        btnGenerarReporte.setBackground(new java.awt.Color(102, 204, 0));
        btnGenerarReporte.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGenerarReporte.setText("Generar reporte de comportamiento");
        btnGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 330, 50));

        lblIconoUsiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconoUsuarioBlanco.png"))); // NOI18N
        jPanel1.add(lblIconoUsiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lblIconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoEmpresaInicio.png"))); // NOI18N
        jPanel1.add(lblIconoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 30, 30));

        txtBienvenido.setText("@Usuario");
        jPanel1.add(txtBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 160, 30));

        lblIconoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconoProductoInicio.png"))); // NOI18N
        jPanel1.add(lblIconoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        lblIconoOferta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconoOfertaInicio.png"))); // NOI18N
        jPanel1.add(lblIconoOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 30, 40));

        btnProducto.setBackground(new java.awt.Color(255, 127, 0));
        btnProducto.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setText("<html><center>Mantenedor de Productos<center><html>");
        btnProducto.setToolTipText("");
        btnProducto.setActionCommand("<html valign=\"top\">Mantenedor de usuarios<html>");
        btnProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0), 3));
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 130, 110));

        lblBanner.setBackground(new java.awt.Color(169, 90, 12));
        lblBanner.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblBanner.setForeground(new java.awt.Color(255, 255, 255));
        lblBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdminStartBanner.jpg"))); // NOI18N
        lblBanner.setFocusable(false);
        lblBanner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBanner.setOpaque(true);
        jPanel1.add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 150));

        btnUsuario.setBackground(new java.awt.Color(255, 127, 0));
        btnUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("<html><center>Mantenedor de usuarios<center><html>");
        btnUsuario.setToolTipText("");
        btnUsuario.setActionCommand("<html valign=\"top\">Mantenedor de usuarios<html>");
        btnUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0), 3));
        btnUsuario.setFocusPainted(false);
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 110));

        btnOferta.setBackground(new java.awt.Color(255, 127, 0));
        btnOferta.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnOferta.setForeground(new java.awt.Color(255, 255, 255));
        btnOferta.setText("<html><center>Mantenedor de Ofertas<center><html>");
        btnOferta.setToolTipText("");
        btnOferta.setActionCommand("<html valign=\"top\">Mantenedor de usuarios<html>");
        btnOferta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0), 3));
        btnOferta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertaActionPerformed(evt);
            }
        });
        jPanel1.add(btnOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 130, 110));

        btnEmpresa.setBackground(new java.awt.Color(255, 127, 0));
        btnEmpresa.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        btnEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpresa.setText("<html><center>Mantenedor de Empresas<center><html>");
        btnEmpresa.setToolTipText("");
        btnEmpresa.setActionCommand("<html valign=\"top\">Mantenedor de usuarios<html>");
        btnEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 0), 3));
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 130, 110));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Mantenedores", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Leelawadee UI", 1, 11), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 390));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdminStartBackground.png"))); // NOI18N
        lblBackground.setText("jLabel2");
        jPanel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        MaintainerUsers maintainerUsers = new MaintainerUsers();
        maintainerUsers.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        MaintainerBusiness maintainerBusiness = new MaintainerBusiness();
        maintainerBusiness.setVisible(true);
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        MaintainerProducts maintainerProducts = new MaintainerProducts();
        maintainerProducts.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertaActionPerformed
        MaintainerOffers maintainerOffers = new MaintainerOffers();
        maintainerOffers.setVisible(true);
    }//GEN-LAST:event_btnOfertaActionPerformed

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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnOferta;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblIconoEmpresa;
    private javax.swing.JLabel lblIconoOferta;
    private javax.swing.JLabel lblIconoProducto;
    private javax.swing.JLabel lblIconoUsiario;
    private javax.swing.JLabel txtBienvenido;
    // End of variables declaration//GEN-END:variables
}
