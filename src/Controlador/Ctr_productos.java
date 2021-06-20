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
import javax.swing.JTextArea;
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
        mod_grup.addColumn("Código del producto");
        mod_grup.addColumn("Nombre del producto");
        mod_grup.addColumn("Marca del producto");
        mod_grup.addColumn("Descripcion del producto");
        mod_grup.addColumn("Cantidad disponible");
        mod_grup.addColumn("Precio en Cordobas");
        
        Object[]columna  = new Object[6];
        
        int cantRegistros=productos_DAO.listar_productos().size();
        
        ArrayList<Mod_productos> lista_prod=productos_DAO.listar_productos();
        //llenamos la tabla
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_prod.get(i).getCodigo_identificador();
            columna[1]=lista_prod.get(i).getNombre();
            columna[2]=lista_prod.get(i).getMarca();
            columna[3]=lista_prod.get(i).getDescripcion();
            columna[4]=lista_prod.get(i).getCantidad();
            columna[5]=lista_prod.get(i).getPrecio();
            
            
            mod_grup.addRow(columna);//agregamos la fila
        }
    }
    //------------------------------------------------------------------------------
    //agregar producto
    public void agregar_producto(String Codigo_identificador,String Nombre,int ID_marca,String Descripcion,int Cantidad,float precio){
        productos_DAO.agregar_producto(Codigo_identificador, Nombre, ID_marca, Descripcion, Cantidad, precio);
    }
    //este metodo es para completar los campos de texto en un frame
    public void buscar_por_codigo(String Codigo,JTextField txt_ID,JTextField txt_nombre,JTextField txt_marca,JTextArea txt_descripcion,JTextField txt_cantidad){
        txt_ID.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getCodigo_identificador()));
        txt_nombre.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getNombre());
        txt_marca.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getMarca());
        txt_descripcion.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getDescripcion());
        txt_cantidad.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getCantidad()));
    }
    //este metodo se utiliza en la vista, entrada - saldia de inventario
    public void actualizar_cantidad_unidades(int nueva_cantidad,String codigo_identificador){
        productos_DAO.editar_catidad_unidades(nueva_cantidad, codigo_identificador);
    }
    public void buscar_por_ID(String ID,JTextField txt_codigo,JTextField txt_nombre,JComboBox cbx_marca,JTextArea txt_descripcion,JTextField txt_cantidad,JTextField txt_precio){
        //este metodo se utiliza para rellenar los campos del frame "edirar producto" y le pasamos como parametros los campos a  utilizar
        txt_nombre.setText(productos_DAO.buscar_por_ID(ID).get(0).getNombre());
        cbx_marca.setSelectedItem(productos_DAO.buscar_por_ID(ID).get(0).getMarca());
        txt_descripcion.setText(productos_DAO.buscar_por_ID(ID).get(0).getDescripcion());
        txt_cantidad.setText(String.valueOf(productos_DAO.buscar_por_ID(ID).get(0).getCantidad()));
        txt_codigo.setText(String.valueOf(productos_DAO.buscar_por_ID(ID).get(0).getCodigo_identificador()));
        txt_precio.setText(String.valueOf(productos_DAO.buscar_por_ID(ID).get(0).getPrecio()));
    }
    //actualizar producto dezde la vista propia de edición
    public void actualizar_producto(String CodigoIdentificador,String Nombre,int ID_Marca,String Descripcion,String Codigo,float precio){
        productos_DAO.editar_producto(CodigoIdentificador,Nombre, ID_Marca, Descripcion, Codigo,precio);
        
    }
    //buscar producto por codigo de catalago
    
    public void listar_por_codigo_Identifiacador(JTable tabla_productos,String codigo){//en el campo de texto del home ingresar el codigo indentifiador
         DefaultTableModel mod_grup =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
        tabla_productos.setModel(mod_grup);
        //creamos la columnas
        mod_grup.addColumn("Código del producto");
        mod_grup.addColumn("Nombre del producto");
        mod_grup.addColumn("Marca del producto");
        mod_grup.addColumn("Descripcion del producto");
        mod_grup.addColumn("Cantidad disponible");
        mod_grup.addColumn("Precio en Cordobas");
        
        Object[]columna  = new Object[6];
        
        int cantRegistros=productos_DAO.buscar_por_codigo(codigo).size();
        
        ArrayList<Mod_productos> lista_prod=productos_DAO.listar_productos_cod_Identificador(codigo);
        //llenamos la tabla
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_prod.get(i).getCodigo_identificador();
            columna[1]=lista_prod.get(i).getNombre();
            columna[2]=lista_prod.get(i).getMarca();
            columna[3]=lista_prod.get(i).getDescripcion();
            columna[4]=lista_prod.get(i).getCantidad();
            columna[5]=lista_prod.get(i).getPrecio();
            
            
            mod_grup.addRow(columna);//agregamos la fila
        }
    }
    public boolean validar_codigo_identificador_existente(String codigo){
        String cod=productos_DAO.Validar_codigo_identificador(codigo).get(0).getCodigo_identificador();
        if(cod==codigo){
            //el producto si existe
            return true;
        }else{
            //el producto no existe
            return false;
        }
    }
    public void buscar_por_codigo_con_precio(String Codigo,JTextField txt_ID,JTextField txt_nombre,JTextField txt_marca,JTextArea txt_descripcion,JTextField txt_cantidad,JTextField txt_precio){
        txt_ID.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getCodigo_identificador()));
        txt_nombre.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getNombre());
        txt_marca.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getMarca());
        txt_descripcion.setText(productos_DAO.buscar_por_codigo(Codigo).get(0).getDescripcion());
        txt_cantidad.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getCantidad()));
        txt_precio.setText(String.valueOf(productos_DAO.buscar_por_codigo(Codigo).get(0).getPrecio()));
    }
    
}
