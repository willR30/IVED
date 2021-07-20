/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_productos;
import Modelo.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author DELL
 */
public class D_seleccionar_producto_reporte extends javax.swing.JDialog {

    /**
     * Creates new form R_seleccionar_producto_reporte
     */
    public D_seleccionar_producto_reporte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setPropiedadesIniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_productos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Jtable_productos.setBackground(new java.awt.Color(255, 255, 255));
        Jtable_productos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Jtable_productos.setForeground(new java.awt.Color(0, 0, 0));
        Jtable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Jtable_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jtable_productos.setFocusCycleRoot(true);
        Jtable_productos.setGridColor(new java.awt.Color(255, 255, 255));
        Jtable_productos.setRowHeight(22);
        Jtable_productos.setSelectionBackground(new java.awt.Color(51, 102, 255));
        Jtable_productos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Jtable_productos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Jtable_productos.setShowVerticalLines(false);
        Jtable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_productosMouseClicked(evt);
            }
        });
        Jtable_productos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Jtable_productosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Jtable_productos);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Doble click para seleccionar un producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(390, 390, 390))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_productosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int select = this.Jtable_productos.rowAtPoint(evt.getPoint());
            String Cod=this.Jtable_productos.getValueAt(select,0).toString();
            GenerarReporte(Cod);
        }
    }//GEN-LAST:event_Jtable_productosMouseClicked

    private void Jtable_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtable_productosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtable_productosKeyPressed

    /**
     * @param args the command line arguments
     */
    private void GenerarReporte(String Cod){
        try {
            // TODO add your handling code here:
            Conexion con =new Conexion();
            Connection conn=con.getConextion();//nos conectamos al servidor
            
            JasperReport reporte=null;
            String path="src\\Reportes\\R_detalle_producto.jasper";
            //realizamos un mapeo de los parametros que le vamos a pasar al reporte
            Map parametro=new HashMap();
            parametro.put("codigo",Cod);
            
            reporte=(JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/R_detalle_producto.jasper"));
            //llenamos el reporte
            JasperPrint jprint=JasperFillManager.fillReport(reporte,parametro,conn);
            //creamos la vista del reporte
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
            view.setTitle("IVED-Detalle de Producto");
            this.dispose();
            view.setVisible(true);//hacemos visible el reporte
        } catch (JRException ex) {
            Logger.getLogger(Panel_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void setPropiedadesIniciales() {
        this.setTitle("IVED-Selecciona un producto para ver sus detalles");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
        this.Jtable_productos.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        // cambia el fondo del encabezado de la tabla
        this.Jtable_productos.getTableHeader().setBackground(new Color(36, 36, 36));
        this.Jtable_productos.getTableHeader().setForeground(Color.WHITE);
        //llenamos el jtable con los productos
        Ctr_productos ctr = new Ctr_productos();
        ctr.llenar_tabla_grupos(Jtable_productos);
        
        
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_seleccionar_producto_reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_seleccionar_producto_reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_seleccionar_producto_reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_seleccionar_producto_reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_seleccionar_producto_reporte dialog = new D_seleccionar_producto_reporte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
