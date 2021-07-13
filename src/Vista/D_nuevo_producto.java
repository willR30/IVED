/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Ctr_marcas;
import Controlador.Ctr_productos;
import Modelo.Conexion;
import img.Guardar;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Code128;
import net.sourceforge.jbarcodebean.model.Code39;
import net.sourceforge.jbarcodebean.model.Interleaved25;

/**
 *
 * @author Usuario
 */
public class D_nuevo_producto extends javax.swing.JDialog {

    /**
     * Creates new form D_nuevo_producto
     */
    JBarcodeBean barcode = new JBarcodeBean();
    public static BufferedImage imagen = null;
    public D_nuevo_producto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("IVED-Agregar Producto");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/img/IVED_isotipo.png")).getImage());
        llenar_combobox_marca();//listamos las marcas en el combobox
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        combo_marcas = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_qr = new rsbuttom.RSButtonMetro();
        btn_agregar = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        lbl_qr = new javax.swing.JLabel();
        btn_qr1 = new rsbuttom.RSButtonMetro();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        txt_cantidad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        combo_marcas.setBackground(new java.awt.Color(255, 255, 255));
        combo_marcas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_marcas.setForeground(new java.awt.Color(0, 0, 0));
        combo_marcas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Guardar Código");

        txt_codigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        txt_precio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Precio:");

        btn_qr.setBackground(new java.awt.Color(51, 102, 255));
        btn_qr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/codigo_de_barras.png"))); // NOI18N
        btn_qr.setColorHover(new java.awt.Color(102, 102, 102));
        btn_qr.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_qr.setFocusPainted(false);
        btn_qr.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_qr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qrActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(51, 102, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Listo.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setColorHover(new java.awt.Color(102, 102, 102));
        btn_agregar.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_agregar.setFocusPainted(false);
        btn_agregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txt_descripcion.setColumns(20);
        txt_descripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_descripcion.setRows(5);
        txt_descripcion.setBorder(null);
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txt_descripcion);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("C$");

        lbl_qr.setBackground(new java.awt.Color(255, 255, 255));
        lbl_qr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_qr1.setBackground(new java.awt.Color(51, 102, 255));
        btn_qr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga-directa.png"))); // NOI18N
        btn_qr1.setColorHover(new java.awt.Color(102, 102, 102));
        btn_qr1.setColorNormal(new java.awt.Color(51, 102, 255));
        btn_qr1.setFocusPainted(false);
        btn_qr1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_qr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qr1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Código ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_qr1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combo_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_qr1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
         if(this.txt_nombre.getText().isEmpty() || this.txt_descripcion.getText().isEmpty() || this.txt_cantidad.getText().isEmpty()||txt_codigo.getText().isEmpty()||this.txt_precio.getText().isEmpty()|| Float.parseFloat(this.txt_precio.getText())<0){
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos");
        }else{
             
           if(Integer.parseInt(this.txt_cantidad.getText())<0){
               
               JOptionPane.showMessageDialog(null,"No se admiten campos negativos");
               
           }else{
               //en caso de que el codigo no existe retorna un false
                //si existe un producto con ese codigo identificador
                Ctr_marcas cm=new Ctr_marcas();
                 int ID_marca=cm.ID_marcca(this.combo_marcas.getSelectedItem().toString().trim());

                 Ctr_productos ctr=new Ctr_productos();
                 float precio=Float.parseFloat(this.txt_precio.getText());
                 ctr.agregar_producto(this.txt_codigo.getText().trim(),this.txt_nombre.getText().trim(),ID_marca,this.txt_descripcion.getText().trim(),Integer.parseInt(this.txt_cantidad.getText()),precio);
                 this.hide();
               
           }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyPressed
        // TODO add your handling code here:
        //limitamos la cantidad de caracteres en la descripcion 450
       if(this.txt_descripcion.getText().length()>=450){
            JOptionPane.showMessageDialog(this, "Haz alcanzado el limite de caracteres!", "Error", JOptionPane.ERROR_MESSAGE);
            String texto=this.txt_descripcion.getText().substring(0,450);
            this.txt_descripcion.setText(texto);
       }
        
    }//GEN-LAST:event_txt_descripcionKeyPressed

    private void btn_qr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qr1ActionPerformed
        // TODO add your handling code here:
        if (imagen == null) {
            JOptionPane.showMessageDialog(this, "Debes generar un código!!!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (new Guardar().guardarImagen()) {
                imagen = null;
                JOptionPane.showMessageDialog(this, "Código guardado con éxito!!!", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btn_qr1ActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        // TODO add your handling code here:
        //validamos que solo se agregen nuemeros
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            //si es un numero, todo bien
        }else{
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo debe escribir numeros","¡Error!",JOptionPane.ERROR_MESSAGE);
            this.txt_codigo.setText("");
        }
        
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyReleased
        // TODO add your handling code here:
        generaCodigo(this.txt_codigo.getText());
    }//GEN-LAST:event_txt_codigoKeyReleased

    private void btn_qrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qrActionPerformed
        if (this.txt_codigo.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Debes ingresar un valor!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            generaCodigo(this.txt_codigo.getText());
        }
    }//GEN-LAST:event_btn_qrActionPerformed

    /**
     * @param args the command line arguments
     */
     public void llenar_combobox_marca(){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Conexion cnx=new Conexion();
        Connection conx=cnx.getConextion();//obtenemos la coneccion
        //limpiamos el comobobox
        this.combo_marcas.removeAllItems();
        try{
           String sql="SELECT Nombre_marca From marcas";
           ps=conx.prepareStatement(sql);
           rs =ps.executeQuery();//ejecutamos la consulta
           
           while(rs.next()){
               this.combo_marcas.addItem(rs.getString(1));
           }
           rs.close();//cerramos la conexion
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    private void generaCodigo(String codigo) {
        // nuestro tipo de codigo de barra
        barcode.setCodeType(new Code128());
        //barcode.setCodeType(new Code39());

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(this.txt_codigo.getText());
        barcode.setCheckDigit(true);
        

        imagen = barcode.draw(new BufferedImage(330,100, BufferedImage.TYPE_INT_RGB));

        ImageIcon barras = new ImageIcon(imagen);
        this.lbl_qr.setIcon(barras);
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
            java.util.logging.Logger.getLogger(D_nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_nuevo_producto dialog = new D_nuevo_producto(new javax.swing.JFrame(), true);
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
    private rsbuttom.RSButtonMetro btn_agregar;
    private rsbuttom.RSButtonMetro btn_qr;
    private rsbuttom.RSButtonMetro btn_qr1;
    private javax.swing.JComboBox<String> combo_marcas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_qr;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
