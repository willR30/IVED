/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mod_productos;
import Modelo.productos_DAO_consultas;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Ctr_productos {
    productos_DAO_consultas productos_DAO=new productos_DAO_consultas();
    public Ctr_productos(){
        //creamos el contructor
    }
    public void llenar_tabla_grupos(JTable tabla_productos){
         DefaultTableModel mod_grup =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
        tabla_productos.setModel(mod_grup);
        //creamos la columnas
        mod_grup.addColumn("ID_producto");
        mod_grup.addColumn("Nombre del producto");
        mod_grup.addColumn("Marca del producto");
        mod_grup.addColumn("Descripcion del producto");
        mod_grup.addColumn("Cantidad disponible");
        mod_grup.addColumn("Código de Catálago");
        mod_grup.addColumn("Precio en Cordobas");
        
        Object[]columna  = new Object[7];
        
        int cantRegistros=productos_DAO.listar_productos().size();
        
        ArrayList<Mod_productos> lista_prod=productos_DAO.listar_productos();
        //llenamos la tabla
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_prod.get(i).getID_producto();
            columna[1]=lista_prod.get(i).getNombre();
            columna[2]=lista_prod.get(i).getMarca();
            columna[3]=lista_prod.get(i).getDescripcion();
            columna[4]=lista_prod.get(i).getCantidad();
            columna[5]=lista_prod.get(i).getCodigo_catalago();
            columna[6]=lista_prod.get(i).getPrecio();
            
            
            mod_grup.addRow(columna);//agregamos la fila
        }
    }
    //------------------------------------------------------------------------------
    //agregar producto
    public void agregar_producto(String Nombre,String Marca,String Descripcion,int Cantidad,String Codigo,float precio){
        productos_DAO.agregar_producto(Nombre, Marca, Descripcion, Cantidad,Codigo,precio);
    }
    public void buscar_por_codigo(String Codigo,JTextField txt_ID,JTextField txt_nombre,JTextField txt_marca,JTextField txt_descripcion,JTextField txt_cantidad){
        txt_ID.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getID_producto()));
        txt_nombre.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getNombre());
        txt_marca.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getMarca());
        txt_descripcion.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getDescripcion());
        txt_cantidad.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getCantidad()));
    }
    public void actualizar_cantidad(int nueva_cantidad,int id){
        productos_DAO.editar_catidad(nueva_cantidad, id);
    }
    public void buscar_por_ID(int ID,JTextField txt_codigo,JTextField txt_nombre,JComboBox cbx_marca,JTextField txt_descripcion,JTextField txt_cantidad,JTextField txt_precio){
        
        txt_nombre.setText(productos_DAO.buscar_por_ID(ID).get(0).getNombre());
        cbx_marca.setSelectedItem(productos_DAO.buscar_por_ID(ID).get(0).getMarca());
        txt_descripcion.setText(productos_DAO.buscar_por_ID(ID).get(0).getDescripcion());
        txt_cantidad.setText(String.valueOf(productos_DAO.buscar_por_ID(ID).get(0).getCantidad()));
        txt_codigo.setText(String.valueOf(productos_DAO.buscar_por_ID(ID).get(0).getCodigo_catalago()));
        txt_precio.setText(String.valueOf(productos_DAO.buscar_por_ID(ID).get(0).getPrecio()));
    }
    public void actualizar_producto(String Nombre,String Marca,String Descripcion,String Codigo,int id,float precio){
        productos_DAO.editar_producto(Nombre, Marca, Descripcion, Codigo, id,precio);
        
    }
    //buscar producto por codigo de catalago
    public void listar_por_codigo_catalgo(JTable tabla_productos,String codigo){
         DefaultTableModel mod_grup =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
        tabla_productos.setModel(mod_grup);
        //creamos la columnas
        mod_grup.addColumn("ID_producto");
        mod_grup.addColumn("Nombre del producto");
        mod_grup.addColumn("Marca del producto");
        mod_grup.addColumn("Descripcion del producto");
        mod_grup.addColumn("Cantidad disponible");
        mod_grup.addColumn("Código de Catálago");
        mod_grup.addColumn("Precio en Cordobas");
        
        Object[]columna  = new Object[7];
        
        int cantRegistros=productos_DAO.buscar_por_codigo(codigo).size();
        
        ArrayList<Mod_productos> lista_prod=productos_DAO.listar_productos_cod_catalago(codigo);
        //llenamos la tabla
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_prod.get(i).getID_producto();
            columna[1]=lista_prod.get(i).getNombre();
            columna[2]=lista_prod.get(i).getMarca();
            columna[3]=lista_prod.get(i).getDescripcion();
            columna[4]=lista_prod.get(i).getCantidad();
            columna[5]=lista_prod.get(i).getCodigo_catalago();
            columna[6]=lista_prod.get(i).getPrecio();
            
            
            mod_grup.addRow(columna);//agregamos la fila
        }
    }
}
