/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lenovo2
 */
public class Clientes extends Archivo{
    private int id_Cliente;
    private String nombre_Cliente;
    private String apellido_Pat_Cliente;
    private String apellido_Mat_Cliente;
    private String direccion_Cliente;
    private Date fecha_Nac_Cliente;
    private String telf_Cliente;
    private String celular_Cliente;
    private Date fecha_Ingreso;
    private boolean status_Cliente;
    private int tipo_Cliente;
    private String correo_Cliente;
    private Double balance_Cliente;
    private Double valor_Cuota_Cliente;
    
    

    public Clientes() {
    
    }

    public Clientes(int id_Cliente, String nombre_Cliente, String apellido_Pat_Cliente, String apellido_Mat_Cliente, String direccion_Cliente, Date fecha_Nac_Cliente, String telf_Cliente, String celular_Cliente, Date fecha_Ingreso, boolean status_Cliente, int tipo_Cliente, String correo_Cliente, Double balance_Cliente, Double valor_Cuota_Cliente) {
        this.id_Cliente = id_Cliente;
        this.nombre_Cliente = nombre_Cliente;
        this.apellido_Pat_Cliente = apellido_Pat_Cliente;
        this.apellido_Mat_Cliente = apellido_Mat_Cliente;
        this.direccion_Cliente = direccion_Cliente;
        this.fecha_Nac_Cliente = fecha_Nac_Cliente;
        this.telf_Cliente = telf_Cliente;
        this.celular_Cliente = celular_Cliente;
        this.fecha_Ingreso = fecha_Ingreso;
        this.status_Cliente = status_Cliente;
        this.tipo_Cliente = tipo_Cliente;
        this.correo_Cliente = correo_Cliente;
        this.balance_Cliente = balance_Cliente;
        this.valor_Cuota_Cliente = valor_Cuota_Cliente;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public String getNombre_Cliente() {
        return nombre_Cliente;
    }

    public String getApellido_Pat_Cliente() {
        return apellido_Pat_Cliente;
    }

    public String getApellido_Mat_Cliente() {
        return apellido_Mat_Cliente;
    }

    public String getDireccion_Cliente() {
        return direccion_Cliente;
    }

    public Date getFecha_Nac_Cliente() {
        return fecha_Nac_Cliente;
    }

    public String getTelf_Cliente() {
        return telf_Cliente;
    }

    public String getCelular_Cliente() {
        return celular_Cliente;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public boolean getStatus_Cliente() {
        return status_Cliente;
    }

    public int getTipo_Cliente() {
        return tipo_Cliente;
    }

    public String getCorreo_Cliente() {
        return correo_Cliente;
    }

    public Double getBalance_Cliente() {
        return balance_Cliente;
    }

    public Double getValor_Cuota_Cliente() {
        return valor_Cuota_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public void setNombre_Cliente(String nombre_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
    }

    public void setApellido_Pat_Cliente(String apellido_Pat_Cliente) {
        this.apellido_Pat_Cliente = apellido_Pat_Cliente;
    }

    public void setApellido_Mat_Cliente(String apellido_Mat_Cliente) {
        this.apellido_Mat_Cliente = apellido_Mat_Cliente;
    }

    public void setDireccion_Cliente(String direccion_Cliente) {
        this.direccion_Cliente = direccion_Cliente;
    }

    public void setFecha_Nac_Cliente(Date fecha_Nac_Cliente) {
        this.fecha_Nac_Cliente = fecha_Nac_Cliente;
    }

    public void setTelf_Cliente(String telf_Cliente) {
        this.telf_Cliente = telf_Cliente;
    }

    public void setCelular_Cliente(String celular_Cliente) {
        this.celular_Cliente = celular_Cliente;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public void setStatus_Cliente(boolean status_Cliente) {
        this.status_Cliente = status_Cliente;
    }

    public void setTipo_Cliente(int tipo_Cliente) {
        this.tipo_Cliente = tipo_Cliente;
    }

    public void setCorreo_Cliente(String correo_Cliente) {
        this.correo_Cliente = correo_Cliente;
    }

    public void setBalance_Cliente(Double balance_Cliente) {
        this.balance_Cliente = balance_Cliente;
    }

    public void setValor_Cuota_Cliente(Double valor_Cuota_Cliente) {
        this.valor_Cuota_Cliente = valor_Cuota_Cliente;
    }

    @Override
    public String toString() {
        SimpleDateFormat fecha=new SimpleDateFormat("dd-MM-yyyy");
        return id_Cliente + separador + nombre_Cliente + separador + apellido_Pat_Cliente 
                + separador + apellido_Mat_Cliente + separador + direccion_Cliente + separador 
                + fecha.format(fecha_Nac_Cliente) + separador + telf_Cliente + separador + celular_Cliente 
                + separador + fecha.format(fecha_Ingreso) + separador + status_Cliente + separador + tipo_Cliente 
                + separador + correo_Cliente + separador + balance_Cliente + separador + valor_Cuota_Cliente;
    }


    
    
}
