/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import Archivos.Archivo;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Manejador {
    
    private ArrayList<Object> arreglo = new ArrayList<Object>();
    
    public Manejador(){}
    
    public Manejador(ArrayList<Object> arregloTmp){
        this.arreglo = arregloTmp;
    }
    
    public void agregarRegistro(Archivo registroArchivo){
        this.arreglo.add(registroArchivo);  
    }

    public void modificarRegistro(int index, Archivo registroArchivo){
        this.arreglo.set(index, registroArchivo);
    }
    
    public void eliminarRegistro(int index){
        this.arreglo.remove(index);
    }
    
    public Archivo obtenerRegistro(int index){
        return (Archivo)arreglo.get(index);
    }
    
    public int cantidadRegistro(){
        return this.arreglo.size();
    }
        
}
