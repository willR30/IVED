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

    public productos_DAO_consultas() {
        conx = new Conexion();
    }

    public ArrayList<Mod_productos> listar_productos() {
        ArrayList lista_grupos = new ArrayList();
        Mod_productos mdp;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT p.Codigo_Identificador,p.Nombre,mar.Nombre_marca,p.Descripcion,p.Cantidad,p.Precio FROM productos p INNER JOIN marcas mar ON mar.ID_marca=p.ID_marca";
            PreparedStatement ps = accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor

            //ejecutamos la consulta
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mdp = new Mod_productos();
                mdp.setCodigo_identificador(rs.getString(1));
                mdp.setNombre(rs.getString(2));
                mdp.setMarca(rs.getString(3));
                mdp.setDescripcion(rs.getString(4));
                mdp.setCantidad(rs.getInt(5));
                mdp.setPrecio(rs.getFloat(6));
                lista_grupos.add(mdp);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
        //retornamos el objeto
        return lista_grupos;
    }

    //----------------------------------------------------------------------------------------------
    //agregar un  producto

    public void agregar_producto(String Codigo_identificador, String Nombre, int ID_marca, String Descripcion, int Cantidad, float Precio) {

        String consulta = "INSERT INTO productos(Codigo_identificador,Nombre,ID_marca,Descripcion,Cantidad,Precio)VALUES(?,?,?,?,?,?)";
        String consulta_validacion = "SELECT * FROM productos WHERE Codigo_Identificador=?";
        try {
            Connection accesoDB = conx.getConextion();
            PreparedStatement pst = accesoDB.prepareStatement(consulta_validacion);
            pst.setString(1, Codigo_identificador);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {//si se encentran registros entonces ya existe un producto registrado con ese codigo
                JOptionPane.showMessageDialog(null, "Ya existe un producto con ese código identificador");

            } else {

                pst = accesoDB.prepareStatement(consulta);
                pst.setString(1, Codigo_identificador);
                pst.setString(2, Nombre);
                pst.setInt(3, ID_marca);
                pst.setString(4, Descripcion);
                pst.setInt(5, Cantidad);
                pst.setFloat(6, Precio);

                int numafectada = pst.executeUpdate();

                if (numafectada < 0) {
                    JOptionPane.showMessageDialog(null, "Error al Agregar");

                } else {
                    JOptionPane.showMessageDialog(null, "Registro Agregado");
                }
            }

            pst.close();//cerramos la conexion
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public ArrayList<Mod_productos> buscar_por_codigo(String Codigo) {//con este metodo se busca el producto desde
        //actualizar stock y a la hora de realizar una venta
        ArrayList lista_grupos = new ArrayList();
        Mod_productos mdp;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT p.Codigo_Identificador,p.Nombre,mar.Nombre_marca,p.Descripcion,p.Cantidad,p.Precio FROM productos p INNER JOIN marcas mar ON mar.ID_marca=p.ID_marca WHERE p.Codigo_Identificador=?";
            PreparedStatement pst = accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
            pst.setString(1, Codigo);//pasamos el parametro
            //ejecutamos la consulta
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                mdp = new Mod_productos();
                mdp.setCodigo_identificador(rs.getString(1));
                mdp.setNombre(rs.getString(2));
                mdp.setMarca(rs.getString(3));
                mdp.setDescripcion(rs.getString(4));
                mdp.setCantidad(rs.getInt(5));
                mdp.setPrecio(rs.getFloat(6));

                lista_grupos.add(mdp);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un registro con ese codigo", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
        //retornamos el objeto
        return lista_grupos;
    }

    //-------------------------------------------------------------------------------------------------------------

    public void editar_catidad_unidades(int nueva_cantidad, String Codigo_identificador) {
        String consulta = "UPDATE productos SET Cantidad=? WHERE Codigo_Identificador=? ";
        try {
            Connection accesoDB = conx.getConextion();
            PreparedStatement pst = accesoDB.prepareStatement(consulta);
            pst.setInt(1, nueva_cantidad);
            pst.setString(2, Codigo_identificador);

            int numafectada = pst.executeUpdate();//ejecutams la consulta

            if (numafectada != 0) {
                //JOptionPane.showMessageDialog(null, "Unidades Actualizadas");
            } else {
                JOptionPane.showMessageDialog(null, "No se puedo completar");
            }
            pst.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public ArrayList<Mod_productos> buscar_por_ID(String Codigo_identificador) {
        ArrayList lista_grupos = new ArrayList();
        Mod_productos mdp;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT p.Codigo_Identificador,p.Nombre,mar.Nombre_marca,p.Descripcion,p.Cantidad,p.Precio FROM productos p INNER JOIN marcas mar ON mar.ID_marca=p.ID_marca WHERE p.Codigo_Identificador=?";
            PreparedStatement pst = accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
            pst.setString(1, Codigo_identificador);//pasamos el parametro
            //ejecutamos la consulta
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                mdp = new Mod_productos();
                mdp.setCodigo_identificador(rs.getString(1));
                mdp.setNombre(rs.getString(2));
                mdp.setMarca(rs.getString(3));
                mdp.setDescripcion(rs.getString(4));
                mdp.setCantidad(rs.getInt(5));
                mdp.setPrecio(rs.getFloat(6));

                lista_grupos.add(mdp);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un registro con ese codigo", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }
            pst.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
        //retornamos el objeto
        return lista_grupos;
    }

    public void editar_producto(String CodigoIdentificador, String Nombre, int ID_Marca, String Descripcion, String Codigo, Float precio) {
        String consulta = "UPDATE productos SET Nombre=?,ID_marca=?,Descripcion=?,Precio=? WHERE Codigo_Identificador=? ";
        try {
            Connection accesoDB = conx.getConextion();
            PreparedStatement pst = accesoDB.prepareStatement(consulta);
            pst.setString(1, Nombre);
            pst.setInt(2, ID_Marca);
            pst.setString(3, Descripcion);
            pst.setFloat(4, precio);
            pst.setString(5, CodigoIdentificador);

            int numafectada = pst.executeUpdate();//ejecutams la consulta

            if (numafectada != 0) {
                JOptionPane.showMessageDialog(null, "Producto Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se puedo completar");
            }
            pst.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //buscar prodcuto por codigo del catalago*/

    public ArrayList<Mod_productos> listar_productos_cod_Identificador(String codigo) {
        ArrayList lista_grupos = new ArrayList();
        Mod_productos mdp;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT p.Codigo_Identificador,p.Nombre,mar.Nombre_marca,p.Descripcion,p.Cantidad,p.Precio FROM productos p INNER JOIN marcas mar ON mar.ID_marca=p.ID_marca WHERE p.Codigo_Identificador=? ORDER BY Nombre ASC";
            PreparedStatement ps = accesoDB.prepareStatement(consulta);//pasamos la consulta al servidor
            ps.setString(1, codigo);
            //ejecutamos la consulta
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mdp = new Mod_productos();
                mdp.setCodigo_identificador(rs.getString(1));
                mdp.setNombre(rs.getString(2));
                mdp.setMarca(rs.getString(3));
                mdp.setDescripcion(rs.getString(4));
                mdp.setCantidad(rs.getInt(5));
                mdp.setPrecio(rs.getFloat(6));
                lista_grupos.add(mdp);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un registro con ese codigo", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
        //retornamos el objeto
        return lista_grupos;
    }

    //validamos si existe un producto oon el mismo código didentificador

    public ArrayList<Mod_productos> Validar_codigo_identificador(String codigo) {
        ArrayList lista_cod = new ArrayList();
        Mod_productos mdp;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT Codigo_Identificador FROM productos WHERE Codigo_Identificador=?";
            String consulta_validadcion = "SELECT Codigo_Identificador FROM productos WHERE Codigo_Identificador=?";
            PreparedStatement pst = accesoDB.prepareStatement(consulta);
            //pasamos el parametro a la consulta
            pst.setString(1, codigo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                mdp = new Mod_productos();
                mdp.setCodigo_identificador(rs.getString(1));
                lista_cod.add(mdp);
            }
            pst.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//hacemos visible la exception
        }
        return lista_cod;
    }

    //obtener el stock dispinible de un producto solo sabiendo su codigo de indentifiacion

    public ArrayList<Mod_productos> Obtener_stock_disponible(String codigo) {
        Mod_productos mdp_stock;
        ArrayList array_stock = new ArrayList();
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor
            String consulta = "SELECT Cantidad FROM productos WHERE Codigo_Identificador=?";
            PreparedStatement pst = accesoDB.prepareStatement(consulta);
            //pasamos los parametros a la consutla
            pst.setString(1, codigo);
            //ejecutamos la consulta
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                mdp_stock = new Mod_productos();
                //si el producto se encuentra rescatamos los valores
                mdp_stock.setCantidad(rs.getInt(1));
                array_stock.add(mdp_stock);
            }
            pst.close();//cerramos la conexion
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);//hacemos la exception visible
        }
        return array_stock;
    }

    //listamos los productos que se vendieron y pertenecen a una determinada factura-------------------------------------------------------------------------------------

    public ArrayList<Mod_ventas> Productos_de_una_factura(String codigo_factura) {
        ArrayList list_productos = new ArrayList();
        Mod_ventas mdp;
        try {
            Connection accesoDB = conx.getConextion();//nos conectamos al servidor 
            String consulta = "SELECT v.Codigo_Identificador,p.Nombre,v.Cantidad_vendida,v.Precio_unitario_vendido "
                    + "FROM ventas v INNER JOIN productos p on p.Codigo_Identificador=v.Codigo_Identificador "
                    + "WHERE v.Codigo_factura=?";
            PreparedStatement pst = accesoDB.prepareStatement(consulta);//pasamos la consulta
            //pasamos los parametros de la consulta
            pst.setString(1, codigo_factura);
            ResultSet rs=pst.executeQuery();//ejecutamos la consulta
            while(rs.next()){
                mdp=new Mod_ventas();
                mdp.setCodigo_identificador(rs.getString(1));
                mdp.setNombre(rs.getString(2));
                mdp.setCantidad_vendida(rs.getInt(3));
                mdp.setPrecio_unitario(rs.getFloat(4));
                
                list_productos.add(mdp);//agregamos los parametros al objeto
                
            }
            pst.close();//cerramos la conexion
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return list_productos;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------

}
