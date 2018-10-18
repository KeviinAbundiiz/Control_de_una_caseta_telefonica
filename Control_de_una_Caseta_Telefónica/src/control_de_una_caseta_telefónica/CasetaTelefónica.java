
package control_de_una_caseta_telefónica;
import Libreria.SacarCostoLlamada;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CasetaTelefónica extends javax.swing.JFrame {

    public CasetaTelefónica() {
        initComponents();
        this.setTitle("CASETA TELEFÓNICA");
        this.setLocationRelativeTo(null);
        
        ImageIcon imagen = new ImageIcon("background_dark_patterns_textures_hd-wallpaper-35206.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jButton2.getWidth(), jButton2.getHeight(),Image.SCALE_DEFAULT));
        jButton2.setIcon(icono);
        this.repaint();
          
        
    }
    
    SacarCostoLlamada costo = new SacarCostoLlamada();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        duraciondellamada = new javax.swing.JTextField();
        sacarcosto = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tarjetaestudiante = new javax.swing.JRadioButton();
        tarjetainapan = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Goudy Stout", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("CASETA TELEFÓNICA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Duración de la llamada: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(duraciondellamada, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 60, 67, 30));

        sacarcosto.setText("Sacar Costo");
        sacarcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarcostoActionPerformed(evt);
            }
        });
        getContentPane().add(sacarcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        limpiar.setText("Limpiar ");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 100, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecciona la tarjeta que poseas (en caso de no tener ninguna, dejar como esta):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        tarjetaestudiante.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        tarjetaestudiante.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaestudiante.setText(" Tarjeta de Estudiante");
        getContentPane().add(tarjetaestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        tarjetainapan.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        tarjetainapan.setForeground(new java.awt.Color(255, 255, 255));
        tarjetainapan.setText("Tarjeta INAPAN");
        getContentPane().add(tarjetainapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abund\\OneDrive\\Escritorio\\Programas en Java\\Control_de_una_Caseta_Telefónica\\telephone_blue.png")); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 140, 120));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void sacarcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarcostoActionPerformed
        try{
            if("".equals(duraciondellamada.getText())){
            JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS" ,"ERROR", 1);
        }
        else{
            double duracion = Double.parseDouble(duraciondellamada.getText());
        
            if(duracion < 0){
               JOptionPane.showMessageDialog(null, "Introduce valores mayores a 0" ,"ERROR", 1);
            }
             if(duracion == 0){
               JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $0" ,"Mensaje", 1);
            }
            if(duracion > 0 && duracion <= 3){
                if(tarjetainapan.isSelected()==false && tarjetaestudiante.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  costo.sacar_costo_llamada_menor_igual_3(duracion),"Mensaje", 1);
                }
                if(tarjetainapan.isSelected()==true && tarjetaestudiante.isSelected()==false){
                    double descuentoinapan = 0.5;
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  descuentoinapan * costo.sacar_costo_llamada_menor_igual_3(duracion),"Mensaje", 1);
                }
                if(tarjetainapan.isSelected()==false && tarjetaestudiante.isSelected()==true){
                    double descuentoestudiante = 0.7;
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  descuentoestudiante * costo.sacar_costo_llamada_menor_igual_3(duracion),"Mensaje", 1);
                }
                if(tarjetainapan.isSelected()==true && tarjetaestudiante.isSelected()==true){
                    double descuentopro = 0.2;
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  descuentopro * costo.sacar_costo_llamada_menor_igual_3(duracion),"Mensaje", 1);
                }
               
            }
            if(duracion > 3 && duracion <= 10){
                if(tarjetainapan.isSelected()==false && tarjetaestudiante.isSelected()==false){
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  costo.sacar_costo_llamada_mayor3_menor10(duracion),"Mensaje", 1);
                }
                if(tarjetainapan.isSelected()==true && tarjetaestudiante.isSelected()==false){
                    double descuentoinapan = 0.5;
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  descuentoinapan * costo.sacar_costo_llamada_mayor3_menor10(duracion),"Mensaje", 1);
                }
                if(tarjetainapan.isSelected()==false && tarjetaestudiante.isSelected()==true){
                    double descuentoestudiante = 0.7;
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  descuentoestudiante * costo.sacar_costo_llamada_mayor3_menor10(duracion),"Mensaje", 1);
                }
                if(tarjetainapan.isSelected()==true && tarjetaestudiante.isSelected()==true){
                    double descuentopro = 0.2;
                    JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +  descuentopro * costo.sacar_costo_llamada_mayor3_menor10(duracion),"Mensaje", 1);
                }
//               
            }
            if(duracion > 10){
                if(tarjetainapan.isSelected()==false && tarjetaestudiante.isSelected()==false){
                    double costototal = costo.sacar_costo_llamada_mayor10(duracion);
                    double descuento = costototal*0.05;
                    if(costototal >= 60){
                        costototal = (costototal-descuento);
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                    
                }
                if(tarjetainapan.isSelected()==true && tarjetaestudiante.isSelected()==false){
                    double descuentoinapan = 0.5;
                    double costototal = descuentoinapan * costo.sacar_costo_llamada_mayor10(duracion); 
                    double descuento = costototal*0.05;
                    if(costototal >= 60){
                        costototal = (costototal-descuento);
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                }
                if(tarjetainapan.isSelected()==false && tarjetaestudiante.isSelected()==true){
                    double descuentoestudiante = 0.7;
                    double costototal = descuentoestudiante * costo.sacar_costo_llamada_mayor10(duracion);
                    double descuento = costototal*0.05;
                    if(costototal>=60){
                        costototal = (costototal-descuento);
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                    
                    
                }
                if(tarjetainapan.isSelected()==true && tarjetaestudiante.isSelected()==true){
                    double descuentopro = 0.2;
                    double costototal = descuentopro * costo.sacar_costo_llamada_mayor10(duracion);
                    double descuento = costototal*0.05;
                    if(costototal>=60){
                        costototal = (costototal-descuento);
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El costo de la llamada es de: $" +costototal  ,"Mensaje", 1);
                    }
                   
                }
               
            }
        }
        }
        catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "PUSISTE ALGUNA LETRA"  ,"ERROR", 1);
        }
        
    }//GEN-LAST:event_sacarcostoActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        
        duraciondellamada.setText("");
        
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(CasetaTelefónica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasetaTelefónica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasetaTelefónica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasetaTelefónica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasetaTelefónica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duraciondellamada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton sacarcosto;
    private javax.swing.JButton salir;
    private javax.swing.JRadioButton tarjetaestudiante;
    private javax.swing.JRadioButton tarjetainapan;
    // End of variables declaration//GEN-END:variables
}
