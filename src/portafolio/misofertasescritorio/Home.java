/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio;

import Helpers.UserLogin;
import Services.ServiceLogin;
import Services.ServiceUsuario;
import Services.Validations;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author cvargas
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        buttonEntrar = new javax.swing.JButton();
        textCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar al sistema");
        setPreferredSize(new java.awt.Dimension(630, 620));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntrar.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        buttonEntrar.setForeground(new java.awt.Color(255, 127, 0));
        buttonEntrar.setText("Ingresar");
        buttonEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 3, true));
        buttonEntrar.setOpaque(false);
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 180, 40));

        textCorreo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        textCorreo.setForeground(new java.awt.Color(122, 122, 122));
        textCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 3, true), "Correo Electronico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 11), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(textCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 330, 50));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 127, 0));
        jLabel6.setText("Sistemas de Administracion y Reporte");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 370, -1));

        txtPassword.setForeground(new java.awt.Color(122, 122, 122));
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 3, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 12), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 330, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeBackGround.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 600));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 127, 0));
        jLabel3.setText("Mis Ofertas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeCandado (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 440, 410));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 390, 600));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 127, 0));
        jLabel5.setText("Sistemas de Administracion y Reporte");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
            
            ServiceUsuario serviceUsuario = new ServiceUsuario();
            
            String correo = textCorreo.getText();
            char[] password0 = txtPassword.getPassword();
            
            //Variables de validacion
            String password1 = Convertir(password0);
            
            //Validaciones
            ArrayList<String> listaErrores = new ArrayList<>();
            
            if (!Validations.validarNoVacio(correo)) {
                listaErrores.add("El correo  no puede estar en blanco");
            }
            
            if (!Validations.validarNoVacio(password1)) {
                listaErrores.add("La password  no puede estar en blanco");
            }
            //Fin validaciones
            
            if (listaErrores.isEmpty()) {
                
                ServiceLogin serviceLogin = new ServiceLogin();
                UserLogin userLogin = new UserLogin(correo, password1);
                String result = serviceLogin.Login(userLogin);
                if (result.equals("400")) {
                    JOptionPane.showMessageDialog(null, "Error en el Usuario o Password");
                }else{
                    dispose();
                    AdminStart adminStart = new AdminStart();
                    adminStart.setVisible(true);
                }
                
            }else{
                String errores = "";
                for (int i = 0; i < listaErrores.size(); i++) {
                    errores += listaErrores.get(i)+"\n";
                }
                JOptionPane.showMessageDialog(null, errores);
            }
    }//GEN-LAST:event_buttonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    private String Convertir(char[] pass){
        String contra = "";
        
        for (int i = 0; i < pass.length; i++) {
            contra += pass[i];
        }
        return contra;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
