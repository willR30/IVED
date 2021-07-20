/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_configuraciones;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class D_cargar_datos extends javax.swing.JDialog {

    /**
     * Creates new form D_cargar_datos
     */
    private String path;
    public D_cargar_datos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("IVED-Cargar Datos");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        btn_restaurar = new rsbuttom.RSButtonMetro();
        btn_actualizar_usuario1 = new rsbuttom.RSButtonMetro();
        btn_buscar_ruta = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Ruta donde extraer los datos");

        txt_ruta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btn_restaurar.setBackground(new java.awt.Color(51, 102, 255));
        btn_restaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Listo.png"))); // NOI18N
        btn_restaurar.setText("Restaurar");
        btn_restaurar.setColorHover(new java.awt.Color(102, 102, 102));
        btn_restaurar.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_restaurar.setFocusPainted(false);
        btn_restaurar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaurarActionPerformed(evt);
            }
        });

        btn_actualizar_usuario1.setBackground(new java.awt.Color(255, 27, 45));
        btn_actualizar_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Listo.png"))); // NOI18N
        btn_actualizar_usuario1.setText("Cancelar");
        btn_actualizar_usuario1.setColorHover(new java.awt.Color(102, 102, 102));
        btn_actualizar_usuario1.setColorNormal(new java.awt.Color(255, 27, 45));
        btn_actualizar_usuario1.setFocusPainted(false);
        btn_actualizar_usuario1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_actualizar_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_usuario1ActionPerformed(evt);
            }
        });

        btn_buscar_ruta.setBackground(new java.awt.Color(51, 102, 255));
        btn_buscar_ruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btn_buscar_ruta.setColorHover(new java.awt.Color(102, 102, 102));
        btn_buscar_ruta.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_buscar_ruta.setFocusPainted(false);
        btn_buscar_ruta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_buscar_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_rutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_restaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_actualizar_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_buscar_ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ruta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_restaurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaurarActionPerformed
        // TODO add your handling code here:
        //validamos que la ruta no esté vacía
        if(this.txt_ruta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe de asignar una ruta al respaldo","¡Error!",JOptionPane.ERROR_MESSAGE);
        }else{
            Ctr_configuraciones ctr=new Ctr_configuraciones();
            ctr.CargarDatos(this.txt_ruta.getText().trim());
        }

    }//GEN-LAST:event_btn_restaurarActionPerformed

    private void btn_actualizar_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizar_usuario1ActionPerformed

    private void btn_buscar_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_rutaActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        String date=new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        try{
            File f=fc.getSelectedFile();
            path=f.getAbsolutePath();
            path=path.replace('\\', '/');
            this.txt_ruta.setText(path);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btn_buscar_rutaActionPerformed

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
            java.util.logging.Logger.getLogger(D_cargar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_cargar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_cargar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_cargar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_cargar_datos dialog = new D_cargar_datos(new javax.swing.JFrame(), true);
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
    private rsbuttom.RSButtonMetro btn_actualizar_usuario1;
    private rsbuttom.RSButtonMetro btn_buscar_ruta;
    private rsbuttom.RSButtonMetro btn_restaurar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables
}
