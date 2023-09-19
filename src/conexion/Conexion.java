/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author saduj
 */
public class Conexion {
    //conexion local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistemaventasutp", "root", "1234");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexio local: "+ e );
        }
        return null;
    }
    
}
