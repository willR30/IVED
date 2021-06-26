/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mod_ventas;
import Modelo.Ventas_DAO_consultas;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Ctr_ventas {
    Ventas_DAO_consultas ventas_DAO=new Ventas_DAO_consultas();
    public Ctr_ventas(){
        //creamos el constructor del objeto controlador del objeto ventas
    }
    public void llenar_tablas_ventas(JTable tabla_ventas){
        DefaultTableModel mod_venta =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
        tabla_ventas.setModel(mod_venta);
        //establecemos las columnas de la tabla que vamos a mostrar
        mod_venta.addColumn("Codigo Venta");
        mod_venta.addColumn("Codigo Producto");
        mod_venta.addColumn("Nombre Producto");
        mod_venta.addColumn("Cantidad Vendida");
        mod_venta.addColumn("Precio Vendido");
        mod_venta.addColumn("Codigo de Factura");
        Object[]columna  = new Object[6];
        int cantRegistros=ventas_DAO.listar_todas_ventas().size();//rescatamos 
        
        ArrayList<Mod_ventas> lista_ventas=ventas_DAO.listar_todas_ventas();
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_ventas.get(i).getID_venta();
            columna[1]=lista_ventas.get(i).getCodigo_identificador();
            columna[2]=lista_ventas.get(i).getNombre();
            columna[3]=lista_ventas.get(i).getCantidad_vendida();
            columna[4]=lista_ventas.get(i).getPrecio_unitario();
            columna[5]=lista_ventas.get(i).getCodigo_factura();
            mod_venta.addRow(columna);
        }
    }
    //agregar una venta
    public void agregar_venta(String Codigo_identificador, int Cantidad_vendida, float precio_unitario, String Codigo_factura){
        ventas_DAO.Agregar_venta(Codigo_identificador, Cantidad_vendida, precio_unitario, Codigo_factura);
    }
    
}
