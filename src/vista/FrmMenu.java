package vista;

import controlador.Ctrl_Empleado;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author saduj
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de ventas");
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        this.jPanel1.setSize(new Dimension(420, 270));
        this.jPanel1.setLocation(1500, 700);
        /*Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
        String rolLog = controlUsuario.rol;
        jMenu_gestionar_venta.setVisible(false);
        if(rolLog.equals("Administrador")){
            jMenu1.setVisible(true);
            jMenu2.setVisible(true);
            jMenu3.setVisible(true);
            jMenu4.setVisible(true);
            jMenu5.setVisible(true);
            jMenu6.setVisible(true);
            jMenu7.setVisible(true);
            jMenu8.setVisible(true);
            rolLog.equals("");
        }else{
            jMenu1.setVisible(false);
            jMenu2.setVisible(false);
            jMenu3.setVisible(true);
            jMenu4.setVisible(false);
            jMenu5.setVisible(true);
            jMenu6.setVisible(false);
            jMenu7.setVisible(false);
            jMenu8.setVisible(true);
            rolLog.equals("");
        }*/
       

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ventas.png"));
        return retValue;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_nuevo_usuario = new javax.swing.JMenuItem();
        jMenu_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_nuevo_producto = new javax.swing.JMenuItem();
        jMenu_gestionar_producto = new javax.swing.JMenuItem();
        jMenu_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu_nuevo_cliente = new javax.swing.JMenuItem();
        jMenu_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu_nuevo_proveedor = new javax.swing.JMenuItem();
        jMenu_gestionar_proveedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu_nueva_categoria = new javax.swing.JMenuItem();
        jMenu_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu_nueva_venta = new javax.swing.JMenuItem();
        jMenu_gestionar_venta = new javax.swing.JMenuItem();
        jMenu_nueva_compra = new javax.swing.JMenuItem();
        jMenu_gestionar_compra = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu_reporte_clientes = new javax.swing.JMenuItem();
        jMenu_reporte_categorias = new javax.swing.JMenuItem();
        jMenu_reporte_productos = new javax.swing.JMenuItem();
        jMenu_reporte_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu_ver_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu_cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Empleado");
        jMenu1.setToolTipText("");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_nuevo_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenu_nuevo_usuario.setText("Registro Empleado");
        jMenu_nuevo_usuario.setToolTipText("");
        jMenu_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_nuevo_usuario);

        jMenu_gestionar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenu_gestionar_usuario.setText("Gestionar Empleado");
        jMenu_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_nuevo_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu_nuevo_producto.setText("Registro Producto");
        jMenu_nuevo_producto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_nuevo_producto);

        jMenu_gestionar_producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu_gestionar_producto.setText("Gestionar Producto");
        jMenu_gestionar_producto.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_gestionar_producto);

        jMenu_actualizar_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenu_actualizar_stock.setText("Actualizar Stock");
        jMenu_actualizar_stock.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente y Proveedor");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu3.setMinimumSize(new java.awt.Dimension(220, 50));
        jMenu3.setName(""); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(220, 50));

        jMenu_nuevo_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenu_nuevo_cliente.setText("Registro Cliente");
        jMenu_nuevo_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu_nuevo_cliente);

        jMenu_gestionar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu_gestionar_cliente.setText("Gestionar Clientes");
        jMenu_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu_gestionar_cliente);

        jMenu_nuevo_proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nuevo_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenu_nuevo_proveedor.setText("Registro Proveedor");
        jMenu_nuevo_proveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nuevo_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevo_proveedorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu_nuevo_proveedor);

        jMenu_gestionar_proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu_gestionar_proveedor.setText("Gestionar Proveedor");
        jMenu_gestionar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_proveedorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu_gestionar_proveedor);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoría");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_nueva_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenu_nueva_categoria.setText("Nueva Categoría");
        jMenu_nueva_categoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenu_nueva_categoria);

        jMenu_gestionar_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu_gestionar_categoria.setText("Gestionar Categoría");
        jMenu_gestionar_categoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_gestionar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenu_gestionar_categoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu5.setText("Facturación");
        jMenu5.setToolTipText("");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_nueva_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenu_nueva_venta.setText("Nueva Venta");
        jMenu_nueva_venta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu_nueva_venta);

        jMenu_gestionar_venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenu_gestionar_venta.setText("Gestionar Ventas");
        jMenu_gestionar_venta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_gestionar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu_gestionar_venta);

        jMenu_nueva_compra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_nueva_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenu_nueva_compra.setText("Nueva Compra");
        jMenu_nueva_compra.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_nueva_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nueva_compraActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu_nueva_compra);

        jMenu_gestionar_compra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_gestionar_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenu_gestionar_compra.setText("Gestionar Compra");
        jMenu_gestionar_compra.setToolTipText("");
        jMenu_gestionar_compra.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_gestionar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_gestionar_compraActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu_gestionar_compra);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_reporte_clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_reporte_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenu_reporte_clientes.setText("Reportes Clientes");
        jMenu_reporte_clientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_reporte_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_reporte_clientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu_reporte_clientes);

        jMenu_reporte_categorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_reporte_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenu_reporte_categorias.setText("Reporte Categorías");
        jMenu_reporte_categorias.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_reporte_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_reporte_categoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu_reporte_categorias);

        jMenu_reporte_productos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_reporte_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenu_reporte_productos.setText("Reportes Productos");
        jMenu_reporte_productos.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_reporte_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_reporte_productosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu_reporte_productos);

        jMenu_reporte_ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_reporte_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenu_reporte_ventas.setText("Reportes Ventas");
        jMenu_reporte_ventas.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_reporte_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_reporte_ventasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu_reporte_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_ver_historial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu_ver_historial.setText("Ver Historial");
        jMenu_ver_historial.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ver_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ver_historialActionPerformed(evt);
            }
        });
        jMenu7.add(jMenu_ver_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenu_cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu_cerrar_sesion.setText("Cerrar Sesión");
        jMenu_cerrar_sesion.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenu_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(873, 873, 873)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevo_usuarioActionPerformed
        InterEmpleado interUsuario = new InterEmpleado();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenu_nuevo_usuarioActionPerformed

    private void jMenu_gestionar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_ventaActionPerformed
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_ventaActionPerformed

    private void jMenu_reporte_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_reporte_categoriasActionPerformed

    }//GEN-LAST:event_jMenu_reporte_categoriasActionPerformed

    private void jMenu_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenu_nueva_categoriaActionPerformed

    private void jMenu_gestionar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_categoriaActionPerformed
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_categoriaActionPerformed

    private void jMenu_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevo_productoActionPerformed
        InterProducto interProducto = new InterProducto();
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenu_nuevo_productoActionPerformed

    private void jMenu_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_productoActionPerformed
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_productoActionPerformed

    private void jMenu_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevo_clienteActionPerformed
        InterCliente interCliente = new InterCliente();
        jDesktopPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenu_nuevo_clienteActionPerformed

    private void jMenu_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_clienteActionPerformed
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        jDesktopPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_clienteActionPerformed

    private void jMenu_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_actualizar_stockActionPerformed

    }//GEN-LAST:event_jMenu_actualizar_stockActionPerformed

    private void jMenu_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_cerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu_cerrar_sesionActionPerformed

    private void jMenu_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_usuarioActionPerformed
        InterGestionarEmpleado interGestionarUsuario = new InterGestionarEmpleado();
        jDesktopPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_usuarioActionPerformed

    private void jMenu_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nueva_ventaActionPerformed
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenu_nueva_ventaActionPerformed

    private void jMenu_reporte_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_reporte_clientesActionPerformed
 
    }//GEN-LAST:event_jMenu_reporte_clientesActionPerformed

    private void jMenu_reporte_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_reporte_productosActionPerformed

    }//GEN-LAST:event_jMenu_reporte_productosActionPerformed

    private void jMenu_reporte_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_reporte_ventasActionPerformed
 
    }//GEN-LAST:event_jMenu_reporte_ventasActionPerformed

    private void jMenu_ver_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ver_historialActionPerformed

    }//GEN-LAST:event_jMenu_ver_historialActionPerformed

    private void jMenu_nuevo_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevo_proveedorActionPerformed
        InterProveedor interProveedor = new InterProveedor();
        jDesktopPane_menu.add(interProveedor);
        interProveedor.setVisible(true);

    }//GEN-LAST:event_jMenu_nuevo_proveedorActionPerformed

    private void jMenu_gestionar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_proveedorActionPerformed
        InterGestionarProveedor interGestionarProveedor = new InterGestionarProveedor();
        jDesktopPane_menu.add(interGestionarProveedor);
        interGestionarProveedor.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_proveedorActionPerformed

    private void jMenu_nueva_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nueva_compraActionPerformed
        InterCompras interCompras = new InterCompras();
        jDesktopPane_menu.add(interCompras);
        interCompras.setVisible(true);
    }//GEN-LAST:event_jMenu_nueva_compraActionPerformed

    private void jMenu_gestionar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_gestionar_compraActionPerformed
        InterGestionarCompras interGestionarCompras = new InterGestionarCompras();
        jDesktopPane_menu.add(interGestionarCompras);
        interGestionarCompras.setVisible(true);
    }//GEN-LAST:event_jMenu_gestionar_compraActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenu_actualizar_stock;
    private javax.swing.JMenuItem jMenu_cerrar_sesion;
    private javax.swing.JMenuItem jMenu_gestionar_categoria;
    private javax.swing.JMenuItem jMenu_gestionar_cliente;
    private javax.swing.JMenuItem jMenu_gestionar_compra;
    private javax.swing.JMenuItem jMenu_gestionar_producto;
    private javax.swing.JMenuItem jMenu_gestionar_proveedor;
    private javax.swing.JMenuItem jMenu_gestionar_usuario;
    private javax.swing.JMenuItem jMenu_gestionar_venta;
    private javax.swing.JMenuItem jMenu_nueva_categoria;
    private javax.swing.JMenuItem jMenu_nueva_compra;
    private javax.swing.JMenuItem jMenu_nueva_venta;
    private javax.swing.JMenuItem jMenu_nuevo_cliente;
    private javax.swing.JMenuItem jMenu_nuevo_producto;
    private javax.swing.JMenuItem jMenu_nuevo_proveedor;
    private javax.swing.JMenuItem jMenu_nuevo_usuario;
    private javax.swing.JMenuItem jMenu_reporte_categorias;
    private javax.swing.JMenuItem jMenu_reporte_clientes;
    private javax.swing.JMenuItem jMenu_reporte_productos;
    private javax.swing.JMenuItem jMenu_reporte_ventas;
    private javax.swing.JMenuItem jMenu_ver_historial;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
