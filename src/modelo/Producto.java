/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saduj
 */
public class Producto {
    
    private int idProducto;
    private String nombre_producto;
    private int cantidad;
    private double precio;
    private String descripcion_prod;
    private int porcentaje_igv;
    private int idCategoria;
    private int estado;

    public Producto() {
        this.idProducto = 0;
        this.nombre_producto = "";
        this.cantidad = 0;
        this.precio = 0.0;
        this.descripcion_prod = "";
        this.porcentaje_igv = 0;
        this.idCategoria = 0;
        this.estado = 0;
    }

    public Producto(int idProducto, String nombre_producto, int cantidad, double precio, String descripcion_prod, int porcentaje_igv, int idCategoria, int estado) {
        this.idProducto = idProducto;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion_prod = descripcion_prod;
        this.porcentaje_igv = porcentaje_igv;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public int getPorcentaje_igv() {
        return porcentaje_igv;
    }

    public void setPorcentaje_igv(int porcentaje_igv) {
        this.porcentaje_igv = porcentaje_igv;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
}
