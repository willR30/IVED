/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_configuraciones;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        //propiedades iniciales
        this.setExtendedState(MAXIMIZED_BOTH);//aqui ponemos por defecto maximizado este jframe
        this.setDefaultCloseOperation(0);//evitamos que se cierre el formulario al oprimirce la X
        this.setTitle("Sistema de Invetariado Digital IVED");
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
        this.btn_inventario.setColorNormal(new Color(51,102,255));
        Mostrarlogo();
        //cambiamos el color del boton
        
        new CambiaPanel(panel_central,new Panel_productos());//nos aeguramos de que la clase este bien escrita
        this.btn_inventario.setBackground(new Color(51,102,255));
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
        Panel_lateral = new javax.swing.JPanel();
        lbl_pic = new javax.swing.JLabel();
        btn_ventas = new rsbuttom.RSButtonMetro();
        btn_inventario = new rsbuttom.RSButtonMetro();
        btn_actualizar_stock = new rsbuttom.RSButtonMetro();
        btn_marcas = new rsbuttom.RSButtonMetro();
        btn_reportes = new rsbuttom.RSButtonMetro();
        btn_salir = new rsbuttom.RSButtonMetro();
        btn_configuraciones = new rsbuttom.RSButtonMetro();
        panel_superior = new javax.swing.JPanel();
        panel_central = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_lateral.setBackground(new java.awt.Color(36, 36, 36));

        btn_ventas.setBackground(new java.awt.Color(36, 36, 36));
        btn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        btn_ventas.setText("        Ventas");
        btn_ventas.setColorHover(new java.awt.Color(51, 102, 255));
        btn_ventas.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_ventas.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_ventas.setFocusPainted(false);
        btn_ventas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_ventas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ventas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasActionPerformed(evt);
            }
        });

        btn_inventario.setBackground(new java.awt.Color(36, 36, 36));
        btn_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/almacen.png"))); // NOI18N
        btn_inventario.setText("        Productos");
        btn_inventario.setColorHover(new java.awt.Color(51, 102, 255));
        btn_inventario.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_inventario.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_inventario.setFocusPainted(false);
        btn_inventario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_inventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_actualizar_stock.setBackground(new java.awt.Color(36, 36, 36));
        btn_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Stock.png"))); // NOI18N
        btn_actualizar_stock.setText("   Actualizar Stock");
        btn_actualizar_stock.setColorHover(new java.awt.Color(51, 102, 255));
        btn_actualizar_stock.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_actualizar_stock.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_actualizar_stock.setFocusPainted(false);
        btn_actualizar_stock.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_actualizar_stock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_stockActionPerformed(evt);
            }
        });

        btn_marcas.setBackground(new java.awt.Color(36, 36, 36));
        btn_marcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Marcas.png"))); // NOI18N
        btn_marcas.setText("        Marcas");
        btn_marcas.setColorHover(new java.awt.Color(51, 102, 255));
        btn_marcas.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_marcas.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_marcas.setFocusPainted(false);
        btn_marcas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_marcas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcasActionPerformed(evt);
            }
        });

        btn_reportes.setBackground(new java.awt.Color(36, 36, 36));
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
        btn_reportes.setText("       Reportes");
        btn_reportes.setColorHover(new java.awt.Color(51, 102, 255));
        btn_reportes.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_reportes.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_reportes.setFocusPainted(false);
        btn_reportes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_reportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(36, 36, 36));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        btn_salir.setText("   Salir      ");
        btn_salir.setColorHover(new java.awt.Color(255, 27, 45));
        btn_salir.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_salir.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_salir.setFocusPainted(false);
        btn_salir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_configuraciones.setBackground(new java.awt.Color(36, 36, 36));
        btn_configuraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        btn_configuraciones.setText("  Configuraciones");
        btn_configuraciones.setColorHover(new java.awt.Color(51, 102, 255));
        btn_configuraciones.setColorNormal(new java.awt.Color(36, 36, 36));
        btn_configuraciones.setColorPressed(new java.awt.Color(84, 88, 91));
        btn_configuraciones.setFocusPainted(false);
        btn_configuraciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_configuraciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_configuraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_lateralLayout = new javax.swing.GroupLayout(Panel_lateral);
        Panel_lateral.setLayout(Panel_lateralLayout);
        Panel_lateralLayout.setHorizontalGroup(
            Panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_configuraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_marcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_actualizar_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_lateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btn_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_lateralLayout.setVerticalGroup(
            Panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_lateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_actualizar_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_configuraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_superior.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout panel_superiorLayout = new javax.swing.GroupLayout(panel_superior);
        panel_superior.setLayout(panel_superiorLayout);
        panel_superiorLayout.setHorizontalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_superiorLayout.setVerticalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panel_central.setBackground(new java.awt.Color(84, 88, 91));
        panel_central.setLayout(new javax.swing.BoxLayout(panel_central, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_central, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_central, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasActionPerformed
        // TODO add your handling code here:
        //llamamos el frame ventas
        this.btn_ventas.setColorNormal(new Color(51,102,255));
        this.btn_inventario.setColorNormal(new Color(36,36,36));
        this.btn_configuraciones.setColorNormal(new Color(36,36,36));
        this.btn_reportes.setColorNormal(new Color(36,36,36));
        
        //validamos si el modulo de ventas esta disponible
        Ctr_configuraciones ctr=new Ctr_configuraciones();
        int estadoModuloVentas=ctr.EstadoModuloVentas();
        if(estadoModuloVentas==1){
            new CambiaPanel(panel_central,new Panel_ventas());//nos aeguramos de que la clase este bien escrita
        }else{
            JOptionPane.showMessageDialog(null,"El modulo de ventas no está disponible","Aviso",JOptionPane.ERROR_MESSAGE);
            new CambiaPanel(panel_central,new Panel_en_blanco());
        }
        
        
    }//GEN-LAST:event_btn_ventasActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        // TODO add your handling code here:
        this.btn_inventario.setColorNormal(new Color(51,102,255));
        this.btn_ventas.setColorNormal(new Color(36,36,36));
        this.btn_configuraciones.setColorNormal(new Color(36,36,36));
        this.btn_reportes.setColorNormal(new Color(36,36,36));
        
        new CambiaPanel(panel_central,new Panel_productos());//nos aeguramos de que la clase este bien escrita
        
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_stockActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
         // TODO add your handling code here:
        D_entradas_salidas d=new D_entradas_salidas(this,true);
        d.setVisible(true);
        while(d.isShowing()){
            //no hace nada
        }
        new CambiaPanel(panel_central,new Panel_productos());//nos aeguramos de que la clase este bien escrita
    }//GEN-LAST:event_btn_actualizar_stockActionPerformed

    private void btn_marcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcasActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        // TODO add your handling code here:
        //abrir formulario 
        new D_marcas(new javax.swing.JFrame(),true).setVisible(true);
    }//GEN-LAST:event_btn_marcasActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        // TODO add your handling code here:
        this.btn_inventario.setColorNormal(new Color(36,36,36));
        this.btn_reportes.setColorNormal(new Color(51,102,255));
        this.btn_ventas.setColorNormal(new Color(36,36,36));
        this.btn_configuraciones.setColorNormal(new Color(36,36,36));
        new CambiaPanel(panel_central,new Panel_reportes());//nos aeguramos de que la clase este bien escrita
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_configuracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracionesActionPerformed
        // TODO add your handling code here:
        this.btn_inventario.setColorNormal(new Color(36,36,36));
        this.btn_reportes.setColorNormal(new Color(36,36,36));
        this.btn_ventas.setColorNormal(new Color(36,36,36));
        this.btn_configuraciones.setColorNormal(new Color(51,102,255));
        new CambiaPanel(panel_central,new Panel_configuraciones());//nos aeguramos de que la clase este bien escrita
    }//GEN-LAST:event_btn_configuracionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Mostrarlogo(){
        ImageIcon logo=new ImageIcon(getClass().getResource("/img/IVED_isotipo.png"));
        ImageIcon icono=new ImageIcon(logo.getImage().getScaledInstance(this.lbl_pic.getWidth(),this.lbl_pic.getHeight(),Image.SCALE_DEFAULT));
        this.lbl_pic.setIcon(icono);
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_lateral;
    private rsbuttom.RSButtonMetro btn_actualizar_stock;
    private rsbuttom.RSButtonMetro btn_configuraciones;
    private rsbuttom.RSButtonMetro btn_inventario;
    private rsbuttom.RSButtonMetro btn_marcas;
    private rsbuttom.RSButtonMetro btn_reportes;
    private rsbuttom.RSButtonMetro btn_salir;
    private rsbuttom.RSButtonMetro btn_ventas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_pic;
    private javax.swing.JPanel panel_central;
    private javax.swing.JPanel panel_superior;
    // End of variables declaration//GEN-END:variables
}
