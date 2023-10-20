/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saduj
 */
public class Almacen {
    
    private int idAlmacen;
    private int idCabeceraCompra;
    private int idProducto;
    private String sku;
    private int stock;
    private String ubicacion;
    private int estado;

    public Almacen() {
        this.idAlmacen = 0;
        this.idCabeceraCompra = 0;
        this.idProducto = 0;
        this.sku = "";
        this.stock = 0;
        this.ubicacion = "";
        this.estado = 0;
    }

    public Almacen(int idAlmacen, int idCabeceraCompra, int idProducto, String sku, int stock, String ubicacion, int estado) {
        this.idAlmacen = idAlmacen;
        this.idCabeceraCompra = idCabeceraCompra;
        this.idProducto = idProducto;
        this.sku = sku;
        this.stock = stock;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getIdCabeceraCompra() {
        return idCabeceraCompra;
    }

    public void setIdCabeceraCompra(int idCabeceraCompra) {
        this.idCabeceraCompra = idCabeceraCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
