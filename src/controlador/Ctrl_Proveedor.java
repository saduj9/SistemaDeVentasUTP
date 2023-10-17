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
import modelo.Proveedor;

/**
 *
 * @author saduj
 */
public class Ctrl_Proveedor {
    
    public boolean guardar(Proveedor objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_proveedor values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getRazon_social());
            consulta.setString(3, objeto.getRuc());
            consulta.setString(4, objeto.getEmail());
            consulta.setString(5, objeto.getTelefono());
            consulta.setString(6, objeto.getDireccion());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el proveedor:" + e);
        }
        return respuesta;
    }
    
    public boolean existeProveedor(String ruc) {
        boolean respuesta = false;
        String sql = "select ruc from tb_proveedor where ruc = '" + ruc + "';";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar el proveedor" + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Proveedor objeto, int idProveedor) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_proveedor set razon_social=?, ruc=?, email=?, telefono=?, direccion=? where idProveedor='" + idProveedor +"'");
            consulta.setString(1, objeto.getRazon_social());
            consulta.setString(2, objeto.getRuc());
            consulta.setString(3, objeto.getEmail());
            consulta.setString(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDireccion());
          
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar proveedor " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int idProveedor) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_proveedor set estado='0' where idProveedor='" + idProveedor +"'");
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el proveedor" + e);
        }
        return respuesta;
    }
    
}
