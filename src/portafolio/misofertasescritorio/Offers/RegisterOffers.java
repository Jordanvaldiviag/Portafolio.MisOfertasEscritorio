/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio.misofertasescritorio.Offers;

import Helpers.OfertaHelper;
import Models.Empresas;
import Models.ProductoElement;
import Models.Usuario;
import Services.ServiceEmpresa;
import Services.ServiceOferta;
import Services.ServiceProducto;
import Services.ServiceUsuario;
import Services.Validations;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Acer
 */
public final class RegisterOffers extends javax.swing.JFrame {
    
    ServiceProducto servicio = new ServiceProducto();
    ServiceOferta serviceOferta = new ServiceOferta();
    ServiceUsuario servicioUsuario = new ServiceUsuario();
    
    ServiceEmpresa servicioEmpresa = new ServiceEmpresa();
    ArrayList <Empresas> listaEmpresas = servicioEmpresa.ListarEmpresas();
   
    
    /**
     * Creates new form MaintainerProducts
     */
    public RegisterOffers() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jDateOferta = new com.toedter.calendar.JDateChooser();
        lblImagenOferta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmpresa = new javax.swing.JTextField();
        txtCompraMax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblIconoGuardar = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        txtPrecioOferta = new javax.swing.JTextField();
        txtCompraMin = new javax.swing.JTextField();
        txtPorcDescuento = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblIconoGuardar1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cbcUsuario = new javax.swing.JComboBox<>();
        txtProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Producto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 127, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateOferta.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jDateOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 30));

        lblImagenOferta.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        lblImagenOferta.setForeground(new java.awt.Color(120, 120, 120));
        lblImagenOferta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenOferta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Fecha Caducidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(lblImagenOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, 660, 20));

        txtEmpresa.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtEmpresa.setForeground(new java.awt.Color(102, 102, 102));
        txtEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Empresa Patrocinadora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 370, 60));

        txtCompraMax.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtCompraMax.setForeground(new java.awt.Color(102, 102, 102));
        txtCompraMax.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Compra Maxima", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtCompraMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 140, 60));

        jScrollPane1.setBackground(new java.awt.Color(255, 127, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 127, 0));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(120, 120, 120));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        txtDescripcion.setCaretColor(new java.awt.Color(255, 127, 0));
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 700, 160));

        lblIconoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoGuardar.png"))); // NOI18N
        lblIconoGuardar.setText("jLabel1");
        jPanel1.add(lblIconoGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 60, 40));

        btnBuscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(78, 204, 44));
        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(78, 204, 44), 2, true));
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 150, 40));

        txtPrecioOferta.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtPrecioOferta.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecioOferta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPrecioOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 180, 60));

        txtCompraMin.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtCompraMin.setForeground(new java.awt.Color(102, 102, 102));
        txtCompraMin.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Compra Minima", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtCompraMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 140, 60));

        txtPorcDescuento.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtPorcDescuento.setForeground(new java.awt.Color(102, 102, 102));
        txtPorcDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "% Descuento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtPorcDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 120, 60));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 750, 200, 50));

        lblIconoGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoGuardar.png"))); // NOI18N
        jPanel1.add(lblIconoGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 750, 60, 50));

        lblTitulo.setBackground(new java.awt.Color(255, 127, 0));
        lblTitulo.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ingrese los datos de la Oferta");
        lblTitulo.setOpaque(true);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 100));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel7.setText("Compra Minima: Solo debe ser caracter numerico.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 270, 20));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel4.setText("Precio: Solo debe ser caracter numerico.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 290, 20));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel3.setText("Porcentaje Descuento: Solo debe ser caracter numerico.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 290, 20));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("*Nota: Debe buscar primero un producto antes de ingresar los datos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 470, 20));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel5.setText("Descripcion: No debe superar los 500 caracteres.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 250, 20));

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 630, 100));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 660, 20));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        jLabel9.setText("Compra Maxima: Solo debe ser caracter numerico.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 260, 20));

        cbcUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        cbcUsuario.setForeground(new java.awt.Color(120, 120, 120));
        cbcUsuario.setMaximumRowCount(20);
        cbcUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 1, true), "Funcionario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Leelawadee UI Semilight", 1, 12), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(cbcUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 310, 50));

        txtProducto.setText("");
        txtProducto.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(102, 102, 102));
        txtProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 127, 0), 2, true), "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 1, 14), new java.awt.Color(255, 127, 0))); // NOI18N
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 500, 60));
        txtProducto.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
            }
            public void removeUpdate(DocumentEvent e) {
            }
            public void insertUpdate(DocumentEvent e) {
                System.out.println("InsertUpdate");
                warn();
            }

            public void warn() {
                CargarComponentes();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        ListProducts listProducts = new ListProducts();
        listProducts.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        listProducts.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String compraMin0 = txtCompraMin.getText();
        String compraMax0 = txtCompraMax.getText();
        String descripcion = txtDescripcion.getText();
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String fechaCaducidad = f.format(jDateOferta.getDate());
        String porcDescuento0 = txtPorcDescuento.getText();
        String precio0 = txtPrecioOferta.getText();
        Usuario usuario = (Usuario)cbcUsuario.getSelectedItem();
        long idUsuario = usuario.getIDUsuario();
        ProductoElement producto = ListProducts.varSessionProductoSelect;
        long idProducto = producto.getIDProducto();
        
        
        //Formateo de entradas
        int compraMin1 = 0;
        int compraMax1 = 0;
        long porcDescuento1;
        long precio1;
        
        //Validaciones
        ArrayList<String> listaErrores = new ArrayList<>();
        
        if (!Validations.validarNoVacio(compraMin0)) {
            listaErrores.add("La compra minima no puede estar en blanco");
        }
        compraMin1 = Validations.validarNumero(compraMin0);
        if (compraMin1 == 0) {
            listaErrores.add("La compra minima no puede contener letras");
        }
        
        if (!Validations.validarNoVacio(compraMax0)) {
            listaErrores.add("La compra maxima no puede estar en blanco");
        }
        compraMax1 = Validations.validarNumero(compraMax0);
        if (compraMax1 == 0) {
            listaErrores.add("La compra maxima no puede contener letras");
        }
        
        if (!Validations.validarNoVacio(descripcion)) {
            listaErrores.add("La descripcion no puede estar en blanco");
        }
        
        if (!Validations.validarNoVacio(porcDescuento0)) {
            listaErrores.add("El porcentaje de descuento no puede estar en blanco");
        }
        porcDescuento1 = Validations.validarNumeroLong(porcDescuento0);
        if (porcDescuento1 == Long.parseLong("0")) {
            listaErrores.add("El porcentaje de descuento no puede contener letras");
        }
        
        if (!Validations.validarNoVacio(precio0)) {
            listaErrores.add("El precio no puede estar en blanco");
        }
        precio1 = Validations.validarNumeroLong(precio0);
        if (precio1 == Long.parseLong("0")) {
            listaErrores.add("El precio no puede contener letras");
        }
        //Fin validaciones
        
        if (listaErrores.isEmpty()) {
            OfertaHelper oferta = new OfertaHelper(descripcion, compraMin1, compraMax1, fechaCaducidad, precio1, porcDescuento1, idProducto, idUsuario);
            serviceOferta.AgregarOferta(oferta);
            JOptionPane.showMessageDialog(null, "Oferta Creada");
            dispose();
        }else{
            String errores = "";
            for (int i = 0; i < listaErrores.size(); i++) {
                errores += listaErrores.get(i)+"\n";
            }
            JOptionPane.showMessageDialog(null, errores);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    
    
    protected void CargarComponentes(){
        CamposVisibles();
    }
    
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
            java.util.logging.Logger.getLogger(RegisterOffers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegisterOffers().setVisible(true);
            }
        });
    }
    
    public void CamposVisibles(){
        if (txtProducto.getText().isEmpty()) {
            txtProducto.setEditable(false);
            txtEmpresa.setEditable(false);
            txtCompraMax.setEditable(false);
            txtCompraMin.setEditable(false);
            txtDescripcion.setEditable(false);
            txtPorcDescuento.setEditable(false);
            txtPrecioOferta.setEditable(false);
            cbcUsuario.setEnabled(false);
            jDateOferta.setEnabled(false);
        }else{
            txtProducto.setEditable(false);
            String nombreEmpresa = cargarEmpresa();
            txtEmpresa.setText(nombreEmpresa);
            txtEmpresa.setEditable(false);
            txtCompraMax.setEditable(true);
            txtCompraMin.setEditable(true);
            txtDescripcion.setEditable(true);
            txtPorcDescuento.setEditable(true);
            txtPrecioOferta.setEditable(true);
            cbcUsuario.setEnabled(true);
            jDateOferta.setEnabled(true);
            CargarUsuario();
        }
    }
    
    private void CargarUsuario() {
        
        cbcUsuario.removeAllItems();
        
        ProductoElement producto = ListProducts.varSessionProductoSelect;
        
        for (int i = 0; i < listaEmpresas.size(); i++) {
            if (producto.getIDEmpresa() == listaEmpresas.get(i).getIDEmpresa()) {
                cbcUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(listaEmpresas.get(i).getUsuarios()));
            }
        }
    }
    
    public String cargarEmpresa(){
        String nombreEmpresa = "";
        
        for (int i = 0; i < listaEmpresas.size(); i++) {
            if (ListProducts.varSessionProductoSelect.getIDEmpresa() == listaEmpresas.get(i).getIDEmpresa()) {
                nombreEmpresa = listaEmpresas.get(i).getNombre();
                break;
            }else{
                nombreEmpresa = "No es de alguna Empresa";
            }
        }
        
        return nombreEmpresa;
    }
    
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Usuario> cbcUsuario;
    private com.toedter.calendar.JDateChooser jDateOferta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIconoGuardar;
    private javax.swing.JLabel lblIconoGuardar1;
    private javax.swing.JLabel lblImagenOferta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCompraMax;
    private javax.swing.JTextField txtCompraMin;
    private javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtPorcDescuento;
    private javax.swing.JTextField txtPrecioOferta;
    public static javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables

    
}
