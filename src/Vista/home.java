/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;

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
        this.setTitle("IVED-Home");
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED.png")).getImage());
        new CambiaPanel(panel_central,new Panel_home());//nos aeguramos de que la clase este bien escrita
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
        panel_superior = new javax.swing.JPanel();
        btn_entrar4 = new rsbuttom.RSButtonMetro();
        btn_home = new rsbuttom.RSButtonMetro();
        btn_entradas = new rsbuttom.RSButtonMetro();
        btn_usuario = new rsbuttom.RSButtonMetro();
        btn_marcas = new rsbuttom.RSButtonMetro();
        btn_entrar6 = new rsbuttom.RSButtonMetro();
        btn_entrar7 = new rsbuttom.RSButtonMetro();
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

        panel_superior.setBackground(new java.awt.Color(36, 36, 36));

        btn_entrar4.setBackground(new java.awt.Color(51, 102, 255));
        btn_entrar4.setText("Salir");
        btn_entrar4.setColorHover(new java.awt.Color(102, 102, 102));
        btn_entrar4.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_entrar4.setFocusPainted(false);
        btn_entrar4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_entrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrar4ActionPerformed(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(51, 102, 255));
        btn_home.setText("Entrdas y/o Salidas de productos");
        btn_home.setColorHover(new java.awt.Color(102, 102, 102));
        btn_home.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_home.setFocusPainted(false);
        btn_home.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_entradas.setBackground(new java.awt.Color(51, 102, 255));
        btn_entradas.setText("Nuevo producto");
        btn_entradas.setColorHover(new java.awt.Color(102, 102, 102));
        btn_entradas.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_entradas.setFocusPainted(false);
        btn_entradas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entradasActionPerformed(evt);
            }
        });

        btn_usuario.setBackground(new java.awt.Color(51, 102, 255));
        btn_usuario.setText("Configuraciones");
        btn_usuario.setColorHover(new java.awt.Color(102, 102, 102));
        btn_usuario.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_usuario.setFocusPainted(false);
        btn_usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });

        btn_marcas.setBackground(new java.awt.Color(51, 102, 255));
        btn_marcas.setText("Marcas");
        btn_marcas.setColorHover(new java.awt.Color(102, 102, 102));
        btn_marcas.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_marcas.setFocusPainted(false);
        btn_marcas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcasActionPerformed(evt);
            }
        });

        btn_entrar6.setBackground(new java.awt.Color(51, 102, 255));
        btn_entrar6.setText("Reportes");
        btn_entrar6.setColorHover(new java.awt.Color(102, 102, 102));
        btn_entrar6.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_entrar6.setFocusPainted(false);
        btn_entrar6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_entrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrar6ActionPerformed(evt);
            }
        });

        btn_entrar7.setBackground(new java.awt.Color(51, 102, 255));
        btn_entrar7.setText("Home");
        btn_entrar7.setColorHover(new java.awt.Color(102, 102, 102));
        btn_entrar7.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_entrar7.setFocusPainted(false);
        btn_entrar7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_entrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_superiorLayout = new javax.swing.GroupLayout(panel_superior);
        panel_superior.setLayout(panel_superiorLayout);
        panel_superiorLayout.setHorizontalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_entrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_entrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_entrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panel_superiorLayout.setVerticalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_superiorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_entrar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_entrar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_entrar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_central.setBackground(new java.awt.Color(102, 102, 102));
        panel_central.setLayout(new javax.swing.BoxLayout(panel_central, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_central, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(panel_central, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 466, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrar4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login log=new Login();
        log.setVisible(true);
    }//GEN-LAST:event_btn_entrar4ActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        D_entradas_salidas d=new D_entradas_salidas(this,true);
        d.setVisible(true);
        while(d.isShowing()){
            //no hace nada
        }
        new CambiaPanel(panel_central,new Panel_home());//nos aeguramos de que la clase este bien escrita
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entradasActionPerformed
        // TODO add your handling code here:
        D_nuevo_producto d=new D_nuevo_producto(this,true);
        d.setVisible(true);
        while(d.isShowing()){
            //no hace nada
        }
        new CambiaPanel(panel_central,new Panel_home());//nos aeguramos de que la clase este bien escrita
    }//GEN-LAST:event_btn_entradasActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
        // TODO add your handling code here:
        //editar usuario
        
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_marcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcasActionPerformed
        // TODO add your handling code here:
        //abrir formulario 
        new D_marcas(new javax.swing.JFrame(),true).setVisible(true);
    }//GEN-LAST:event_btn_marcasActionPerformed

    private void btn_entrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_entrar6ActionPerformed

    private void btn_entrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrar7ActionPerformed
        // TODO add your handling code here:
        //regresamos al home
        new CambiaPanel(panel_central,new Panel_home());//nos aeguramos de que la clase este bien escrita
    }//GEN-LAST:event_btn_entrar7ActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private rsbuttom.RSButtonMetro btn_entradas;
    private rsbuttom.RSButtonMetro btn_entrar4;
    private rsbuttom.RSButtonMetro btn_entrar6;
    private rsbuttom.RSButtonMetro btn_entrar7;
    private rsbuttom.RSButtonMetro btn_home;
    private rsbuttom.RSButtonMetro btn_marcas;
    private rsbuttom.RSButtonMetro btn_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_central;
    private javax.swing.JPanel panel_superior;
    // End of variables declaration//GEN-END:variables
}
