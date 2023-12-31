/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.Ctrl_Almacen;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Almacen;

/**
 *
 * @author saduj
 */
public class InterAlmacen extends javax.swing.JInternalFrame {

    int obtenerIdCabeceraCompraCombo = 0;
    int obtenerIdProducto = 0;

    public InterAlmacen() {
        initComponents();

        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Producto en Almacén");
        this.CargarComboOrdenCompra();
        this.CargarComboProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jComboBox_producto = new javax.swing.JComboBox<>();
        jComboBox_orden_compra = new javax.swing.JComboBox<>();
        jComboBox_ubicacion = new javax.swing.JComboBox<>();
        jButton_guardar = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Producto en Almacén");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("O/C:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ubicación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        jComboBox_producto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:" }));
        jComboBox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        jComboBox_orden_compra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_orden_compra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione orden:" }));
        getContentPane().add(jComboBox_orden_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        jComboBox_ubicacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_ubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ubicación:", "A-001", "A-002", "A-003", "A-004", "A-005", "B-001", "B-002", "B-003", "B-004", "B-005" }));
        jComboBox_ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ubicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        jButton_guardar.setBackground(new java.awt.Color(0, 204, 204));
        jButton_guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, 30));

        jLabel_wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed

        Almacen almacen = new Almacen();
        Ctrl_Almacen controlAlmacen = new Ctrl_Almacen();
        String orden = "";
        String producto = "";
        producto = jComboBox_producto.getSelectedItem().toString().trim();
        orden = jComboBox_orden_compra.getSelectedItem().toString().trim();
        String fechaActual = "";
        Date date = new Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);

        if (jComboBox_ubicacion.getSelectedItem().toString().equals("Seleccione ubicación:") || txt_cantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos o seleccione ubicación");
            txt_cantidad.setBackground(Color.red);
        } else {

            if (orden.equalsIgnoreCase("Seleccione orden:")) {
                JOptionPane.showMessageDialog(null, "Seleccione la orden de compra registrada.");
            } else {
                if (producto.equalsIgnoreCase("Seleccione producto:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione el producto registrado.");
                } else {
                    try {
                        this.IdCabeceraCompra();
                        almacen.setIdCabeceraCompra(obtenerIdCabeceraCompraCombo);
                        this.IdProducto();
                        almacen.setIdProducto(obtenerIdProducto);
                        String sku = "MAPU" + getFiveDigitsNumber();
                        if (controlAlmacen.obtenerSku(obtenerIdProducto).equals("") || controlAlmacen.obtenerSku(obtenerIdProducto) == null) {
                            almacen.setSku(sku);
                        } else {
                            sku = controlAlmacen.obtenerSku(obtenerIdProducto);
                            almacen.setSku(sku);
                        }
                        almacen.setStock(Integer.parseInt(txt_cantidad.getText().trim()));
                        almacen.setUbicacion(jComboBox_ubicacion.getSelectedItem().toString().trim());
                        almacen.setFechaIngreso(fechaActual);
                        almacen.setEstado(1);

                        if (controlAlmacen.guardar(almacen)) {
                            JOptionPane.showMessageDialog(null, "Registro guardado");
                            txt_cantidad.setBackground(Color.green);
                            this.CargarComboOrdenCompra();
                            this.CargarComboProductos();
                            this.jComboBox_orden_compra.setSelectedItem("Seleccione orden:");
                            this.jComboBox_producto.setSelectedItem("Seleccione producto:");
                            this.jComboBox_ubicacion.setSelectedItem("Seleccione ubicación:");
                            this.Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en:" + e);
                    }
                }
            }

        }
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jComboBox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_productoActionPerformed

    private void jComboBox_ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_ubicacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JComboBox<String> jComboBox_orden_compra;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JComboBox<String> jComboBox_ubicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_cantidad;
    // End of variables declaration//GEN-END:variables
    /**
     * limpiar campos
     */
    private void Limpiar() {
        txt_cantidad.setText("");     
    }
    
    private int getFiveDigitsNumber() {
        double fiveDigits = 10000 + Math.random() * 90000;
        return (int) fiveDigits;
    }

    /**
     * Metodo para cargar las categorias
     */
    private void CargarComboOrdenCompra() {
        Connection cn = conexion.Conexion.conectar();
        String sql = "select * from tb_cabecera_compra";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_orden_compra.removeAllItems();
            jComboBox_orden_compra.addItem("Seleccione orden:");
            while (rs.next()) {
                jComboBox_orden_compra.addItem(rs.getString("orden_compra"));

            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar las Ordenes de compra");
        }

    }

    private void CargarComboProductos() {
        Connection cn = conexion.Conexion.conectar();
        String sql = "select * from tb_producto";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Seleccione producto:");
            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre_producto"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar productos, !" + e);
        }
    }

    private int IdCabeceraCompra() {
        String sql = "Select * from tb_cabecera_compra where orden_compra = '" + this.jComboBox_orden_compra.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCabeceraCompraCombo = rs.getInt("idCabeceraCompra");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener idCabeceraCompra");
        }
        return obtenerIdCabeceraCompraCombo;
    }

    private int IdProducto() {
        String sql = "Select * from tb_producto where nombre_producto = '" + this.jComboBox_producto.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdProducto = rs.getInt("idProducto");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener idCabeceraCompra");
        }
        return obtenerIdProducto;
    }
}
