/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_productos;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Panel_productos extends javax.swing.JPanel {

    /**
     * Creates new form Panel_home
     */
    public Panel_productos() {
        initComponents();
        this.Jtable_productos.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 18));
        // cambia el fondo del encabezado de la tabla
        this.Jtable_productos.getTableHeader().setBackground(new Color(36,36,36));
        this.Jtable_productos.getTableHeader().setForeground(Color.WHITE);
        Ctr_productos ctr=new Ctr_productos();
        ctr.llenar_tabla_grupos(Jtable_productos);
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
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_buscar = new rsbuttom.RSButtonMetro();
        btn_buscar2 = new rsbuttom.RSButtonMetro();
        jLabel4 = new javax.swing.JLabel();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));

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

        txt_codigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código:");

        btn_buscar.setBackground(new java.awt.Color(51, 102, 255));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscar.setColorHover(new java.awt.Color(0, 0, 0));
        btn_buscar.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_buscar.setFocusPainted(false);
        btn_buscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_buscar2.setBackground(new java.awt.Color(79, 184, 80));
        btn_buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btn_buscar2.setColorHover(new java.awt.Color(0, 0, 0));
        btn_buscar2.setColorNormal(new java.awt.Color(79, 184, 80));
        btn_buscar2.setFocusPainted(false);
        btn_buscar2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Haga doble click sobre un producto para editarlo");

        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        rSButtonMetro2.setText("  Nuevo Producto");
        rSButtonMetro2.setColorHover(new java.awt.Color(36, 36, 36));
        rSButtonMetro2.setColorNormal(new java.awt.Color(51, 102, 255));
        rSButtonMetro2.setColorPressed(new java.awt.Color(84, 88, 91));
        rSButtonMetro2.setFocusPainted(false);
        rSButtonMetro2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rSButtonMetro2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Jtable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_productosMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int select =this.Jtable_productos.rowAtPoint(evt.getPoint());

            String Codigo_identificador=this.Jtable_productos.getValueAt(select,0).toString();
            String Marca=this.Jtable_productos.getValueAt(select,2).toString();
            D_editar_producto d= new D_editar_producto(new javax.swing.JFrame(),true,Codigo_identificador,Marca);
            d.setVisible(true);

            while(d.isShowing()){

            }
            Ctr_productos ctr=new Ctr_productos();
            ctr.llenar_tabla_grupos(Jtable_productos);
        }
    }//GEN-LAST:event_Jtable_productosMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Ctr_productos ctr=new Ctr_productos();
        if(this.txt_codigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debes de ingresar el código de catálago de un producto","¡Error!",JOptionPane.ERROR_MESSAGE);
            ctr.llenar_tabla_grupos(Jtable_productos);
        }else{
            
           ctr.listar_por_codigo_Identifiacador(Jtable_productos,this.txt_codigo.getText().trim());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar2ActionPerformed
        // TODO add your handling code here:
        Ctr_productos ctr=new Ctr_productos();
        ctr.llenar_tabla_grupos(Jtable_productos);
    }//GEN-LAST:event_btn_buscar2ActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER) {
            Ctr_productos ctr=new Ctr_productos();
            if(this.txt_codigo.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null,"Debes de ingresar el código de catálago de un producto","¡Error!",JOptionPane.ERROR_MESSAGE);
                ctr.llenar_tabla_grupos(Jtable_productos);
            }else{

               ctr.listar_por_codigo_Identifiacador(Jtable_productos,this.txt_codigo.getText().trim());
            }
        }
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        // TODO add your handling code here:
        D_nuevo_producto d=new D_nuevo_producto(new javax.swing.JFrame(),true);
        d.setVisible(true);
        while(d.isShowing()){
            //no hace nada
        }
        //actualizamos los productos registrados
        Ctr_productos ctr=new Ctr_productos();
        ctr.llenar_tabla_grupos(Jtable_productos);
        
    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

    private void Jtable_productosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtable_productosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtable_productosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_productos;
    private rsbuttom.RSButtonMetro btn_buscar;
    private rsbuttom.RSButtonMetro btn_buscar2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration//GEN-END:variables
}