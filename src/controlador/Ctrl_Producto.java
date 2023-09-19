/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;

/**
 *
 * @author saduj
 */
public class Ctrl_Producto {
    
    //metodo para registrar un nuevo producto
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_producto values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre_producto());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion_prod());
            consulta.setInt(6, objeto.getPorcentaje_igv());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el producto:" + e);
        }
        return respuesta;
    }
//metodo para verificar el producto existe
    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_producto where nombre = '" + producto + "';";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la producto" + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_producto set nombre_producto=?, cantidad=?, precio=?, descripcion_prod=?, porcentaje_igv=?, idCategoria=?  where idProducto='" + idProducto +"'");
            consulta.setString(1, objeto.getNombre_producto());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion_prod());
            consulta.setInt(5, objeto.getPorcentaje_igv());
            consulta.setInt(6, objeto.getIdCategoria());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualiizar producto" + e);
        }
        return respuesta;
    }
    
    //metodo para eliminar  producto
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_producto set estado='0' where idProducto='" + idProducto +"'");
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la producto" + e);
        }
        return respuesta;
    }
    
    public boolean actualizarStock(Producto objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_producto set cantidad=?  where idProducto='" + idProducto +"'");
            consulta.setInt(1, objeto.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el stock del producto" + e);
        }
        return respuesta;
    }
    
    public boolean eliminarPorCategoria(int idCategoría) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE tb_producto SET estado = '0' WHERE idCategoria ='" + idCategoría +"' AND idProducto NOT IN (SELECT idProducto FROM ( SELECT idProducto FROM tb_producto WHERE idCategoria <> "+ idCategoría +" ) AS subconsulta)");
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la producto" + e);
        }
        return respuesta;
    }
}
