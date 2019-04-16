/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Archivos.Entrenador;
import java.awt.AWTKeyStroke;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javaapplication27.LimpiarCampos;
import javaapplication27.Manejador;
import javaapplication27.PanelFondo;
import javax.swing.JOptionPane;

/**
 *
 * @author ing mariano ramos
 */
public class MantenimientoEntrenador extends javax.swing.JInternalFrame {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Entrenador objetoArchivo;
Manejador instanciaManejador;

    /**
     * Creates new form Usuarios
     */
    public MantenimientoEntrenador() {
        initComponents();
        
        // Conjunto de teclas que queremos que sirvan para pasar el foco 
        // al siguiente campo de texto: ENTER y TAB
//        Set<AWTKeyStroke> teclas = new HashSet<AWTKeyStroke>();
//        teclas.add(AWTKeyStroke.getAWTKeyStroke(
//                KeyEvent.VK_ENTER, 0));
//        teclas.add(AWTKeyStroke.getAWTKeyStroke(
//                KeyEvent.VK_TAB, 0));
//        
//        // Se pasa el conjunto de teclas al panel principal 
//        this.getContentPane().setFocusTraversalKeys(
//                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, 
//                teclas);
        
        //this.getRootPane().setDefaultButton(buttonGuardar);
        PanelFondo panel=new PanelFondo(this.screenSize.width,this.screenSize.height);
        this.add(panel,BorderLayout.CENTER);
        instanciaManejador=new Manejador();
        objetoArchivo=new Entrenador();

        //objetoArchivo=new Entrenador();
        
    }
    
    public void abrirTxt(){
        FileReader fileReader;
        BufferedReader bufferedReader;

                
        try{
            File directorio=new File(objetoArchivo.getCarpeta()); 
            directorio.mkdir(); 
            fileReader = new FileReader(objetoArchivo.getCarpeta()+objetoArchivo.getClass().getSimpleName()+".txt");
            bufferedReader = new BufferedReader(fileReader);
            
           
            String registro = null;
  
            while((registro = bufferedReader.readLine())!=null){
            
            
            String[] datosRegistro=registro.split(objetoArchivo.getSeparador());           
                
            
                //StringTokenizer registroSeparado = new StringTokenizer(registro, "|");
                
                objetoArchivo = new Entrenador();
                objetoArchivo.setId_Entrenador(Integer.parseInt(datosRegistro[0]));
                objetoArchivo.setNombre_Entrenador(datosRegistro[1]);
                objetoArchivo.setApellido_Entrenador(datosRegistro[2]);
                objetoArchivo.setTelf_Entrenador(datosRegistro[3]);
                objetoArchivo.setCorreo_Entrenador(datosRegistro[4]);
                instanciaManejador.agregarRegistro(objetoArchivo);
                
                JOptionPane.showMessageDialog(null,Arrays.toString(datosRegistro));
            }
            bufferedReader.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al cargar archivo: "+ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }
    //buscar si existe ese ID
    public int buscarId(int id){
        for(int i = 0; i < instanciaManejador.cantidadRegistro(); i++){
            if(id == ((Entrenador)instanciaManejador.obtenerRegistro(i)).getId_Entrenador())return i;
        }
        return -1;
    }
    //Llena los campos
    private void llenarCampos() {
        int id=buscarId(Integer.parseInt(textIdEntrenador.getText().trim()));
        if(id!=-1){
            labelMensaje.setText("MODIFICANDO");
            objetoArchivo=(Entrenador) instanciaManejador.obtenerRegistro(id);
            textNombre.setText(objetoArchivo.getNombre_Entrenador());
            textApellido.setText(objetoArchivo.getApellido_Entrenador());
            textTelefono.setText(objetoArchivo.getTelf_Entrenador());
            textEmail.setText(objetoArchivo.getCorreo_Entrenador());
        }
    }
    
    private void guardarTxt(){
        FileWriter fileWriter;
        PrintWriter printWriter;
        
        try{
            File directorio=new File(objetoArchivo.getCarpeta()); 
            directorio.mkdir(); 
            fileWriter = new FileWriter(objetoArchivo.getCarpeta()+objetoArchivo.getClass().getSimpleName()+".txt");
            printWriter = new PrintWriter(fileWriter);
            
            //JOptionPane.showMessageDialog(this,objetoArchivo.getNombre_Entrenador());
            
            for(int i = 0; i < instanciaManejador.cantidadRegistro(); i++){
                objetoArchivo = (Entrenador) instanciaManejador.obtenerRegistro(i);
                printWriter.println(objetoArchivo.toString());
            }
            
            //System.out.println(fileWriter.toString());
             printWriter.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error al grabar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    private void botonGuardar(){
        if(textIdEntrenador.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el ID de Entrenador");
            textIdEntrenador.requestFocus();
        }
        else if(textNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Nombre");
            textNombre.requestFocus();
        }
        else if(textApellido.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Apellido");
            textApellido.requestFocus();
        }        
        else {
            objetoArchivo=new Entrenador(Integer.parseInt(textIdEntrenador.getText().trim()),
                textNombre.getText().trim(),textApellido.getText().trim(),textTelefono.getText().trim(),
                textEmail.getText().trim());      


            instanciaManejador.agregarRegistro(objetoArchivo);
            guardarTxt();
            LimpiarCampos.limpiarCampos(this.getContentPane()); 
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

        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textIdEntrenador = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        buttoncancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        textApellido = new javax.swing.JTextField();
        buttonLimpiar = new javax.swing.JButton();
        labelMensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("ENTRENADOR");
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
                formInternalFrameOpened(evt);
            }
        });

        labelNombre.setText("Nombre ");

        labelTelefono.setText("Telefono");

        labelEmail.setText("Email ");

        textIdEntrenador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIdEntrenadorFocusLost(evt);
            }
        });

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });

        buttoncancelar.setText("Cancelar");
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar ");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        labelID.setText("ID de entrenador");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        labelApellido.setText("Apellidos");

        textApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        labelMensaje.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(buttonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(buttoncancelar)
                .addGap(40, 40, 40)
                .addComponent(buttonGuardar)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApellido)
                            .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(textEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoncancelar)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        LimpiarCampos.limpiarCampos(this.getContentPane());
        labelMensaje.setText("CREANDO");
        abrirTxt();
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        LimpiarCampos.limpiarCampos(this.getContentPane());
        labelMensaje.setText("CREANDO");
        textIdEntrenador.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void textIdEntrenadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdEntrenadorFocusLost
        if(!textIdEntrenador.getText().isEmpty())
            llenarCampos();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdEntrenadorFocusLost

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        botonGuardar();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGuardarActionPerformed
    public void cerrar()
    {   int opcion =  JOptionPane.showConfirmDialog(this,"Desea Salir?",this.getTitle(),JOptionPane.YES_NO_OPTION);
        if(opcion==0)
            dispose();
    
    }
    public void centrar()
    {
        this.setLocation(this.getParent().getWidth()/2 - this.getWidth()/2 ,this.getParent().getHeight()/2 - this.getHeight()/2 - 20);
    }
    
 /**
     * Encargada de transferir el foco al siguiente componente.
     */
//    private ActionListener tranfiereElFoco = new ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent arg0) {
//            // Se transfiere el foco al siguiente elemento.
//            ((Component) arg0.getSource()).transferFocus();
//        }
//    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textIdEntrenador;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
