/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Mod_productos {
    //establecemos las propiedades del objeto
    private int Cantidad;
    private int ID_marca;
    private String Nombre,Marca,Descripcion,Codigo_identificador;
    private float Precio;

    public int getID_marca() {
        return ID_marca;
    }

    public void setID_marca(int ID_marca) {
        this.ID_marca = ID_marca;
    }
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getCodigo_identificador() {
        return Codigo_identificador;
    }

    public void setCodigo_identificador(String Codigo_identificador) {
        this.Codigo_identificador = Codigo_identificador;
    }
    
}
