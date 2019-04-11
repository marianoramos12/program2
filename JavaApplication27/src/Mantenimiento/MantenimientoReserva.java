/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javaapplication27.PanelFondo;
import javax.swing.JOptionPane;

/**
 *
 * @author ing mariano ramos
 */
public class MantenimientoReserva extends javax.swing.JInternalFrame {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * Creates new form Usuarios
     */
    public MantenimientoReserva() {
        initComponents();
        PanelFondo panel=new PanelFondo(this.screenSize.width,this.screenSize.height);
        this.add(panel,BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIDsaladereserva = new javax.swing.JLabel();
        labelFechadereserva = new javax.swing.JLabel();
        labelIDhorariodereserva = new javax.swing.JLabel();
        textIDreserva = new javax.swing.JTextField();
        textIDEstadodelareserva = new javax.swing.JTextField();
        textFechareserva = new javax.swing.JTextField();
        buttoncancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        labelIDdereserva = new javax.swing.JLabel();
        textIDsaladereserva = new javax.swing.JTextField();
        labelIDclient = new javax.swing.JLabel();
        textIDcliente = new javax.swing.JTextField();
        labelIDestadodereserva = new javax.swing.JLabel();
        textIDhorariodereserva = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("RESERVA ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        labelIDsaladereserva.setText("ID sala de reserva");

        labelFechadereserva.setText("Fecha de reserva");

        labelIDhorariodereserva.setText("ID de horario de reserva");

        textIDreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDreservaActionPerformed(evt);
            }
        });

        textIDEstadodelareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDEstadodelareservaActionPerformed(evt);
            }
        });

        textFechareserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechareservaActionPerformed(evt);
            }
        });

        buttoncancelar.setText("Cancelar");
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar ");

        labelIDdereserva.setText("ID Reserva");

        textIDsaladereserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDsaladereservaActionPerformed(evt);
            }
        });

        labelIDclient.setText("ID Cliente");

        textIDcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDclienteActionPerformed(evt);
            }
        });

        labelIDestadodereserva.setText("ID Estado de la reserva");

        textIDhorariodereserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDhorariodereservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(buttoncancelar)
                        .addGap(33, 33, 33)
                        .addComponent(buttonGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFechadereserva)
                            .addComponent(labelIDclient, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDsaladereserva)
                            .addComponent(labelIDdereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelIDestadodereserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelIDhorariodereserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textIDhorariodereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textIDreserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(textIDEstadodelareserva, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textFechareserva)
                                .addComponent(textIDcliente)
                                .addComponent(textIDsaladereserva)))))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIDreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDdereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIDsaladereserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDsaladereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDclient, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechadereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelIDhorariodereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIDhorariodereserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDestadodereserva, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIDEstadodelareserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoncancelar)
                    .addComponent(buttonGuardar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIDreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDreservaActionPerformed

    private void textIDEstadodelareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDEstadodelareservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDEstadodelareservaActionPerformed

    private void textFechareservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechareservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechareservaActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void textIDsaladereservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDsaladereservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDsaladereservaActionPerformed

    private void textIDclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDclienteActionPerformed

    private void textIDhorariodereservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDhorariodereservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDhorariodereservaActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing
    public void cerrar()
    {   int opcion =  JOptionPane.showConfirmDialog(this,"Desea Salir?",this.getTitle(),JOptionPane.YES_NO_OPTION);
        if(opcion==0)
            dispose();
    
    }
    public void centrar()
    {
        this.setLocation(this.getParent().getWidth()/2 - this.getWidth()/2 ,this.getParent().getHeight()/2 - this.getHeight()/2 - 20);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JLabel labelFechadereserva;
    private javax.swing.JLabel labelIDclient;
    private javax.swing.JLabel labelIDdereserva;
    private javax.swing.JLabel labelIDestadodereserva;
    private javax.swing.JLabel labelIDhorariodereserva;
    private javax.swing.JLabel labelIDsaladereserva;
    private javax.swing.JTextField textFechareserva;
    private javax.swing.JTextField textIDEstadodelareserva;
    private javax.swing.JTextField textIDcliente;
    private javax.swing.JTextField textIDhorariodereserva;
    private javax.swing.JTextField textIDreserva;
    private javax.swing.JTextField textIDsaladereserva;
    // End of variables declaration//GEN-END:variables
}