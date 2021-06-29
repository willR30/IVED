/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_factura;
import Controlador.Ctr_ventas;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Panel_ventas extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ventas
     */
    public Panel_ventas() {
        initComponents();
        perzonalizar_Jtables();//con este metodo personalizamos las jtables que se muestran en el panel

        //mostramos las ventas en el jtable
        Ctr_ventas ctr = new Ctr_ventas();
        ctr.llenar_tablas_ventas(Jtable_ventas);

        //llenamos las facturas en el jtable
        Ctr_factura ctf = new Ctr_factura();
        ctf.listar_todas_facturas(Jtable_facturas);
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
        Tab_general = new javax.swing.JTabbedPane();
        Panel_facturas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_facturas = new javax.swing.JTable();
        btn_nueva_venta_FACTURAS = new rsbuttom.RSButtonMetro();
        Panel_Ventas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Jtable_ventas = new javax.swing.JTable();
        btn_nueva_venta_VENTAS = new rsbuttom.RSButtonMetro();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Tab_general.setToolTipText("");
        Tab_general.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab_general.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        Panel_facturas.setForeground(new java.awt.Color(255, 255, 255));

        Jtable_facturas.setBackground(new java.awt.Color(255, 255, 255));
        Jtable_facturas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Jtable_facturas.setForeground(new java.awt.Color(0, 0, 0));
        Jtable_facturas.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtable_facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jtable_facturas.setFocusCycleRoot(true);
        Jtable_facturas.setGridColor(new java.awt.Color(255, 255, 255));
        Jtable_facturas.setRowHeight(22);
        Jtable_facturas.setSelectionBackground(new java.awt.Color(51, 102, 255));
        Jtable_facturas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Jtable_facturas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Jtable_facturas.setShowVerticalLines(false);
        Jtable_facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_facturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtable_facturas);

        btn_nueva_venta_FACTURAS.setBackground(new java.awt.Color(51, 102, 255));
        btn_nueva_venta_FACTURAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btn_nueva_venta_FACTURAS.setText("   Nueva Venta");
        btn_nueva_venta_FACTURAS.setColorHover(new java.awt.Color(36, 36, 36));
        btn_nueva_venta_FACTURAS.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_nueva_venta_FACTURAS.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_nueva_venta_FACTURAS.setFocusPainted(false);
        btn_nueva_venta_FACTURAS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_nueva_venta_FACTURAS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_nueva_venta_FACTURAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_venta_FACTURASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_facturasLayout = new javax.swing.GroupLayout(Panel_facturas);
        Panel_facturas.setLayout(Panel_facturasLayout);
        Panel_facturasLayout.setHorizontalGroup(
            Panel_facturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_facturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_facturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_facturasLayout.createSequentialGroup()
                        .addComponent(btn_nueva_venta_FACTURAS, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1872, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel_facturasLayout.setVerticalGroup(
            Panel_facturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_facturasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nueva_venta_FACTURAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tab_general.addTab("Facturas", Panel_facturas);

        Jtable_ventas.setBackground(new java.awt.Color(255, 255, 255));
        Jtable_ventas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Jtable_ventas.setForeground(new java.awt.Color(0, 0, 0));
        Jtable_ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtable_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jtable_ventas.setFocusCycleRoot(true);
        Jtable_ventas.setGridColor(new java.awt.Color(255, 255, 255));
        Jtable_ventas.setRowHeight(22);
        Jtable_ventas.setSelectionBackground(new java.awt.Color(51, 102, 255));
        Jtable_ventas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Jtable_ventas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Jtable_ventas.setShowVerticalLines(false);
        Jtable_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_ventasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Jtable_ventas);

        btn_nueva_venta_VENTAS.setBackground(new java.awt.Color(51, 102, 255));
        btn_nueva_venta_VENTAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btn_nueva_venta_VENTAS.setText("   Nueva Venta");
        btn_nueva_venta_VENTAS.setColorHover(new java.awt.Color(36, 36, 36));
        btn_nueva_venta_VENTAS.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_nueva_venta_VENTAS.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_nueva_venta_VENTAS.setFocusPainted(false);
        btn_nueva_venta_VENTAS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_nueva_venta_VENTAS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_nueva_venta_VENTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_venta_VENTASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_VentasLayout = new javax.swing.GroupLayout(Panel_Ventas);
        Panel_Ventas.setLayout(Panel_VentasLayout);
        Panel_VentasLayout.setHorizontalGroup(
            Panel_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_VentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_VentasLayout.createSequentialGroup()
                        .addComponent(btn_nueva_venta_VENTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 815, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        Panel_VentasLayout.setVerticalGroup(
            Panel_VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_VentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nueva_venta_VENTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        Tab_general.addTab("Ventas", Panel_Ventas);

        Tab_general.setSelectedComponent(Panel_facturas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab_general)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tab_general))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nueva_venta_FACTURASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_venta_FACTURASActionPerformed
        // TODO add your handling code here:
        D_Nueva_Ventas d = new D_Nueva_Ventas(new javax.swing.JFrame(), true);
        d.setVisible(true);
        while (d.isShowing()) {
            //no hace nada
        }
        //actualizamos las ventas y las facturas
        new Ctr_ventas().llenar_tablas_ventas(Jtable_ventas);
        new Ctr_factura().listar_todas_facturas(Jtable_facturas);
    
    }//GEN-LAST:event_btn_nueva_venta_FACTURASActionPerformed

    private void Jtable_facturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_facturasMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int select =this.Jtable_facturas.rowAtPoint(evt.getPoint());
            String codigo_factura=this.Jtable_facturas.getValueAt(select,0).toString();
            String Fecha=this.Jtable_facturas.getValueAt(select,1).toString();
            String Cliente=this.Jtable_facturas.getValueAt(select,2).toString();
            float Sub_total=Float.parseFloat(this.Jtable_facturas.getValueAt(select,3).toString());
            float IVA=Float.parseFloat(this.Jtable_facturas.getValueAt(select,4).toString());
            float Total=Float.parseFloat(this.Jtable_facturas.getValueAt(select,5).toString());
            String Estado=this.Jtable_facturas.getValueAt(select,6).toString();
           
            D_detalle_factura dv=new D_detalle_factura(new javax.swing.JFrame(),true,Cliente,Fecha,codigo_factura,Sub_total,IVA,Total,Estado);
            dv.setVisible(true);
            while(dv.isShowing()){
                //no hace nada , solo espera que el frame se cierre
            }
            //actualizamos las ventas y las facturas
            new Ctr_ventas().llenar_tablas_ventas(Jtable_ventas);
            new Ctr_factura().listar_todas_facturas(Jtable_facturas);
        }
    }//GEN-LAST:event_Jtable_facturasMouseClicked

    private void Jtable_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_ventasMouseClicked
        // TODO add your handling code here:
        //al hacer doble click se mostrara el detalle de la venta

        
    }//GEN-LAST:event_Jtable_ventasMouseClicked

    private void btn_nueva_venta_VENTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_venta_VENTASActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        D_Nueva_Ventas d=new D_Nueva_Ventas(new javax.swing.JFrame(),true);
        d.setVisible(true);
        while(d.isShowing()){
            //no hace nada
        }
    }//GEN-LAST:event_btn_nueva_venta_VENTASActionPerformed
    private void perzonalizar_Jtables(){
        this.Jtable_facturas.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        // cambia el fondo del encabezado de la tabla
        this.Jtable_facturas.getTableHeader().setBackground(new Color(36,36,36));
        this.Jtable_facturas.getTableHeader().setForeground(Color.WHITE);
        
        this.Jtable_ventas.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        // cambia el fondo del encabezado de la tabla
        this.Jtable_ventas.getTableHeader().setBackground(new Color(36,36,36));
        this.Jtable_ventas.getTableHeader().setForeground(Color.WHITE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_facturas;
    private javax.swing.JTable Jtable_ventas;
    private javax.swing.JPanel Panel_Ventas;
    private javax.swing.JPanel Panel_facturas;
    private javax.swing.JTabbedPane Tab_general;
    private rsbuttom.RSButtonMetro btn_nueva_venta_FACTURAS;
    private rsbuttom.RSButtonMetro btn_nueva_venta_VENTAS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
