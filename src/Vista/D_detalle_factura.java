/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_productos;
import Modelo.Conexion;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
public class D_detalle_factura extends javax.swing.JDialog {

    /**
     * Creates new form D_detalle_venta
     */
    //establecemos los parametros on los que vasmo a trabajar
     private String cliente,fecha,codigo_factura;
     private float sub_total,iva,total;
     private String Estado;
    public D_detalle_factura(java.awt.Frame parent, boolean modal,String cliente,String fecha,String codigo_factura,float sub_total,float iva,float total,String Estado) {
        super(parent, modal);
        initComponents();
        //establecemos las propiedades iniciales
        this.setLocationRelativeTo(null);
        this.setTitle("IVED-Detalle de Factura");
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
        //hacemos locales los parametros que recibimos del frame anterios
        this.cliente=cliente;
        this.fecha=fecha;
        this.codigo_factura=codigo_factura;
        this.sub_total=sub_total;
        this.iva=iva;
        this.total=total;
        this.Estado=Estado;
        //rellenamos las propiedades iniciales
        this.lbl_fecha.setText(this.fecha);
        this.txt_cliente.setText(this.cliente);
        this.lbl_cod_factura.setText(this.codigo_factura);
        this.lbl_sub_total.setText(String.valueOf(this.sub_total));
        this.lbl_iva.setText(String.valueOf(this.iva));
        this.lbl_total.setText(String.valueOf(this.total));
        
        //llenamos el detalle de los productos facturados
        Ctr_productos ctr=new Ctr_productos();
        ctr.productos_de_una_factra(this.codigo_factura,this.Table_productos_ventas);
        
        
    }

    private D_detalle_factura(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_anular_factura = new rsbuttom.RSButtonMetro();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_productos_ventas = new javax.swing.JTable();
        lbl_cod_factura = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_iva = new javax.swing.JLabel();
        lbl_sub_total = new javax.swing.JLabel();
        btn_anular_factura1 = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalle de Factura");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha:");

        lbl_fecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setText("0001");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo de Factutra:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente:");

        txt_cliente.setEditable(false);
        txt_cliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_cliente.setText("jTextField1");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sub Total:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IVA:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total :");

        btn_anular_factura.setBackground(new java.awt.Color(51, 102, 255));
        btn_anular_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga-directa.png"))); // NOI18N
        btn_anular_factura.setText("Anular");
        btn_anular_factura.setColorHover(new java.awt.Color(0, 0, 0));
        btn_anular_factura.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_anular_factura.setFocusable(false);
        btn_anular_factura.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_anular_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anular_facturaActionPerformed(evt);
            }
        });

        Table_productos_ventas.setBackground(new java.awt.Color(255, 255, 255));
        Table_productos_ventas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Table_productos_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio", "Sub Total"
            }
        ));
        Table_productos_ventas.setCellSelectionEnabled(true);
        Table_productos_ventas.setEnabled(false);
        Table_productos_ventas.setFocusable(false);
        Table_productos_ventas.setRowHeight(20);
        Table_productos_ventas.setSelectionBackground(new java.awt.Color(51, 102, 255));
        Table_productos_ventas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Table_productos_ventas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Table_productos_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_productos_ventasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table_productos_ventas);
        Table_productos_ventas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (Table_productos_ventas.getColumnModel().getColumnCount() > 0) {
            Table_productos_ventas.getColumnModel().getColumn(0).setPreferredWidth(100);
            Table_productos_ventas.getColumnModel().getColumn(1).setPreferredWidth(350);
            Table_productos_ventas.getColumnModel().getColumn(2).setPreferredWidth(100);
            Table_productos_ventas.getColumnModel().getColumn(3).setResizable(false);
            Table_productos_ventas.getColumnModel().getColumn(3).setPreferredWidth(100);
            Table_productos_ventas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        lbl_cod_factura.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_cod_factura.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cod_factura.setText("Codigo de Factutra:");

        lbl_total.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total.setText("Total :");

        lbl_iva.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_iva.setForeground(new java.awt.Color(255, 255, 255));
        lbl_iva.setText("Total :");

        lbl_sub_total.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl_sub_total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sub_total.setText("Total :");

        btn_anular_factura1.setBackground(new java.awt.Color(79, 184, 80));
        btn_anular_factura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresion.png"))); // NOI18N
        btn_anular_factura1.setText("Imprimir");
        btn_anular_factura1.setColorHover(new java.awt.Color(0, 0, 0));
        btn_anular_factura1.setColorNormal(new java.awt.Color(79, 184, 80));
        btn_anular_factura1.setFocusable(false);
        btn_anular_factura1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_anular_factura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anular_factura1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(lbl_cod_factura))
                            .addComponent(jLabel5)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(lbl_sub_total)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_iva)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_anular_factura1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_anular_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lbl_fecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_cod_factura))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbl_sub_total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_iva)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbl_total)
                            .addComponent(btn_anular_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_anular_factura1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anular_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anular_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_anular_facturaActionPerformed

    private void Table_productos_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_productos_ventasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_productos_ventasMouseClicked

    private void btn_anular_factura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anular_factura1ActionPerformed
        // TODO add your handling code here:
        GenerarReporte(this.lbl_cod_factura.getText().trim());
    }//GEN-LAST:event_btn_anular_factura1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void GenerarReporte(String Cod){
        try {
            // TODO add your handling code here:
            Conexion con =new Conexion();
            Connection conn=con.getConextion();//nos conectamos al servidor
            
            JasperReport reporte=null;
            String path="src\\Reportes\\R_Detalle_de_factura.jasper";
            //realizamos un mapeo de los parametros que le vamos a pasar al reporte
            Map parametro=new HashMap();
            parametro.put("factura",Cod);
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            //llenamos el reporte
            JasperPrint jprint=JasperFillManager.fillReport(reporte,parametro,conn);
            //creamos la vista del reporte
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
            view.setTitle("IVED-Detalle de Factura");
            this.dispose();
            view.setVisible(true);//hacemos visible el reporte
        } catch (JRException ex) {
            Logger.getLogger(Panel_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(D_detalle_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_detalle_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_detalle_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_detalle_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_detalle_factura dialog = new D_detalle_factura(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable Table_productos_ventas;
    private rsbuttom.RSButtonMetro btn_anular_factura;
    private rsbuttom.RSButtonMetro btn_anular_factura1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_cod_factura;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_iva;
    private javax.swing.JLabel lbl_sub_total;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTextField txt_cliente;
    // End of variables declaration//GEN-END:variables
}