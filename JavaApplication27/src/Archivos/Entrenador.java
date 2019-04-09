/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

/**
 *
 * @author lenovo2
 */
public class Entrenador extends Archivo{
    private int id_Entrenador;
    private String nombre_Entrenador;
    private String apellido_Entrenador;
    private String telf_Entrenador;
    private String correo_Entrenador;

    public Entrenador() {
    }

    public Entrenador(int id_Entrenador, String nombre_Entrenador, String apellido_Entrenador, String telf_Entrenador, String correo_Entrenador) {
        this.id_Entrenador = id_Entrenador;
        this.nombre_Entrenador = nombre_Entrenador;
        this.apellido_Entrenador = apellido_Entrenador;
        this.telf_Entrenador = telf_Entrenador;
        this.correo_Entrenador = correo_Entrenador;
    }

    public int getId_Entrenador() {
        return id_Entrenador;
    }

    public String getNombre_Entrenador() {
        return nombre_Entrenador;
    }

    public String getApellido_Entrenador() {
        return apellido_Entrenador;
    }

    public String getTelf_Entrenador() {
        return telf_Entrenador;
    }

    public String getCorreo_Entrenador() {
        return correo_Entrenador;
    }

    public void setId_Entrenador(int id_Entrenador) {
        this.id_Entrenador = id_Entrenador;
    }

    public void setNombre_Entrenador(String nombre_Entrenador) {
        this.nombre_Entrenador = nombre_Entrenador;
    }

    public void setApellido_Entrenador(String apellido_Entrenador) {
        this.apellido_Entrenador = apellido_Entrenador;
    }

    public void setTelf_Entrenador(String telf_Entrenador) {
        this.telf_Entrenador = telf_Entrenador;
    }

    public void setCorreo_Entrenador(String correo_Entrenador) {
        this.correo_Entrenador = correo_Entrenador;
    }
    
    
}
