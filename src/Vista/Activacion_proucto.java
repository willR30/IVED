/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_configuraciones;
import Modelo.main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Activacion_proucto extends javax.swing.JFrame {

    /**
     * Creates new form Activacion_proucto
     */
    private int cod1 = 0, cod2 = 0, cod3 = 0, cod4 = 0;

    public Activacion_proucto() {
        initComponents();
        //establecemos las propiedades iniciales
        this.setTitle("IVED-Acticavión de Producto");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_cod1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cod2 = new javax.swing.JTextField();
        txt_cod3 = new javax.swing.JTextField();
        txt_cod4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_activar = new rsbuttom.RSButtonMetro();

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));

        txt_cod1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_cod1.setForeground(new java.awt.Color(0, 0, 0));
        txt_cod1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_cod1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod1KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa el código de activación");

        txt_cod2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_cod2.setForeground(new java.awt.Color(0, 0, 0));
        txt_cod2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_cod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod2KeyPressed(evt);
            }
        });

        txt_cod3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_cod3.setForeground(new java.awt.Color(0, 0, 0));
        txt_cod3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_cod3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod3KeyPressed(evt);
            }
        });

        txt_cod4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txt_cod4.setForeground(new java.awt.Color(0, 0, 0));
        txt_cod4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36), 3));
        txt_cod4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod4KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("-");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");

        btn_activar.setBackground(new java.awt.Color(51, 102, 255));
        btn_activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        btn_activar.setText("Activar");
        btn_activar.setColorHover(new java.awt.Color(102, 102, 102));
        btn_activar.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_activar.setFocusable(false);
        btn_activar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_activarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_cod1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(16, 16, 16)
                        .addComponent(txt_cod2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(txt_cod3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(13, 13, 13)
                .addComponent(txt_cod4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_activar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_activar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cod1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod1KeyPressed
        // TODO add your handling code here:
        this.cod1++;
        limitar_dimension_textbox(this.txt_cod1);


    }//GEN-LAST:event_txt_cod1KeyPressed

    private void txt_cod2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod2KeyPressed
        // TODO add your handling code here:

        this.cod2++;
        limitar_dimension_textbox(this.txt_cod2);
    }//GEN-LAST:event_txt_cod2KeyPressed

    private void txt_cod3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod3KeyPressed
        // TODO add your handling code here:
        this.cod3++;
        limitar_dimension_textbox(this.txt_cod3);
    }//GEN-LAST:event_txt_cod3KeyPressed

    private void txt_cod4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod4KeyPressed
        // TODO add your handling code here:
        this.cod4++;
        limitar_dimension_textbox(this.txt_cod4);
    }//GEN-LAST:event_txt_cod4KeyPressed

    private void btn_actualizar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_usuarioActionPerformed
        

    }//GEN-LAST:event_btn_actualizar_usuarioActionPerformed

    private void btn_actualizar_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizar_usuario1ActionPerformed

    private void btn_activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_activarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //validamos que la ruta no esté vacía
            if (validacion_de_campos()) {
                Activar_producto();
            } else {
                JOptionPane.showMessageDialog(null, "No se admiten campos Nulos", "¡Error!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException ex) {
            Logger.getLogger(Activacion_proucto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_activarActionPerformed

    /**
     * @param args the command line arguments
     */
    private void EliminarFichero() {
        File fichero = new File("C:\\ProgramData\\IVED_activation_code.txt");
        if (fichero.delete()) {
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        } else {
            System.out.println("El fichero no puede ser borrado");
        }
    }

    private boolean validacion_de_campos() {
        if (this.txt_cod1.getText().isEmpty() || this.txt_cod2.getText().isEmpty() || this.txt_cod3.getText().isEmpty() || this.txt_cod4.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void Activar_producto() throws IOException {
        Descargar_archivo();
        String cod = ObtenerCodigoUsuario();
        String fichero = LeerFicheroDescargado();
        validar_activacion_producto(cod, fichero);
        EliminarFichero();

    }

    private String ObtenerCodigoUsuario() {
        String codigo_usuario = "" + this.txt_cod1.getText().trim() + this.txt_cod2.getText().trim() + this.txt_cod3.getText().trim() + this.txt_cod4.getText().trim();
        return codigo_usuario;
    }

    private void validar_activacion_producto(String code_usuario, String fichero) {
        if (code_usuario.equals(fichero)) {
            Ctr_configuraciones ctr=new Ctr_configuraciones();
            ctr.ActivarProducto();
            main m=new main();
            main.ValidarLoginCreacionUsuario();
            this.dispose();
            //JOptionPane.showMessageDialog(null, "Producto Activado");
        } else {
            JOptionPane.showMessageDialog(null, "El producto no pudo ser Activado");
        }
    }

    private String LeerFicheroDescargado() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea = "";
        String line = "";
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\ProgramData\\IVED_activation_code.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            while ((linea = br.readLine()) != null) {
                line = linea;
                return linea;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return line;
    }

    private void Descargar_archivo() throws MalformedURLException, IOException {
        String url = "https://drive.google.com/uc?id=1uWdOpo9oaq87PpEpLdT7rJicfQbGrKol"; //dirección url del recurso a descargar
        String name = "IVED_activation_code.txt"; //nombre del archivo destino
        //Directorio destino para las descargas
        String folder = "C:\\ProgramData\\";

        //Crea el directorio de destino en caso de que no exista
        File dir = new File(folder);
        if (!dir.exists()) {
            if (!dir.mkdir()) {
                return; // no se pudo crear la carpeta de destino
            }
        }
        File file = new File(folder + name);
        URLConnection conn = new URL(url).openConnection();
        conn.connect();
        System.out.println("\nempezando descarga: \n");
        System.out.println(">> URL: " + url);
        System.out.println(">> Nombre: " + name);
        System.out.println(">> tamaño: " + conn.getContentLength() + " bytes");

        InputStream in = conn.getInputStream();
        OutputStream out = new FileOutputStream(file);
        int b = 0;
        while (b != -1) {
            b = in.read();
            if (b != -1) {
                out.write(b);
            }
        }
        out.close();
        in.close();
    }

    private void limitar_dimension_textbox(javax.swing.JTextField txt_codigo) {

        if (txt_codigo.getText().length() > 5) {
            txt_codigo.setText(txt_codigo.getText().substring(0, 5));
        } else {

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
            java.util.logging.Logger.getLogger(Activacion_proucto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activacion_proucto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activacion_proucto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activacion_proucto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activacion_proucto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btn_activar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cod1;
    private javax.swing.JTextField txt_cod2;
    private javax.swing.JTextField txt_cod3;
    private javax.swing.JTextField txt_cod4;
    // End of variables declaration//GEN-END:variables
}
