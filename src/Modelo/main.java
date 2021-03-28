/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Login;//importamos el maquete

/**
 *
 * @author Usuario
 */
public class main {
    
    public static void main(String []args){
        //hacemos visible el formulario de login que va a ser el primero que se vera 
        Login log=new Login ();
        log.setVisible(true);
    }
    
}
