/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos;

/**
 *
 * @author ing mariano ramos
 */
public class Detalle_Cuota extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cobros
     */
    public Detalle_Cuota() {
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

        jTextField3 = new javax.swing.JTextField();
        LabelIDcuota = new javax.swing.JLabel();
        LabelSecciondecuota = new javax.swing.JLabel();
        LabelConceptodecobro = new javax.swing.JLabel();
        jLabelIDcuota = new javax.swing.JLabel();
        TextFieldIDcuot = new javax.swing.JTextField();
        TextFieldConceptocobro = new javax.swing.JTextField();
        jTextFieldSeccioncuota = new javax.swing.JTextField();
        TextFieldIDcuota = new javax.swing.JTextField();
        ButtonCancelar = new javax.swing.JButton();
        ButtonAceptar = new javax.swing.JButton();

        jTextField3.setText("jTextField1");

        setBackground(new java.awt.Color(255, 204, 0));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("COBROS");

        LabelIDcuota.setText("ID de cuota");

        LabelSecciondecuota.setText("Seccion de cuota");

        LabelConceptodecobro.setText("Concepto de cobro");

        jLabelIDcuota.setText("ID de la cuota");

        TextFieldConceptocobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldConceptocobroActionPerformed(evt);
            }
        });

        jTextFieldSeccioncuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSeccioncuotaActionPerformed(evt);
            }
        });

        TextFieldIDcuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIDcuotaActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ButtonAceptar.setText("Aceptar");
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelSecciondecuota)
                            .addComponent(LabelIDcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSeccioncuota, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(TextFieldIDcuota)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelConceptodecobro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldConceptocobro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIDcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldIDcuot, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonCancelar)
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(290, Short.MAX_VALUE)
                    .addComponent(ButtonAceptar)
                    .addGap(28, 28, 28)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIDcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldIDcuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSecciondecuota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSeccioncuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelConceptodecobro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldConceptocobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDcuota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldIDcuot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(ButtonCancelar)
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(178, Short.MAX_VALUE)
                    .addComponent(ButtonAceptar)
                    .addGap(55, 55, 55)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldConceptocobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldConceptocobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldConceptocobroActionPerformed

    private void jTextFieldSeccioncuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSeccioncuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSeccioncuotaActionPerformed

    private void TextFieldIDcuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIDcuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIDcuotaActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JLabel LabelConceptodecobro;
    private javax.swing.JLabel LabelIDcuota;
    private javax.swing.JLabel LabelSecciondecuota;
    private javax.swing.JTextField TextFieldConceptocobro;
    private javax.swing.JTextField TextFieldIDcuot;
    private javax.swing.JTextField TextFieldIDcuota;
    private javax.swing.JLabel jLabelIDcuota;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldSeccioncuota;
    // End of variables declaration//GEN-END:variables
}
