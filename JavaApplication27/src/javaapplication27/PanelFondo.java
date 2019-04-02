/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author lenovo2
 */
import java.awt.*;
import javax.swing.*;

public class PanelFondo extends javax.swing.JPanel {
int ancho,largo;
public PanelFondo(int ancho,int largo)
{
    this.ancho=ancho;
    this.largo=largo;
     initComponents();
    this.setSize(this.ancho,this.largo);
}
    public PanelFondo() {
        initComponents();
    this.setSize(ancho,largo);
    }

public void pintar(int ancho,int largo)    
{
     this.ancho=ancho;
    this.largo=largo;

    this.setSize(this.ancho,this.largo);
   
}   
    @Override
    public void paintComponent(Graphics g){
        Dimension tam= getSize();
        ImageIcon ImagenFondo=new ImageIcon(new ImageIcon(getClass().getResource("/Graficas/Fondo6.jpg")).getImage());
        g.drawImage(ImagenFondo.getImage(), 0,0, tam.width, tam.height,null);
        setOpaque(false);
        super.paintComponent(g);
        
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>                        
    // Variables declaration - do not modify                     
    // End of variables declaration                   
}

