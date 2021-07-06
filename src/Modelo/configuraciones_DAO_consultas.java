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
    public void actualizar_validacion_de_usuario_existente(){
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al ervidor
            String consulta="UPDATE configuraciones SET usuario_creado=?";
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            //pasamos el parámetro de la consulta
            pst.setInt(1,1);//establecemos que el usuario ya fué creado
            
            int numafectada=pst.executeUpdate();//ejecutams la consulta
              
            if(numafectada!=0){
                    //JOptionPane.showMessageDialog(null, "Usuario actualizado");
            }else{
                    //JOptionPane.showMessageDialog(null, "No se puedo completarz");
            }
            pst.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visibles las exception
        }
    }
    public void Agregar_nombre_negocio(String Nombre){
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor de la base de datos
            String consulta="UPDATE configuraciones SET Nombre_negocio=?";//Tenemos un dato por defecto en la base de datos, asi que solo actualizamos , igual está validado desde la interfaz de crear usuario
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            //pasamos los parametros de la cosnutla , en este caso el nomre del negocio
            pst.setString(1, Nombre);
            
            
            pst.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception encontrada
        }
        
    }
    //------------------------------------------------------------------------------------------------------------------------------
    public void Activar_Descativar_modulo_ventas(int valor){
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="UPDATE configuraciones SET ModuloVentasActivo=?";
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            //pasamos los parametros a la consulta
            pst.setInt(1, valor);
            int numafectada=pst.executeUpdate();//ejecutams la consulta
              
            if(numafectada!=0){
                    //JOptionPane.showMessageDialog(null, "Nombre de negocio agregado");
            }else{
                    //JOptionPane.showMessageDialog(null, "No se puedo agregar el nombre del negocio");
            }
            pst.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
    }
    public ArrayList<Mod_configuraciones> EstadoModuloVentas(){
        ArrayList estadoVentas=new ArrayList();
        Mod_configuraciones mod_conf;
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="SELECT ModuloVentasActivo FROM configuraciones";
            PreparedStatement pst=accesoDB.prepareCall(consulta);
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta
            while(rs.next()){
                mod_conf=new Mod_configuraciones();
                mod_conf.setModuloVentasEstado(rs.getInt(1));
                estadoVentas.add(mod_conf);
            }
            pst.close();//cerramos la conexion
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return estadoVentas;
    }
    
}
