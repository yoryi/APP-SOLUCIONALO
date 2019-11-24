
package FORMULARIOS;

import static FORMULARIOS.GUIA.CONTENEDOR;
import static FORMULARIOS.MODIFICARUSUARIO.nombreusuariomod;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class USUARIO extends javax.swing.JPanel {

    public USUARIO() {
        initComponents();
        mostrardatos();
       
        
    }     

    public void mostrardatos(){
        
         conexion con1 = new conexion();
           Connection cn1 = con1.conexion();
           String sql ="SELECT * FROM usuario";
           
           Statement  st;
           
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("ID");
            tabla.addColumn("NOMBRE");
            tabla.addColumn("APELLIDO");
            tabla.addColumn("FECHA DE NACIMIENTO");
            tabla.addColumn("TELEFONO");
            tabla.addColumn("DIRRECIÓN");
            tabla.addColumn("EDAD");
            tabla.addColumn("ROL");
            tablausuario.setModel(tabla); 
            
              try {
        st =  cn1.createStatement();
        
        
        ResultSet result = st.executeQuery(sql);
        
        while(result.next()){
            
            String [] datos = new String[8];
            datos[0] = result.getString(1);
            datos[1] = result.getString(2);
            datos[2] = result.getString(3);
            datos[3] = result.getString(4);
            datos[4] = result.getString(5);
            datos[5] = result.getString(6);
            datos[6] = result.getString(7);
            datos[7] = result.getString(8);
            tabla.addRow(datos);
        
        }
    } catch (SQLException ex) {
        Logger.getLogger(NUEVOUSUARIO.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
    
    
    public void modificar(){
        
        
        
        
        int fila = tablausuario.getSelectedRow();
        if(fila>=0){
        
     
        String nombre = (String)tablausuario.getValueAt(fila, 1);
        
        
        nombreusuariomod.setText(nombre);
        
        
        
        
        
       
  
       
        
    }
             
      else{
             
        JOptionPane.showMessageDialog(null, "FILA NO SELECIONADA");
            
          }
            
    }
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuario = new javax.swing.JTable();
        btnnuevomodificar = new javax.swing.JButton();
        btneliminarusuario = new javax.swing.JButton();
        btnnuevousuario = new javax.swing.JButton();
        mostrar = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 159, 217));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Reguistro de Usuarios.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tablausuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tablausuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuario);

        btnnuevomodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BTN-MODIFICAR.png"))); // NOI18N
        btnnuevomodificar.setBorder(null);
        btnnuevomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevomodificarActionPerformed(evt);
            }
        });

        btneliminarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BTN-ELIMINAR.png"))); // NOI18N
        btneliminarusuario.setBorder(null);
        btneliminarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarusuarioActionPerformed(evt);
            }
        });

        btnnuevousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BTN-NUEVO.png"))); // NOI18N
        btnnuevousuario.setBorder(null);
        btnnuevousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevousuarioActionPerformed(evt);
            }
        });

        mostrar.setText("hola");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnuevousuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnuevomodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnnuevomodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(btnnuevousuario)
                    .addComponent(btneliminarusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevomodificarActionPerformed
        
            modificar();
           
                 
            
    }//GEN-LAST:event_btnnuevomodificarActionPerformed

    private void btneliminarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarusuarioActionPerformed
        conexion con = new conexion();
        Connection cn = con.conexion();
        String sql ="SELECT * FROM usuario";
           
        Statement  st;
    
        int fila = tablausuario.getSelectedRow();
        
        String valor= tablausuario.getValueAt(fila, 0).toString();
        if(fila >=0){
            
            try{
                
                PreparedStatement pps= cn.prepareStatement("DELETE FROM usuario WHERE id='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADO");
                mostrardatos();
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
                
            }
        }
    }//GEN-LAST:event_btneliminarusuarioActionPerformed

    private void btnnuevousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevousuarioActionPerformed
        
            NUEVOUSUARIO N1 = new NUEVOUSUARIO();//instancia
            N1.setSize(680, 580);//tamaño
            N1.setLocation(0, 0);

            CONTENEDOR.removeAll();
            CONTENEDOR.add(N1, BorderLayout.CENTER);
            CONTENEDOR.revalidate();
            CONTENEDOR.repaint();
    }//GEN-LAST:event_btnnuevousuarioActionPerformed

    private void tablausuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuarioMouseClicked
            
         
    }//GEN-LAST:event_tablausuarioMouseClicked

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminarusuario;
    private javax.swing.JButton btnnuevomodificar;
    private javax.swing.JButton btnnuevousuario;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mostrar;
    public static javax.swing.JTable tablausuario;
    // End of variables declaration//GEN-END:variables
}
