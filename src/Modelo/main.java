/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Login;//importamos el maquete
import Vista.Splash_screen;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class main {
    
    public static void main(String []args){
        Splash_screen ss=new Splash_screen();
        ss.setVisible(true);
        try {
            Thread.sleep(3*1000);
            ss.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login login=new Login();
        login.setVisible(true);
        
    }
    
}
