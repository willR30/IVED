/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_configuraciones;
import Controlador.Ctr_usuario;
import Modelo.Conexion;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author DELL
 */
public class Crear_usuario extends javax.swing.JFrame {

    /**
     * Creates new form Crear_usuario
     */
    private String path="";
    File f;
    public Crear_usuario() {
        initComponents();
        Establecer_propiedades();
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
        jLabel2 = new javax.swing.JLabel();
        txt_user_name = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        btn_crear_usuario = new rsbuttom.RSButtonMetro();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre_negocio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_confrimar_contraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contaseña:");

        txt_user_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_user_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_user_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_user_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_user_nameKeyPressed(evt);
            }
        });

        txt_contraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contraseñaKeyPressed(evt);
            }
        });

        btn_crear_usuario.setBackground(new java.awt.Color(51, 102, 255));
        btn_crear_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Listo.png"))); // NOI18N
        btn_crear_usuario.setText("Crear");
        btn_crear_usuario.setColorHover(new java.awt.Color(102, 102, 102));
        btn_crear_usuario.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_crear_usuario.setFocusPainted(false);
        btn_crear_usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_usuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Negocio:");

        txt_nombre_negocio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nombre_negocio.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre_negocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_nombre_negocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombre_negocioKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirme contraseña:");

        txt_confrimar_contraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_confrimar_contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_confrimar_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_confrimar_contraseñaKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Usa números, simbolos y letras para que");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Configura tu primer inicio de Sesión");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("tu contraseña sea mas segura.");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¿Necesitas ayuda?");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Escribe a koltwarehelp@gmail.com con gusto te atenderemos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre_negocio, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(72, 72, 72))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_confrimar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(23, 23, 23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(129, 129, 129))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_negocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(txt_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(txt_confrimar_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_user_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_user_nameKeyPressed
        // TODO add your handling code here:
        //al presionar la tecla enter que se inicien las opciones de validacion
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (this.txt_user_name.getText().isEmpty() || this.txt_contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se admiten campos nulos!");
            } else {
                String user_name = this.txt_user_name.getText().trim();
                String Contraseña = this.txt_contraseña.getText().trim();
                Ctr_usuario ctr_user = new Ctr_usuario();
                int validacion = 0;
                validacion = ctr_user.login(user_name, Contraseña);

                if (validacion == 1) {
                    //mostramos el home principa
                    home home=new home();
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    home.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al iniciar secion! intente de nuevo");
                    this.txt_contraseña.setText("");
                    this.txt_user_name.setText("");
                }

            }
        }

    }//GEN-LAST:event_txt_user_nameKeyPressed

    private void txt_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contraseñaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (this.txt_user_name.getText().isEmpty() || this.txt_contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se admiten campos nulos!");
            } else {
                String user_name = this.txt_user_name.getText().trim();
                String Contraseña = this.txt_contraseña.getText().trim();
                Ctr_usuario ctr_user = new Ctr_usuario();
                int validacion = 0;
                validacion = ctr_user.login(user_name, Contraseña);

                if (validacion == 1) {
                    home home=new home();
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    home.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al iniciar secion! intente de nuevo");
                    this.txt_contraseña.setText("");
                    this.txt_user_name.setText("");
                }
            }
        }
    }//GEN-LAST:event_txt_contraseñaKeyPressed

    private void btn_crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_usuarioActionPerformed
        // TODO add your handling code here:
        //crear usuario
        //validamos los campos nulos
        if(this.txt_nombre_negocio.getText().isEmpty() ||this.txt_user_name.getText().isEmpty() || this.txt_contraseña.getText().isEmpty() ||this.txt_confrimar_contraseña.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe de completar todos los campos");
        }else{
            //capturamos las contraseñas y las comparamos
            String contra=this.txt_contraseña.getText().trim();
            String confirma=this.txt_confrimar_contraseña.getText().trim();
            if(contra.equals(confirma)){
                //aguí agrega al usuario
                
                new Ctr_usuario().agregar_usuario(this.txt_user_name.getText().trim(), contra);//pasamos el usuario tomado del campo de texto y la contraseñe
                new Ctr_configuraciones().agregar_nombre_negocio(this.txt_nombre_negocio.getText().trim());//capturamos y agregamos el nombre del negocio
                JOptionPane.showMessageDialog(null,"Inicia Sesion");
                new Ctr_configuraciones().actualizar_validacion_de_usuario_existente();//actualizamos el registro de usuario
                this.hide();
                this.dispose();
                new Login().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"La contraseñas no son iguales","¡Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_crear_usuarioActionPerformed

    private void txt_nombre_negocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_negocioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_negocioKeyPressed

    private void txt_confrimar_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confrimar_contraseñaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_confrimar_contraseñaKeyPressed
         
    
    /**
     * @param args the command line arguments
     */
    public void Establecer_propiedades(){
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("IVED-Crear usuario");
        //establecemos la imagen como incono del programa
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
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
            java.util.logging.Logger.getLogger(Crear_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btn_crear_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_confrimar_contraseña;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_nombre_negocio;
    private javax.swing.JTextField txt_user_name;
    // End of variables declaration//GEN-END:variables
}
