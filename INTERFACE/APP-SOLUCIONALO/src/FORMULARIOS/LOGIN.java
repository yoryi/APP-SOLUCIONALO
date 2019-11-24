
package FORMULARIOS;

import java.sql.Connection;
import javax.swing.JOptionPane;


public class LOGIN extends javax.swing.JFrame {

  
    public LOGIN() {
        initComponents();
        jPanel3.requestFocus();
        setLocationRelativeTo(null); // CENTRALIZAR PANEL  JFAME     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        minimizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 117, 203));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/AÑO.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/TITULO.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CONTEXTO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Iniciar sección.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 75, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 292, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 307, 298, -1));

        minimizar.setBackground(new java.awt.Color(255, 255, 255));
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/minimizar.png"))); // NOI18N
        minimizar.setBorderPainted(false);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 30, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/man-user.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/bloquear.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, 31));

        Contraseña.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Contraseña.setText("jPasswor");
        Contraseña.setBorder(null);
        Contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaFocusGained(evt);
            }
        });
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 287, 260, 20));

        Usuario.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Usuario.setText("Usuario");
        Usuario.setBorder(null);
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuario(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 260, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Empresarial.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 110, -1, -1));

        entrar.setBackground(new java.awt.Color(255, 255, 255));
        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/boton.png"))); // NOI18N
        entrar.setBorderPainted(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 485, -1, -1));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cerrar.png"))); // NOI18N
        cerrar.setBorderPainted(false);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //eventos
    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed

    }//GEN-LAST:event_minimizarActionPerformed

    private void ContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaFocusGained
                     Contraseña.setText("");
    }//GEN-LAST:event_ContraseñaFocusGained

    private void usuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario
         Usuario.setText("");
    }//GEN-LAST:event_usuario

    private void ContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseClicked
        
        Contraseña.setText("");
    }//GEN-LAST:event_ContraseñaMouseClicked

    
    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
            
        String user = "admin";
        String pass = "1234";
        
        if(Usuario.getText().equals(user)&&Contraseña.getText().equals(pass)){
        
            //instancias
            GUIA G1 = new GUIA();
            G1.setVisible(true);
            dispose();//cerrar la ventana anterior
            
        }
        else{
        
            JOptionPane.showMessageDialog(null, "ACCESO INCORRECTO");
           
        
        }
        
        
    }//GEN-LAST:event_entrarActionPerformed

    //METODOS
    
    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarActionPerformed

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
      
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit( 0 ); 
    }//GEN-LAST:event_cerrarMouseClicked

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField Contraseña;
    public javax.swing.JTextField Usuario;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton minimizar;
    // End of variables declaration//GEN-END:variables

    //conexion
    conexion mysql = new conexion();
    Connection cn = mysql.conexion();
}
