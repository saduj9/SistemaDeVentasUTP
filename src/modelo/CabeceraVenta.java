/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saduj
 */
public class CabeceraVenta {
    
    private int idCabeceraventa;
    private int idCliente;
    private int idEmpleado;
    private double valorPagar;
    private String fechaVenta;
    private int estado;
    
    public CabeceraVenta(){
        this.idCabeceraventa = 0;
        this.idCliente = 0;
        this.idEmpleado=0;
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }

    public CabeceraVenta(int idCabeceraventa, int idCliente, int idEmpleado, double valorPagar, String fechaVenta, int estado) {
        this.idCabeceraventa = idCabeceraventa;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }

    public int getIdCabeceraventa() {
        return idCabeceraventa;
    }

    public void setIdCabeceraventa(int idCabeceraventa) {
        this.idCabeceraventa = idCabeceraventa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    
    
    
    
}
