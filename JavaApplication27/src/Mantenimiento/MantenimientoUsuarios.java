/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Archivos.Usuarios;
import java.awt.AWTKeyStroke;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class MantenimientoUsuarios extends javax.swing.JInternalFrame {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Usuarios objetoArchivo;
Manejador instanciaManejador;

    /**
     * Creates new form Usuarios
     */
    public MantenimientoUsuarios() {
        initComponents();
        
        // Conjunto de teclas que queremos que sirvan para pasar el foco 
        // al siguiente campo de texto: ENTER y TAB
        Set<AWTKeyStroke> teclas = new HashSet<AWTKeyStroke>();
        teclas.add(AWTKeyStroke.getAWTKeyStroke(
                KeyEvent.VK_ENTER, 0));
        teclas.add(AWTKeyStroke.getAWTKeyStroke(
                KeyEvent.VK_TAB, 0));
        
        // Se pasa el conjunto de teclas al panel principal 
        panelCampos.setFocusTraversalKeys(
                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, 
                teclas);
        

        //this.getRootPane().setDefaultButton(buttonGuardar);
        PanelFondo panel=new PanelFondo(this.screenSize.width,this.screenSize.height);
        this.add(panel,BorderLayout.CENTER);
        instanciaManejador=new Manejador();
        objetoArchivo=new Usuarios();
        
    }
    
    public void abrirTxt(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        
        //verificar si existe el archivo para cargarlo
        File archivo = new File(objetoArchivo.carpeta+objetoArchivo.getClass().getSimpleName()+".txt");
        if(archivo.exists()){
                
            try{

                fileReader = new FileReader(objetoArchivo.carpeta+objetoArchivo.getClass().getSimpleName()+".txt");
                bufferedReader = new BufferedReader(fileReader);

                String registro = null;

                while((registro = bufferedReader.readLine())!=null){

                String[] datosRegistro=registro.split(objetoArchivo.separador,-1);           

                    objetoArchivo = new Usuarios();
                    objetoArchivo.setLogin_Usuario(datosRegistro[0]);
                    objetoArchivo.setPass_Usuario(datosRegistro[1]);
                    objetoArchivo.setNivel_Acceso(Integer.parseInt(datosRegistro[2]));
                    objetoArchivo.setNombre_Usuario(datosRegistro[3]);
                    objetoArchivo.setApellidos_Usuario(datosRegistro[4]);
                    objetoArchivo.setCorreo_Usuario(datosRegistro[5]);
                    instanciaManejador.agregarRegistro(objetoArchivo);

                    //JOptionPane.showMessageDialog(null,Arrays.toString(datosRegistro));
                }
                bufferedReader.close();
            }catch(HeadlessException | IOException | NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar archivo: "+ex.getMessage());
                //System.out.println(ex.getMessage());
            }
        }
    }
    //buscar si existe ese ID
    public int buscarId(String usuario){
        for(int i = 0; i < instanciaManejador.cantidadRegistro(); i++){
            if(usuario.equals(((Usuarios)instanciaManejador.obtenerRegistro(i)).getLogin_Usuario()))return i;
        }
        return -1;
    }
    //Llena los campos
    private void llenarCampos() {
        int id=buscarId(textUsuario.getText().trim());
        if(id!=-1){
            labelMensaje.setText("MODIFICANDO");
            objetoArchivo=(Usuarios) instanciaManejador.obtenerRegistro(id);
            textPassword.setText(objetoArchivo.getPass_Usuario());
            comboNivelAcceso.setSelectedIndex(objetoArchivo.getNivel_Acceso());
            textNombre.setText(objetoArchivo.getNombre_Usuario());
            textApellido.setText(objetoArchivo.getApellidos_Usuario());
            textEmail.setText(objetoArchivo.getCorreo_Usuario());
        }
    }
    
    private void guardarTxt(){
        FileWriter fileWriter;
        PrintWriter printWriter;
        
        try{
            File directorio=new File(objetoArchivo.carpeta); 
            directorio.mkdir(); 
            fileWriter = new FileWriter(objetoArchivo.carpeta+objetoArchivo.getClass().getSimpleName()+".txt");
            printWriter = new PrintWriter(fileWriter);
            
            //JOptionPane.showMessageDialog(this,objetoArchivo.getNombre_Entrenador());
            
            for(int i = 0; i < instanciaManejador.cantidadRegistro(); i++){
                objetoArchivo = (Usuarios) instanciaManejador.obtenerRegistro(i);
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
        //VALIDACION DE CAMPOS OBLIGATORIOS
        if(textUsuario.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Usuario");
            textUsuario.requestFocus();
        }
        else if(textPassword.getPassword().length==0) {
            JOptionPane.showMessageDialog(this, "Falta el Password");
            textPassword.requestFocus();
        }
        else if(comboNivelAcceso.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(this, "Falta el Nivel de Acceso");
            comboNivelAcceso.requestFocus();
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
            //CREAR EL OBJETO
            objetoArchivo=new Usuarios(textUsuario.getText().trim(),String.valueOf(textPassword.getPassword()),
                comboNivelAcceso.getSelectedIndex(),textNombre.getText().trim(),textApellido.getText().trim(),
                textEmail.getText().trim());      

            //VERIFICAR SI EXISTE PARA MODIFICARLO SINO AGREGARLO
            int id=buscarId(objetoArchivo.getLogin_Usuario());
            if(id!=-1)
                instanciaManejador.modificarRegistro(id, objetoArchivo);
            else
                instanciaManejador.agregarRegistro(objetoArchivo);
            //GUARDAR LA INSTANCIA EN EL TXT
            guardarTxt();
            LimpiarCampos.limpiarCampos(panelCampos); 
            labelMensaje.setText("CREANDO");
            textUsuario.requestFocus();
            }

    }
    private void botonEliminar() {
        int id=buscarId(textUsuario.getText().trim());
        if(id!=-1) {
            instanciaManejador.eliminarRegistro(id);
            guardarTxt();
            LimpiarCampos.limpiarCampos(panelCampos); 
            labelMensaje.setText("CREANDO");
            JOptionPane.showMessageDialog(this, "Registro eliminado");
            textUsuario.requestFocus();
        }
        else {
            JOptionPane.showMessageDialog(this, "ID no existe para eliminar");
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

        labelMensaje = new javax.swing.JLabel();
        panelCampos = new javax.swing.JPanel();
        labelNivelAcceso = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textApellido = new javax.swing.JTextField();
        comboNivelAcceso = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        panelBotones = new javax.swing.JPanel();
        buttonGuardar = new javax.swing.JButton();
        buttoncancelar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("USUARIOS");
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

        labelMensaje.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        labelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        panelCampos.setOpaque(false);

        labelNivelAcceso.setText("Nivel de Acceso");

        labelEmail.setText("Email ");

        textUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textUsuarioFocusLost(evt);
            }
        });

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        labelUsuario.setText("Usuario");

        labelApellido.setText("Apellidos");

        labelNombre.setText("Nombre ");

        textApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoActionPerformed(evt);
            }
        });

        comboNivelAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        comboNivelAcceso.setSelectedIndex(1);

        jLabel1.setText("Password");

        javax.swing.GroupLayout panelCamposLayout = new javax.swing.GroupLayout(panelCampos);
        panelCampos.setLayout(panelCamposLayout);
        panelCamposLayout.setHorizontalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNivelAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)))
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textApellido)
                    .addComponent(textEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboNivelAcceso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPassword, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(125, 125, 125))))
        );
        panelCamposLayout.setVerticalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboNivelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBotones.setOpaque(false);

        buttonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficas/guardar.png"))); // NOI18N
        buttonGuardar.setText("Guardar ");
        buttonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonGuardar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buttonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttoncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficas/salir.png"))); // NOI18N
        buttoncancelar.setText("Cancelar");
        buttoncancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttoncancelar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buttoncancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelarActionPerformed(evt);
            }
        });

        buttonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficas/nuevo.png"))); // NOI18N
        buttonLimpiar.setText("Nuevo");
        buttonLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLimpiar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buttonLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        buttonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficas/eliminar.png"))); // NOI18N
        buttonEliminar.setText("Eliminar");
        buttonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEliminar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        buttonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttoncancelar)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttoncancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGuardar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        cerrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        LimpiarCampos.limpiarCampos(panelCampos);
        labelMensaje.setText("CREANDO");
        abrirTxt();
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        LimpiarCampos.limpiarCampos(panelCampos);
        labelMensaje.setText("CREANDO");
        textUsuario.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void textUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsuarioFocusLost
        if(!textUsuario.getText().isEmpty())
            llenarCampos();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioFocusLost

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        botonGuardar();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        botonEliminar();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEliminarActionPerformed
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
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JComboBox<String> comboNivelAcceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNivelAcceso;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNombre;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
