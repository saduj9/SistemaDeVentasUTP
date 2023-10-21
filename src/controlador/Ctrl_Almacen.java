/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            PreparedStatement consulta = cn.prepareStatement("insert into tb_almacen values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, objeto.getIdCabeceraCompra());
            consulta.setInt(3, objeto.getIdProducto());
            consulta.setString(4, objeto.getSku());
            consulta.setInt(5, objeto.getStock());
            consulta.setString(6, objeto.getUbicacion());
            consulta.setString(7, objeto.getFechaIngreso());
            consulta.setInt(8, objeto.getEstado());
    
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
            PreparedStatement consulta = cn.prepareStatement("update tb_almacen set  sku=?, stock=?, ubicacion=?  where idAlmacen='" + idAlmacen +"'");
            consulta.setString(1, objeto.getSku());
            consulta.setInt(2, objeto.getStock());
            consulta.setString(3, objeto.getUbicacion());
      
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto del almacen" + e);
        }
        return respuesta;
    }
    
    public boolean actualizarStock(Almacen objeto, int idAlmacen) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_almacen set stock=?, estado=?  where idAlmacen='" + idAlmacen +"'");
            consulta.setInt(1, objeto.getStock());
            consulta.setInt(2, objeto.getEstado());
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
    
    public String obtenerSku(int idProducto){
        String sku = "";
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("select a.sku, p.nombre_producto from tb_almacen a, tb_producto p where p.idProducto =  a.idProducto and a.idProducto = '"+idProducto +"' Limit 1");
            
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                sku = rs.getString("sku");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener sku" + e);
        }
        return sku;
    }
    
    public int obtenerCantidadFechaAntigua(int idProducto){
        int stock = 0;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("select stock,min(fecha_ingreso) as fechaantigua from tb_almacen where idProducto = '"+idProducto+"' and estado= 1 group by  1  order by 1 ASC LIMIT 1");
            
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                stock = rs.getInt("stock");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener stock con fecha antigua" + e);
        }
        return stock;
    }
    
    public int obtenerIdAlmacen(int idProducto){
        int idAlmacen = 0;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("select idAlmacen  from tb_almacen where idProducto = '"+idProducto+"' and estado= 1 group by  1  order by 1 ASC LIMIT 1");
            
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                idAlmacen = rs.getInt("idAlmacen");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener idAlmacen con fecha antigua" + e);
        }
        return idAlmacen;
    }
    
    public int obtenerSumaStock (int idProducto){
        int sumaStock = 0;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("select sum(stock) as sumaStock from tb_almacen where idProducto = '"+idProducto+"' and estado= 1");
            
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                sumaStock = rs.getInt("sumaStock");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener suma del stock" + e);
        }
        return sumaStock;
    }
    
    public int obtenerTotalRows(int idProducto){
        int conteo = 0;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("select count(*) as conteo from tb_almacen where idProducto = '"+idProducto+"' and estado= 1");
            
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                conteo = rs.getInt("conteo");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el conteo" + e);
        }
        return conteo;
    }
}
