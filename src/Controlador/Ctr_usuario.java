/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.usuario_DAO_consultas;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ctr_usuario {
    usuario_DAO_consultas usuario_DAO=new usuario_DAO_consultas();
    
    public int login(String User_name ,String Contraseña){
        int numero_registros=usuario_DAO.login(User_name, Contraseña).size();
        return numero_registros;
    }
    public void listar_usuario(JTextField txt_usuario,JTextField txt_contraseña){
        txt_usuario.setText(usuario_DAO.listar_usuario().get(0).getUsuario());
        txt_contraseña.setText(usuario_DAO.listar_usuario().get(0).getContra());
    }
}
