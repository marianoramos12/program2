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
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class DesktopPanel extends javax.swing.JDesktopPane{
    int ancho,largo;
public DesktopPanel(int ancho,int largo)
{
    this.ancho=ancho;
    this.largo=largo;
    
    this.setSize(this.ancho,this.largo);
}
    public DesktopPanel() {
       
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
        //ImageIcon ImagenFondo=new ImageIcon(new ImageIcon(getClass().getResource("/Graficas/zoom.jpg")).getImage());
        //g.drawImage(ImagenFondo.getImage(), 0,0, tam.width, tam.height,null);
        setOpaque(false);
        super.paintComponent(g);
        
    }
}

