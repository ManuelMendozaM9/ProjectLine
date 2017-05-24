/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel
 */
public class frmInventario extends javax.swing.JFrame {

    /**
     * Creates new form frmInventario
     */
    public frmInventario() throws SQLException, ClassNotFoundException {
        initComponents();
        
        Conexion cnn = new Conexion();
        try{
          
        String consulta = "select * from mobiliario_inventario";
        proyectopoo.Conexion.sentencia = proyectopoo.Conexion.conexion.createStatement();
        ResultSet rs = proyectopoo.Conexion.sentencia.executeQuery(consulta);
        rs.next();
            DefaultTableModel modelo = (DefaultTableModel) tblInvent.getModel();
            while(rs.next()){
                Object[] fila = new Object[3];
                for (int i=0;i < fila.length; i++){
                    fila[i]=rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }
            tblInvent.setModel(modelo);
        }catch(SQLException ex){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            frmVerEventos1 = new proyectopoo.frmVerEventos();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        } catch (java.lang.ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        btnCancelar = new javax.swing.JButton();
        btnEventosVer = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvent = new javax.swing.JTable();

        btnCancelar.setText("Cerrar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEventosVer.setText("Eventos");
        btnEventosVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventosVerActionPerformed(evt);
            }
        });

        tblInvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Apartado"
            }
        ));
        jScrollPane1.setViewportView(tblInvent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEventosVer)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnEventosVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEventosVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosVerActionPerformed
        try {
            frmVerEventos frm = new frmVerEventos();
            frm.setTitle("Registro");
            frm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEventosVerActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnEventosVer;
    private proyectopoo.frmVerEventos frmVerEventos1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInvent;
    // End of variables declaration//GEN-END:variables

    private void frmsetTitle(String registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}