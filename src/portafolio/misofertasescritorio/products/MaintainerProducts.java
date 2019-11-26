/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.products;

import Models.ProductoElement;
import Services.ServiceProducto;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import portafolio.misofertasescritorio.IconCellRenderer;

/**
 *
 * @author Acer
 */
public final class MaintainerProducts extends javax.swing.JFrame {
    
    //variableLocal
    public static int varSessionProducto;
    ServiceProducto servicio = new ServiceProducto();
    
    /**
     * Creates new form MaintainerBusiness
     */
    public MaintainerProducts() {
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
        lblTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 90, 20));

        lblTitulo.setBackground(new java.awt.Color(0, 153, 204));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Datos de los Productos");
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoRegistrarProducto.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 60, 40));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Producto", "Precio Normal", "Descripcion", "Marca", "Modelo", "Stock", "Imagen", "Fecha Vencimiento", "Temporada", "Actualizar", "Eliminar", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProductos.setRowHeight(35);
        jTableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 810, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        RegisterProducts registerProducts = new RegisterProducts();
        registerProducts.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductosMouseClicked
        int fila = jTableProductos.rowAtPoint(evt.getPoint());
        int columna = jTableProductos.columnAtPoint(evt.getPoint());
        
        if (columna == 9){
            String idProducto = jTableProductos.getValueAt(fila, 11).toString();
            System.out.println(idProducto);
            varSessionProducto = Integer.parseInt(idProducto);
            
            UpdateProducts updateProducts = new UpdateProducts();
            updateProducts.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            updateProducts.setVisible(true);
        }
        
        if (columna == 10) {
            String idProducto = jTableProductos.getValueAt(fila,11).toString();
            varSessionProducto = Integer.parseInt(idProducto);
            System.out.println(varSessionProducto);
            PopupDeleteProducts popupDeleteProducts = new PopupDeleteProducts();
            popupDeleteProducts.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            popupDeleteProducts.setVisible(true);
        }
    }//GEN-LAST:event_jTableProductosMouseClicked

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
            java.util.logging.Logger.getLogger(MaintainerProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintainerProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintainerProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintainerProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintainerProducts().setVisible(true);
            }
        });
    }
    
    public void CargarLista(){
        //recuperar lista por metodo api
        ArrayList<ProductoElement> listaProducto;
        listaProducto = servicio.ListarProductos();
        
        //modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTableProductos.getModel();
        Object[] O = new Object[12];
        
        //Renderizador de Iconos
        jTableProductos.setDefaultRenderer(Object.class, new IconCellRenderer());
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/iconoActualizar.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/iconoEliminar.png"));
        
        for (int i = 0; i < listaProducto.size(); i++) {
            //Icono Actualizar
            JLabel actualizar = new JLabel();
            actualizar.setIcon(icon1);
                
            //Icono Eliminar
            JLabel eliminar = new JLabel();
            eliminar.setIcon(icon2);
            
            O[0] = listaProducto.get(i).getNombre();
            O[1] = listaProducto.get(i).getPrecioNormal();
            O[2] = listaProducto.get(i).getDescripcion();
            O[3] = listaProducto.get(i).getMarca();
            O[4] = listaProducto.get(i).getModelo();
            O[5] = listaProducto.get(i).getStock();
            O[6] = listaProducto.get(i).getImagen();
            O[7] = listaProducto.get(i).getFechaVencimiento();
            O[8] = listaProducto.get(i).getTemporada();
            O[9] = actualizar;
            O[10] = eliminar;
            O[11] = listaProducto.get(i).getIDProducto();
            
            modelo.addRow(O);
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
