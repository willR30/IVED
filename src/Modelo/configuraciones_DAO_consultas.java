/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void DescargarDatos(String ruta){//solamente resivimos la ruta donde se va a guardar el respaldo
        //nos conectamos con la clase conexion para obtener el usuario y la contraseña
        Conexion conexion=new Conexion();
        String usuario=conexion.getUser(),password=conexion.getContra(),rutabackup=ruta,bd="ived";
        try {
            //omitimos el parametro para la contraseña puesto que el servidor no tendrá contraseña 
            //si no lo omitimos se quedará esperando una contraseña que nunca llegara y por lo tanto el servidor se quedara pegado
            //la cadena de t texto debera pasarce tal cual esta indicada abajo
            String command = "C:\\wamp\\bin\\mysql\\mysql5.5.24\\bin\\mysqldump --opt -u "+usuario+" "+bd+" -r"+rutabackup;
            Runtime rt = Runtime.getRuntime();
            rt.exec(command);
            JOptionPane.showMessageDialog(null,"Backup creado exitosamente!");
        } catch (IOException ex) {
            ex.printStackTrace();
            }
    }
    public void Restaurar_Backup(String ruta) {
       //boton de restaurar los datos
        Conexion conexion=new Conexion();
        String usuario=conexion.getUser(),contraseña=conexion.getContra();
        try{
            String comando="C:\\wamp\\bin\\mysql\\mysql5.5.24\\bin\\mysql -u "+usuario+" ived";
            Process p=Runtime.getRuntime().exec(comando);
            OutputStream os=p.getOutputStream();
            FileInputStream fis=new FileInputStream(ruta);
            
            byte[] buffer =new byte[1000];
            
            int leido=fis.read(buffer);
            
            while(leido>0){
                os.write(buffer,0,leido);
                leido=fis.read(buffer);
            }
            //cerramos todas las conexiones que teniamos
            os.flush();
            os.close();
            fis.close();
            JOptionPane.showMessageDialog(null,"Los datos fueron cargados exitosamente! :-)");
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void ActivarProducto(){
        Connection accesoDB=conx.getConextion();
        String consulta="UPDATE configuraciones SET ProductoActivado=?";
        try {
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            //pasamos los parametros de la consulta
            pst.setInt(1,1);
            int numafectada=pst.executeUpdate();//ejecutams la consulta
              
            if(numafectada!=0){
                    JOptionPane.showMessageDialog(null, "Producto Activado");
            }else{
                    JOptionPane.showMessageDialog(null, "No se pudo Activar el producto");
            }
            pst.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(configuraciones_DAO_consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Mod_configuraciones>  EstadoProducto(){
        ArrayList estado_producto=new ArrayList();
        Mod_configuraciones mcon=null;
        try{
            Connection accesoDB=conx.getConextion();//nos conectamos al servidor
            String consulta="SELECT ProductoActivado FROM configuraciones ";
            PreparedStatement pst=accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta
            while(rs.next()){
                mcon=new Mod_configuraciones();
                mcon.setProductoActivado(rs.getInt(1));
                estado_producto.add(mcon);
            }
            pst.close();//cerramos la conexion
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
        return estado_producto;
    }
    
}
