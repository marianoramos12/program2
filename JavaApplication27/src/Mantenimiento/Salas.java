/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

/**
 *
 * @author ing mariano ramos
 */
public class Salas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
     */
    public Salas() {
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

        textIDsala = new javax.swing.JTextField();
        buttoncancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        labelIDsala = new javax.swing.JLabel();
        labelDescripciondesala = new javax.swing.JLabel();
        textNombresala = new javax.swing.JTextField();
        labelNombresala = new javax.swing.JLabel();
        textIDlocalizacionsala = new javax.swing.JTextField();
        labelIDlocalizacionsala = new javax.swing.JLabel();
        textDescripcionsala = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("LOCALIZACION ");
        setToolTipText("");

        textIDsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDsalaActionPerformed(evt);
            }
        });

        buttoncancelar.setText("Cancelar");
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar ");

        labelIDsala.setText("ID de sala");

        labelDescripciondesala.setText("Descripcion de sala");

        textNombresala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombresalaActionPerformed(evt);
            }
        });

        labelNombresala.setText("Nombre de sala");

        textIDlocalizacionsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDlocalizacionsalaActionPerformed(evt);
            }
        });

        labelIDlocalizacionsala.setText("ID de localización de sala");

        textDescripcionsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescripcionsalaActionPerformed(evt);
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
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelIDlocalizacionsala)
                            .addComponent(labelDescripciondesala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombresala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDsala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIDsala, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(textNombresala, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(textIDlocalizacionsala, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(textDescripcionsala, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIDsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDsala, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombresala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombresala, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescripciondesala, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDescripcionsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDlocalizacionsala, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIDlocalizacionsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoncancelar)
                    .addComponent(buttonGuardar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIDsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDsalaActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void textNombresalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombresalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombresalaActionPerformed

    private void textIDlocalizacionsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDlocalizacionsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDlocalizacionsalaActionPerformed

    private void textDescripcionsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescripcionsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescripcionsalaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JLabel labelDescripciondesala;
    private javax.swing.JLabel labelIDlocalizacionsala;
    private javax.swing.JLabel labelIDsala;
    private javax.swing.JLabel labelNombresala;
    private javax.swing.JTextField textDescripcionsala;
    private javax.swing.JTextField textIDlocalizacionsala;
    private javax.swing.JTextField textIDsala;
    private javax.swing.JTextField textNombresala;
    // End of variables declaration//GEN-END:variables
}
