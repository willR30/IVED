/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Facturas_DAO_consultas;
import Modelo.Mod_factura;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Ctr_factura {
    Facturas_DAO_consultas facturas_DAO=new Facturas_DAO_consultas();
    //creamos el constructor
    public Ctr_factura(){
        
    }
    public void listar_todas_facturas(JTable tabla_facturas){
        DefaultTableModel mod_factura =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
        tabla_facturas.setModel(mod_factura);
        //establecemos las columnas de la tabla que vamos a mostrar
        mod_factura.addColumn("Codigo");
        mod_factura.addColumn("Fecha");
        mod_factura.addColumn("Nombre Del Cliente Facturado");
        mod_factura.addColumn("Sub Total");
        mod_factura.addColumn("IVA");
        mod_factura.addColumn("Total");
        mod_factura.addColumn("Estado");
        
        Object[]columna  = new Object[7];
        int cantRegistros=facturas_DAO.listar_todas_facturas().size();
        ArrayList<Mod_factura> lista_facturas=facturas_DAO.listar_todas_facturas();
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_facturas.get(i).getCodigo_factura();
            columna[1]=lista_facturas.get(i).getFecha();
            columna[2]=lista_facturas.get(i).getCliente();
            columna[3]=lista_facturas.get(i).getSub_total();
            columna[4]=lista_facturas.get(i).getIva();
            columna[5]=lista_facturas.get(i).getTotal();
            columna[6]=lista_facturas.get(i).getEstado_factura();
            
            mod_factura.addRow(columna);
        }
    }
    public void Registrar_factura(String Codigo_factura,String Fecha,String Cliente,float Sub_total,float Iva,float Total,String Estado_factura){
        facturas_DAO.registrar_factura(Codigo_factura, Fecha, Cliente, Sub_total, Iva, Total, Estado_factura);
    }
    //listamos toda las facturas para la vista de seleccion de reporte
    public void listar_todas_facturas_para_reporte(JTable tabla_facturas){
        DefaultTableModel mod_factura =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
        tabla_facturas.setModel(mod_factura);
        //establecemos las columnas de la tabla que vamos a mostrar
        mod_factura.addColumn("Codigo");
        mod_factura.addColumn("Fecha");
        mod_factura.addColumn("Nombre Del Cliente Facturado");
        
        Object[]columna  = new Object[3];
        int cantRegistros=facturas_DAO.listar_todas_facturas().size();
        ArrayList<Mod_factura> lista_facturas=facturas_DAO.listar_todas_facturas();
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_facturas.get(i).getCodigo_factura();
            columna[1]=lista_facturas.get(i).getFecha();
            columna[2]=lista_facturas.get(i).getCliente();
            
            mod_factura.addRow(columna);
        }
    }
    
}
