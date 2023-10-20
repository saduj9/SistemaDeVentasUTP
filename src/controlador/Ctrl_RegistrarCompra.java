/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CabeceraCompra;
import modelo.DetalleCompra;


/**
 *
 * @author saduj
 */
public class Ctrl_RegistrarCompra {
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    
    public boolean guardar(CabeceraCompra objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_cabecera_compra values(?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getIdProveedor());
            consulta.setInt(3, objeto.getIdEmpleado());
            consulta.setDouble(4, objeto.getValorCompra());
            consulta.setString(5, objeto.getOrdenCompra());
            consulta.setString(6, objeto.getTipoDocumento());
            consulta.setString(7, objeto.getNumeroDocumento());
            consulta.setString(8, objeto.getFechaCompra());
            consulta.setString(9, objeto.getEstadoPago());
            consulta.setInt(10, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de compra: " + e);
        }
        return respuesta;
    }
    
    
    public boolean guardarDetalle(DetalleCompra objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_detalle_compra values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIgv());
            consulta.setDouble(9, objeto.getTotalPagar());
            consulta.setInt(10, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de proveedor: " + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(CabeceraCompra objeto, int idCabeceraCompra) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update tb_cabecera_compra set idProveedor = ?, orden_compra = ?,estado_pago = ? "
                            + "where idCabeceraCompra ='" + idCabeceraCompra + "'");
            consulta.setInt(1, objeto.getIdProveedor());
            consulta.setString(2, objeto.getOrdenCompra());
            consulta.setString(3, objeto.getEstadoPago());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cabecera de compra: " + e);
        }
        return respuesta;
    }
    
}
