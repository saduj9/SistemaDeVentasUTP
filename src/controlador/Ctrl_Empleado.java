/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import modelo.Empleado;

/**
 *
 * @author saduj
 */
public class Ctrl_Empleado {
   //metoodo para logearse
    public static int idUsuarioLogeado = 0;
    public static String usuario = "";
    public static String rol = "";
    public boolean loginUsuario(Empleado objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "select usuario, contraseña ,nombreRol, idEmpleado from tb_empleado inner join tb_rol on tb_rol.idRol =tb_empleado.idRol"
                + " where tb_empleado.usuario = '"+ objeto.getUsuario() +"' and tb_empleado.contraseña = '"+ objeto.getContraseña()+"' and tb_empleado.estado = 1";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
               idUsuarioLogeado = rs.getInt("idEmpleado");
               usuario = rs.getString("usuario");              
               rol = rs.getString("nombreRol");
               //System.out.println("Error al Iniciar Sesion"+rol);
               respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
    
    
    public boolean guardar(Empleado objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_empleado values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getContraseña());
            consulta.setInt(6, objeto.getIdRol());
            consulta.setString(7, objeto.getTelefono());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el empleado:" + e);
        }
        return respuesta;
    }
//metodo para verificar el cliente existe

    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_empleado where usuario = '" + usuario + "';";
        Statement st;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el empleado" + e);
        }
        return respuesta;
    }
    
    public boolean actualizar(Empleado objeto, int idEmpleado) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_empleado set nombre=?, apellido = ?, usuario = ?, contraseña= ?, idRol = ?, telefono = ?, estado = ? where idEmpleado ='" + idEmpleado + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getContraseña());
            consulta.setInt(5, objeto.getIdRol());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar empleado: " + e);
        }
        return respuesta;
    }
    
    public boolean eliminar(int idEmpleado) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_empleado set estado='0' where idEmpleado='" + idEmpleado +"'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar empleado: " + e);
        }
        return respuesta;
    }
    
    public boolean restaurar(int idEmpleado) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_empleado set estado='1' where idEmpleado='" + idEmpleado +"'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restaurar empleado: " + e);
        }
        return respuesta;
    }

}
