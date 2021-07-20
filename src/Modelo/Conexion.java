/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
//esta clase guardara la conexion a la base de datos del servidor
public class Conexion {
    private final String base ="ived" ;//asegurate del que este nombre este bien escrito
    private String user="root";
    private String contra="";//GERTRUDIStortuga";
    private final String url="jdbc:mysql://localhost/"+base;//no es necesario especificar el puerto que se esta usando
    private Connection cnx=null;//esta variable guardara la conexion
    
    //creamos el metodo de la conexion que no recivira ningun dato 
    //----------------------------------------------------------------
     public Connection getConextion() 
     {
         //siempre hacemos un try para controlar los errores
         try{
             //mandamos a llamar al driver de conexion com.mysql.cj.jdbc.Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //pasamos la conexion a la variable cnx con el driver y la cadena construida a partir de las variables 
             //antes declaradas
             cnx =(Connection) DriverManager.getConnection(this.url,this.user,this.contra);
             
         }catch(ClassNotFoundException | SQLException ex){
             JOptionPane.showMessageDialog(null, ex);//mostramos el error
             JOptionPane.showMessageDialog(null,"No se pudo conectar al servidor");
             
             
         }
         return cnx;//retormanos la variable cnx 
        
     }
     //----------------------------------------------------

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
}
