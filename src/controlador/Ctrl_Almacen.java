/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Almacen;


/**
 *
 * @author saduj
 */
public class Ctrl_Almacen {
    
    public boolean guardar(Almacen objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_almacen values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, objeto.getIdCabeceraCompra());
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setString(4, objeto.getSku());
            consulta.setInt(5, objeto.getStock());
            consulta.setString(6, objeto.getUbicacion());
            consulta.setInt(7, objeto.getEstado());
    
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el producto en almacén:" + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Almacen objeto, int idAlmacen) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_almacen set idCabeceraCompra=?, idProducto=?, sku=?, stock=?, ubicacion=?  where idAlmacen='" + idAlmacen +"'");
            consulta.setInt(1, objeto.getIdCabeceraCompra());
            consulta.setInt(2, objeto.getIdProducto());
            consulta.setString(3, objeto.getSku());
            consulta.setInt(4, objeto.getStock());
            consulta.setString(5, objeto.getUbicacion());
      
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto del almacen" + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int idAlmacen) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_almacen set estado='0' where idAlmacen='" + idAlmacen +"'");
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto del almacen" + e);
        }
        return respuesta;
    }
}
