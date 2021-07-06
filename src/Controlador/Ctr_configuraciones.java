/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.configuraciones_DAO_consultas;//importamos la clase con la que se va a trabajar

/**
 *
 * @author DELL
 */
public class Ctr_configuraciones {
    //instanciamos el objeto para conectarnos a la clase en modelo
    configuraciones_DAO_consultas conf_DAO=new configuraciones_DAO_consultas();
    public int validar_usuario_creado(){
        int usuarioValidacion=conf_DAO.validar_usuario_creado().get(0).getUsuario_creado_val();
        return usuarioValidacion;
        
    }
    public void actualizar_validacion_de_usuario_existente(){
        //aqui actualizamos la validacion el usuario
        conf_DAO.actualizar_validacion_de_usuario_existente();//actualizamos el estado
        
    }
    //agregamos el nombre del negocio
    public void agregar_nombre_negocio(String Nombre){
        conf_DAO.Agregar_nombre_negocio(Nombre);//nos conectamos a la capa de modelo y psasmos el nombre como parametro
    }
    //activar-desactivar modulo de ventas*/
    public void Activar_Desactivar_Ventas(int valor){
        conf_DAO.Activar_Descativar_modulo_ventas(valor);
    }
    public int EstadoModuloVentas(){
        return conf_DAO.EstadoModuloVentas().get(0).getModuloVentasEstado();
    }
        
}
