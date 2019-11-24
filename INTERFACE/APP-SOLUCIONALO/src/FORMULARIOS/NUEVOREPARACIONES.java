/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORMULARIOS;

import static FORMULARIOS.GUIA.CONTENEDOR;
import static FORMULARIOS.NUEVOCLIENTE.apellidocliente;
import static FORMULARIOS.NUEVOCLIENTE.direccioncliente;
import static FORMULARIOS.NUEVOCLIENTE.fechacliente;
import static FORMULARIOS.NUEVOCLIENTE.nombrecliente;
import static FORMULARIOS.NUEVOCLIENTE.telefonocliente;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class NUEVOREPARACIONES extends javax.swing.JPanel {
    
     conexion con = new conexion();
    Connection cn = con.conexion();
    public NUEVOREPARACIONES() {
        initComponents();
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
        tipodearreglo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        valorreparacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Idreparacion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        duracion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        observaciones = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        buscarcliente = new javax.swing.JTextField();
        buscarreparaciones = new javax.swing.JButton();
        resultadocliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        tipodearreglo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        tipodearreglo.setText("Tipo de arreglo");
        tipodearreglo.setBorder(null);
        tipodearreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodearregloActionPerformed(evt);
            }
        });

        valorreparacion.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        valorreparacion.setText("valor");
        valorreparacion.setBorder(null);
        valorreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorreparacionActionPerformed(evt);
            }
        });

        Idreparacion.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Idreparacion.setText("Id");
        Idreparacion.setBorder(null);
        Idreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdreparacionActionPerformed(evt);
            }
        });

        duracion.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        duracion.setText("Duracion");
        duracion.setBorder(null);
        duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionActionPerformed(evt);
            }
        });

        observaciones.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        observaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        observaciones.setText("Observaciones");
        observaciones.setBorder(null);
        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });

        buscarcliente.setText("Buscar Cliente");
        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });

        buscarreparaciones.setText("Buscar");

        resultadocliente.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        resultadocliente.setBorder(null);
        resultadocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoclienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(resultadocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(observaciones)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(duracion))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Idreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipodearreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarreparaciones)))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarreparaciones))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipodearreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Idreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(observaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        REPARACIONES U2 = new REPARACIONES();//instancia
        U2.setSize(680, 580);//tamaño
        U2.setLocation(0, 0);

        CONTENEDOR.removeAll();
        CONTENEDOR.add(U2, BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
    }//GEN-LAST:event_btnnuevousuarioActionPerformed

    private void btnnuevomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevomodificarActionPerformed
           try{
          PreparedStatement pps = cn.prepareStatement("insert into reparaciones(id,tipo,valor,duración,observaciones) VALUE(?,?,?,?,?)");
          pps.setString(1, Idreparacion.getText());
          pps.setString(2, tipodearreglo.getText());
          pps.setString(3, valorreparacion.getText());
          pps.setString(4, duracion.getText());
          pps.setString(5, observaciones.getText()); 
          pps.executeUpdate();
          JOptionPane.showMessageDialog(null, "DATOS GUARDADO");
         
            
            REPARACIONES N1 = new REPARACIONES();//instancia
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

    private void valorreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorreparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorreparacionActionPerformed

    private void duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionActionPerformed

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionesActionPerformed

    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarclienteActionPerformed

    private void tipodearregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodearregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodearregloActionPerformed

    private void resultadoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoclienteActionPerformed

    private void IdreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdreparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdreparacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idreparacion;
    private javax.swing.JButton btnnuevomodificar;
    private javax.swing.JButton btnnuevousuario;
    private javax.swing.JTextField buscarcliente;
    private javax.swing.JButton buscarreparaciones;
    private javax.swing.JTextField duracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTextField resultadocliente;
    private javax.swing.JTextField tipodearreglo;
    private javax.swing.JTextField valorreparacion;
    // End of variables declaration//GEN-END:variables
}
