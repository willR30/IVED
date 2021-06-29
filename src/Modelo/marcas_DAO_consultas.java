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
public class marcas_DAO_consultas {
    Conexion conx;
    //establecemos el contructo de la calse
    public marcas_DAO_consultas(){
        conx=new Conexion();//instanciamos el objeto de la clase conexion
    }
    //metodo para listar las marcas
    public ArrayList<Mod_marcas> listar_todas_las_marcas(){
        ArrayList lista_marcas=new ArrayList();//creamos el objeto array list donde se listaran los datos
        Mod_marcas mdm;
        try{
            Connection accesoDB=conx.getConextion();
            String consulta="SELECT * FROM marcas";//esta es la consula 
            PreparedStatement pst=accesoDB.prepareStatement(consulta);//le pasamos la consulta al servidor
            
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta y rescatamos los datos obtenidos
            
            while(rs.next()){//mientras se encuentren valores se entra al ciclo
                //rescatamos los vakires que se encontraron
                mdm =new Mod_marcas();
                mdm.setID_marca(rs.getInt(1));
                mdm.setNombre(rs.getString(2));
                mdm.setDescripcion(rs.getString(3));
                
                lista_marcas.add(mdm);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exeption 
        }
        return lista_marcas;//retornamos el objeto array list
    }
    //insertar marcas
    public void nueva_marca(String nombre,String descripcion){
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="INSERT INTO marcas(ID_marca,Nombre_marca,Descripcion_marca) VALUES(?,?,?)";
            PreparedStatement pst=accesoDB.prepareCall(consulta);
            //pasamos los paramtetros a la computadora
            pst.setString(1,"0");
            pst.setString(2, nombre);
            pst.setString(3,descripcion);
            
            int numafectada =pst.executeUpdate();
            
            if(numafectada<0){
                JOptionPane.showMessageDialog(null,"Error al Agregar");
                
            }else{
                JOptionPane.showMessageDialog(null,"Marca Agregada");
            }
            pst.close();//cerramos la conexion
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
    }
    
    public void editar_marca(String Nombre,String Descripcion, int ID_marca){
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String Consulta="UPDATE marcas SET Nombre_marca=?,Descripcion_marca=?  WHERE ID_marca=?";
            PreparedStatement pst=accesoDB.prepareCall(Consulta);
            //pasamos los parametros de la consulta
            pst.setString(1, Nombre);
            pst.setString(2, Descripcion);
            pst.setInt(3,ID_marca);
            int numafectada=pst.executeUpdate();//ejecutams la consulta
              
            if(numafectada!=0){
                    JOptionPane.showMessageDialog(null, "Marca Actualizada");
            }else{
                    JOptionPane.showMessageDialog(null, "No se puedo completar");
            }
            pst.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
    }
    public void elimiar_marca(int ID_marca){
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="DElETE FROM marcas WHERE ID_marca=?";
            PreparedStatement pst=accesoDB.prepareCall(consulta);
            //pasamos los parametros de la consutla
            pst.setInt(1, ID_marca);
            
            int numafectada=pst.executeUpdate();//ejecutams la consulta
              
              if(numafectada!=0){
                    JOptionPane.showMessageDialog(null, "Marca Eliminada");
              }else{
                    JOptionPane.showMessageDialog(null, "Error al eliminar\n intente de nuevo");
              }
             pst.close();//cerramos la conexion con el servidor
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public ArrayList<Mod_marcas> ID_marca(String nombre){
        ArrayList list_marca=new ArrayList();
        Mod_marcas mod_marca;
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="SELECT ID_marca FROM  marcas WHERE Nombre_marca=?";
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            //pasmos los parametros de la consulta
            pst.setString(1, nombre);
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta
            while(rs.next()){
                mod_marca=new Mod_marcas();
                mod_marca.setID_marca(rs.getInt(1));
                list_marca.add(mod_marca);//agregamos el objeto
            }   
            //cerramos la conexion
            pst.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception que estmos trabajando
        }
        return list_marca;
    }
    
}
