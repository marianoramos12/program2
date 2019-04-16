/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Oceballo
 */
public class TextBox extends javax.swing.JFormattedTextField{
    
    public TextBox() throws HeadlessException
    {   DocumentFilter filter = new UppercaseDocumentFilter();
        ((AbstractDocument) this.getDocument()).setDocumentFilter(filter);
        
        this.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxActionPerformed(evt);
            }
        });
    }
    
    public TextBox(boolean solonumeros) throws HeadlessException
    {   
           final numerosDocumentFilter filter = new numerosDocumentFilter();
            this.setDocument(filter);
            this.setHorizontalAlignment(RIGHT);
            
        
        this.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxActionPerformed(evt);
            }
        });
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formatear();
                filter.setc(actualizar());
            }
        });
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filter.setc(actualizar());
            }
        });
        this.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                filter.setpunto_sel(seleccionado(evt));
                filter.setc(actualizar());
            }
        });
    }
    
    private void textBoxActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(getRootPane(),getRootPane().getDefaultButton().getName());
        //getRootPane().getDefaultButton().doClick();
        
        this.transferFocus();
       
    }
    private double redondear(double numero) 
    {   return Math.rint(numero*100)/100;
    }
    public void formatear()
    {   String cadena,decimal="",aux1="",aux2="";
        cadena=this.getText();
        //elimina las comas
        for(int i=0;i<cadena.length();i++)
           aux1+=(!cadena.substring(i,i+1).equals(","))?cadena.substring(i,i+1):"";
        if(aux1.equals(""))
           aux1="0.00";
        if(aux1.equals("."))
           aux1="0.00";
        if(!aux1.equals(""))
        {   
            double numero=redondear(Double.parseDouble(aux1));
            if(numero-(int)numero>0)
            {   decimal=Double.toString(redondear(numero-(int)numero));
                decimal+="00".substring(decimal.substring(decimal.indexOf('.')+1).length());
            }
            else
                decimal="0.00";
            //JOptionPane.showMessageDialog(this, numero+" "+decimal);
        }
        int i,miles=0;
        //agrega comas
        if(aux1.indexOf('.')!=-1)
            i=aux1.indexOf('.');
        else
            i=aux1.length();
        for(;i>0;i--)
        {   aux2=aux1.substring(i-1, i)+aux2;
            miles++;
            if((miles)%3==0 && i>1)
                aux2=","+aux2;  
        }   //decimal esta vacio, no pone eel punto en la seleccion
        //System.out.println(decimal);
        if(aux2.equals(""))
           aux2="0";
        if(!decimal.equals(""))
             aux2=aux2+(decimal.substring(1));
        this.setText(aux2);
        //JOptionPane.showMessageDialog(this,aux2);
        
    }
    public int actualizar()
    {   int cant=0;
        String texto=this.getText();
        if(texto.indexOf('.')==-1)
            cant=0;
        else
        {   for(int i=0;i<texto.length();i++)
                cant+=(texto.charAt(i)=='.')?1:0;
        }
            return(cant);
            
    }
    public boolean seleccionado(javax.swing.event.CaretEvent evt)
    {   
        if(this.getSelectedText()!=null)
        {    if(this.getSelectedText().indexOf('.')!=-1)
                return(true);
        else
            return(false);
        }
        else
            return(false);

    }
    
    class UppercaseDocumentFilter extends DocumentFilter {
    //
    // Override insertString method of DocumentFilter to make the text format
    // to uppercase.
    //
    
    public void insertString(DocumentFilter.FilterBypass fb, int offset,
                             String text, AttributeSet attr)
            throws BadLocationException {

        fb.insertString(offset, text.toUpperCase(), attr);
    }

    //
    // Override replace method of DocumentFilter to make the text format
    // to uppercase.
    //
    public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
                        String text, AttributeSet attrs)
        throws BadLocationException {

            fb.replace(offset, length, text.toUpperCase(), attrs);
        }
    }
    
    class numerosDocumentFilter extends PlainDocument
    {
        private int c=0;
        private boolean punto_sel;
   /**
    * Método al que llama el editor cada vez que se intenta insertar caracteres.
    * Sólo debemos verificar arg1, que es la cadena que se quiere insertar en el JTextField
    */
    public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException
    {  //System.out.println(punto_sel);
       for (int i=0;i<arg1.length();i++)
          // si no es digit, volvemos
       {   if(punto_sel)
                c=0;
           if(arg1.charAt(i)=='.')  c++;
           //System.out.println(c);
          
           if ((!Character.isDigit(arg1.charAt(i)) && arg1.charAt(i)!=',' && arg1.charAt(i)!='.') || (arg1.charAt(i)=='.') && c>1)
           {  c--;
               return;
           }
       }
       // Si todos son digit, insertamos el texto en el JTextField
       super.insertString(arg0, arg1, arg2);
    }
    public void setc(int c)
    {
        this.c=c;
    }
    public void setpunto_sel(boolean punto_sel)
    {
        this.punto_sel=punto_sel;
    }
    public int getc()
    {
        return(this.c);
    }

    }
}