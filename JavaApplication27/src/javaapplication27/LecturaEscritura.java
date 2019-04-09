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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LecturaEscritura {
    public static void setEscritura() throws IOException{
        File f=new File("datos.txt");
        FileOutputStream fos=new FileOutputStream(f); 
        ObjectOutputStream oos=new ObjectOutputStream(fos); 
        oos.writeObject(new Personas("Duan",40,"258741369Z")); 
        oos.writeObject(new Personas("Luis",35,"236985471B")); 
        oos.writeObject(new Personas ("Pilar", 41, "777589632L"));//£;scribo
        oos.close();
    }
    public static void getLectura() throws ClassNotFoundException, IOException{
        ObjectInputStream ois=null;
        try{
            File f=new File("datos.obj");
            FileInputStream fis=new FileInputStream(f);
            ois=new ObjectInputStream(fis);
            while(true){
                Personas p=(Personas) ois.readObject();
                System.out.println("Nombre:"+p.getNombre());
                System.out.println("Edad: "+p.getEdad());
                System.out.println("DNI: "+p.getDni());
                System.out.println("**************************");
            }
        }catch(IOException io){
            System.out.println("\n***********Fin************");
        }finally{
            ois.close();
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        setEscritura();
        getLectura();
    }
}
