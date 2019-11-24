
package FORMULARIOS;

import static FORMULARIOS.GUIA.CONTENEDOR;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CLIENTE extends javax.swing.JPanel {

    public CLIENTE() {
        initComponents();
        mostrardatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnnuevocliente = new javax.swing.JButton();
        btnmodificarcliente = new javax.swing.JButton();
        btneliminarcliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 159, 217));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/titulo-cliente.png"))); // NOI18N

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
                .addContainerGap(50, Short.MAX_VALUE))
        );

        btnnuevocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/NUEVO-CLIENTE.png"))); // NOI18N
        btnnuevocliente.setBorder(null);
        btnnuevocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoclienteActionPerformed(evt);
            }
        });

        btnmodificarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MODIFICAR-CLIENTE.png"))); // NOI18N
        btnmodificarcliente.setBorder(null);
        btnmodificarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarclienteActionPerformed(evt);
            }
        });

        btneliminarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ELIMINAR-CLIENTE.png"))); // NOI18N
        btneliminarcliente.setBorder(null);
        btneliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarclienteActionPerformed(evt);
            }
        });

        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tablacliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablacliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnnuevocliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btneliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodificarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnnuevocliente)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

        public void mostrardatos(){
        
         conexion con2 = new conexion();
         Connection cn2 = con2.conexion();
           
           String sql ="SELECT * FROM clientes";
           
           Statement  st;
           
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("ID");
            tabla.addColumn("NOMBRE");
            tabla.addColumn("APELLIDO");
            tabla.addColumn("FECHA DE NACIMIENTO");
            tabla.addColumn("TELEFONO");
            tabla.addColumn("DIRRECIÓN");
            tablacliente.setModel(tabla); 
            
              try {
        st =  cn2.createStatement();
        
        
        ResultSet result = st.executeQuery(sql);
        
        while(result.next()){
            
            String [] datos = new String[6];
            datos[0] = result.getString(1);
            datos[1] = result.getString(2);
            datos[2] = result.getString(3);
            datos[3] = result.getString(4);
            datos[4] = result.getString(5);
            datos[5] = result.getString(6);
            tabla.addRow(datos);
        
        }
    } catch (SQLException ex) {
        System.out.println(ex);
    }
       
    }
    
    
    
    
    private void btnnuevoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoclienteActionPerformed

        NUEVOCLIENTE N1 = new NUEVOCLIENTE();//instancia
        N1.setSize(680, 580);//tamaño
        N1.setLocation(0, 0);

        CONTENEDOR.removeAll();
        CONTENEDOR.add(N1, BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
    }//GEN-LAST:event_btnnuevoclienteActionPerformed

    private void btnmodificarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarclienteActionPerformed

        MODIFICARCLIENTE M1 = new MODIFICARCLIENTE();//instancia
        M1.setSize(680, 580);//tamaño
        M1.setLocation(0, 0);

        CONTENEDOR.removeAll();
        CONTENEDOR.add(M1, BorderLayout.CENTER);
        CONTENEDOR.revalidate();
        CONTENEDOR.repaint();
    }//GEN-LAST:event_btnmodificarclienteActionPerformed

    private void btneliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarclienteActionPerformed
        conexion con = new conexion();
        Connection cn = con.conexion();
        
        
        String sql ="SELECT * FROM clientes";
           
        Statement  st;
        
        int fila = tablacliente.getSelectedRow();
        
        String valor= tablacliente.getValueAt(fila, 0).toString();
        if(fila >=0){
            
            try{
                
                PreparedStatement pps= cn.prepareStatement("DELETE FROM clientes WHERE id='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADO");
                mostrardatos();
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
                
            }
        }
    }//GEN-LAST:event_btneliminarclienteActionPerformed

    private void tablaclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclienteMouseClicked

    }//GEN-LAST:event_tablaclienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminarcliente;
    private javax.swing.JButton btnmodificarcliente;
    private javax.swing.JButton btnnuevocliente;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tablacliente;
    // End of variables declaration//GEN-END:variables
}
