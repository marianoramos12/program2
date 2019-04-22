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
public class MantenimientoHorariosActividades extends javax.swing.JInternalFrame {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    /**
     * Creates new form Usuarios
     */
    public MantenimientoHorariosActividades() {
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

        textIDhorariodeactividad = new javax.swing.JTextField();
        buttoncancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        labelIDhorariodeactividad = new javax.swing.JLabel();
        labelHoradeactividad = new javax.swing.JLabel();
        textDiadeactividad = new javax.swing.JTextField();
        labelNombredeactividad = new javax.swing.JLabel();
        textIDactividad = new javax.swing.JTextField();
        labelIDactividad = new javax.swing.JLabel();
        textHoradeactividad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("HORARIO DE ACTIVIDADES");
        setToolTipText("");
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

        textIDhorariodeactividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDhorariodeactividadActionPerformed(evt);
            }
        });

        buttoncancelar.setText("Cancelar");
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar ");

        labelIDhorariodeactividad.setText("ID de horario de actividad");

        labelHoradeactividad.setText("Hora de actividad");

        textDiadeactividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDiadeactividadActionPerformed(evt);
            }
        });

        labelNombredeactividad.setText("Dia de actividad");

        textIDactividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDactividadActionPerformed(evt);
            }
        });

        labelIDactividad.setText("ID de actividad");

        textHoradeactividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHoradeactividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIDhorariodeactividad)
                            .addComponent(labelHoradeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIDhorariodeactividad, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(textDiadeactividad, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(textIDactividad, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(textHoradeactividad, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(buttoncancelar)
                                .addGap(33, 33, 33)
                                .addComponent(buttonGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(labelNombredeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIDhorariodeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDhorariodeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDiadeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombredeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHoradeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHoradeactividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIDactividad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDactividad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoncancelar)
                    .addComponent(buttonGuardar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIDhorariodeactividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDhorariodeactividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDhorariodeactividadActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void textDiadeactividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDiadeactividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDiadeactividadActionPerformed

    private void textIDactividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDactividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDactividadActionPerformed

    private void textHoradeactividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHoradeactividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHoradeactividadActionPerformed

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
    private javax.swing.JLabel labelHoradeactividad;
    private javax.swing.JLabel labelIDactividad;
    private javax.swing.JLabel labelIDhorariodeactividad;
    private javax.swing.JLabel labelNombredeactividad;
    private javax.swing.JTextField textDiadeactividad;
    private javax.swing.JTextField textHoradeactividad;
    private javax.swing.JTextField textIDactividad;
    private javax.swing.JTextField textIDhorariodeactividad;
    // End of variables declaration//GEN-END:variables
}
