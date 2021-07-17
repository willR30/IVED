/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Ctr_configuraciones;
import Vista.Activacion_proucto;
import Vista.Crear_usuario;
import Vista.Login;//importamos el maquete
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class main {
    
    public static void main(String []args){
        //Activacion_proucto act=new Activacion_proucto();
        //act.setVisible(true);
        //pirmero validamos que el usuario exista para saber que formulario mostrar
        //primero quiero validar si el usuario existe
        //tomamos encuenta las exception de la clase
        //el software solo adminitrá un usuario unicamente fuera de ese no se podrá crear mas
        
       try{
            Ctr_configuraciones ctr=new Ctr_configuraciones();//importamos y nos  conectamos al ctr
            int validacion_usuario=ctr.validar_usuario_creado();
            if(validacion_usuario==0){
                //en un caso de que el usuario no exista, mostramos el formulario en que va a poder crear el usuario
                Crear_usuario registrarce=new Crear_usuario();
                registrarce.setVisible(true);
            }else if (validacion_usuario==1){
                //si el usuairo existe lo mandamos directamente al inicio de sescion de forma normal
                //hacemos visible el formulario de login que va a ser el primero que se vera 
                Login log=new Login ();
                log.setVisible(true);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
}
