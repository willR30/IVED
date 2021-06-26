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
public class Mod_ventas extends Mod_productos{//heredamos algunos atributos de las propiedades productos
    //establecemos las propiedades iniciales de el objeto venta
    private int ID_venta;
    private String Codigo_identificador;//el codigo del producto que vamos a vender
    private int Cantidad_vendida;//la cantidad que estamos vendiendo
    private float Precio_unitario;//el precio al que se vendio el producto en ese momento
    private String Codigo_factura;//el codigo de la factura a la cual pretener

    public int getID_venta() {
        return ID_venta;
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;
    }

    public String getCodigo_identificador() {
        return Codigo_identificador;
    }

    public void setCodigo_identificador(String Codigo_identificador) {
        this.Codigo_identificador = Codigo_identificador;
    }

    public int getCantidad_vendida() {
        return Cantidad_vendida;
    }

    public void setCantidad_vendida(int Cantidad_vendida) {
        this.Cantidad_vendida = Cantidad_vendida;
    }

    public float getPrecio_unitario() {
        return Precio_unitario;
    }

    public void setPrecio_unitario(float Precio_unitario) {
        this.Precio_unitario = Precio_unitario;
    }

    public String getCodigo_factura() {
        return Codigo_factura;
    }

    public void setCodigo_factura(String Codigo_factura) {
        this.Codigo_factura = Codigo_factura;
    }
    
}
