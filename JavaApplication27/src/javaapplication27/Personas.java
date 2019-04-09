/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.io.Serializable;

/**
 *
 * @author lenovo2
 */
public class Personas implements Serializable{
/**
*
*/
    private static final long seriaLVersionUID = 1L;
    private String nombre;
    private int edad;
    private String dni;
    
    public Personas(String nombre, int edad, String dni) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getDni() {
        return dni;
    }
}