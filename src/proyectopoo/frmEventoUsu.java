/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class frmEventoUsu extends javax.swing.JFrame {

    /**
     * Creates new form frmEvento
     * 
     * 
     * @param args
     */
    
    public frmEventoUsu() {
       initComponents();
        
    }    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnArea = new javax.swing.JButton();
        btnAmbi = new javax.swing.JButton();
        btnEntreten = new javax.swing.JButton();
        btnPaquetes = new javax.swing.JButton();
        cmbEventos = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        cmbDia = new javax.swing.JComboBox<String>();
        cmbMes = new javax.swing.JComboBox<String>();
        cmbAño = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox();
        cmbMusica = new javax.swing.JComboBox();
        cmbIlumina = new javax.swing.JComboBox();
        cmbPaquete = new javax.swing.JComboBox();
        cmbAnimador = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNumP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMesas = new javax.swing.JTextField();
        txtSillas = new javax.swing.JTextField();
        cmbBocinas = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cmbTipoA = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();

        jLabel7.setText("Tipo:");

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Evento:");

        jLabel2.setText("Fecha del evento:");

        btnArea.setText("Ver Áreas");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnAmbi.setText("Ver Ambientación");
        btnAmbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbiActionPerformed(evt);
            }
        });

        btnEntreten.setText("Ver Entretenimiento");
        btnEntreten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntretenActionPerformed(evt);
            }
        });

        btnPaquetes.setText("Ver Paquetes");
        btnPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaquetesActionPerformed(evt);
            }
        });

        cmbEventos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Graduación", "XV Años", "Boda", "Bautizo", "Despedida de Soltera(o)", "Fiesta Infantil" }));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes:", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));

        cmbAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año:", "2016", "2017", "2018" }));

        jLabel3.setText("Área:");

        jLabel4.setText("Entretenimiento:");

        jLabel5.setText("Ambientación:");

        jLabel6.setText("Paquetes:");

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Interior", "Exterior", "Mixto" }));
        cmbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAreaActionPerformed(evt);
            }
        });

        cmbMusica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musica:", "DJ", "Banda", "Grupo Versátil" }));
        cmbMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMusicaActionPerformed(evt);
            }
        });

        cmbIlumina.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Iluminación:", "Robótica", "Estroboscopica", "LED", "Bola Disco" }));
        cmbIlumina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIluminaActionPerformed(evt);
            }
        });

        cmbPaquete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Paquete 1", "Paquete 2", "Paquete 3", "Paquete 4", "Paquete 5" }));

        cmbAnimador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animador:", "Locutor", "Dj", "Payaso", "Strippers" }));
        cmbAnimador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnimadorActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo:");

        btnCancel.setText("Limpiar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel9.setText("Personas que asistiran:");

        jLabel10.setText("Mobiliario:");

        jLabel11.setText("Mesas:");

        cmbBocinas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bocinas:", "2", "4", "6", "8" }));

        jLabel12.setText("Sillas:");

        cmbTipoA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione:", "Nocturna", "Viejo Oeste", "Clásico" }));
        cmbTipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoAActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnFecha.setText("Verificar Fecha");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbMusica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbTipoA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cmbIlumina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cmbAnimador, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSillas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbBocinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAmbi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPaquetes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntreten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cmbEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(btnFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnCancel)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFecha))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumP))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBocinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMusica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAnimador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntreten))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(cmbIlumina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAmbi)
                    .addComponent(cmbTipoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaquetes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancel)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        frmArea frm = new frmArea();
        frm.setLocationRelativeTo(frm);
        frm.setTitle("Area");
        frm.setVisible(true);
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnAmbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbiActionPerformed
        frmAmbientacion frm = new frmAmbientacion();
        frm.setLocationRelativeTo(frm);
        frm.setTitle("Ambientación");
        frm.setVisible(true);
    }//GEN-LAST:event_btnAmbiActionPerformed

    private void btnEntretenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntretenActionPerformed
        frmEntretenimiento frm = new frmEntretenimiento();
        frm.setLocationRelativeTo(frm);
        frm.setTitle("Entretenimiento");
        frm.setVisible(true);
    }//GEN-LAST:event_btnEntretenActionPerformed

    private void btnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaquetesActionPerformed
        try {
            frmPaquete frm = new frmPaquete();
            frm.setLocationRelativeTo(frm);
            frm.setTitle("Paquetes Disponibles");
            frm.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmEventoUsu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmEventoUsu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPaquetesActionPerformed
    int area_id, ambientacion_id, entretenimiento_id;
    double costo_area, costo_ambi, costo_entreten;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        try {
            Conexion cnn = new Conexion();
            String evento = cmbEventos.getSelectedItem().toString();
            String dia = cmbDia.getSelectedItem().toString();
            String mes = String.valueOf(cmbMes.getSelectedIndex());
            String año = cmbAño.getSelectedItem().toString();
            int personas = Integer.parseInt(txtNumP.getText());
            AsignarID();
            double costo_total=costo_area+costo_ambi+costo_entreten;
            String query = "insert into evento(Evento_nom,Evento_fecha,numPersonas,idEntreten,idAmbi,idArea,costoTotal) values('" + evento + "'"
                    +", '" + año + "-" + mes + "-" + dia + "'"
                    +", '" + personas + "'"
                    +", " + entretenimiento_id + ""
                    +", " + ambientacion_id + ""        
                    +", " + area_id + ""        
                    +", '" + costo_total + "')" ;
            Conexion.sentencia = Conexion.conexion.createStatement();
            Conexion.sentencia.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(frmEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(frmEventoUsu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cmbAño.setSelectedItem("Año:");
        cmbMes.setSelectedItem("Mes:");
        cmbDia.setSelectedItem("Dia:");
        cmbEventos.setSelectedItem("Seleccione:");
        cmbIlumina.setSelectedItem("Ilimunación:");
        cmbAnimador.setSelectedItem("Animador:");
        cmbMusica.setSelectedItem("Musica:");
        cmbPaquete.setSelectedItem("Seleccione:");
        cmbTipoA.setSelectedItem("Seleccione:");
        cmbArea.setSelectedItem("Seleccione:");
        txtMesas.setText("");
        txtSillas.setText("");
        cmbBocinas.setSelectedItem("Bocinas:");
        txtNumP.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        cmbAño.setSelectedItem("Año:");
        cmbMes.setSelectedItem("Mes:");
        cmbDia.setSelectedItem("Dia:");
        cmbEventos.setSelectedItem("Seleccione:");
        cmbIlumina.setSelectedItem("Ilimunación:");
        cmbAnimador.setSelectedItem("Animador:");
        cmbMusica.setSelectedItem("Musica:");
        cmbPaquete.setSelectedItem("Seleccione:");
        cmbTipoA.setSelectedItem("Seleccione:");
        cmbArea.setSelectedItem("Seleccione:");
        txtMesas.setText("");
        txtSillas.setText("");
        cmbBocinas.setSelectedItem("Bocinas:");
        txtNumP.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed
    int area;
    private void cmbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAreaActionPerformed
        area = cmbArea.getSelectedIndex();
        if(area ==0){
            JOptionPane.showMessageDialog(this, "Seleccione un area por favor");
        }
        area = cmbArea.getSelectedIndex();
        switch(area){
            case 1: 
                area_id = 1;
                costo_area = 3000;
            break;
            
            case 2:
                area_id = 2;
                costo_area = 4000;
            break;
                
            case 3:
                area_id = 3;
                costo_area = 6500;
            break;
        }
    }//GEN-LAST:event_cmbAreaActionPerformed
    int musica, animador;
    private void cmbMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMusicaActionPerformed
        musica = cmbMusica.getSelectedIndex();
    }//GEN-LAST:event_cmbMusicaActionPerformed
    int iluminacion, TipoA;
    private void cmbTipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoAActionPerformed
        TipoA = cmbTipoA.getSelectedIndex();
    }//GEN-LAST:event_cmbTipoAActionPerformed

    private void cmbAnimadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnimadorActionPerformed
        animador = cmbAnimador.getSelectedIndex();
    }//GEN-LAST:event_cmbAnimadorActionPerformed

    private void cmbIluminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIluminaActionPerformed
        iluminacion = cmbIlumina.getSelectedIndex();
    }//GEN-LAST:event_cmbIluminaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmLogin frm = new frmLogin();
        frm.setLocationRelativeTo(frm);
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
        Conexion con = new Conexion();
        try {
            String mes = String.valueOf(cmbMes.getSelectedIndex());
            String consultas = "select `Evento_fecha` from `evento` where `Evento_fecha` = '"+cmbAño.getSelectedItem()+"-"+mes+"-"+cmbDia.getSelectedItem()+"'";
            proyectopoo.Conexion.sentencia = proyectopoo.Conexion.conexion.createStatement();
            ResultSet rss = proyectopoo.Conexion.sentencia.executeQuery(consultas);
            if(rss.next()){
                JOptionPane.showMessageDialog(rootPane, "Esta fecha esta apartada");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Esta fecha esta libre");
            }
        }catch(SQLException ex){

        }
    }//GEN-LAST:event_btnFechaActionPerformed

    private void AsignarID(){
        switch(musica){
            case 1:
                if(animador == 1){
                    entretenimiento_id = 1;
                    costo_entreten = 5000;
                }else if(animador == 2){
                    entretenimiento_id = 4;
                    costo_entreten = 4500;
                }else if(animador == 3){
                    entretenimiento_id = 7;
                    costo_entreten = 3000;
                }else if(animador == 4){
                    entretenimiento_id = 10;
                    costo_entreten = 5000;
                }
            break;
            case 2:
                if(animador == 1){
                    entretenimiento_id = 2;
                    costo_entreten = 6000;
                }else if(animador == 2){
                    entretenimiento_id = 5;
                    costo_entreten = 5000;
                }else if(animador == 3){
                    entretenimiento_id = 8;
                    costo_entreten = 2500;
                }else if(animador == 4){
                    entretenimiento_id = 11;
                    costo_entreten = 4000;
                }
            break;
            case 3:
                if(animador == 1){
                    entretenimiento_id = 3;
                    costo_entreten = 4000;
                }else if(animador == 2){
                    entretenimiento_id = 6;
                    costo_entreten = 3500;
                }else if(animador == 3){
                    entretenimiento_id = 9;
                    costo_entreten = 2500;
                }else if(animador == 4){
                    entretenimiento_id = 12;
                    costo_entreten = 3500;
                }
            break;
                
        }
        switch(TipoA){
            case 1:
                if(iluminacion == 1){
                    ambientacion_id = 1;
                    costo_ambi = 6000;
                }else if(iluminacion == 2){
                    ambientacion_id = 2;
                    costo_ambi = 6500;
                }else if(iluminacion == 3){
                    ambientacion_id = 3;
                    costo_ambi = 5000;
                }else if(iluminacion == 4){
                    ambientacion_id = 4;
                    costo_ambi = 5000;
                }
            break;
            case 2:
                if(iluminacion == 1){
                    ambientacion_id = 5;
                    costo_ambi = 4000;
                }else if(iluminacion == 2){
                    ambientacion_id = 6;
                    costo_ambi = 4000;
                }else if(iluminacion == 3){
                    ambientacion_id = 7;
                    costo_ambi = 3500;
                }else if(iluminacion == 4){
                    ambientacion_id = 8;
                    costo_ambi = 3500;
                }
            break;
            case 3:
                if(iluminacion == 1){
                    ambientacion_id = 9;
                    costo_ambi = 4500;
                }else if(iluminacion == 2){
                    ambientacion_id = 10;
                    costo_ambi = 4500;
                }else if(iluminacion == 3){
                    ambientacion_id = 11;
                    costo_ambi = 4500;
                }else if(iluminacion == 4){
                    ambientacion_id = 12;
                    costo_ambi = 5000;
                }
            break;
                
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbi;
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEntreten;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPaquetes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbAnimador;
    private javax.swing.JComboBox cmbArea;
    private javax.swing.JComboBox<String> cmbAño;
    private javax.swing.JComboBox cmbBocinas;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox cmbEventos;
    private javax.swing.JComboBox cmbIlumina;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JComboBox cmbMusica;
    private javax.swing.JComboBox cmbPaquete;
    private javax.swing.JComboBox cmbTipoA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMesas;
    private javax.swing.JTextField txtNumP;
    private javax.swing.JTextField txtSillas;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
