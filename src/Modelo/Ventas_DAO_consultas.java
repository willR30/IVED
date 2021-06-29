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
public class Ventas_DAO_consultas {

    Conexion conx;

    public Ventas_DAO_consultas() {
        conx = new Conexion();
    }

    public void Agregar_venta(String Codigo_identificador, int Cantidad_vendida, float precio_unitario, String Codigo_factura) {
        try {
            Connection accesoDB = conx.getConextion();
            String consulta = "INSERT INTO ventas (ID_venta,Codigo_Identificador,Cantidad_vendida,Precio_unitario_vendido,Codigo_factura) VALUES(?,?,?,?,?)";
            PreparedStatement pst = accesoDB.prepareStatement(consulta);
            //pasamos los parametros de la consultas
            pst.setString(1,"0");
            pst.setString(2, Codigo_identificador);
            pst.setInt(3, Cantidad_vendida);
            pst.setFloat(4, precio_unitario);
            pst.setString(5, Codigo_factura);
            int numafectada = pst.executeUpdate();

            if (numafectada < 0) {
                //JOptionPane.showMessageDialog(null, "Error al Agregar");

            } else {
                //JOptionPane.showMessageDialog(null, "Registro Agregado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "¡Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    //listamos las ventas realizadas
    public ArrayList<Mod_ventas> listar_todas_ventas() {
        ArrayList lista_ventas = new ArrayList();
        Mod_ventas mv;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT v.ID_venta,p.Codigo_Identificador,p.Nombre,v.Cantidad_vendida,v.Precio_unitario_vendido,v.Codigo_factura "
                            + "FROM ventas v INNER JOIN productos p on p.Codigo_Identificador=v.Codigo_Identificador ";
            PreparedStatement pst=accesoDB.prepareStatement(consulta);//pasamos la consulta
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta
            while(rs.next()){
                mv=new Mod_ventas();
                mv.setID_venta(rs.getInt(1));
                mv.setCodigo_identificador(rs.getString(2));
                mv.setNombre(rs.getString(3));
                mv.setCantidad_vendida(rs.getInt(4));
                mv.setPrecio_unitario(rs.getFloat(5));
                mv.setCodigo_factura(rs.getString(6));
                
                lista_ventas.add(mv);
            }
            pst.close();//cerramos la conexion al servidor
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lista_ventas;
    }
    

}
