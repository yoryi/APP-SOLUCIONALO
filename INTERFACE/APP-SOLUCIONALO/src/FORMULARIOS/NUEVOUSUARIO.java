
package FORMULARIOS;

import static FORMULARIOS.GUIA.CONTENEDOR;
import static FORMULARIOS.USUARIO.tablausuario;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


  

public class NUEVOUSUARIO extends javax.swing.JPanel {

conexion con = new conexion();
Connection cn = con.conexion();




    public NUEVOUSUARIO() {
        initComponents();

    }
    
    public void contar(){
    
    int filas = tablausuario.getRowCount();
    
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnnuevousuario = new javax.swing.JButton();
        btnnuevomodificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nombreusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        apellidousuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        telefonousuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        fechausuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        edadusuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        direcciónusuario = new javax.swing.JTextField();
        rolusuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        idusuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(216, 0, 83));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/NUEVO-TEXT.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        btnnuevousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BTN-CANCELAR.png"))); // NOI18N
        btnnuevousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevousuarioActionPerformed(evt);
            }
        });

        btnnuevomodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BTN-GUARDAR.png"))); // NOI18N
        btnnuevomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevomodificarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/NOTA-TEXT.png"))); // NOI18N

        nombreusuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        nombreusuario.setText("Nombre");
        nombreusuario.setBorder(null);
        nombreusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreusuarioMouseClicked(evt);
            }
        });
        nombreusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreusuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/nombre.png"))); // NOI18N

        apellidousuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        apellidousuario.setText("Apellido");
        apellidousuario.setBorder(null);
        apellidousuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidousuarioMouseClicked(evt);
            }
        });
        apellidousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidousuarioActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/nombre.png"))); // NOI18N

        telefonousuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        telefonousuario.setText("Telefono");
        telefonousuario.setBorder(null);
        telefonousuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonousuarioMouseClicked(evt);
            }
        });
        telefonousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonousuarioActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/telefono.png"))); // NOI18N

        fechausuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        fechausuario.setText("Fecha de Nacimiento");
        fechausuario.setBorder(null);
        fechausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechausuarioMouseClicked(evt);
            }
        });
        fechausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechausuarioActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fecha nacimiento.png"))); // NOI18N

        edadusuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        edadusuario.setText("Edad");
        edadusuario.setBorder(null);
        edadusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edadusuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edadusuarioMouseEntered(evt);
            }
        });
        edadusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadusuarioActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/edad.png"))); // NOI18N

        direcciónusuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        direcciónusuario.setText("Dirección");
        direcciónusuario.setBorder(null);
        direcciónusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direcciónusuarioMouseClicked(evt);
            }
        });
        direcciónusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcciónusuarioActionPerformed(evt);
            }
        });

        rolusuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        rolusuario.setText("Rol");
        rolusuario.setBorder(null);
        rolusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rolusuarioMouseClicked(evt);
            }
        });
        rolusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolusuarioActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/direcion.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/rol.png"))); // NOI18N

        idusuario.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        idusuario.setText("id");
        idusuario.setBorder(null);
        idusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idusuarioMouseClicked(evt);
            }
        });
        idusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idusuarioActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/rol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direcciónusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rolusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edadusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechausuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefonousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnnuevousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnnuevomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(apellidousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fechausuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telefonousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(direcciónusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edadusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rolusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnnuevomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevousuarioActionPerformed

        USUARIO U2 = new USUARIO();//instancia
        U2.setSize(680, 580);//tamaño
        U2.setLocation(0, 0);

        CONTENEDOR.removeAll();
        CONTENEDOR.add(U2, BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
        
    }//GEN-LAST:event_btnnuevousuarioActionPerformed

    private void btnnuevomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevomodificarActionPerformed
        
        try{
          PreparedStatement pps = cn.prepareStatement("insert into usuario(id,nombre,apellido,fecha,telefono,direccion,edad,rol) VALUE(?,?,?,?,?,?,?,?)");
          pps.setString(1, idusuario.getText());
          pps.setString(2, nombreusuario.getText());
          pps.setString(3, apellidousuario.getText());
          pps.setString(4, fechausuario.getText());
          pps.setString(5, telefonousuario.getText()); 
          pps.setString(6, direcciónusuario.getText());
          pps.setString(7, edadusuario.getText());
          pps.setString(8, rolusuario.getText());
          pps.executeUpdate();
          JOptionPane.showMessageDialog(null, "DATOS GUARDADO");
         
            
            USUARIO N1 = new USUARIO();//instancia
            N1.setSize(680, 580);//tamaño
            N1.setLocation(0, 0);
            CONTENEDOR.removeAll();
            CONTENEDOR.add(N1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
            
            cn.close();
         
            
        }catch (SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex);
        
        }
   
        
    }//GEN-LAST:event_btnnuevomodificarActionPerformed

    private void nombreusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreusuarioActionPerformed

    private void apellidousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidousuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidousuarioActionPerformed

    private void telefonousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonousuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonousuarioActionPerformed

    private void fechausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechausuarioActionPerformed

    private void edadusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadusuarioActionPerformed

    private void direcciónusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcciónusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcciónusuarioActionPerformed

    private void rolusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolusuarioActionPerformed

    private void nombreusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreusuarioMouseClicked
        
        nombreusuario.setText("");
    }//GEN-LAST:event_nombreusuarioMouseClicked

    private void apellidousuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidousuarioMouseClicked
        apellidousuario.setText("");
    }//GEN-LAST:event_apellidousuarioMouseClicked

    private void fechausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechausuarioMouseClicked
        fechausuario.setText("");
    }//GEN-LAST:event_fechausuarioMouseClicked

    private void telefonousuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonousuarioMouseClicked
        telefonousuario.setText("");
    }//GEN-LAST:event_telefonousuarioMouseClicked

    private void direcciónusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direcciónusuarioMouseClicked
       direcciónusuario.setText("");
    }//GEN-LAST:event_direcciónusuarioMouseClicked

    private void edadusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadusuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_edadusuarioMouseEntered

    private void edadusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadusuarioMouseClicked
        edadusuario.setText("");
    }//GEN-LAST:event_edadusuarioMouseClicked

    private void rolusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolusuarioMouseClicked
        rolusuario.setText("");
    }//GEN-LAST:event_rolusuarioMouseClicked

    private void idusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idusuarioMouseClicked

    private void idusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idusuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidousuario;
    private javax.swing.JButton btnnuevomodificar;
    private javax.swing.JButton btnnuevousuario;
    private javax.swing.JTextField direcciónusuario;
    private javax.swing.JTextField edadusuario;
    private javax.swing.JTextField fechausuario;
    private javax.swing.JTextField idusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombreusuario;
    private javax.swing.JTextField rolusuario;
    private javax.swing.JTextField telefonousuario;
    // End of variables declaration//GEN-END:variables
}
