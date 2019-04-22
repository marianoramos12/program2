/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Archivos.Clientes;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication27.LimpiarCampos;
import javaapplication27.Manejador;
import javaapplication27.PanelFondo;
import javax.swing.JOptionPane;

/**
 *
 * @author ing mariano ramos
 */
public class MantenimientoCliente extends javax.swing.JInternalFrame {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Clientes objetoArchivo;
Manejador instanciaManejador;

    /**
     * Creates new form Usuarios
     */
    public MantenimientoCliente() {
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
        objetoArchivo=new Clientes();

  
        
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
                SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");

                    objetoArchivo = new Clientes();
                    objetoArchivo.setId_Cliente(Integer.parseInt(datosRegistro[0]));
                    objetoArchivo.setNombre_Cliente(datosRegistro[1]);
                    objetoArchivo.setApellido_Pat_Cliente(datosRegistro[2]);
                    objetoArchivo.setApellido_Mat_Cliente(datosRegistro[3]);
                    objetoArchivo.setDireccion_Cliente(datosRegistro[4]);
                    objetoArchivo.setFecha_Nac_Cliente(fecha.parse(datosRegistro[5]));
                    objetoArchivo.setTelf_Cliente(datosRegistro[6]);
                    objetoArchivo.setCelular_Cliente(datosRegistro[7]);
                    objetoArchivo.setFecha_Ingreso(fecha.parse(datosRegistro[8]));
                    objetoArchivo.setStatus_Cliente(Boolean.parseBoolean(datosRegistro[9]));
                    objetoArchivo.setTipo_Cliente(Integer.parseInt(datosRegistro[10]));
                    objetoArchivo.setCorreo_Cliente(datosRegistro[11]);
                    objetoArchivo.setBalance_Cliente(Double.parseDouble(datosRegistro[12]));
                    objetoArchivo.setValor_Cuota_Cliente(Double.parseDouble(datosRegistro[13]));
                    instanciaManejador.agregarRegistro(objetoArchivo);

                }
                bufferedReader.close();
            }catch(HeadlessException | IOException | NumberFormatException | ParseException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar archivo: "+ex.getMessage());
                //System.out.println(ex.getMessage());
            }
        }
    }
    //buscar si existe ese ID
    public int buscarId(int id){
        for(int i = 0; i < instanciaManejador.cantidadRegistro(); i++){
            if(id == ((Clientes)instanciaManejador.obtenerRegistro(i)).getId_Cliente())return i;
        }
        return -1;
    }
    //Llena los campos
    private void llenarCampos() {
        SimpleDateFormat fecha=new SimpleDateFormat("dd-MM-yyyy");
        int id=buscarId(Integer.parseInt(textIdCliente.getText().trim()));
        if(id!=-1){
            labelMensaje.setText("MODIFICANDO");
            objetoArchivo=(Clientes) instanciaManejador.obtenerRegistro(id);
            textNombre.setText(objetoArchivo.getNombre_Cliente());
            textPrimerApellido.setText(objetoArchivo.getApellido_Pat_Cliente());
            textSegundoApellido.setText(objetoArchivo.getApellido_Mat_Cliente());
            textDireccion.setText(objetoArchivo.getDireccion_Cliente());
            textFechaNacimiento.setText(fecha.format(objetoArchivo.getFecha_Nac_Cliente()));
            textTelefono.setText(objetoArchivo.getTelf_Cliente());
            textCelular.setText(objetoArchivo.getCelular_Cliente());
            textFechaIngreso.setText(fecha.format(objetoArchivo.getFecha_Ingreso()));
            comboStatus.setSelectedIndex(objetoArchivo.getStatus_Cliente()?1:0);
            comboTipoCliente.setSelectedIndex(objetoArchivo.getTipo_Cliente());
            textCorreo.setText(objetoArchivo.getCorreo_Cliente());
            textBalance.setText(Double.toString(objetoArchivo.getBalance_Cliente()));
            textCuota.setText(Double.toString(objetoArchivo.getValor_Cuota_Cliente()));
            
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
                objetoArchivo = (Clientes) instanciaManejador.obtenerRegistro(i);
                printWriter.println(objetoArchivo.toString());
            }
            
            //System.out.println(fileWriter.toString());
             printWriter.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error al grabar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    private void botonGuardar() throws ParseException{
        //VALIDACION DE CAMPOS OBLIGATORIOS
        if(textIdCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el ID de Cliente");
            textIdCliente.requestFocus();
        }
        else if(textNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Nombre");
            textNombre.requestFocus();
        }
        else if(textPrimerApellido.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Primer Apellido");
            textPrimerApellido.requestFocus();
        }     
        else if(textSegundoApellido.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Segundo Apellido");
            textSegundoApellido.requestFocus();
        }
        else if(textDireccion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta la Direccion");
            textDireccion.requestFocus();
        }
        else if(textFechaNacimiento.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta la Fecha de Nacimiento");
            textFechaNacimiento.requestFocus();
        }
        else if(textTelefono.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Telefono");
            textTelefono.requestFocus();
        }
        else if(textCelular.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta el Celular");
            textCelular.requestFocus();
        }
        else if(textFechaIngreso.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Falta la Fecha de Ingreso");
            textFechaIngreso.requestFocus();
        }
        else if(comboStatus.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(this, "Falta el Status");
            comboStatus.requestFocus();
        }
        else if(comboTipoCliente.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(this, "Falta el Tipo de Cliente");
            comboTipoCliente.requestFocus();
        }
        else {
            //CREAR EL OBJETO
            SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
            objetoArchivo=new Clientes(Integer.parseInt(textIdCliente.getText().trim()),
                    textNombre.getText().trim(),textPrimerApellido.getText().trim(),
                    textSegundoApellido.getText().trim(),textDireccion.getText().trim(),
                    fecha.parse(textFechaNacimiento.getText().trim()),textTelefono.getText().trim(),
                    textCelular.getText().trim(),fecha.parse(textFechaIngreso.getText().trim()),
                    (comboStatus.getSelectedIndex() != 0),comboTipoCliente.getSelectedIndex(),
                    textCorreo.getText().trim(),
                    textBalance.getText().trim().isEmpty()?0:Double.parseDouble(textBalance.getText().trim()),
                    textCuota.getText().trim().isEmpty()?0:Double.parseDouble(textCuota.getText().trim()));

            //VERIFICAR SI EXISTE PARA MODIFICARLO SINO AGREGARLO
            int id=buscarId(objetoArchivo.getId_Cliente());
            if(id!=-1)
                instanciaManejador.modificarRegistro(id, objetoArchivo);
            else
                instanciaManejador.agregarRegistro(objetoArchivo);
            //GUARDAR LA INSTANCIA EN EL TXT
            guardarTxt();
            LimpiarCampos.limpiarCampos(panelCampos); 
            labelMensaje.setText("CREANDO");
            textIdCliente.requestFocus();
            }

    }
    private void botonEliminar() {
        int id=buscarId(Integer.parseInt(textIdCliente.getText().trim()));
        if(id!=-1) {
            instanciaManejador.eliminarRegistro(id);
            guardarTxt();
            LimpiarCampos.limpiarCampos(panelCampos); 
            labelMensaje.setText("CREANDO");
            JOptionPane.showMessageDialog(this, "Registro eliminado");
            textIdCliente.requestFocus();
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
        labelIdcliente = new javax.swing.JLabel();
        textIdCliente = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelPrimerApellido = new javax.swing.JLabel();
        textPrimerApellido = new javax.swing.JTextField();
        labelSegundoApellido = new javax.swing.JLabel();
        textSegundoApellido = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        labelFechanacimiento = new javax.swing.JLabel();
        textFechaNacimiento = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        textCelular = new javax.swing.JTextField();
        labelCelular = new javax.swing.JLabel();
        labelFechaIngreso = new javax.swing.JLabel();
        textFechaIngreso = new javax.swing.JTextField();
        labelStatusCliente = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        LabelTipocliente = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        textCorreo = new javax.swing.JTextField();
        LabelBalance = new javax.swing.JLabel();
        textBalance = new javax.swing.JTextField();
        comboTipoCliente = new javax.swing.JComboBox<>();
        LabelCuota = new javax.swing.JLabel();
        textCuota = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        buttonGuardar = new javax.swing.JButton();
        buttoncancelar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("CLIENTES");
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

        labelIdcliente.setText("ID Cliente");

        textIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIdClienteFocusLost(evt);
            }
        });

        labelNombre.setText("Nombre ");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        labelPrimerApellido.setText("Primer Apellido");

        textPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimerApellidoActionPerformed(evt);
            }
        });

        labelSegundoApellido.setText("Segundo Apellido");

        textSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegundoApellidoActionPerformed(evt);
            }
        });

        labelDireccion.setText("Dirección");

        textDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDireccionActionPerformed(evt);
            }
        });

        labelFechanacimiento.setText("Fecha de nacimiento");

        textFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaNacimientoActionPerformed(evt);
            }
        });

        labelTelefono.setText("Telefono");

        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });

        textCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCelularActionPerformed(evt);
            }
        });

        labelCelular.setText("Celular ");

        labelFechaIngreso.setText("Fecha ingreso");

        textFechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaIngresoActionPerformed(evt);
            }
        });

        labelStatusCliente.setText("Status de cliente");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pasivo", "Activo" }));

        LabelTipocliente.setText("Tipo cliente");

        LabelCorreo.setText("Correo Electronico");

        textCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorreoActionPerformed(evt);
            }
        });

        LabelBalance.setText("Balance");

        textBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBalanceActionPerformed(evt);
            }
        });

        comboTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socio activo", "Invitado" }));

        LabelCuota.setText("Cuota");

        textCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCuotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCamposLayout = new javax.swing.GroupLayout(panelCampos);
        panelCampos.setLayout(panelCamposLayout);
        panelCamposLayout.setHorizontalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addComponent(labelIdcliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNombre))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addComponent(labelDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addComponent(labelPrimerApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSegundoApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSegundoApellido))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCamposLayout.createSequentialGroup()
                                .addComponent(labelStatusCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTipocliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelCamposLayout.createSequentialGroup()
                                .addComponent(labelFechanacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTelefono))
                            .addGroup(panelCamposLayout.createSequentialGroup()
                                .addComponent(labelCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFechaIngreso)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFechaIngreso)
                            .addComponent(textTelefono)
                            .addComponent(comboTipoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addComponent(LabelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCorreo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCamposLayout.createSequentialGroup()
                        .addComponent(LabelBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCuota)
                        .addGap(18, 18, 18)
                        .addComponent(textCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCamposLayout.setVerticalGroup(
            panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposLayout.createSequentialGroup()
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCamposLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(panelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelarActionPerformed
        cerrar();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoncancelarActionPerformed

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
        textIdCliente.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
    try {
        botonGuardar();
        // TODO add your handling code here:
    } catch (ParseException ex) {
        Logger.getLogger(MantenimientoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        botonEliminar();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerApellidoActionPerformed

    private void textSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoApellidoActionPerformed

    private void textDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDireccionActionPerformed

    private void textFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaNacimientoActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void textCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCelularActionPerformed

    private void textFechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaIngresoActionPerformed

    private void textCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorreoActionPerformed

    private void textBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBalanceActionPerformed

    private void textCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCuotaActionPerformed

    private void textIdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdClienteFocusLost
        if(!textIdCliente.getText().isEmpty())
            llenarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdClienteFocusLost
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
    private javax.swing.JLabel LabelBalance;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelCuota;
    private javax.swing.JLabel LabelTipocliente;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttoncancelar;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JComboBox<String> comboTipoCliente;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaIngreso;
    private javax.swing.JLabel labelFechanacimiento;
    private javax.swing.JLabel labelIdcliente;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrimerApellido;
    private javax.swing.JLabel labelSegundoApellido;
    private javax.swing.JLabel labelStatusCliente;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JTextField textBalance;
    private javax.swing.JTextField textCelular;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JTextField textCuota;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textFechaIngreso;
    private javax.swing.JTextField textFechaNacimiento;
    private javax.swing.JTextField textIdCliente;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrimerApellido;
    private javax.swing.JTextField textSegundoApellido;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
