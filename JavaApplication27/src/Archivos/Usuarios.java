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
public class Usuarios extends Archivo{
    private String login_Usuario;
    private String pass_Usuario;
    private int nivel_Acceso;
    private String nombre_Usuario;
    private String apellidos_Usuario;
    private String correo_Usuario;

    public Usuarios(){}
    
    public Usuarios(String login_Usuario, String pass_Usuario, int nivel_Acceso, String nombre_Usuario, String apellidos_Usuario, String correo_Usuario) {
        this.login_Usuario = login_Usuario;
        this.pass_Usuario = pass_Usuario;
        this.nivel_Acceso = nivel_Acceso;
        this.nombre_Usuario = nombre_Usuario;
        this.apellidos_Usuario = apellidos_Usuario;
        this.correo_Usuario = correo_Usuario;
    }

    public String getLogin_Usuario() {
        return login_Usuario;
    }

    public String getPass_Usuario() {
        return pass_Usuario;
    }

    public int getNivel_Acceso() {
        return nivel_Acceso;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public String getApellidos_Usuario() {
        return apellidos_Usuario;
    }

    public String getCorreo_Usuario() {
        return correo_Usuario;
    }

    public void setLogin_Usuario(String login_Usuario) {
        this.login_Usuario = login_Usuario;
    }

    public void setPass_Usuario(String pass_Usuario) {
        this.pass_Usuario = pass_Usuario;
    }

    public void setNivel_Acceso(int nivel_Acceso) {
        this.nivel_Acceso = nivel_Acceso;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public void setApellidos_Usuario(String apellidos_Usuario) {
        this.apellidos_Usuario = apellidos_Usuario;
    }

    public void setCorreo_Usuario(String correo_Usuario) {
        this.correo_Usuario = correo_Usuario;
    }
    
    
}
