/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saduj
 */
public class Proveedor {
    
    private int idProveedor;
    private String razon_social;
    private String ruc;
    private String email;
    private String telefono;
    private String direccion;
    private int estado;

    public Proveedor() {
        this.idProveedor = 0;
        this.razon_social = "";
        this.ruc = "";
        this.email = "";
        this.telefono = "";
        this.direccion = "";
        this.estado = 0;
    }

    public Proveedor(int idProveedor, String razon_social, String ruc, String email, String telefono, String direccion, int estado) {
        this.idProveedor = idProveedor;
        this.razon_social = razon_social;
        this.ruc = ruc;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
