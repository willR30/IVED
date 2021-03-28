/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class usuario_DAO_consultas {
     Conexion conx;
     
     
    
    //creamos el constructor 
    
    public usuario_DAO_consultas(){
        conx=new Conexion();//inicializamos el objeto 
        
    }
      public ArrayList<Mod_usuario> login(String User_name ,String Contraseña){
         ArrayList log =new ArrayList();//creamos el objeto
         Mod_usuario login_usuario=null;
         try{
             Connection accesoDB=conx.getConextion();//nos conectamos al servidor
             String consulta="SELECT usuario,contra FROM usuario WHERE usuario=? AND contra=?";
             PreparedStatement ps=accesoDB.prepareStatement(consulta);
             //pasamos los parametros a la consulta
             ps.setString(1,User_name);
             ps.setString(2,Contraseña);
             
             //ejecutamos la consulta
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                 login_usuario=new Mod_usuario();
                 login_usuario.setUsuario(rs.getString(1));
                 
                 log.add(login_usuario);
             }
             accesoDB.close();//cerramos la conexion a la base de datos
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);//hacemos visible la exceptin
            
         }
         return log;//retornamos el objeto
     }
}
