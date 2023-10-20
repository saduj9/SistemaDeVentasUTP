/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saduj
 */
public class DetalleCompra {
    
    private int idDetalleCompra;
    private int idCabeceraCompra;
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subTotal;
    private double descuento;
    private double igv;
    private double totalPagar;
    private int estado;
    
    public DetalleCompra() {
        this.idDetalleCompra = 0;
        this.idCabeceraCompra = 0;
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precioUnitario = 0.0;
        this.subTotal = 0.0;
        this.descuento = 0.0;
        this.igv = 0.0;
        this.totalPagar = 0.0;
        this.estado = 0;
    }

    public DetalleCompra(int idDetalleCompra, int idCabeceraCompra, int idProducto, String nombre, int cantidad, double precioUnitario, double subTotal, double descuento, double igv, double totalPagar, int estado) {
        this.idDetalleCompra = idDetalleCompra;
        this.idCabeceraCompra = idCabeceraCompra;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.igv = igv;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

   
   
    
    
}
