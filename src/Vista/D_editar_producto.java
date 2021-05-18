/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_productos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class D_editar_producto extends javax.swing.JDialog {

    /**
     * Creates new form D_editar_producto
     */
    private int ID;
    public D_editar_producto(java.awt.Frame parent, boolean modal,int id) {
        super(parent, modal);
        initComponents();
        this.ID=id;
        this.setTitle("Editar propiedades de producto");
        this.setLocationRelativeTo(null);
        
        //--------------------
        Ctr_productos ctr=new Ctr_productos();
        ctr.buscar_por_ID(ID, txt_codigo, txt_nombre,this.combo_marcas , txt_descripcion, txt_cantidad,this.txt_precio);
        
    }

    private D_editar_producto(JFrame jFrame, boolean b) {
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
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        btn_home = new javax.swing.JButton();
        combo_marcas = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 52, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 48, 226, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 92, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Descripción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 138, -1, -1));

        txt_descripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 134, 385, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad Disponible:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 183, -1, -1));

        txt_cantidad.setEditable(false);
        txt_cantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 179, 123, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Codigo Catalago");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 19, -1, -1));

        txt_codigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(0, 0, 0));
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, 226, -1));

        btn_home.setBackground(new java.awt.Color(51, 102, 255));
        btn_home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Editar");
        btn_home.setBorder(null);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 155, 72));

        combo_marcas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        combo_marcas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oriflame", "Avon", "Arabela", "Otra" }));
        combo_marcas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(combo_marcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 87, 212, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Precio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 224, -1, -1));

        txt_precio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 224, 123, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 535, 266));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        //validamos campos nulos
        if(this.txt_nombre.getText().isEmpty() || this.txt_descripcion.getText().isEmpty() || this.txt_codigo.getText().isEmpty()||txt_codigo.getText().isEmpty()||this.txt_precio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos");
        }else{
           if(Integer.parseInt(this.txt_cantidad.getText())<0){
               JOptionPane.showMessageDialog(null,"No se admiten campos negativos");
           }else{
               Ctr_productos ctr=new Ctr_productos();
               //capturamos el precio del producto
               float precio=Float.parseFloat(this.txt_precio.getText().trim());
               ctr.actualizar_producto(this.txt_nombre.getText(),this.combo_marcas.getSelectedItem().toString(), txt_descripcion.getText(), txt_codigo.getText(), ID,precio);
               this.hide();
           }
        }
        

    }//GEN-LAST:event_btn_homeActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

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
            java.util.logging.Logger.getLogger(D_editar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_editar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_editar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_editar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_editar_producto dialog = new D_editar_producto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_home;
    private javax.swing.JComboBox<String> combo_marcas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
