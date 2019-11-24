package FORMULARIOS;

import static FORMULARIOS.GUIA.CONTENEDOR;
import static FORMULARIOS.USUARIO.tablausuario;
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

public class REPARACIONES extends javax.swing.JPanel {

  
    public REPARACIONES() {
        initComponents();
        mostrardatos();
        
    }

        public void mostrardatos(){
        
         conexion con1 = new conexion();
         Connection cn1 = con1.conexion();
           
           String sql ="SELECT * FROM reparaciones";
           
           Statement  st;
           
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("ID");
            tabla.addColumn("TIPO DE ARREGLO");
            tabla.addColumn("VALOR");
            tabla.addColumn("DURACION GARANTIA");
            tabla.addColumn("OBSERVACIONES");
            tablareparaciones.setModel(tabla); 
            
              try {
        st =  cn1.createStatement();
        
        
        ResultSet result = st.executeQuery(sql);
        
        while(result.next()){
            
            String [] datos = new String[5];
            datos[0] = result.getString(1);
            datos[1] = result.getString(2);
            datos[2] = result.getString(3);
            datos[3] = result.getString(4);
            datos[4] = result.getString(5);
            tabla.addRow(datos);
        
        }
    } catch (SQLException ex) {
        Logger.getLogger(NUEVOUSUARIO.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnnuevoreparacion = new javax.swing.JButton();
        btnmodificarreparacion = new javax.swing.JButton();
        btnelimarreparacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablareparaciones = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 159, 217));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/titulo-reparaciones.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        btnnuevoreparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/NUEVA-REPARACION.png"))); // NOI18N
        btnnuevoreparacion.setBorder(null);
        btnnuevoreparacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnuevoreparacionMouseClicked(evt);
            }
        });
        btnnuevoreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoreparacionActionPerformed(evt);
            }
        });

        btnmodificarreparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MODIFICAR-REPARACION.png"))); // NOI18N
        btnmodificarreparacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmodificarreparacionMouseClicked(evt);
            }
        });
        btnmodificarreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarreparacionActionPerformed(evt);
            }
        });

        btnelimarreparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ELIMINAR-REPARACIÓN.png"))); // NOI18N
        btnelimarreparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimarreparacionActionPerformed(evt);
            }
        });

        tablareparaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tablareparaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablareparacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablareparaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnuevoreparacion)
                        .addGap(12, 12, 12)
                        .addComponent(btnmodificarreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnelimarreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnelimarreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificarreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevoreparacion))
                .addGap(0, 165, Short.MAX_VALUE))
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

    private void btnnuevoreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoreparacionActionPerformed
        
        NUEVOREPARACIONES N2 = new NUEVOREPARACIONES();//instancia
        N2.setSize(680, 580);//tamaño
        N2.setLocation(0, 0);

        CONTENEDOR.removeAll();
        CONTENEDOR.add(N2, BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
     
        
    }//GEN-LAST:event_btnnuevoreparacionActionPerformed

    private void btnmodificarreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarreparacionActionPerformed
        

       
    }//GEN-LAST:event_btnmodificarreparacionActionPerformed

    private void btnelimarreparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimarreparacionActionPerformed
         conexion con = new conexion();
        Connection cn = con.conexion();
        String sql ="SELECT * FROM reparaciones";
           
        Statement  st;
        
        int fila = tablareparaciones.getSelectedRow();
        
        String valor= tablareparaciones.getValueAt(fila, 0).toString();
        if(fila >=0){
            
            try{
                
                PreparedStatement pps= cn.prepareStatement("DELETE FROM reparaciones WHERE id='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADO");
                mostrardatos();
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
                
            }
        }
    }//GEN-LAST:event_btnelimarreparacionActionPerformed

    private void btnnuevoreparacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnuevoreparacionMouseClicked
      
         
    }//GEN-LAST:event_btnnuevoreparacionMouseClicked

    private void btnmodificarreparacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodificarreparacionMouseClicked
        
        MODIFICARREPARACIONES M2 = new MODIFICARREPARACIONES();//instancia
        M2.setSize(680, 580);//tamaño
        M2.setLocation(0, 0);

        CONTENEDOR.removeAll();
        CONTENEDOR.add(M2, BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
    }//GEN-LAST:event_btnmodificarreparacionMouseClicked

    private void tablareparacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablareparacionesMouseClicked

    }//GEN-LAST:event_tablareparacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnelimarreparacion;
    private javax.swing.JButton btnmodificarreparacion;
    private javax.swing.JButton btnnuevoreparacion;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablareparaciones;
    // End of variables declaration//GEN-END:variables
}
