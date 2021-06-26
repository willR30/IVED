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
public class Facturas_DAO_consultas {
    Conexion conx;
    public Facturas_DAO_consultas(){
        conx=new Conexion();
    }
    public ArrayList<Mod_factura> listar_todas_facturas(){
        ArrayList lista_facturas=new ArrayList();
        Mod_factura mfp;
        try{
            Connection accesoDB=conx.getConextion();//nnos conectamos al servidor
            String consulta="SELECT * FROM facturas";
            PreparedStatement pst=accesoDB.prepareCall(consulta);
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta
            
            while(rs.next()){
               mfp=new Mod_factura();
               mfp.setCodigo_factura(rs.getString(1));
               mfp.setFecha(rs.getString(2));
               mfp.setCliente(rs.getString(3));
               mfp.setSub_total(rs.getFloat(4));
               mfp.setIva(rs.getFloat(5));
               mfp.setTotal(rs.getFloat(6));
               mfp.setEstado_factura(rs.getString(7));
               
               lista_facturas.add(mfp);//agregamos la linea al objeto que contiene los registros
            }
            pst.close();//cerramos la conexion
        }catch(Exception ex){
            System.out.println(ex);
        }
        return lista_facturas;
    }
    //agregar una fatura
    public void registrar_factura(String Codigo_factura,String Fecha,String Cliente,float Sub_total,float Iva,float Total,String Estado_factura){
        try{
            Connection accesoDB=conx.getConextion();
            String consulta="INSERT INTO facturas(Codigo_factura,Fecha,Cliente,Sub_total,IVA,Total,Estado_factura) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst=accesoDB.prepareStatement(consulta);
            //pasamos los parametros de la consulta
            pst.setString(1, Codigo_factura);
            pst.setString(2, Fecha);
            pst.setString(3, Cliente);
            pst.setFloat(4,Sub_total);
            pst.setFloat(5, Iva);
            pst.setFloat(6, Total);
            pst.setString(7,Estado_factura);
            
            int numafectada = pst.executeUpdate();

            if (numafectada < 0) {
                JOptionPane.showMessageDialog(null, "Error al Agregar");

            } else {
                JOptionPane.showMessageDialog(null, "Factura Agregada");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, Fecha,"¡Error! "+ex,JOptionPane.ERROR_MESSAGE, null);
        }
        
    }
    
}
