package FORMULARIOS;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class GUIA extends javax.swing.JFrame {
   
    public GUIA() {
        initComponents();
        setLocationRelativeTo(null);   
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnusuario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnclientes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnreparaciones = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btninforme = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnconsulta = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CONTENEDOR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minimizar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 117, 203));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/TITULO-INICIO.png"))); // NOI18N

        btnusuario.setBackground(new java.awt.Color(0, 173, 237));
        btnusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusuarioMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/USUARIO.png"))); // NOI18N

        javax.swing.GroupLayout btnusuarioLayout = new javax.swing.GroupLayout(btnusuario);
        btnusuario.setLayout(btnusuarioLayout);
        btnusuarioLayout.setHorizontalGroup(
            btnusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnusuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnusuarioLayout.setVerticalGroup(
            btnusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnusuarioLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnclientes.setBackground(new java.awt.Color(0, 124, 216));
        btnclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclientesMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CLIENTE.png"))); // NOI18N

        javax.swing.GroupLayout btnclientesLayout = new javax.swing.GroupLayout(btnclientes);
        btnclientes.setLayout(btnclientesLayout);
        btnclientesLayout.setHorizontalGroup(
            btnclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnclientesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnclientesLayout.setVerticalGroup(
            btnclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnclientesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnreparaciones.setBackground(new java.awt.Color(0, 124, 216));
        btnreparaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreparacionesMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/REPARACIONES.png"))); // NOI18N

        javax.swing.GroupLayout btnreparacionesLayout = new javax.swing.GroupLayout(btnreparaciones);
        btnreparaciones.setLayout(btnreparacionesLayout);
        btnreparacionesLayout.setHorizontalGroup(
            btnreparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnreparacionesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnreparacionesLayout.setVerticalGroup(
            btnreparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnreparacionesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btninforme.setBackground(new java.awt.Color(0, 124, 216));
        btninforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninformeMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/INFORME REPARACION.png"))); // NOI18N

        javax.swing.GroupLayout btninformeLayout = new javax.swing.GroupLayout(btninforme);
        btninforme.setLayout(btninformeLayout);
        btninformeLayout.setHorizontalGroup(
            btninformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btninformeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btninformeLayout.setVerticalGroup(
            btninformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btninformeLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnconsulta.setBackground(new java.awt.Color(0, 124, 216));
        btnconsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconsultaMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CONSULTA DE CLIENTE.png"))); // NOI18N

        javax.swing.GroupLayout btnconsultaLayout = new javax.swing.GroupLayout(btnconsulta);
        btnconsulta.setLayout(btnconsultaLayout);
        btnconsultaLayout.setHorizontalGroup(
            btnconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnconsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnconsultaLayout.setVerticalGroup(
            btnconsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnconsultaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Administrador.png"))); // NOI18N

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnreparaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btninforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(btnusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btninforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 660));

        CONTENEDOR.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/saludo.png"))); // NOI18N

        javax.swing.GroupLayout CONTENEDORLayout = new javax.swing.GroupLayout(CONTENEDOR);
        CONTENEDOR.setLayout(CONTENEDORLayout);
        CONTENEDORLayout.setHorizontalGroup(
            CONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTENEDORLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(149, 149, 149))
        );
        CONTENEDORLayout.setVerticalGroup(
            CONTENEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTENEDORLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jPanel1.add(CONTENEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 680, 590));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WE LOVE.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 30));

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
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 30, 20));

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
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, 30));

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

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizarActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit( 0 );
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarioMouseClicked
          
           //activar color menu
           setcolor(btnusuario);
           resetcolor(btnclientes);
           resetcolor(btnreparaciones);
           resetcolor(btninforme);
           resetcolor(btnconsulta);
           
            //INSTASNICAS
            USUARIO u1 = new USUARIO();//instancia
            u1.setSize(680, 580);//tamaño
            u1.setLocation(0, 0);

            CONTENEDOR.removeAll();
            CONTENEDOR.add(u1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
    }//GEN-LAST:event_btnusuarioMouseClicked

    private void btnclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclientesMouseClicked
            
            //activar color menu
           setcolor(btnclientes);
           resetcolor(btnusuario);
           resetcolor(btnreparaciones);
           resetcolor(btninforme);
           resetcolor(btnconsulta);
           
        
            CLIENTE C1 = new CLIENTE();
            C1.setSize(680, 580);
            C1.setLocation(0, 0);

            CONTENEDOR.removeAll();
            CONTENEDOR.add(C1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
    }//GEN-LAST:event_btnclientesMouseClicked

    private void btnreparacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreparacionesMouseClicked
           
           //activar color menu
           setcolor(btnreparaciones);
           resetcolor(btnusuario);
           resetcolor(btnclientes);
           resetcolor(btninforme);
           resetcolor(btnconsulta);
        
           
            REPARACIONES R1 = new REPARACIONES();//instancia
            R1.setSize(680, 580);//tamaño
            R1.setLocation(0, 0);//ubicacion

            CONTENEDOR.removeAll();//remueve
            CONTENEDOR.add(R1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
    }//GEN-LAST:event_btnreparacionesMouseClicked

    private void btninformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninformeMouseClicked
        
            //activar color menu
            setcolor(btninforme);
            resetcolor(btnusuario);
            resetcolor(btnclientes);
            resetcolor(btnreparaciones);
            resetcolor(btnconsulta);
        
           
            INFORME I1 = new INFORME();
            I1.setSize(680, 580);
            I1.setLocation(0, 0);

            CONTENEDOR.removeAll();
            CONTENEDOR.add(I1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
    }//GEN-LAST:event_btninformeMouseClicked

    private void btnconsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultaMouseClicked
        
            //activar color menu
            setcolor(btnconsulta);
            resetcolor(btnusuario);
            resetcolor(btnclientes);
            resetcolor(btnreparaciones);
            resetcolor(btninforme);
        
            CONSULTA I1 = new CONSULTA();
            I1.setSize(680, 580);
            I1.setLocation(0, 0);

            CONTENEDOR.removeAll();
            CONTENEDOR.add(I1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
            
    }//GEN-LAST:event_btnconsultaMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
          
            
    }//GEN-LAST:event_menuMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            
            BIENVENIDA I1 = new BIENVENIDA();
            I1.setSize(680, 580);
            I1.setLocation(0, 0);

            CONTENEDOR.removeAll();
            CONTENEDOR.add(I1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
            
    }//GEN-LAST:event_jLabel3MouseClicked

   public void setcolor(JPanel panel){
       panel.setBackground(new Color (0,173,237));
    }
   
   
   public void resetcolor(JPanel panel){
       panel.setBackground(new Color (0,124,216));
       
    }
   
   
    
    
    
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(() -> {
            new GUIA().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel CONTENEDOR;
    private javax.swing.JPanel btnclientes;
    private javax.swing.JPanel btnconsulta;
    private javax.swing.JPanel btninforme;
    private javax.swing.JPanel btnreparaciones;
    private javax.swing.JPanel btnusuario;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel menu;
    private javax.swing.JButton minimizar;
    // End of variables declaration//GEN-END:variables
}
