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
public class productos_DAO_consultas {
    Conexion conx;
        public productos_DAO_consultas(){
            conx=new Conexion();
        }
    public ArrayList<Mod_productos>listar_productos(){
            ArrayList lista_grupos=new ArrayList();
            Mod_productos mdp;
            try{
                Connection accesoDB=conx.getConextion();//nos conectamos al servidor
                String consulta="SELECT * FROM productos ORDEr BY Nombre ASC";
                PreparedStatement ps=accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
                
                //ejecutamos la consulta
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                 mdp=new Mod_productos();
                 mdp.setID_producto(rs.getInt(1));
                 mdp.setNombre(rs.getString(2));
                 mdp.setMarca(rs.getString(3));
                 mdp.setDescripcion(rs.getString(4));
                 mdp.setCantidad(rs.getInt(5));
                 mdp.setCodigo_catalago(rs.getString(6));
                 mdp.setPrecio(rs.getFloat(7));
                 lista_grupos.add(mdp);
                }
                ps.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
            }
            //retornamos el objeto
            return lista_grupos;
        }
    //----------------------------------------------------------------------------------------------
    //agregar un  producto
    public void agregar_producto(String Nombre,String Marca,String Descripcion,int Cantidad,String Codigo,float Precio){
        
        String consulta="INSERT INTO productos(ID_producto,Nombre,Marca,Descripcion,Cantidad,Codigo_catalago ,Precio)VALUES(?,?,?,?,?,?,?)";
        try{
            Connection accesoDB=conx.getConextion();
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            
            pst.setString(1,"0");
            pst.setString(2,Nombre);
            pst.setString(3,Marca);
            pst.setString(4,Descripcion);
            pst.setInt(5,Cantidad);
            pst.setString(6,Codigo);
            pst.setFloat(7, Precio);
            
            int numafectada =pst.executeUpdate();
            
            if(numafectada<0){
                JOptionPane.showMessageDialog(null,"Error al Agregar");
                
            }else{
                JOptionPane.showMessageDialog(null,"Registro Agregado");
            }
            pst.close();//cerramos la conexion
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     public ArrayList<Mod_productos>buscar_por_codigo(String Codigo){
            ArrayList lista_grupos=new ArrayList();
            Mod_productos mdp;
            try{
                Connection accesoDB=conx.getConextion();//nos conectamos al servidor
                String consulta="SELECT ID_producto,Nombre,Marca,Descripcion,Cantidad FROM productos WHERE Codigo_catalago=?";
                PreparedStatement pst=accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
                pst.setString(1, Codigo);//pasamos el parametro
                //ejecutamos la consulta
                ResultSet rs=pst.executeQuery();
                while(rs.next()){
                 mdp=new Mod_productos();
                 mdp.setID_producto(rs.getInt(1));
                 mdp.setNombre(rs.getString(2));
                 mdp.setMarca(rs.getString(3));
                 mdp.setDescripcion(rs.getString(4));
                 mdp.setCantidad(rs.getInt(5));
                 
                 lista_grupos.add(mdp);
                }
                pst.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
            }
            //retornamos el objeto
            return lista_grupos;
        }
    //-------------------------------------------------------------------------------------------------------------
     public void editar_catidad(int nueva_cantidad,int id){
         String consulta="UPDATE productos SET Cantidad=? WHERE ID_producto=? ";
         try{
             Connection accesoDB=conx.getConextion();
             PreparedStatement pst=accesoDB.prepareStatement(consulta);
             pst.setInt(1,nueva_cantidad);
             pst.setInt(2, id);
             
             int numafectada=pst.executeUpdate();//ejecutams la consulta
              
            if(numafectada!=0){
                    JOptionPane.showMessageDialog(null, "Unidades Actualizadas");
            }else{
                    JOptionPane.showMessageDialog(null, "No se puedo completar");
            }
            pst.close();
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
         }
     }
    public ArrayList<Mod_productos>buscar_por_ID(int ID){
            ArrayList lista_grupos=new ArrayList();
            Mod_productos mdp;
            try{
                Connection accesoDB=conx.getConextion();//nos conectamos al servidor
                String consulta="SELECT Nombre,Marca,Descripcion,Cantidad,Codigo_catalago,Precio FROM productos WHERE ID_producto=?";
                PreparedStatement pst=accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
                pst.setInt(1, ID);//pasamos el parametro
                //ejecutamos la consulta
                ResultSet rs=pst.executeQuery();
                while(rs.next()){
                 mdp=new Mod_productos();
                 
                 mdp.setNombre(rs.getString(1));
                 mdp.setMarca(rs.getString(2));
                 mdp.setDescripcion(rs.getString(3));
                 mdp.setCantidad(rs.getInt(4));
                 mdp.setCodigo_catalago(rs.getString(5));
                 mdp.setPrecio(rs.getFloat(6));
                 
                 lista_grupos.add(mdp);
                }
                pst.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
            }
            //retornamos el objeto
            return lista_grupos;
        }
    public void editar_producto(String Nombre,String Marca,String Descripcion,String Codigo,int id,Float precio){
         String consulta="UPDATE productos SET Nombre=?,Marca=?,Descripcion=?,Codigo_catalago=?,Precio=? WHERE ID_producto=? ";
         try{
             Connection accesoDB=conx.getConextion();
             PreparedStatement pst=accesoDB.prepareStatement(consulta);
             pst.setString(1,Nombre);
             pst.setString(2,Marca);
             pst.setString(3,Descripcion);
             pst.setString(4, Codigo);
             pst.setFloat(5,precio);
             pst.setInt(6, id);
             
             
             int numafectada=pst.executeUpdate();//ejecutams la consulta
              
            if(numafectada!=0){
                    JOptionPane.showMessageDialog(null, "Producto Actualizado");
            }else{
                    JOptionPane.showMessageDialog(null, "No se puedo completar");
            }
            pst.close();
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
         }
     }
    //buscar prodcuto por codigo del catalago
    public ArrayList<Mod_productos>listar_productos_cod_catalago(String codigo){
            ArrayList lista_grupos=new ArrayList();
            Mod_productos mdp;
            try{
                Connection accesoDB=conx.getConextion();//nos conectamos al servidor
                String consulta="SELECT * FROM productos WHERE Codigo_catalago=? ORDER BY Nombre ASC";
                PreparedStatement ps=accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
                ps.setString(1, codigo);
                //ejecutamos la consulta
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                 mdp=new Mod_productos();
                 mdp.setID_producto(rs.getInt(1));
                 mdp.setNombre(rs.getString(2));
                 mdp.setMarca(rs.getString(3));
                 mdp.setDescripcion(rs.getString(4));
                 mdp.setCantidad(rs.getInt(5));
                 mdp.setCodigo_catalago(rs.getString(6));
                 mdp.setPrecio(rs.getFloat(7));
                 lista_grupos.add(mdp);
                }
                ps.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
            }
            //retornamos el objeto
            return lista_grupos;
        }

}
