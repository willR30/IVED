/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mod_marcas;
import Modelo.marcas_DAO_consultas;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Ctr_marcas {
    marcas_DAO_consultas marcas_DAO=new marcas_DAO_consultas();
    //creamos el constructor
    public Ctr_marcas(){
        
    }
    public void llenar_tabla_marcas(JTable tabla){
        //apturamos el modelo de la tabla
        DefaultTableModel mod_marca =new DefaultTableModel(){
             @Override
             public boolean isCellEditable(int rowIndex,int columnIndex){return false;}//bloqueamos las celdas
        };
       tabla.setModel(mod_marca);//le pasamos el modelo a la tabla de marca
       
       //creamos las columnas
       mod_marca.addColumn("ID");
       mod_marca.addColumn("Nombre de Marca");
       mod_marca.addColumn("Descripcion de Marca");
       
       Object[]columna  = new Object[3];
       int cantRegistros=marcas_DAO.listar_todas_las_marcas().size();
       ArrayList<Mod_marcas> lista_marca=marcas_DAO.listar_todas_las_marcas();
        for(int i=0;i<cantRegistros;i++){
            columna[0]=lista_marca.get(i).getID_marca();
            columna[1]=lista_marca.get(i).getNombre();
            columna[2]=lista_marca.get(i).getDescripcion();
            
            
            mod_marca.addRow(columna);
        }
       
    }
    public void nueva_marca(String nombre,String descripcion){
        marcas_DAO.nueva_marca(nombre, descripcion);
    }
    public void editar_marca(String Nombre,String Descripcion,int ID_marca){
        marcas_DAO.editar_marca(Nombre, Descripcion, ID_marca);//nos conectamos con la capa modelo y le pasamos los parametros del metodo
    }
    public void Eliminar_marca(int ID_marca){
        marcas_DAO.elimiar_marca(ID_marca);
    }
    
}
