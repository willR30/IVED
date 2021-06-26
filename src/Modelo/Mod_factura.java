/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Mod_factura {
    private String Codigo_factura, Fecha,Cliente;
    private Float Sub_total,Iva,Total;
    private String Estado_factura;

    public String getCodigo_factura() {
        return Codigo_factura;
    }

    public void setCodigo_factura(String Codigo_factura) {
        this.Codigo_factura = Codigo_factura;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public Float getSub_total() {
        return Sub_total;
    }

    public void setSub_total(Float Sub_total) {
        this.Sub_total = Sub_total;
    }

    public Float getIva() {
        return Iva;
    }

    public void setIva(Float Iva) {
        this.Iva = Iva;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public String getEstado_factura() {
        return Estado_factura;
    }

    public void setEstado_factura(String Estado_factura) {
        this.Estado_factura = Estado_factura;
    }
    
    
}
