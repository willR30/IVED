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
public class Mod_marcas {
    //esta clase guardará las propiedades de las marcas segun la base de datos
    private int ID_marca;
    private String Nombre;
    private String Descripcion;
    
    //ecapsulaos las propiedades
    public int getID_marca() {
        return ID_marca;
    }

    public void setID_marca(int ID_marca) {
        this.ID_marca = ID_marca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
