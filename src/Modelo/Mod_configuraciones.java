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
public class Mod_configuraciones {
    private int Usuario_creado_val;//validará el si el usario ha sido creado o no , solo admitirá un usuario en el software
    private String Nombre_negocio;
    private int ModuloVentasEstado;
    private int ProductoActivado;
    
    public int getUsuario_creado_val() {
        return Usuario_creado_val;
    }

    public void setUsuario_creado_val(int Usuario_creado_val) {
        this.Usuario_creado_val = Usuario_creado_val;
    }

    public String getNombre_negocio() {
        return Nombre_negocio;
    }

    public void setNombre_negocio(String Nombre_negocio) {
        this.Nombre_negocio = Nombre_negocio;
    }

    public int getModuloVentasEstado() {
        return ModuloVentasEstado;
    }

    public void setModuloVentasEstado(int ModuloVentasEstado) {
        this.ModuloVentasEstado = ModuloVentasEstado;
    }

    public int getProductoActivado() {
        return ProductoActivado;
    }

    public void setProductoActivado(int ProductoActivado) {
        this.ProductoActivado = ProductoActivado;
    }

   
    
}
