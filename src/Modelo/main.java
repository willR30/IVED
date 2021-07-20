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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class main {
    static Scanner entrada;
    public static void main(String[] args) {
        //validamos si el producto está activado
        //creamos el obejto de la capa de configuraciones para acceder al metodo
        Ctr_configuraciones ctr = new Ctr_configuraciones();
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("C:\\Users\\DELL\\Desktop\\archivo.txt"));
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        int EstadoProducto = 0;
        
        
        try {
            
            EstadoProducto=ctr.EstadoProducto();
            new Login().setVisible(true);
            
            if (EstadoProducto == 0) {
            //si el producto no esta activado
            Activacion_proucto act = new Activacion_proucto();
            act.setVisible(true);
            
            } else {
            ValidarLoginCreacionUsuario();
            }
        } catch (Exception ex) {
            pw.write(Arrays.toString(ex.getStackTrace())+'\n'+'\n'+ex.getMessage());
            pw.close();
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void ValidarLoginCreacionUsuario(){
        //pirmero validamos que el usuario exista para saber que formulario mostrar
            //primero quiero validar si el usuario existe
            //tomamos encuenta las exception de la clase
            //el software solo adminitrá un usuario unicamente fuera de ese no se podrá crear mas
            Ctr_configuraciones ctr = new Ctr_configuraciones();
             try{
                
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
