
package FORMULARIOS;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class INFORME extends javax.swing.JPanel {

    
        conexion con = new conexion();
        Connection cn = con.conexion();
        ResultSet rs;
        
        
    public INFORME() {
        initComponents();
        panelinforme.setVisible(false);
        buscador();
      
        
    }


    public void buscador(){
    
        String buscador;
        buscador = buscarinforme.getText();
        
        if(buscador == "hola"){
        
             JOptionPane.showMessageDialog(null, "esribistes hola");
             
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        buscarinforme = new javax.swing.JTextField();
        btnbuscarinforme = new javax.swing.JButton();
        panelinforme = new javax.swing.JPanel();
        labelid = new javax.swing.JLabel();
        mostrarid = new javax.swing.JTextField();
        labelnombre = new javax.swing.JLabel();
        mostrarnombre = new javax.swing.JTextField();
        mostrartelefono = new javax.swing.JTextField();
        labeltelefono = new javax.swing.JLabel();
        mostrardireccion = new javax.swing.JTextField();
        labeldireccion = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 159, 217));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/titulo-informe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        buscarinforme.setText("Buscar cliente");
        buscarinforme.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        buscarinforme.setBounds(new java.awt.Rectangle(20, 20, 20, 20));
        buscarinforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buscarinformeMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarinformeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarinformeMouseExited(evt);
            }
        });
        buscarinforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarinformeActionPerformed(evt);
            }
        });

        btnbuscarinforme.setText("Buscar");
        btnbuscarinforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarinformeActionPerformed(evt);
            }
        });

        labelid.setText("IDENTIFICACION:");

        mostrarid.setText("jTextField1");

        labelnombre.setText("NOMBRE:");

        mostrarnombre.setText("jTextField1");

        mostrartelefono.setText("jTextField1");

        labeltelefono.setText("TELEFONO:");

        mostrardireccion.setText("jTextField1");

        labeldireccion.setText("DIRECCION:");

        javax.swing.GroupLayout panelinformeLayout = new javax.swing.GroupLayout(panelinforme);
        panelinforme.setLayout(panelinformeLayout);
        panelinformeLayout.setHorizontalGroup(
            panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformeLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelinformeLayout.createSequentialGroup()
                        .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelnombre)
                            .addComponent(labelid))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelinformeLayout.createSequentialGroup()
                        .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labeldireccion)
                            .addComponent(labeltelefono))
                        .addGap(18, 18, 18)))
                .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mostrartelefono)
                        .addComponent(mostrarid)
                        .addComponent(mostrarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrardireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelinformeLayout.setVerticalGroup(
            panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinformeLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrartelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeltelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelinformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrardireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldireccion))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelinforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarinforme, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarinforme)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarinforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarinforme))
                .addGap(67, 67, 67)
                .addComponent(panelinforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void buscarinformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarinformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarinformeActionPerformed

    private void btnbuscarinformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarinformeActionPerformed
       
        
       try{
         
           //busqueda
          PreparedStatement pps = cn.prepareStatement("SELECT * FROM informe WHERE id_cliente = ?");
          pps.setString(1, buscarinforme.getText());
        
          rs = pps.executeQuery();
          
          
          if(rs.next()){
              
          mostrarid.setText(rs.getString("id"));
          mostrarnombre.setText(rs.getString("nombre"));
          mostrardireccion.setText(rs.getString("direccion"));
         
          }else{
            JOptionPane.showMessageDialog(null, "no existe esa persona");
          }
         
         
            
        }catch (SQLException ex){
        
        JOptionPane.showMessageDialog(null, ex);
        
        }
    
    
    
    
    }//GEN-LAST:event_btnbuscarinformeActionPerformed

    private void buscarinformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarinformeMouseClicked
        buscarinforme.setText("");
    }//GEN-LAST:event_buscarinformeMouseClicked

    private void buscarinformeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarinformeMouseExited
        
    }//GEN-LAST:event_buscarinformeMouseExited

    private void buscarinformeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarinformeMouseReleased
     
    }//GEN-LAST:event_buscarinformeMouseReleased
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarinforme;
    private javax.swing.JTextField buscarinforme;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labeldireccion;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JTextField mostrardireccion;
    private javax.swing.JTextField mostrarid;
    private javax.swing.JTextField mostrarnombre;
    private javax.swing.JTextField mostrartelefono;
    private javax.swing.JPanel panelinforme;
    // End of variables declaration//GEN-END:variables
}
