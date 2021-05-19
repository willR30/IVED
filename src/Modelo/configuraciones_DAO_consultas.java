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
 * @author DELL
 */
public class configuraciones_DAO_consultas {
    //creamos el consructor de la clase
    //variable de conexin a la calse
    Conexion conx;
    //creamos el constructor de la clase e instanciamos la variable de conexion
    public configuraciones_DAO_consultas(){
        conx=new Conexion();//instanciamos la variable de conexion
    }
    
    //validamos si el usuario ha sido creado o no al inciaar el programa
    public ArrayList<Mod_configuraciones>validar_usuario_creado(){
        ArrayList usuario_validacion =new ArrayList();
        Mod_configuraciones mod_config;
        //validamos exception dentro del metodo
        
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="SELECT  usuario_creado FROM configuraciones";
            PreparedStatement ps=accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
            
            //ejecutamos la consulta
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                mod_config=new Mod_configuraciones();//instanciamos el objeto
                mod_config.setUsuario_creado_val(rs.getInt(1));
                
                usuario_validacion.add(mod_config);//agregamos el objeto al arraylist
            }
            ps.close();//cerrramos la conexion al servidor
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception del programa
        }
        return usuario_validacion;
    }
    
}
