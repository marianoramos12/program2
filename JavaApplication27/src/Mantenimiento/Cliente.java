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
public class Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
     */
    public Cliente() {
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

        labelNombre = new javax.swing.JLabel();
        labelSegundoApellido = new javax.swing.JLabel();
        labelDirección = new javax.swing.JLabel();
        textfieldIDcliente = new javax.swing.JTextField();
        textfieldDireccion = new javax.swing.JTextField();
        textfieldSegundoApellido = new javax.swing.JTextField();
        buttoncancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        labelIDcliente = new javax.swing.JLabel();
        textNombr = new javax.swing.JTextField();
        labelPrimerapellido = new javax.swing.JLabel();
        textfieldPrimerApellido = new javax.swing.JTextField();
        labelFechanacimiento = new javax.swing.JLabel();
        textfieldFechanacimiento = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        LabelCelular = new javax.swing.JLabel();
        textfieldTelefono = new javax.swing.JTextField();
        textfieldCelular = new javax.swing.JTextField();
        LabelFecha = new javax.swing.JLabel();
        TextFieldFecha = new javax.swing.JTextField();
        LabelStatuscliente = new javax.swing.JLabel();
        LabelTipocliente = new javax.swing.JLabel();
        TextFieldTipocliente = new javax.swing.JTextField();
        LabelCorreo = new javax.swing.JLabel();
        TextFieldBalance = new javax.swing.JTextField();
        LabelCuota = new javax.swing.JLabel();
        TextFieldCorreo = new javax.swing.JTextField();
        LabelBalance = new javax.swing.JLabel();
        TextFieldCuota = new javax.swing.JTextField();
        RadioButtonInactivo = new javax.swing.JRadioButton();
        RadioButtonActivo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ENTRENADOR");

        labelNombre.setText("Nombre ");

        labelSegundoApellido.setText("Segundo Apellido");

        labelDirección.setText("Dirección");

        textfieldIDcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldIDclienteActionPerformed(evt);
            }
        });

        textfieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldDireccionActionPerformed(evt);
            }
        });

        textfieldSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldSegundoApellidoActionPerformed(evt);
            }
        });

        buttoncancelar.setText("Cancelar");
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar ");

        labelIDcliente.setText("ID Cliente");

        textNombr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombrActionPerformed(evt);
            }
        });

        labelPrimerapellido.setText("Primer Apellido");

        textfieldPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldPrimerApellidoActionPerformed(evt);
            }
        });

        labelFechanacimiento.setText("Fecha de nacimiento");

        textfieldFechanacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldFechanacimientoActionPerformed(evt);
            }
        });

        LabelTelefono.setText("Telefono");

        LabelCelular.setText("Celular ");

        textfieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldTelefonoActionPerformed(evt);
            }
        });

        textfieldCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCelularActionPerformed(evt);
            }
        });

        LabelFecha.setText("Fecha");

        TextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldFechaActionPerformed(evt);
            }
        });

        LabelStatuscliente.setText("Status de cliente");

        LabelTipocliente.setText("Tipo cliente");

        TextFieldTipocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTipoclienteActionPerformed(evt);
            }
        });

        LabelCorreo.setText("Correo Electronico");

        TextFieldBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBalanceActionPerformed(evt);
            }
        });

        LabelCuota.setText("Cuota");

        TextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCorreoActionPerformed(evt);
            }
        });

        LabelBalance.setText("Balance");

        TextFieldCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCuotaActionPerformed(evt);
            }
        });

        RadioButtonInactivo.setBackground(new java.awt.Color(255, 51, 0));
        RadioButtonInactivo.setText("Inactivo");

        RadioButtonActivo.setBackground(new java.awt.Color(102, 255, 51));
        RadioButtonActivo.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(labelIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfieldIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelPrimerapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelDirección, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(labelFechanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfieldPrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(textfieldSegundoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(textNombr, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(textfieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(textfieldFechanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LabelTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelStatuscliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(RadioButtonActivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RadioButtonInactivo)))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(textfieldCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelTipocliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldTipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttoncancelar)
                    .addComponent(buttonGuardar))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfieldIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textfieldPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelStatuscliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButtonInactivo)
                            .addComponent(RadioButtonActivo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDirección, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGuardar)
                .addGap(18, 18, 18)
                .addComponent(buttoncancelar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldIDclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldIDclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldIDclienteActionPerformed

    private void textfieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldDireccionActionPerformed

    private void textfieldSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldSegundoApellidoActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void textNombrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombrActionPerformed

    private void textfieldPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldPrimerApellidoActionPerformed

    private void textfieldFechanacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldFechanacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldFechanacimientoActionPerformed

    private void textfieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldTelefonoActionPerformed

    private void textfieldCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCelularActionPerformed

    private void TextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldFechaActionPerformed

    private void TextFieldTipoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTipoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTipoclienteActionPerformed

    private void TextFieldBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldBalanceActionPerformed

    private void TextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCorreoActionPerformed

    private void TextFieldCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCuotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBalance;
    private javax.swing.JLabel LabelCelular;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelCuota;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelStatuscliente;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTipocliente;
    private javax.swing.JRadioButton RadioButtonActivo;
    private javax.swing.JRadioButton RadioButtonInactivo;
    private javax.swing.JTextField TextFieldBalance;
    private javax.swing.JTextField TextFieldCorreo;
    private javax.swing.JTextField TextFieldCuota;
    private javax.swing.JTextField TextFieldFecha;
    private javax.swing.JTextField TextFieldTipocliente;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JLabel labelDirección;
    private javax.swing.JLabel labelFechanacimiento;
    private javax.swing.JLabel labelIDcliente;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrimerapellido;
    private javax.swing.JLabel labelSegundoApellido;
    private javax.swing.JTextField textNombr;
    private javax.swing.JTextField textfieldCelular;
    private javax.swing.JTextField textfieldDireccion;
    private javax.swing.JTextField textfieldFechanacimiento;
    private javax.swing.JTextField textfieldIDcliente;
    private javax.swing.JTextField textfieldPrimerApellido;
    private javax.swing.JTextField textfieldSegundoApellido;
    private javax.swing.JTextField textfieldTelefono;
    // End of variables declaration//GEN-END:variables
}
