/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author saduj
 */
public class CabeceraCompra {
    
    private int idCabeceraCompra;
    private int idProveedor;
    private int idEmpleado;
    private double valorCompra;
    private String ordenCompra;
    private String tipoDocumento;
    private String numeroDocumento;
    private String fechaCompra;
    private String estadoPago;
    private int estado;

    public CabeceraCompra() {
        this.idCabeceraCompra = 0;
        this.idProveedor = 0;
        this.idEmpleado = 0;
        this.valorCompra = 0;
        this.ordenCompra = "";
        this.tipoDocumento = "";
        this.numeroDocumento = "";
        this.fechaCompra = "";
        this.estadoPago = "";
        this.estado = 0;
    }

    public CabeceraCompra(int idCabeceraCompra, int idProveedor, int idEmpleado, double valorCompra, String ordenCompra, String tipoDocumento, String numeroDocumento, String fechaCompra, String estadoPago, int estado) {
        this.idCabeceraCompra = idCabeceraCompra;
        this.idProveedor = idProveedor;
        this.idEmpleado = idEmpleado;
        this.valorCompra = valorCompra;
        this.ordenCompra = ordenCompra;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaCompra = fechaCompra;
        this.estadoPago = estadoPago;
        this.estado = estado;
    }

    public int getIdCabeceraCompra() {
        return idCabeceraCompra;
    }

    public void setIdCabeceraCompra(int idCabeceraCompra) {
        this.idCabeceraCompra = idCabeceraCompra;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
   
    
    
    
    
    
}
