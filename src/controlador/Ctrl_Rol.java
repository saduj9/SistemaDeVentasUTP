/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import modelo.Rol;

/**
 *
 * @author Rexar
 */
public class Ctrl_Rol {

    public static ResultSet consultarRoles() {
        String sql = "SELECT * FROM tb_rol where estado = 1;";
        Statement st;
        ResultSet rs = null;

        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

        } catch (SQLException e) {
            System.out.println("Error al consultar los roles" + e);
        }
        return rs;
    }

    public void llenarComboBox(JComboBox<Rol> comboRol){
        String sql = "SELECT * FROM tb_rol where estado = 1;";
        Statement st;
        ResultSet rs;
        Connection cn = conexion.Conexion.conectar();
        try {

            st = cn.createStatement();
            rs = st.executeQuery(sql);
            comboRol.removeAllItems();
            while (rs.next()) {
                comboRol.addItem(new Rol(
                        rs.getInt("idRol"),
                        rs.getString("nombreRol"),
                        rs.getInt("estado")
                ));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al consultar los roles" + e);
        }
        
    }
    
}
