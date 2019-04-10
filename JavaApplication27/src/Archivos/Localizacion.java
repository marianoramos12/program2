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
public class Localizacion extends Archivo{
    private int id_Localizacion;
    private String tipo;

    public int getId_Localizacion() {
        return id_Localizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId_Localizacion(int id_Localizacion) {
        this.id_Localizacion = id_Localizacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
